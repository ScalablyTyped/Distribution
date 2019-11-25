package typings.pkijs.srcGeneralSubtreeMod

import typings.asn1js.asn1jsMod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralSubtree extends js.Object {
  var base: typings.pkijs.srcGeneralNameMod.default
  var maximum: js.UndefOr[Double | Integer] = js.undefined
  var minimum: Double | Integer
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object GeneralSubtree {
  @scala.inline
  def apply(
    base: typings.pkijs.srcGeneralNameMod.default,
    fromSchema: js.Any => Unit,
    minimum: Double | Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    maximum: Double | Integer = null
  ): GeneralSubtree = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), minimum = minimum.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralSubtree]
  }
}

