package typings.openpgp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eme {
  
  @JSImport("openpgp", "eme")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Decode a EME-PKCS1-v1_5 padded message
    * @see
    * @param EM encoded message, an octet string
    * @returns message, an octet string
    */
  @scala.inline
  def decode(EM: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(EM.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Create a EME-PKCS1-v1_5 padded message
    * @see
    * @param M message to be encoded
    * @param k the length in octets of the key modulus
    * @returns EME-PKCS1 padded message
    */
  @scala.inline
  def encode(M: String, k: Integer): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(M.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
