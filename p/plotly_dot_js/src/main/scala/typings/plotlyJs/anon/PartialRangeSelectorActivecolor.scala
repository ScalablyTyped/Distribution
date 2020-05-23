package typings.plotlyJs.anon

import typings.plotlyJs.mod.RangeSelectorButton
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.RangeSelector> */
trait PartialRangeSelectorActivecolor extends js.Object {
  var activecolor: js.UndefOr[String] = js.undefined
  var bgcolor: js.UndefOr[String] = js.undefined
  var bordercolor: js.UndefOr[String] = js.undefined
  var borderwidth: js.UndefOr[Double] = js.undefined
  var buttons: js.UndefOr[js.Array[Partial[RangeSelectorButton]]] = js.undefined
  var font: js.UndefOr[Partial[typings.plotlyJs.mod.Font]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
}

object PartialRangeSelectorActivecolor {
  @scala.inline
  def apply(
    activecolor: String = null,
    bgcolor: String = null,
    bordercolor: String = null,
    borderwidth: js.UndefOr[Double] = js.undefined,
    buttons: js.Array[Partial[RangeSelectorButton]] = null,
    font: Partial[typings.plotlyJs.mod.Font] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    xanchor: auto | left | center | right = null,
    y: js.UndefOr[Double] = js.undefined,
    yanchor: auto | top | middle | bottom = null
  ): PartialRangeSelectorActivecolor = {
    val __obj = js.Dynamic.literal()
    if (activecolor != null) __obj.updateDynamic("activecolor")(activecolor.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderwidth)) __obj.updateDynamic("borderwidth")(borderwidth.get.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRangeSelectorActivecolor]
  }
}

