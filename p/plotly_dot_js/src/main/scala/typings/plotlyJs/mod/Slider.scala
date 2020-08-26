package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialPadding
import typings.plotlyJs.anon.PartialSliderStep
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

@js.native
trait Slider extends js.Object {
  /**
    * Determines which button (by index starting from 0) is
    * considered active.
    */
  var active: Double = js.native
  /**
    * Sets the background color of the slider grip
    * while dragging.
    */
  var activebgcolor: Color = js.native
  /**
    * Sets the background color of the slider.
    */
  var bgcolor: Color = js.native
  /**
    * Sets the color of the border enclosing the slider.
    */
  var bordercolor: Color = js.native
  /**
    * Sets the width (in px) of the border enclosing the slider.
    */
  var borderwidth: Double = js.native
  var currentvalue: typings.plotlyJs.anon.Font = js.native
  /**
    * Sets the font of the slider step labels.
    */
  var font: Font = js.native
  /**
    * Sets the length of the slider
    * This measure excludes the padding of both ends.
    * That is, the slider's length is this length minus the
    * padding on both ends.
    */
  var len: Double = js.native
  /**
    * Determines whether this slider length
    * is set in units of plot *fraction* or in *pixels.
    * Use `len` to set the value.
    */
  var lenmode: fraction | pixels = js.native
  /**
    * Sets the length in pixels of minor step tick marks
    */
  var minorticklen: Double = js.native
  /**
    * Set the padding of the slider component along each side.
    */
  var pad: PartialPadding = js.native
  var steps: js.Array[PartialSliderStep] = js.native
  /**
    * Sets the color of the border enclosing the slider.
    */
  var tickcolor: Color = js.native
  /**
    * Sets the length in pixels of step tick marks
    */
  var ticklen: Double = js.native
  /**
    * Sets the tick width (in px).
    */
  var tickwidth: Double = js.native
  var transition: Transition = js.native
  /**
    * Determines whether or not the slider is visible.
    */
  var visible: Boolean = js.native
  /**
    * Sets the x position (in normalized coordinates) of the slider.
    */
  var x: Double = js.native
  /**
    * Sets the slider's horizontal position anchor.
    * This anchor binds the `x` position to the *left*, *center*
    * or *right* of the range selector.
    */
  var xanchor: auto | left | center | right = js.native
  /**
    * Sets the y position (in normalized coordinates) of the slider.
    */
  var y: Double = js.native
  /**
    * Sets the slider's vertical position anchor
    * This anchor binds the `y` position to the *top*, *middle*
    * or *bottom* of the range selector.
    */
  var yanchor: auto | top | middle | bottom = js.native
}

object Slider {
  @scala.inline
  def apply(
    active: Double,
    activebgcolor: Color,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Double,
    currentvalue: typings.plotlyJs.anon.Font,
    font: Font,
    len: Double,
    lenmode: fraction | pixels,
    minorticklen: Double,
    pad: PartialPadding,
    steps: js.Array[PartialSliderStep],
    tickcolor: Color,
    ticklen: Double,
    tickwidth: Double,
    transition: Transition,
    visible: Boolean,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): Slider = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], activebgcolor = activebgcolor.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], currentvalue = currentvalue.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], lenmode = lenmode.asInstanceOf[js.Any], minorticklen = minorticklen.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
  @scala.inline
  implicit class SliderOps[Self <: Slider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Double): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivebgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("activebgcolor", js.Array(value :_*))
    @scala.inline
    def setActivebgcolor(value: Color): Self = this.set("activebgcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bgcolor", js.Array(value :_*))
    @scala.inline
    def setBgcolor(value: Color): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bordercolor", js.Array(value :_*))
    @scala.inline
    def setBordercolor(value: Color): Self = this.set("bordercolor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderwidth(value: Double): Self = this.set("borderwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentvalue(value: typings.plotlyJs.anon.Font): Self = this.set("currentvalue", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setLen(value: Double): Self = this.set("len", value.asInstanceOf[js.Any])
    @scala.inline
    def setLenmode(value: fraction | pixels): Self = this.set("lenmode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinorticklen(value: Double): Self = this.set("minorticklen", value.asInstanceOf[js.Any])
    @scala.inline
    def setPad(value: PartialPadding): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepsVarargs(value: PartialSliderStep*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[PartialSliderStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("tickcolor", js.Array(value :_*))
    @scala.inline
    def setTickcolor(value: Color): Self = this.set("tickcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicklen(value: Double): Self = this.set("ticklen", value.asInstanceOf[js.Any])
    @scala.inline
    def setTickwidth(value: Double): Self = this.set("tickwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: Transition): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = this.set("yanchor", value.asInstanceOf[js.Any])
  }
  
}

