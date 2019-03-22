package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "eme")
@js.native
object emeNs extends js.Object {
  /**
    * Decode a EME-PKCS1-v1_5 padded message
    * @see
    * @param EM encoded message, an octet string
    * @returns message, an octet string
    */
  def decode(EM: java.lang.String): java.lang.String = js.native
  /**
    * Create a EME-PKCS1-v1_5 padded message
    * @see
    * @param M message to be encoded
    * @param k the length in octets of the key modulus
    * @returns EME-PKCS1 padded message
    */
  def encode(M: java.lang.String, k: openpgpLib.Integer): js.Promise[java.lang.String] = js.native
}

