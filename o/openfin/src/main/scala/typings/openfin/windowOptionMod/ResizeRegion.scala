package typings.openfin.windowOptionMod

import typings.openfin.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeRegion extends js.Object {
  var bottomRightCorner: js.UndefOr[Double] = js.undefined
  var sides: js.UndefOr[Bottom] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object ResizeRegion {
  @scala.inline
  def apply(
    bottomRightCorner: js.UndefOr[Double] = js.undefined,
    sides: Bottom = null,
    size: js.UndefOr[Double] = js.undefined
  ): ResizeRegion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottomRightCorner)) __obj.updateDynamic("bottomRightCorner")(bottomRightCorner.get.asInstanceOf[js.Any])
    if (sides != null) __obj.updateDynamic("sides")(sides.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeRegion]
  }
}

