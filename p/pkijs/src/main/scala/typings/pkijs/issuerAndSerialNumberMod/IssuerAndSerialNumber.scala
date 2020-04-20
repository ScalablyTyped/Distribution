package typings.pkijs.issuerAndSerialNumberMod

import typings.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuerAndSerialNumber extends js.Object {
  var issuer: typings.pkijs.relativeDistinguishedNamesMod.default
  var serialNumber: Integer
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object IssuerAndSerialNumber {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    issuer: typings.pkijs.relativeDistinguishedNamesMod.default,
    serialNumber: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): IssuerAndSerialNumber = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[IssuerAndSerialNumber]
  }
}

