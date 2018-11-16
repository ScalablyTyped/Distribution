package typings
package pkijsLib.srcKEKIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KEKIdentifier extends js.Object {
  var date: js.UndefOr[asn1jsLib.asn1jsMod.GeneralizedTime] = js.undefined
  var keyIdentifier: asn1jsLib.asn1jsMod.OctetString
  var other: js.UndefOr[pkijsLib.srcOtherKeyAttributeMod.default] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

