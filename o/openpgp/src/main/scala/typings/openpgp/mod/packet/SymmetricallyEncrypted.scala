package typings.openpgp.mod.packet

import typings.openpgp.mod.enums.symmetric
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "packet.SymmetricallyEncrypted")
@js.native
/**
  * Implementation of the Symmetrically Encrypted Data Packet (Tag 9)
  * {@link https://tools.ietf.org/html/rfc4880#section-5.7|RFC4880 5.7}:
  * The Symmetrically Encrypted Data packet contains data encrypted with a
  * symmetric-key algorithm. When it has been decrypted, it contains other
  * packets (usually a literal data packet or compressed data packet, but in
  * theory other Symmetrically Encrypted Data packets or sequences of packets
  * that form whole OpenPGP messages).
  */
class SymmetricallyEncrypted () extends js.Object {
  
  /**
    * Decrypt the symmetrically-encrypted packet data
    * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
    * @param sessionKeyAlgorithm Symmetric key algorithm to use
    * @param key The key of cipher blocksize length to be used
    * @returns
    */
  def decrypt(sessionKeyAlgorithm: symmetric, key: Uint8Array): js.Promise[Boolean] = js.native
  
  /**
    * Encrypt the symmetrically-encrypted packet data
    * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
    * @param sessionKeyAlgorithm Symmetric key algorithm to use
    * @param key The key of cipher blocksize length to be used
    * @returns
    */
  def encrypt(sessionKeyAlgorithm: symmetric, key: Uint8Array): js.Promise[Boolean] = js.native
  
  /**
    * Encrypted secret-key data
    */
  var encrypted: js.Any = js.native
  
  /**
    * When true, decrypt fails if message is not integrity protected
    * @see module:config.ignore_mdc_error
    */
  var ignore_mdc_error: js.Any = js.native
  
  /**
    * Decrypted packets contained within.
    */
  var packets: List = js.native
  
  /**
    * Packet type
    */
  var tag: typings.openpgp.mod.enums.packet = js.native
}
