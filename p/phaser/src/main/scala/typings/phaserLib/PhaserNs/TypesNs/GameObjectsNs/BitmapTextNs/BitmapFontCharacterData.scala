package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs

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
  var centerX: scala.Double
  /**
    * The center y position of the character.
    */
  var centerY: scala.Double
  /**
    * Extra data for the character.
    */
  var data: js.Object
  /**
    * The height of the character.
    */
  var height: scala.Double
  /**
    * Kerning values, keyed by character code.
    */
  var kerning: org.scalablytyped.runtime.StringDictionary[scala.Double]
  /**
    * The width of the character.
    */
  var width: scala.Double
  /**
    * The x position of the character.
    */
  var x: scala.Double
  /**
    * The x offset of the character.
    */
  var xOffset: scala.Double
  /**
    * The y position of the character.
    */
  var y: scala.Double
  /**
    * The y offset of the character.
    */
  var yOffset: scala.Double
}

object BitmapFontCharacterData {
  @scala.inline
  def apply(
    centerX: scala.Double,
    centerY: scala.Double,
    data: js.Object,
    height: scala.Double,
    kerning: org.scalablytyped.runtime.StringDictionary[scala.Double],
    width: scala.Double,
    x: scala.Double,
    xOffset: scala.Double,
    y: scala.Double,
    yOffset: scala.Double
  ): BitmapFontCharacterData = {
    val __obj = js.Dynamic.literal(centerX = centerX, centerY = centerY, data = data, height = height, kerning = kerning, width = width, x = x, xOffset = xOffset, y = y, yOffset = yOffset)
  
    __obj.asInstanceOf[BitmapFontCharacterData]
  }
}

