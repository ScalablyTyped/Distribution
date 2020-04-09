package typings.plotlyJs

import typings.plotlyJs.mod.Font
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFont extends js.Object {
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

object AnonFont {
  @scala.inline
  def apply(
    font: Partial[Font],
    offset: Double,
    prefix: String,
    suffix: String,
    visible: Boolean,
    xanchor: left | center | right
  ): AnonFont = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFont]
  }
}

