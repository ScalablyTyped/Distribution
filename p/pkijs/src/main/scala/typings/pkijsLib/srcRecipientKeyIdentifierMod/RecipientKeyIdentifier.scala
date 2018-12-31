package typings
package pkijsLib.srcRecipientKeyIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientKeyIdentifier extends js.Object {
  var date: js.UndefOr[asn1jsLib.asn1jsMod.GeneralizedTime] = js.undefined
  var other: js.UndefOr[pkijsLib.srcOtherKeyAttributeMod.default] = js.undefined
  var subjectKeyIdentifier: asn1jsLib.asn1jsMod.OctetString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

