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
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    variant: scala.Double,
    value: js.Any = null
  ): OriginatorIdentifierOrKey = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), variant = variant)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OriginatorIdentifierOrKey]
  }
}

