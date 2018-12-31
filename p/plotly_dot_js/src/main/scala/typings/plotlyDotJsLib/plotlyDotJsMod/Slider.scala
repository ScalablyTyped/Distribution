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
  var currentvalue: plotlyDotJsLib.Anon_Visible
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

