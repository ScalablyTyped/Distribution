package typings.plottable.canvasDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFillStyle extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var `fill-opacity`: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object IFillStyle {
  @scala.inline
  def apply(
    fill: String = null,
    `fill-opacity`: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined
  ): IFillStyle = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(`fill-opacity`)) __obj.updateDynamic("fill-opacity")(`fill-opacity`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFillStyle]
  }
}

