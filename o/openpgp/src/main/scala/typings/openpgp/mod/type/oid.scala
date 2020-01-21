package typings.openpgp.mod.`type`

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Wrapper to an OID value
  * {@link https://tools.ietf.org/html/rfc6637#section-11|RFC6637, section 11}:
  * The sequence of octets in the third column is the result of applying
  * the Distinguished Encoding Rules (DER) to the ASN.1 Object Identifier
  * with subsequent truncation.  The truncation removes the two fields of
  * encoded Object Identifier.  The first omitted field is one octet
  * representing the Object Identifier tag, and the second omitted field
  * is the length of the Object Identifier body.  For example, the
  * complete ASN.1 DER encoding for the NIST P-256 curve OID is "06 08 2A
  * 86 48 CE 3D 03 01 07", from which the first entry in the table above
  * is constructed by omitting the first two octets.  Only the truncated
  * sequence of octets is the valid representation of a curve OID.
  */
@JSImport("openpgp", "type.oid")
@js.native
object oid extends js.Object {
  @js.native
  class OID () extends js.Object {
    /**
      * If a known curve object identifier, return the canonical name of the curve
      * @returns String with the canonical name of the curve
      */
    def getName(): String = js.native
    /**
      * Method to read an OID object
      * @param input Where to read the OID from
      * @returns Number of read bytes
      */
    def read(input: Uint8Array): Double = js.native
    /**
      * Serialize an OID object as a hex string
      * @returns String with the hex value of the OID
      */
    def toHex(): String = js.native
    /**
      * Serialize an OID object
      * @returns Array with the serialized value the OID
      */
    def write(): Uint8Array = js.native
  }
  
}

