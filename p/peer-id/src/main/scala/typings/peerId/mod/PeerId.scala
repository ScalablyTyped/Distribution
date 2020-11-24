package typings.peerId.mod

import typings.libp2pCrypto.mod.PrivateKey
import typings.libp2pCrypto.mod.PublicKey
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PeerId is an object representation of a peer identifier.
  */
@js.native
trait PeerId extends js.Object {
  
  /**
    * Checks the equality of `this` peer against a given PeerId.
    * @param id The other PeerId.
    */
  def equals(id: PeerId): Boolean = js.native
  def equals(id: Uint8Array): Boolean = js.native
  
  /**
    * Check if the PeerId has an inline public key.
    */
  def hasInlinePublicKey(): Boolean = js.native
  
  /**
    * Raw id.
    */
  val id: Uint8Array = js.native
  
  /**
    * Checks the equality of `this` peer against a given PeerId.
    * @deprecated Use {.equals}
    * @param id The other PeerId.
    */
  def isEqual(id: PeerId): Boolean = js.native
  def isEqual(id: Uint8Array): Boolean = js.native
  
  /**
    * Check if this PeerId instance is valid (privKey -> pubKey -> Id)
    */
  def isValid(): Boolean = js.native
  
  /**
    * Return the protobuf version of the peer-id.
    * @param excludePriv Whether to exclude the private key information from the output.
    */
  def marshal(): Uint8Array = js.native
  def marshal(excludePriv: Boolean): Uint8Array = js.native
  
  /**
    * Return the protobuf version of the private key, matching go ipfs formatting.
    */
  def marshalPrivKey(): Uint8Array = js.native
  
  /**
    * Return the protobuf version of the public key, matching go ipfs formatting.
    */
  def marshalPubKey(): Uint8Array = js.native
  
  /**
    * Private key.
    */
  var privKey: PrivateKey = js.native
  
  /**
    * Public key.
    */
  var pubKey: PublicKey = js.native
  
  /**
    * Encode to base58 string.
    */
  def toB58String(): String = js.native
  
  /**
    * Return raw id bytes.
    */
  def toBytes(): Uint8Array = js.native
  
  /**
    * Encode to hex.
    */
  def toHexString(): String = js.native
  
  /**
    * Return the jsonified version of the key.
    * Matches the formatting of go-ipfs for its config file.
    * @see {@link PeerId.createFromJSON}
    */
  def toJSON(): JSONPeerId = js.native
  
  /**
    * String representation.
    */
  def toPrint(): String = js.native
}
