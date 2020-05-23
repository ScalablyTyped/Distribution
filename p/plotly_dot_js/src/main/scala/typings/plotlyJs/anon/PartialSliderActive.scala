package typings.plotlyJs.anon

import typings.plotlyJs.mod.Transition
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.fraction
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.pixels
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Slider> */
trait PartialSliderActive extends js.Object {
  var active: js.UndefOr[Double] = js.undefined
  var activebgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var bordercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var borderwidth: js.UndefOr[Double] = js.undefined
  var currentvalue: js.UndefOr[Offset] = js.undefined
  var font: js.UndefOr[typings.plotlyJs.mod.Font] = js.undefined
  var len: js.UndefOr[Double] = js.undefined
  var lenmode: js.UndefOr[fraction | pixels] = js.undefined
  var minorticklen: js.UndefOr[Double] = js.undefined
  var pad: js.UndefOr[PartialPadding] = js.undefined
  var steps: js.UndefOr[js.Array[PartialSliderStep]] = js.undefined
  var tickcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var ticklen: js.UndefOr[Double] = js.undefined
  var tickwidth: js.UndefOr[Double] = js.undefined
  var transition: js.UndefOr[Transition] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
}

object PartialSliderActive {
  @scala.inline
  def apply(
    active: js.UndefOr[Double] = js.undefined,
    activebgcolor: typings.plotlyJs.mod.Color = null,
    bgcolor: typings.plotlyJs.mod.Color = null,
    bordercolor: typings.plotlyJs.mod.Color = null,
    borderwidth: js.UndefOr[Double] = js.undefined,
    currentvalue: Offset = null,
    font: typings.plotlyJs.mod.Font = null,
    len: js.UndefOr[Double] = js.undefined,
    lenmode: fraction | pixels = null,
    minorticklen: js.UndefOr[Double] = js.undefined,
    pad: PartialPadding = null,
    steps: js.Array[PartialSliderStep] = null,
    tickcolor: typings.plotlyJs.mod.Color = null,
    ticklen: js.UndefOr[Double] = js.undefined,
    tickwidth: js.UndefOr[Double] = js.undefined,
    transition: Transition = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    xanchor: auto | left | center | right = null,
    y: js.UndefOr[Double] = js.undefined,
    yanchor: auto | top | middle | bottom = null
  ): PartialSliderActive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (activebgcolor != null) __obj.updateDynamic("activebgcolor")(activebgcolor.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderwidth)) __obj.updateDynamic("borderwidth")(borderwidth.get.asInstanceOf[js.Any])
    if (currentvalue != null) __obj.updateDynamic("currentvalue")(currentvalue.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(len)) __obj.updateDynamic("len")(len.get.asInstanceOf[js.Any])
    if (lenmode != null) __obj.updateDynamic("lenmode")(lenmode.asInstanceOf[js.Any])
    if (!js.isUndefined(minorticklen)) __obj.updateDynamic("minorticklen")(minorticklen.get.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (tickcolor != null) __obj.updateDynamic("tickcolor")(tickcolor.asInstanceOf[js.Any])
    if (!js.isUndefined(ticklen)) __obj.updateDynamic("ticklen")(ticklen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickwidth)) __obj.updateDynamic("tickwidth")(tickwidth.get.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSliderActive]
  }
}

