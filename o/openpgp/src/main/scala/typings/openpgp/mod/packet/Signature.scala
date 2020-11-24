package typings.openpgp.mod.packet

import typings.openpgp.mod.Integer
import typings.openpgp.mod.enums.signature
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "packet.Signature")
@js.native
class Signature protected () extends js.Object {
  /**
    * Implementation of the Signature Packet (Tag 2)
    * {@link https://tools.ietf.org/html/rfc4880#section-5.2|RFC4480 5.2}:
    * A Signature packet describes a binding between some public key and
    * some data.  The most common signatures are a signature of a file or a
    * block of text, and a signature that is a certification of a User ID.
    * @param date the creation date of the signature
    */
  def this(date: Date) = this()
  
  /**
    * Returns the expiration time of the signature or Infinity if signature does not expire
    * @returns expiration time
    */
  def getExpirationTime(): Date = js.native
  
  /**
    * Verifies signature expiration date
    * @param date (optional) use the given date for verification instead of the current time
    * @returns true if expired
    */
  def isExpired(date: Date): Boolean = js.native
  
  /**
    * Fix custom types after cloning
    */
  def postCloneTypeFix(): Unit = js.native
  
  /**
    * parsing function for a signature packet (tag 2).
    * @param bytes payload of a tag 2 packet
    * @param position position to start reading from the bytes string
    * @param len length of the packet or the remaining length of bytes at position
    * @returns object representation
    */
  def read(bytes: String, position: Integer, len: Integer): Signature = js.native
  
  /**
    * Signs provided data. This needs to be done prior to serialization.
    * @param key private key used to sign the message.
    * @param data Contains packets to be signed.
    * @returns
    */
  def sign(key: SecretKey, data: js.Object): js.Promise[Boolean] = js.native
  
  def verify(key: PublicKey, signatureType: signature, data: String): js.Promise[Boolean] = js.native
  def verify(key: PublicKey, signatureType: signature, data: js.Object): js.Promise[Boolean] = js.native
  /**
    * verifys the signature packet. Note: not signature types are implemented
    * @param key the public key to verify the signature
    * @param signatureType expected signature type
    * @param data data which on the signature applies
    * @returns True if message is verified, else false.
    */
  def verify(key: PublicSubkey, signatureType: signature, data: String): js.Promise[Boolean] = js.native
  def verify(key: PublicSubkey, signatureType: signature, data: js.Object): js.Promise[Boolean] = js.native
  def verify(key: SecretKey, signatureType: signature, data: String): js.Promise[Boolean] = js.native
  def verify(key: SecretKey, signatureType: signature, data: js.Object): js.Promise[Boolean] = js.native
  def verify(key: SecretSubkey, signatureType: signature, data: String): js.Promise[Boolean] = js.native
  def verify(key: SecretSubkey, signatureType: signature, data: js.Object): js.Promise[Boolean] = js.native
  
  /**
    * Creates Uint8Array of bytes of all subpacket data except Issuer and Embedded Signature subpackets
    * @returns subpacket data
    */
  def write_hashed_sub_packets(): Uint8Array = js.native
  
  /**
    * Creates Uint8Array of bytes of Issuer and Embedded Signature subpackets
    * @returns subpacket data
    */
  def write_unhashed_sub_packets(): Uint8Array = js.native
}
