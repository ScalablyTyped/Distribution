package typings.plotlyJs

import typings.plotlyJs.mod.Datum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.RangeSlider> */
trait PartialRangeSlider extends js.Object {
  var bgcolor: js.UndefOr[String] = js.undefined
  var bordercolor: js.UndefOr[String] = js.undefined
  var borderwidth: js.UndefOr[Double] = js.undefined
  var range: js.UndefOr[js.Tuple2[Datum, Datum]] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PartialRangeSlider {
  @scala.inline
  def apply(
    bgcolor: String = null,
    bordercolor: String = null,
    borderwidth: Int | Double = null,
    range: js.Tuple2[Datum, Datum] = null,
    thickness: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PartialRangeSlider = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (borderwidth != null) __obj.updateDynamic("borderwidth")(borderwidth.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRangeSlider]
  }
}

