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

