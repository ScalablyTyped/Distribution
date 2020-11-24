package typings.openpgp.mod.packet

import typings.openpgp.mod.ReadableStream
import typings.openpgp.openpgpStrings.decrypt
import typings.openpgp.openpgpStrings.encrypt
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "packet.SymEncryptedAEADProtected")
@js.native
/**
  * Implementation of the Symmetrically Encrypted Authenticated Encryption with
  * Additional Data (AEAD) Protected Data Packet
  * {@link https://tools.ietf.org/html/draft-ford-openpgp-format-00#section-2.1}:
  * AEAD Protected Data Packet
  */
class SymEncryptedAEADProtected () extends js.Object {
  
  @JSName("crypt")
  def crypt_decrypt(fn: decrypt, key: Uint8Array, data: ReadableStream[Uint8Array], streaming: Boolean): Uint8Array | ReadableStream[Uint8Array] = js.native
  @JSName("crypt")
  def crypt_decrypt(fn: decrypt, key: Uint8Array, data: Uint8Array, streaming: Boolean): Uint8Array | ReadableStream[Uint8Array] = js.native
  @JSName("crypt")
  def crypt_encrypt(fn: encrypt, key: Uint8Array, data: ReadableStream[Uint8Array], streaming: Boolean): Uint8Array | ReadableStream[Uint8Array] = js.native
  /**
    * En/decrypt the payload.
    * @param fn Whether to encrypt or decrypt
    * @param key The session key used to en/decrypt the payload
    * @param data The data to en/decrypt
    * @param streaming Whether the top-level function will return a stream
    * @returns
    */
  @JSName("crypt")
  def crypt_encrypt(fn: encrypt, key: Uint8Array, data: Uint8Array, streaming: Boolean): Uint8Array | ReadableStream[Uint8Array] = js.native
  
  /**
    * Decrypt the encrypted payload.
    * @param sessionKeyAlgorithm The session key's cipher algorithm e.g. 'aes128'
    * @param key The session key used to encrypt the payload
    * @param streaming Whether the top-level function will return a stream
    * @returns
    */
  def decrypt(sessionKeyAlgorithm: String, key: Uint8Array, streaming: Boolean): Boolean = js.native
  
  /**
    * Encrypt the packet list payload.
    * @param sessionKeyAlgorithm The session key's cipher algorithm e.g. 'aes128'
    * @param key The session key used to encrypt the payload
    * @param streaming Whether the top-level function will return a stream
    */
  def encrypt(sessionKeyAlgorithm: String, key: Uint8Array, streaming: Boolean): Unit = js.native
  
  def read(bytes: ReadableStream[Uint8Array]): Unit = js.native
  /**
    * Parse an encrypted payload of bytes in the order: version, IV, ciphertext (see specification)
    * @param bytes
    */
  def read(bytes: Uint8Array): Unit = js.native
  
  /**
    * Write the encrypted payload of bytes in the order: version, IV, ciphertext (see specification)
    * @returns The encrypted payload
    */
  def write(): Uint8Array | ReadableStream[Uint8Array] = js.native
}
