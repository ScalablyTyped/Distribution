package typings
package pkijsLib.srcAuthorityKeyIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorityKeyIdentifier extends js.Object {
  var authorityCertIssuer: js.Array[pkijsLib.srcAccessDescriptionMod.default]
  var authorityCertSerialNumber: asn1jsLib.asn1jsMod.Integer
  var keyIdentifier: asn1jsLib.asn1jsMod.OctetString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object AuthorityKeyIdentifier {
  @scala.inline
  def apply(
    authorityCertIssuer: js.Array[pkijsLib.srcAccessDescriptionMod.default],
    authorityCertSerialNumber: asn1jsLib.asn1jsMod.Integer,
    fromSchema: js.Any => scala.Unit,
    keyIdentifier: asn1jsLib.asn1jsMod.OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): AuthorityKeyIdentifier = {
    val __obj = js.Dynamic.literal(authorityCertIssuer = authorityCertIssuer, authorityCertSerialNumber = authorityCertSerialNumber, fromSchema = js.Any.fromFunction1(fromSchema), keyIdentifier = keyIdentifier, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[AuthorityKeyIdentifier]
  }
}

