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

object KEKIdentifier {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    keyIdentifier: asn1jsLib.asn1jsMod.OctetString,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    date: asn1jsLib.asn1jsMod.GeneralizedTime = null,
    other: pkijsLib.srcOtherKeyAttributeMod.default = null
  ): KEKIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("keyIdentifier")(keyIdentifier)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    if (date != null) __obj.updateDynamic("date")(date)
    if (other != null) __obj.updateDynamic("other")(other)
    __obj.asInstanceOf[KEKIdentifier]
  }
}

