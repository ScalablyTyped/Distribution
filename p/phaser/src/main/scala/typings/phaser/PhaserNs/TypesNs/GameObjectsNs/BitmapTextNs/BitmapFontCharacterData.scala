package typings.phaser.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The font data for an individual character of a Bitmap Font.
  * 
  * Describes the character's position, size, offset and kerning.
  */
trait BitmapFontCharacterData extends js.Object {
  /**
    * The center x position of the character.
    */
  var centerX: Double
  /**
    * The center y position of the character.
    */
  var centerY: Double
  /**
    * Extra data for the character.
    */
  var data: js.Object
  /**
    * The height of the character.
    */
  var height: Double
  /**
    * Kerning values, keyed by character code.
    */
  var kerning: StringDictionary[Double]
  /**
    * The width of the character.
    */
  var width: Double
  /**
    * The x position of the character.
    */
  var x: Double
  /**
    * The x offset of the character.
    */
  var xOffset: Double
  /**
    * The y position of the character.
    */
  var y: Double
  /**
    * The y offset of the character.
    */
  var yOffset: Double
}

object BitmapFontCharacterData {
  @scala.inline
  def apply(
    centerX: Double,
    centerY: Double,
    data: js.Object,
    height: Double,
    kerning: StringDictionary[Double],
    width: Double,
    x: Double,
    xOffset: Double,
    y: Double,
    yOffset: Double
  ): BitmapFontCharacterData = {
    val __obj = js.Dynamic.literal(centerX = centerX, centerY = centerY, data = data, height = height, kerning = kerning, width = width, x = x, xOffset = xOffset, y = y, yOffset = yOffset)
  
    __obj.asInstanceOf[BitmapFontCharacterData]
  }
}

