package typings
package olLib.structsRBushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var maxX: scala.Double
  var maxY: scala.Double
  var minX: scala.Double
  var minY: scala.Double
  var value: js.UndefOr[js.Any] = js.undefined
}

object Entry {
  @scala.inline
  def apply(
    maxX: scala.Double,
    maxY: scala.Double,
    minX: scala.Double,
    minY: scala.Double,
    value: js.Any = null
  ): Entry = {
    val __obj = js.Dynamic.literal(maxX = maxX, maxY = maxY, minX = minX, minY = minY)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Entry]
  }
}

