package typings.openpgp.mod.packet

import typings.openpgp.mod.Integer
import typings.openpgp.mod.`type`.keyid.Keyid
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "packet.SecretKey")
@js.native
/**
  * A Secret-Key packet contains all the information that is found in a
  * Public-Key packet, including the public-key material, but also
  * includes the secret-key material after all the public-key fields.
  */
class SecretKey () extends js.Object {
  /**
    * Public key algorithm.
    */
  var algorithm: String = js.native
  /**
    * Key creation date.
    */
  var created: Date = js.native
  /**
    * Encrypted secret-key data
    */
  var encrypted: js.Any = js.native
  /**
    * Time until expiration in days (V3 only)
    */
  var expirationTimeV3: Integer = js.native
  /**
    * Fingerprint in lowercase hex
    */
  var fingerprint: String = js.native
  /**
    * Indicator if secret-key data is encrypted. `this.isEncrypted === false` means data is available in decrypted form.
    */
  var isEncrypted: js.Any = js.native
  /**
    * Keyid
    */
  var keyid: Keyid = js.native
  /**
    * Algorithm specific params
    */
  var params: js.Array[js.Object] = js.native
  /**
    * Alias of read()
    * @see module:packet.PublicKey#read
    */
  var readPublicKey: js.Any = js.native
  /**
    * Packet type
    */
  var tag: typings.openpgp.mod.enums.packet = js.native
  /**
    * Packet version
    */
  var version: Integer = js.native
  /**
    * Alias of write()
    * @see module:packet.PublicKey#write
    */
  var writePublicKey: js.Any = js.native
  /**
    * Clear private params, return to initial state
    */
  def clearPrivateParams(): Unit = js.native
  /**
    * Decrypts the private key params which are needed to use the key.
    * {@link module:packet.SecretKey.isDecrypted} should be false, as
    * otherwise calls to this function will throw an error.
    * @param passphrase The passphrase for this private key as string
    * @returns
    */
  def decrypt(passphrase: String): js.Promise[Boolean] = js.native
  /**
    * Encrypt the payload. By default, we use aes256 and iterated, salted string
    * to key specifier. If the key is in a decrypted state (isEncrypted === false)
    * and the passphrase is empty or undefined, the key will be set as not encrypted.
    * This can be used to remove passphrase protection after calling decrypt().
    * @param passphrase
    * @returns
    */
  def encrypt(passphrase: String): js.Promise[Boolean] = js.native
  /**
    * Returns algorithm information
    * @returns An object of the form {algorithm: string, bits:int, curve:String}
    */
  def getAlgorithmInfo(): js.Object = js.native
  /**
    * Returns the creation time of the key
    * @returns
    */
  def getCreationTime(): Date = js.native
  /**
    * Calculates the fingerprint of the key
    * @returns A string containing the fingerprint in lowercase hex
    */
  def getFingerprint(): String = js.native
  /**
    * Calculates the fingerprint of the key
    * @returns A Uint8Array containing the fingerprint
    */
  def getFingerprintBytes(): Uint8Array = js.native
  /**
    * Calculates the key id of the key
    * @returns A 8 byte key id
    */
  def getKeyId(): String = js.native
  /**
    * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
    * @returns Whether the two keys have the same version and public key data
    */
  def hasSameFingerprintAs(): Boolean = js.native
  /**
    * Check whether secret-key data is available in decrypted form. Returns null for public keys.
    * @returns
    */
  def isDecrypted(): Boolean | Null = js.native
  /**
    * Fix custom types after cloning
    */
  def postCloneTypeFix(): Unit = js.native
  /**
    * Internal parser for private keys as specified in
    * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-5.5.3|RFC4880bis-04 section 5.5.3}
    * @param bytes Input string to read the packet from
    */
  def read(bytes: String): Unit = js.native
  /**
    * Creates an OpenPGP key packet for the given key.
    * @returns A string of bytes containing the secret key OpenPGP packet
    */
  def write(): String = js.native
  /**
    * Write an old version packet - it's used by some of the internal routines.
    */
  def writeOld(): Unit = js.native
}

