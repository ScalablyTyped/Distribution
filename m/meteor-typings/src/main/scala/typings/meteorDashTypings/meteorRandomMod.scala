package typings.meteorDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/random", JSImport.Namespace)
@js.native
object meteorRandomMod extends js.Object {
  @JSName("Random")
  @js.native
  object RandomNs extends js.Object {
    // @param array, @return a random element in array
    def choice(array: js.Array[_]): String = js.native
    // @param str, @return a random char in str
    def choice(str: String): String = js.native
    def fraction(): Double = js.native
    // @param numberOfDigits, @returns a random hex string of the given length
    def hexString(numberOfDigits: Double): String = js.native
    def id(): String = js.native
    def id(numberOfChars: Double): String = js.native
    def secret(): String = js.native
    def secret(numberOfChars: Double): String = js.native
  }
  
}

