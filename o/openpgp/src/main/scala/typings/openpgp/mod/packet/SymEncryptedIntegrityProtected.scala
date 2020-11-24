package typings.openpgp.mod.packet

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "packet.SymEncryptedIntegrityProtected")
@js.native
/**
  * Implementation of the Sym. Encrypted Integrity Protected Data Packet (Tag 18)
  * {@link https://tools.ietf.org/html/rfc4880#section-5.13|RFC4880 5.13}:
  * The Symmetrically Encrypted Integrity Protected Data packet is
  * a variant of the Symmetrically Encrypted Data packet. It is a new feature
  * created for OpenPGP that addresses the problem of detecting a modification to
  * encrypted data. It is used in combination with a Modification Detection Code
  * packet.
  */
class SymEncryptedIntegrityProtected () extends js.Object {
  
  /**
    * Decrypts the encrypted data contained in the packet.
    * @param sessionKeyAlgorithm The selected symmetric encryption algorithm to be used e.g. 'aes128'
    * @param key The key of cipher blocksize length to be used
    * @param streaming Whether to read this.encrypted as a stream
    * @returns
    */
  def decrypt(sessionKeyAlgorithm: String, key: Uint8Array, streaming: Boolean): js.Promise[Boolean] = js.native
  
  /**
    * Encrypt the payload in the packet.
    * @param sessionKeyAlgorithm The selected symmetric encryption algorithm to be used e.g. 'aes128'
    * @param key The key of cipher blocksize length to be used
    * @param streaming Whether to set this.encrypted to a stream
    * @returns
    */
  def encrypt(sessionKeyAlgorithm: String, key: Uint8Array, streaming: Boolean): js.Promise[Boolean] = js.native
  
  /**
    * The encrypted payload.
    */
  var encrypted: js.Any = js.native
  
  /**
    * If after decrypting the packet this is set to true,
    * a modification has been detected and thus the contents
    * should be discarded.
    */
  var modification: Boolean = js.native
}
