package com.yash.biggernumbergame

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val left : Button = findViewById(R.id.leftNumber)
        val right : Button = findViewById(R.id.rightNumber)





        assignNumbers()



        left.setOnClickListener{
            
               checkAnswer(true)

        }
        right.setOnClickListener{
            checkAnswer(false)
        }
    }

        private fun checkAnswer(isleftButton : Boolean){

            val left : Button = findViewById(R.id.leftNumber)
            val right : Button = findViewById(R.id.rightNumber)

            val background : ConstraintLayout = findViewById(R.id.background_view)


            val leftnum =  left.text.toString().toInt()
            val rightnum =  right.text.toString().toInt()



            if(isleftButton){
                if (leftnum > rightnum){
                    Toast.makeText(this, "Correct ans", Toast.LENGTH_SHORT).show()
                    background.setBackgroundColor(Color.CYAN)

                }
                else{
                    Toast.makeText(this, "Wrong ans", Toast.LENGTH_SHORT).show()
                    background.setBackgroundColor(Color.RED)

                }
            }
            else{
                if (leftnum < rightnum){
                    Toast.makeText(this, "Correct ans", Toast.LENGTH_SHORT).show()
                    background.setBackgroundColor(Color.CYAN)

                }
                else{
                    Toast.makeText(this, "Wrong ans", Toast.LENGTH_SHORT).show()
                    background.setBackgroundColor(Color.RED)

                }
            }

           assignNumbers()
        }
    private fun assignNumbers(){
        val r = random()
        val left : Button = findViewById(R.id.leftNumber)
        val right : Button = findViewById(R.id.rightNumber)
        left.text = r.rand().toString()
        right.text = r.rand().toString()

    }

}

class random{
    fun rand() : Int{
        return (1..100).random()
    }
}