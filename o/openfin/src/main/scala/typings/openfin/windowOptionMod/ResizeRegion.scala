package typings.openfin.windowOptionMod

import typings.openfin.AnonBottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeRegion extends js.Object {
  var bottomRightCorner: js.UndefOr[Double] = js.undefined
  var sides: js.UndefOr[AnonBottom] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object ResizeRegion {
  @scala.inline
  def apply(bottomRightCorner: Int | Double = null, sides: AnonBottom = null, size: Int | Double = null): ResizeRegion = {
    val __obj = js.Dynamic.literal()
    if (bottomRightCorner != null) __obj.updateDynamic("bottomRightCorner")(bottomRightCorner.asInstanceOf[js.Any])
    if (sides != null) __obj.updateDynamic("sides")(sides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeRegion]
  }
}

