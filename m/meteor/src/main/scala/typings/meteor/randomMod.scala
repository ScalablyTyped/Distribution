package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/random", JSImport.Namespace)
@js.native
object randomMod extends js.Object {
  
  @js.native
  object Random extends js.Object {
    
    // @param str, @return a random char in str
    def choice(str: String): String = js.native
    // @param array, @return a random element in array
    def choice[T](array: js.Array[T]): js.UndefOr[T] = js.native
    
    def fraction(): Double = js.native
    
    // @param numberOfDigits, @returns a random hex string of the given length
    def hexString(numberOfDigits: Double): String = js.native
    
    def id(): String = js.native
    def id(numberOfChars: Double): String = js.native
    
    def secret(): String = js.native
    def secret(numberOfChars: Double): String = js.native
  }
}
