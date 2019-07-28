package typings.plotlyDotJs

import typings.plotlyDotJs.plotlyDotJsMod.Font
import typings.plotlyDotJs.plotlyDotJsStrings.center
import typings.plotlyDotJs.plotlyDotJsStrings.left
import typings.plotlyDotJs.plotlyDotJsStrings.right
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Center extends js.Object {
  /**
  		 * Sets the font of the current value label text.
  		 */
  var font: Partial[Font]
  /**
  		 * The amount of space, in pixels, between the current value label
  		 * and the slider.
  		 */
  var offset: Double
  /**
  		 * When currentvalue.visible is true, this sets the prefix of the label.
  		 */
  var prefix: String
  /**
  		 * When currentvalue.visible is true, this sets the suffix of the label.
  		 */
  var suffix: String
  /**
  		 * Shows the currently-selected value above the slider.
  		 */
  var visible: Boolean
  /**
  		 * The alignment of the value readout relative to the length of the slider.
  		 */
  var xanchor: left | center | right
}

object Anon_Center {
  @scala.inline
  def apply(
    font: Partial[Font],
    offset: Double,
    prefix: String,
    suffix: String,
    visible: Boolean,
    xanchor: left | center | right
  ): Anon_Center = {
    val __obj = js.Dynamic.literal(font = font, offset = offset, prefix = prefix, suffix = suffix, visible = visible, xanchor = xanchor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Center]
  }
}

