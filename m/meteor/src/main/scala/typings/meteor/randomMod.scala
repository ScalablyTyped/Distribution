package typings.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  object Random {
    
    // @param str, @return a random char in str
    @JSImport("meteor/random", "Random.choice")
    @js.native
    def choice(str: String): String = js.native
    // @param array, @return a random element in array
    @JSImport("meteor/random", "Random.choice")
    @js.native
    def choice[T](array: js.Array[T]): js.UndefOr[T] = js.native
    
    @JSImport("meteor/random", "Random.fraction")
    @js.native
    def fraction(): Double = js.native
    
    // @param numberOfDigits, @returns a random hex string of the given length
    @JSImport("meteor/random", "Random.hexString")
    @js.native
    def hexString(numberOfDigits: Double): String = js.native
    
    @JSImport("meteor/random", "Random.id")
    @js.native
    def id(): String = js.native
    @JSImport("meteor/random", "Random.id")
    @js.native
    def id(numberOfChars: Double): String = js.native
    
    @JSImport("meteor/random", "Random.secret")
    @js.native
    def secret(): String = js.native
    @JSImport("meteor/random", "Random.secret")
    @js.native
    def secret(numberOfChars: Double): String = js.native
  }
}
