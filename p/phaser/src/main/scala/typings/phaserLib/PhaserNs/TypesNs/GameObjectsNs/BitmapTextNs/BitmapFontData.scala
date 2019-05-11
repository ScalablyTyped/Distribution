package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs

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
  var chars: org.scalablytyped.runtime.NumberDictionary[BitmapFontCharacterData]
  /**
    * The name of the font.
    */
  var font: java.lang.String
  /**
    * The line height of the font.
    */
  var lineHeight: scala.Double
  /**
    * Whether this font is a retro font (monospace).
    */
  var retroFont: scala.Boolean
  /**
    * The size of the font.
    */
  var size: scala.Double
}

object BitmapFontData {
  @scala.inline
  def apply(
    chars: org.scalablytyped.runtime.NumberDictionary[BitmapFontCharacterData],
    font: java.lang.String,
    lineHeight: scala.Double,
    retroFont: scala.Boolean,
    size: scala.Double
  ): BitmapFontData = {
    val __obj = js.Dynamic.literal(chars = chars, font = font, lineHeight = lineHeight, retroFont = retroFont, size = size)
  
    __obj.asInstanceOf[BitmapFontData]
  }
}

