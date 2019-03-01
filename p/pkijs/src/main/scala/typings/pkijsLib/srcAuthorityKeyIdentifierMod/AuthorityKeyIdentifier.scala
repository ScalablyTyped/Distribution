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
    fromSchema: js.Function1[js.Any, scala.Unit],
    keyIdentifier: asn1jsLib.asn1jsMod.OctetString,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): AuthorityKeyIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorityCertIssuer")(authorityCertIssuer)
    __obj.updateDynamic("authorityCertSerialNumber")(authorityCertSerialNumber)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("keyIdentifier")(keyIdentifier)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[AuthorityKeyIdentifier]
  }
}

