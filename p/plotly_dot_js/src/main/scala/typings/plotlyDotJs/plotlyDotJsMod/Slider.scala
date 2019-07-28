package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.Anon_Center
import typings.plotlyDotJs.plotlyDotJsStrings.auto
import typings.plotlyDotJs.plotlyDotJsStrings.bottom
import typings.plotlyDotJs.plotlyDotJsStrings.center
import typings.plotlyDotJs.plotlyDotJsStrings.fraction
import typings.plotlyDotJs.plotlyDotJsStrings.left
import typings.plotlyDotJs.plotlyDotJsStrings.middle
import typings.plotlyDotJs.plotlyDotJsStrings.pixels
import typings.plotlyDotJs.plotlyDotJsStrings.right
import typings.plotlyDotJs.plotlyDotJsStrings.top
import typings.std.Partial
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
  var currentvalue: Anon_Center
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
  var pad: Partial[Padding]
  var steps: js.Array[Partial[SliderStep]]
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
    currentvalue: Anon_Center,
    font: Font,
    len: Double,
    lenmode: fraction | pixels,
    minorticklen: Double,
    pad: Partial[Padding],
    steps: js.Array[Partial[SliderStep]],
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
    val __obj = js.Dynamic.literal(active = active, activebgcolor = activebgcolor.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth, currentvalue = currentvalue, font = font, len = len, lenmode = lenmode.asInstanceOf[js.Any], minorticklen = minorticklen, pad = pad, steps = steps, tickcolor = tickcolor.asInstanceOf[js.Any], ticklen = ticklen, tickwidth = tickwidth, transition = transition, visible = visible, x = x, xanchor = xanchor.asInstanceOf[js.Any], y = y, yanchor = yanchor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Slider]
  }
}

