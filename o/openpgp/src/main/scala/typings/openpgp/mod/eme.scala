package typings.openpgp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "eme")
@js.native
object eme extends js.Object {
  /**
    * Decode a EME-PKCS1-v1_5 padded message
    * @see
    * @param EM encoded message, an octet string
    * @returns message, an octet string
    */
  def decode(EM: String): String = js.native
  /**
    * Create a EME-PKCS1-v1_5 padded message
    * @see
    * @param M message to be encoded
    * @param k the length in octets of the key modulus
    * @returns EME-PKCS1 padded message
    */
  def encode(M: String, k: Integer): js.Promise[String] = js.native
}

