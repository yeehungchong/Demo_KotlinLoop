package com.yeehungchong.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
//            TODO: FOR LOOP
//            for (i in 1..5) {
//                Log.d("MainActivity", "$i")
//            }

//            TODO: WHILE LOOP
            var i = 1
            while (i < 6) {
                Log.d("MainActivity", "$i")
                i++
            }
        }

        button2.setOnClickListener {
            val word = editText.text
            for (letter in word) {
                Log.d("MainActivity", "$letter")
            }

        }

    }
}