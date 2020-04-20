package typings.plotlyJs

import typings.plotlyJs.mod.Color
import typings.plotlyJs.mod.Font
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
  var activebgcolor: js.UndefOr[Color] = js.undefined
  var bgcolor: js.UndefOr[Color] = js.undefined
  var bordercolor: js.UndefOr[Color] = js.undefined
  var borderwidth: js.UndefOr[Double] = js.undefined
  var currentvalue: js.UndefOr[AnonOffset] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var len: js.UndefOr[Double] = js.undefined
  var lenmode: js.UndefOr[fraction | pixels] = js.undefined
  var minorticklen: js.UndefOr[Double] = js.undefined
  var pad: js.UndefOr[PartialPadding] = js.undefined
  var steps: js.UndefOr[js.Array[PartialSliderStep]] = js.undefined
  var tickcolor: js.UndefOr[Color] = js.undefined
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
    active: Int | Double = null,
    activebgcolor: Color = null,
    bgcolor: Color = null,
    bordercolor: Color = null,
    borderwidth: Int | Double = null,
    currentvalue: AnonOffset = null,
    font: Font = null,
    len: Int | Double = null,
    lenmode: fraction | pixels = null,
    minorticklen: Int | Double = null,
    pad: PartialPadding = null,
    steps: js.Array[PartialSliderStep] = null,
    tickcolor: Color = null,
    ticklen: Int | Double = null,
    tickwidth: Int | Double = null,
    transition: Transition = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    xanchor: auto | left | center | right = null,
    y: Int | Double = null,
    yanchor: auto | top | middle | bottom = null
  ): PartialSliderActive = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (activebgcolor != null) __obj.updateDynamic("activebgcolor")(activebgcolor.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (borderwidth != null) __obj.updateDynamic("borderwidth")(borderwidth.asInstanceOf[js.Any])
    if (currentvalue != null) __obj.updateDynamic("currentvalue")(currentvalue.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (len != null) __obj.updateDynamic("len")(len.asInstanceOf[js.Any])
    if (lenmode != null) __obj.updateDynamic("lenmode")(lenmode.asInstanceOf[js.Any])
    if (minorticklen != null) __obj.updateDynamic("minorticklen")(minorticklen.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (tickcolor != null) __obj.updateDynamic("tickcolor")(tickcolor.asInstanceOf[js.Any])
    if (ticklen != null) __obj.updateDynamic("ticklen")(ticklen.asInstanceOf[js.Any])
    if (tickwidth != null) __obj.updateDynamic("tickwidth")(tickwidth.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSliderActive]
  }
}

