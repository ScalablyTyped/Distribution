package typings.openpgp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eme {
  
  /**
    * Decode a EME-PKCS1-v1_5 padded message
    * @see
    * @param EM encoded message, an octet string
    * @returns message, an octet string
    */
  @JSImport("openpgp", "eme.decode")
  @js.native
  def decode(EM: String): String = js.native
  
  /**
    * Create a EME-PKCS1-v1_5 padded message
    * @see
    * @param M message to be encoded
    * @param k the length in octets of the key modulus
    * @returns EME-PKCS1 padded message
    */
  @JSImport("openpgp", "eme.encode")
  @js.native
  def encode(M: String, k: Integer): js.Promise[String] = js.native
}
