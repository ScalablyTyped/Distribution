package typings.phaser

import typings.phaser.phaserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  /**
    * The key of the font to use from the BitmapFont cache.
    */
  var font: js.UndefOr[String] = js.undefined
  /**
    * The font size to set.
    */
  var size: js.UndefOr[Double | `false`] = js.undefined
  /**
    * The string, or array of strings, to be set as the content of this Bitmap Text.
    */
  var text: js.UndefOr[String] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(font: String = null, size: Double | `false` = null, text: String = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

