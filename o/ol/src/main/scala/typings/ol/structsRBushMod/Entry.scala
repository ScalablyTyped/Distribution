package typings.ol.structsRBushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var maxX: Double
  var maxY: Double
  var minX: Double
  var minY: Double
  var value: js.UndefOr[js.Any] = js.undefined
}

object Entry {
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double, value: js.Any = null): Entry = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}

