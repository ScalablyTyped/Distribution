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

trait Slider extends js.Object {
  /**
    * Determines which button (by index starting from 0) is
    * considered active.
    */
  var active: Double
  /**
    * Sets the background color of the slider grip
    * while dragging.
    */
  var activebgcolor: Color
  /**
    * Sets the background color of the slider.
    */
  var bgcolor: Color
  /**
    * Sets the color of the border enclosing the slider.
    */
  var bordercolor: Color
  /**
    * Sets the width (in px) of the border enclosing the slider.
    */
  var borderwidth: Double
  var currentvalue: typings.plotlyJs.anon.Font
  /**
    * Sets the font of the slider step labels.
    */
  var font: Font
  /**
    * Sets the length of the slider
    * This measure excludes the padding of both ends.
    * That is, the slider's length is this length minus the
    * padding on both ends.
    */
  var len: Double
  /**
    * Determines whether this slider length
    * is set in units of plot *fraction* or in *pixels.
    * Use `len` to set the value.
    */
  var lenmode: fraction | pixels
  /**
    * Sets the length in pixels of minor step tick marks
    */
  var minorticklen: Double
  /**
    * Set the padding of the slider component along each side.
    */
  var pad: PartialPadding
  var steps: js.Array[PartialSliderStep]
  /**
    * Sets the color of the border enclosing the slider.
    */
  var tickcolor: Color
  /**
    * Sets the length in pixels of step tick marks
    */
  var ticklen: Double
  /**
    * Sets the tick width (in px).
    */
  var tickwidth: Double
  var transition: Transition
  /**
    * Determines whether or not the slider is visible.
    */
  var visible: Boolean
  /**
    * Sets the x position (in normalized coordinates) of the slider.
    */
  var x: Double
  /**
    * Sets the slider's horizontal position anchor.
    * This anchor binds the `x` position to the *left*, *center*
    * or *right* of the range selector.
    */
  var xanchor: auto | left | center | right
  /**
    * Sets the y position (in normalized coordinates) of the slider.
    */
  var y: Double
  /**
    * Sets the slider's vertical position anchor
    * This anchor binds the `y` position to the *top*, *middle*
    * or *bottom* of the range selector.
    */
  var yanchor: auto | top | middle | bottom
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
}

