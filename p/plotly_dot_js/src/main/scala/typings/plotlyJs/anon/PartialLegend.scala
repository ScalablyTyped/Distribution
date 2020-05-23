package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.grouped
import typings.plotlyJs.plotlyJsStrings.h
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.normal
import typings.plotlyJs.plotlyJsStrings.reversed
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import typings.plotlyJs.plotlyJsStrings.v
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Legend> */
trait PartialLegend extends js.Object {
  var bgcolor: js.UndefOr[String] = js.undefined
  var bordercolor: js.UndefOr[String] = js.undefined
  var borderwidth: js.UndefOr[Double] = js.undefined
  var font: js.UndefOr[PartialFont] = js.undefined
  var orientation: js.UndefOr[v | h] = js.undefined
  var tracegroupgap: js.UndefOr[Double] = js.undefined
  var traceorder: js.UndefOr[grouped | normal | reversed] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
}

object PartialLegend {
  @scala.inline
  def apply(
    bgcolor: String = null,
    bordercolor: String = null,
    borderwidth: js.UndefOr[Double] = js.undefined,
    font: PartialFont = null,
    orientation: v | h = null,
    tracegroupgap: js.UndefOr[Double] = js.undefined,
    traceorder: grouped | normal | reversed = null,
    x: js.UndefOr[Double] = js.undefined,
    xanchor: auto | left | center | right = null,
    y: js.UndefOr[Double] = js.undefined,
    yanchor: auto | top | middle | bottom = null
  ): PartialLegend = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderwidth)) __obj.updateDynamic("borderwidth")(borderwidth.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(tracegroupgap)) __obj.updateDynamic("tracegroupgap")(tracegroupgap.get.asInstanceOf[js.Any])
    if (traceorder != null) __obj.updateDynamic("traceorder")(traceorder.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLegend]
  }
}

