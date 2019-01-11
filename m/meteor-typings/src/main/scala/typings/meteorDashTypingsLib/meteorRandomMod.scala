package typings
package meteorDashTypingsLib

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
    def choice(array: js.Array[_]): java.lang.String = js.native
    // @param str, @return a random char in str
    def choice(str: java.lang.String): java.lang.String = js.native
    def fraction(): scala.Double = js.native
    // @param numberOfDigits, @returns a random hex string of the given length
    def hexString(numberOfDigits: scala.Double): java.lang.String = js.native
    def id(): java.lang.String = js.native
    def id(numberOfChars: scala.Double): java.lang.String = js.native
    def secret(): java.lang.String = js.native
    def secret(numberOfChars: scala.Double): java.lang.String = js.native
  }
  
}

