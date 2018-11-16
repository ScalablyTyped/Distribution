package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "cleartext")
@js.native
object cleartextNs extends js.Object {
  /** Class that represents an OpenPGP cleartext signed message.
       */
  
  trait CleartextMessage extends js.Object {
    /** Returns ASCII armored text of cleartext signed message
             */
    def armor(): java.lang.String
    /** Returns the key IDs of the keys that signed the cleartext message
             */
    def getSigningKeyIds(): js.Array[openpgpLib.openpgpMod.Keyid]
    /** Get cleartext
             */
    def getText(): java.lang.String
    /** Sign the cleartext message
                @param privateKeys private keys with decrypted secret key data for signing
             */
    def sign(privateKeys: js.Array[openpgpLib.openpgpMod.keyNs.Key]): scala.Unit
    /** Verify signatures of cleartext signed message
                @param keys array of keys to verify signatures
             */
    def verify(keys: js.Array[openpgpLib.openpgpMod.keyNs.Key]): js.Array[openpgpLib.openpgpMod.VerifiedMessage]
  }
  
  /** creates new message object from binary data
          @param bytes
       */
  def fromBinary(bytes: java.lang.String): CleartextMessage = js.native
  /** creates new message object from text
          @param text
       */
  def fromText(text: java.lang.String): CleartextMessage = js.native
  def readArmored(armoredText: java.lang.String): stdLib.Promise[CleartextMessage] = js.native
}

