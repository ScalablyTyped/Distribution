package typings
package pkijsLib.srcIssuerAndSerialNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuerAndSerialNumber extends js.Object {
  var issuer: pkijsLib.srcRelativeDistinguishedNamesMod.default
  var serialNumber: asn1jsLib.asn1jsMod.Integer
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object IssuerAndSerialNumber {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    issuer: pkijsLib.srcRelativeDistinguishedNamesMod.default,
    serialNumber: asn1jsLib.asn1jsMod.Integer,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): IssuerAndSerialNumber = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, issuer = issuer, serialNumber = serialNumber, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[IssuerAndSerialNumber]
  }
}

