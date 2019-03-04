package typings
package pkijsLib.srcOriginatorIdentifierOrKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginatorIdentifierOrKey extends js.Object {
  var value: js.UndefOr[js.Any] = js.undefined
  var variant: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OriginatorIdentifierOrKey {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    variant: scala.Double,
    value: js.Any = null
  ): OriginatorIdentifierOrKey = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema, variant = variant)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OriginatorIdentifierOrKey]
  }
}

