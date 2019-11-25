package typings.phaser.Phaser.Types.GameObjects.BitmapText

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bitmap Font data that can be used by a BitmapText Game Object.
  */
trait BitmapFontData extends js.Object {
  /**
    * The character data of the font, keyed by character code. Each character datum includes a position, size, offset and more.
    */
  var chars: NumberDictionary[BitmapFontCharacterData]
  /**
    * The name of the font.
    */
  var font: String
  /**
    * The line height of the font.
    */
  var lineHeight: Double
  /**
    * Whether this font is a retro font (monospace).
    */
  var retroFont: Boolean
  /**
    * The size of the font.
    */
  var size: Double
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
}

