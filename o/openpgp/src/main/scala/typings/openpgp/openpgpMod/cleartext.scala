package typings.openpgp.openpgpMod

import typings.openpgp.Anon_Keyid
import typings.openpgp.ReadableStream
import typings.openpgp.openpgpMod.cleartext.CleartextMessage
import typings.openpgp.openpgpMod.signature.Signature
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "cleartext")
@js.native
object cleartext extends js.Object {
  /**
    * Class that represents an OpenPGP cleartext signed message.
    * See {@link https://tools.ietf.org/html/rfc4880#section-7}
    */
  @js.native
  class CleartextMessage protected () extends js.Object {
    /**
      * @param text The cleartext of the signed message
      * @param signature The detached signature or an empty signature for unsigned messages
      */
    def this(text: String, signature: Signature) = this()
    /**
      * Returns ASCII armored text of cleartext signed message
      * @returns ASCII armor
      */
    def armor(): String | ReadableStream[String] = js.native
    /**
      * Returns the key IDs of the keys that signed the cleartext message
      * @returns array of keyid objects
      */
    def getSigningKeyIds(): js.Array[_] = js.native
    /**
      * Get cleartext
      * @returns cleartext of message
      */
    def getText(): String = js.native
    /**
      * Sign the cleartext message
      * @param privateKeys private keys with decrypted secret key data for signing
      * @param signature (optional) any existing detached signature
      * @param date (optional) The creation time of the signature that should be created
      * @param userIds (optional) user IDs to sign with, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
      * @returns new cleartext message with signed content
      */
    def sign(privateKeys: js.Array[_], signature: Signature, date: Date, userIds: js.Array[_]): js.Promise[CleartextMessage] = js.native
    /**
      * Sign the cleartext message
      * @param privateKeys private keys with decrypted secret key data for signing
      * @param signature (optional) any existing detached signature
      * @param date (optional) The creation time of the signature that should be created
      * @param userIds (optional) user IDs to sign with, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
      * @returns new detached signature of message content
      */
    def signDetached(privateKeys: js.Array[_], signature: Signature, date: Date, userIds: js.Array[_]): js.Promise[Signature] = js.native
    /**
      * Verify signatures of cleartext signed message
      * @param keys array of keys to verify signatures
      * @param date (optional) Verify the signature against the given date, i.e. check signature creation time < date < expiration time
      * @returns list of signer's keyid and validity of signature
      */
    def verify(keys: js.Array[_], date: Date): js.Promise[js.Array[Anon_Keyid]] = js.native
    /**
      * Verify signatures of cleartext signed message
      * @param keys array of keys to verify signatures
      * @param date (optional) Verify the signature against the given date, i.e. check signature creation time < date < expiration time
      * @returns list of signer's keyid and validity of signature
      */
    def verifyDetached(keys: js.Array[_], date: Date): js.Promise[js.Array[Anon_Keyid]] = js.native
  }
  
  /**
    * Creates a new CleartextMessage object from text
    * @param text
    */
  def fromText(text: String): Unit = js.native
  /**
    * reads an OpenPGP cleartext signed message and returns a CleartextMessage object
    * @param armoredText text to be parsed
    * @returns new cleartext message object
    */
  def readArmored(armoredText: String): CleartextMessage = js.native
  def readArmored(armoredText: ReadableStream[String]): CleartextMessage = js.native
}

