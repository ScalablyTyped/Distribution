package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "message")
@js.native
object messageNs extends js.Object {
  /** Class that represents an OpenPGP message. Can be an encrypted message, signed message, compressed message or literal message
       */
  
  trait Message extends js.Object {
    /** Returns ASCII armored text of message
             */
    def armor(): java.lang.String
    /** Decrypt the message
                @param privateKey private key with decrypted secret data
             */
    def decrypt(privateKey: openpgpLib.openpgpMod.keyNs.Key): js.Array[Message]
    /** Encrypt the message
                @param keys array of keys, used to encrypt the message
             */
    def encrypt(keys: js.Array[openpgpLib.openpgpMod.keyNs.Key]): js.Array[Message]
    /** Returns the key IDs of the keys to which the session key is encrypted
             */
    def getEncryptionKeyIds(): js.Array[openpgpLib.openpgpMod.Keyid]
    /** Get literal data that is the body of the message
             */
    def getLiteralData(): java.lang.String
    /** Returns the key IDs of the keys that signed the message
             */
    def getSigningKeyIds(): js.Array[openpgpLib.openpgpMod.Keyid]
    /** Get literal data as text
             */
    def getText(): java.lang.String
    /** Sign the message (the literal data packet of the message)
                @param privateKey private keys with decrypted secret key data for signing
             */
    def sign(privateKey: js.Array[openpgpLib.openpgpMod.keyNs.Key]): Message
    /** Unwrap compressed message
             */
    def unwrapCompressed(): Message
    /** Verify message signatures
                @param keys array of keys to verify signatures
             */
    def verify(keys: js.Array[openpgpLib.openpgpMod.keyNs.Key]): js.Array[js.Object]
  }
  
  /** creates new message object from binary data
          @param bytes
       */
  def fromBinary(bytes: java.lang.String): Message = js.native
  /** creates new message object from text
          @param text
       */
  def fromText(text: java.lang.String): Message = js.native
  /**
       * reads an OpenPGP message as byte array and returns a message object
       * @param {Uint8Array} input   binary message
       * @returns {Message}           new message object
       * @static
       */
  def read(data: stdLib.Uint8Array): Message = js.native
  /** reads an OpenPGP armored message and returns a message object
  
          @param armoredText text to be parsed
       */
  def readArmored(armoredText: java.lang.String): js.Promise[Message] = js.native
}

