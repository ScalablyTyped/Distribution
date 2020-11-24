package typings.openpgp.mod.packet

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "packet.OnePassSignature")
@js.native
/**
  * Implementation of the One-Pass Signature Packets (Tag 4)
  * {@link https://tools.ietf.org/html/rfc4880#section-5.4|RFC4880 5.4}:
  * The One-Pass Signature packet precedes the signed data and contains
  * enough information to allow the receiver to begin calculating any
  * hashes needed to verify the signature.  It allows the Signature
  * packet to be placed at the end of the message, so that the signer
  * can compute the entire signed message in one pass.
  */
class OnePassSignature () extends js.Object {
  
  /**
    * A one-octet number holding a flag showing whether the signature is nested.
    * A zero value indicates that the next packet is another One-Pass Signature packet
    * that describes another signature to be applied to the same message data.
    */
  var flags: js.Any = js.native
  
  /**
    * A one-octet number describing the hash algorithm used.
    * @see
    */
  var hashAlgorithm: js.Any = js.native
  
  /**
    * An eight-octet number holding the Key ID of the signing key.
    */
  var issuerKeyId: js.Any = js.native
  
  /**
    * Fix custom types after cloning
    */
  def postCloneTypeFix(): Unit = js.native
  
  /**
    * A one-octet number describing the public-key algorithm used.
    * @see
    */
  var publicKeyAlgorithm: js.Any = js.native
  
  /**
    * parsing function for a one-pass signature packet (tag 4).
    * @param bytes payload of a tag 4 packet
    * @returns object representation
    */
  def read(bytes: Uint8Array): OnePassSignature = js.native
  
  /**
    * A one-octet signature type.
    * Signature types are described in
    * {@link https://tools.ietf.org/html/rfc4880#section-5.2.1|RFC4880 Section 5.2.1}.
    */
  var signatureType: js.Any = js.native
  
  /**
    * Packet type
    */
  var tag: typings.openpgp.mod.enums.packet = js.native
  
  /**
    * A one-octet version number.  The current version is 3.
    */
  var version: js.Any = js.native
  
  /**
    * creates a string representation of a one-pass signature packet
    * @returns a Uint8Array representation of a one-pass signature packet
    */
  def write(): Uint8Array = js.native
}
