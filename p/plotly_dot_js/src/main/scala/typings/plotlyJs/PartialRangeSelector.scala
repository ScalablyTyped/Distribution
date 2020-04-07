package typings.plotlyJs

import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.RangeSelector> */
trait PartialRangeSelector extends js.Object {
  var activecolor: js.UndefOr[String] = js.undefined
  var bgcolor: js.UndefOr[String] = js.undefined
  var bordercolor: js.UndefOr[String] = js.undefined
  var borderwidth: js.UndefOr[Double] = js.undefined
  var buttons: js.UndefOr[js.Array[PartialRangeSelectorButto]] = js.undefined
  var font: js.UndefOr[PartialFont] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
}

object PartialRangeSelector {
  @scala.inline
  def apply(
    activecolor: String = null,
    bgcolor: String = null,
    bordercolor: String = null,
    borderwidth: Int | Double = null,
    buttons: js.Array[PartialRangeSelectorButto] = null,
    font: PartialFont = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    xanchor: auto | left | center | right = null,
    y: Int | Double = null,
    yanchor: auto | top | middle | bottom = null
  ): PartialRangeSelector = {
    val __obj = js.Dynamic.literal()
    if (activecolor != null) __obj.updateDynamic("activecolor")(activecolor.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (borderwidth != null) __obj.updateDynamic("borderwidth")(borderwidth.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRangeSelector]
  }
}

