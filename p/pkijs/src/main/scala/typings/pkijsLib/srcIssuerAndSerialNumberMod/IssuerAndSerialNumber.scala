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
    fromSchema: js.Any => scala.Unit,
    issuer: pkijsLib.srcRelativeDistinguishedNamesMod.default,
    serialNumber: asn1jsLib.asn1jsMod.Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): IssuerAndSerialNumber = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), issuer = issuer, serialNumber = serialNumber, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[IssuerAndSerialNumber]
  }
}

