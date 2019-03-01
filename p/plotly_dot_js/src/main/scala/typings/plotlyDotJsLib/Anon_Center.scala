package typings
package plotlyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Center extends js.Object {
  /**
  		 * Sets the font of the current value label text.
  		 */
  var font: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Font]
  /**
  		 * The amount of space, in pixels, between the current value label
  		 * and the slider.
  		 */
  var offset: scala.Double
  /**
  		 * When currentvalue.visible is true, this sets the prefix of the label.
  		 */
  var prefix: java.lang.String
  /**
  		 * When currentvalue.visible is true, this sets the suffix of the label.
  		 */
  var suffix: java.lang.String
  /**
  		 * Shows the currently-selected value above the slider.
  		 */
  var visible: scala.Boolean
  /**
  		 * The alignment of the value readout relative to the length of the slider.
  		 */
  var xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right
}

object Anon_Center {
  @scala.inline
  def apply(
    font: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Font],
    offset: scala.Double,
    prefix: java.lang.String,
    suffix: java.lang.String,
    visible: scala.Boolean,
    xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right
  ): Anon_Center = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("suffix")(suffix)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Center]
  }
}

