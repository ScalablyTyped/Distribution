package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slider extends js.Object {
  /**
  	 * Determines which button (by index starting from 0) is
  	 * considered active.
  	 */
  var active: scala.Double
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
  var borderwidth: scala.Double
  var currentvalue: plotlyDotJsLib.Anon_Center
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
  var len: scala.Double
  /**
  	 * Determines whether this slider length
  	 * is set in units of plot *fraction* or in *pixels.
  	 * Use `len` to set the value.
  	 */
  var lenmode: plotlyDotJsLib.plotlyDotJsLibStrings.fraction | plotlyDotJsLib.plotlyDotJsLibStrings.pixels
  /**
  	 * Sets the length in pixels of minor step tick marks
  	 */
  var minorticklen: scala.Double
  /**
  	 * Set the padding of the slider component along each side.
  	 */
  var pad: stdLib.Partial[Padding]
  var steps: js.Array[stdLib.Partial[SliderStep]]
  /**
  	 * Sets the color of the border enclosing the slider.
  	 */
  var tickcolor: Color
  /**
  	 * Sets the length in pixels of step tick marks
  	 */
  var ticklen: scala.Double
  /**
  	 * Sets the tick width (in px).
  	 */
  var tickwidth: scala.Double
  var transition: Transition
  /**
  	 * Determines whether or not the slider is visible.
  	 */
  var visible: scala.Boolean
  /**
  	 * Sets the x position (in normalized coordinates) of the slider.
  	 */
  var x: scala.Double
  /**
  	 * Sets the slider's horizontal position anchor.
  	 * This anchor binds the `x` position to the *left*, *center*
  	 * or *right* of the range selector.
  	 */
  var xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right
  /**
  	 * Sets the y position (in normalized coordinates) of the slider.
  	 */
  var y: scala.Double
  /**
  	 * Sets the slider's vertical position anchor
  	 * This anchor binds the `y` position to the *top*, *middle*
  	 * or *bottom* of the range selector.
  	 */
  var yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
}

object Slider {
  @scala.inline
  def apply(
    active: scala.Double,
    activebgcolor: Color,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: scala.Double,
    currentvalue: plotlyDotJsLib.Anon_Center,
    font: Font,
    len: scala.Double,
    lenmode: plotlyDotJsLib.plotlyDotJsLibStrings.fraction | plotlyDotJsLib.plotlyDotJsLibStrings.pixels,
    minorticklen: scala.Double,
    pad: stdLib.Partial[Padding],
    steps: js.Array[stdLib.Partial[SliderStep]],
    tickcolor: Color,
    ticklen: scala.Double,
    tickwidth: scala.Double,
    transition: Transition,
    visible: scala.Boolean,
    x: scala.Double,
    xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right,
    y: scala.Double,
    yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
  ): Slider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("activebgcolor")(activebgcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    __obj.updateDynamic("borderwidth")(borderwidth)
    __obj.updateDynamic("currentvalue")(currentvalue)
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("len")(len)
    __obj.updateDynamic("lenmode")(lenmode.asInstanceOf[js.Any])
    __obj.updateDynamic("minorticklen")(minorticklen)
    __obj.updateDynamic("pad")(pad)
    __obj.updateDynamic("steps")(steps)
    __obj.updateDynamic("tickcolor")(tickcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("ticklen")(ticklen)
    __obj.updateDynamic("tickwidth")(tickwidth)
    __obj.updateDynamic("transition")(transition)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
}

