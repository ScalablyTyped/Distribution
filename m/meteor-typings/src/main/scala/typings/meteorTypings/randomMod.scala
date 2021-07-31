package typings.meteorTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  object Random {
    
    @JSImport("meteor/random", "Random")
    @js.native
    val ^ : js.Any = js.native
    
    // @param array, @return a random element in array
    @scala.inline
    def choice(array: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("choice")(array.asInstanceOf[js.Any]).asInstanceOf[String]
    // @param str, @return a random char in str
    @scala.inline
    def choice(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("choice")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def fraction(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fraction")().asInstanceOf[Double]
    
    // @param numberOfDigits, @returns a random hex string of the given length
    @scala.inline
    def hexString(numberOfDigits: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexString")(numberOfDigits.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def id(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[String]
    @scala.inline
    def id(numberOfChars: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(numberOfChars.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def secret(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("secret")().asInstanceOf[String]
    @scala.inline
    def secret(numberOfChars: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("secret")(numberOfChars.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
