package typings.openpgp.openpgpMod.crypto

import typings.openpgp.openpgpMod.Integer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see module:crypto/public_key/rsa
  * @see module:crypto/public_key/elliptic/ecdh
  * @see module:packet.PublicKeyEncryptedSessionKey
  */
@JSImport("openpgp", "crypto.pkcs1")
@js.native
object pkcs1 extends js.Object {
  /**
    * ASN1 object identifiers for hashes
    * @see
    */
  val hash_headers: js.Any = js.native
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
  
  @js.native
  object emsa extends js.Object {
    /**
      * Create a EMSA-PKCS1-v1_5 padded message
      * @see
      * @param algo Hash algorithm type used
      * @param hashed message to be encoded
      * @param emLen intended length in octets of the encoded message
      * @returns encoded message
      */
    def encode(algo: Integer, hashed: Uint8Array, emLen: Integer): String = js.native
  }
  
}

