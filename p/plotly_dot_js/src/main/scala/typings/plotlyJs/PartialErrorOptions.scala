package typings.plotlyJs

import typings.plotlyJs.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.ErrorOptions> */
trait PartialErrorOptions extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var symmetric: js.UndefOr[Boolean] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialErrorOptions {
  @scala.inline
  def apply(
    color: Color = null,
    opacity: Int | Double = null,
    symmetric: js.UndefOr[Boolean] = js.undefined,
    thickness: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): PartialErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(symmetric)) __obj.updateDynamic("symmetric")(symmetric.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialErrorOptions]
  }
}

