package typings
package pkijsLib.srcGeneralSubtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralSubtree extends js.Object {
  var base: pkijsLib.srcGeneralNameMod.default
  var maximum: js.UndefOr[scala.Double | asn1jsLib.asn1jsMod.Integer] = js.undefined
  var minimum: scala.Double | asn1jsLib.asn1jsMod.Integer
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object GeneralSubtree {
  @scala.inline
  def apply(
    base: pkijsLib.srcGeneralNameMod.default,
    fromSchema: js.Function1[js.Any, scala.Unit],
    minimum: scala.Double | asn1jsLib.asn1jsMod.Integer,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    maximum: scala.Double | asn1jsLib.asn1jsMod.Integer = null
  ): GeneralSubtree = {
    val __obj = js.Dynamic.literal(base = base, fromSchema = fromSchema, minimum = minimum.asInstanceOf[js.Any], toJSON = toJSON, toSchema = toSchema)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralSubtree]
  }
}

