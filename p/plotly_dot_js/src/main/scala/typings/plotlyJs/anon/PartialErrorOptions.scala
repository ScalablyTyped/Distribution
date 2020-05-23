package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.ErrorOptions> */
trait PartialErrorOptions extends js.Object {
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var symmetric: js.UndefOr[Boolean] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialErrorOptions {
  @scala.inline
  def apply(
    color: typings.plotlyJs.mod.Color = null,
    opacity: js.UndefOr[Double] = js.undefined,
    symmetric: js.UndefOr[Boolean] = js.undefined,
    thickness: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PartialErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(symmetric)) __obj.updateDynamic("symmetric")(symmetric.get.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialErrorOptions]
  }
}

