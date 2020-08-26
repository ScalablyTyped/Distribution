package typings.phaser.Phaser.Types.GameObjects.BitmapText

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bitmap Font data that can be used by a BitmapText Game Object.
  */
@js.native
trait BitmapFontData extends js.Object {
  /**
    * The character data of the font, keyed by character code. Each character datum includes a position, size, offset and more.
    */
  var chars: NumberDictionary[BitmapFontCharacterData] = js.native
  /**
    * The name of the font.
    */
  var font: String = js.native
  /**
    * The line height of the font.
    */
  var lineHeight: Double = js.native
  /**
    * Whether this font is a retro font (monospace).
    */
  var retroFont: Boolean = js.native
  /**
    * The size of the font.
    */
  var size: Double = js.native
}

object BitmapFontData {
  @scala.inline
  def apply(
    chars: NumberDictionary[BitmapFontCharacterData],
    font: String,
    lineHeight: Double,
    retroFont: Boolean,
    size: Double
  ): BitmapFontData = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], retroFont = retroFont.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapFontData]
  }
  @scala.inline
  implicit class BitmapFontDataOps[Self <: BitmapFontData] (val x: Self) extends AnyVal {
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
    def setChars(value: NumberDictionary[BitmapFontCharacterData]): Self = this.set("chars", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetroFont(value: Boolean): Self = this.set("retroFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

