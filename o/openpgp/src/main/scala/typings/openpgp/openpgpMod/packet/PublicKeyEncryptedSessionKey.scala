package typings.openpgp.openpgpMod.packet

import typings.openpgp.Integer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "packet.PublicKeyEncryptedSessionKey")
@js.native
/**
  * Public-Key Encrypted Session Key Packets (Tag 1)
  * {@link https://tools.ietf.org/html/rfc4880#section-5.1|RFC4880 5.1}:
  * A Public-Key Encrypted Session Key packet holds the session key
  * used to encrypt a message. Zero or more Public-Key Encrypted Session Key
  * packets and/or Symmetric-Key Encrypted Session Key packets may precede a
  * Symmetrically Encrypted Data Packet, which holds an encrypted message. The
  * message is encrypted with the session key, and the session key is itself
  * encrypted and stored in the Encrypted Session Key packet(s). The
  * Symmetrically Encrypted Data Packet is preceded by one Public-Key Encrypted
  * Session Key packet for each OpenPGP key to which the message is encrypted.
  * The recipient of the message finds a session key that is encrypted to their
  * public key, decrypts the session key, and then uses the session key to
  * decrypt the message.
  */
class PublicKeyEncryptedSessionKey () extends js.Object {
  var encrypted: js.Array[_] = js.native
  /**
    * Decrypts the session key (only for public key encrypted session key
    * packets (tag 1)
    * @param key Private key with secret params unlocked
    * @returns
    */
  def decrypt(key: SecretKey): js.Promise[Boolean] = js.native
  /**
    * Encrypt session key packet
    * @param key Public key
    * @returns
    */
  def encrypt(key: PublicKey): js.Promise[Boolean] = js.native
  /**
    * Fix custom types after cloning
    */
  def postCloneTypeFix(): Unit = js.native
  /**
    * Parsing function for a publickey encrypted session key packet (tag 1).
    * @param input Payload of a tag 1 packet
    * @param position Position to start reading from the input string
    * @param len Length of the packet or the remaining length of
    *        input at position
    * @returns Object representation
    */
  def read(input: Uint8Array, position: Integer, len: Integer): PublicKeyEncryptedSessionKey = js.native
  /**
    * Create a string representation of a tag 1 packet
    * @returns The Uint8Array representation
    */
  def write(): Uint8Array = js.native
}

