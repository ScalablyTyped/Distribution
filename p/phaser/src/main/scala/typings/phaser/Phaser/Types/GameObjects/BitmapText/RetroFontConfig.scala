package typings.phaser.Phaser.Types.GameObjects.BitmapText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetroFontConfig extends js.Object {
  /**
    * The characters used in the font set, in display order. You can use the TEXT_SET consts for common font set arrangements.
    */
  var chars: String
  /**
    * The number of characters per row in the font set. If not given charsPerRow will be the image width / characterWidth.
    */
  var charsPerRow: Double
  /**
    * The height of each character in the font set.
    */
  var height: Double
  /**
    * The key of the image containing the font.
    */
  var image: String
  /**
    * The amount of vertical space to add to the line height of the font.
    */
  var lineSpacing: Double
  /**
    * If the font set doesn't start at the top left of the given image, specify the X coordinate offset here.
    */
  var `offset.x`: Double
  /**
    * If the font set doesn't start at the top left of the given image, specify the Y coordinate offset here.
    */
  var `offset.y`: Double
  /**
    * If the characters in the font set have horizontal spacing between them set the required amount here.
    */
  var `spacing.x`: Double
  /**
    * If the characters in the font set have vertical spacing between them set the required amount here.
    */
  var `spacing.y`: Double
  /**
    * The width of each character in the font set.
    */
  var width: Double
}

object RetroFontConfig {
  @scala.inline
  def apply(
    chars: String,
    charsPerRow: Double,
    height: Double,
    image: String,
    lineSpacing: Double,
    `offset.x`: Double,
    `offset.y`: Double,
    `spacing.x`: Double,
    `spacing.y`: Double,
    width: Double
  ): RetroFontConfig = {
    val __obj = js.Dynamic.literal(chars = chars, charsPerRow = charsPerRow, height = height, image = image, lineSpacing = lineSpacing, width = width)
    __obj.updateDynamic("offset.x")(`offset.x`)
    __obj.updateDynamic("offset.y")(`offset.y`)
    __obj.updateDynamic("spacing.x")(`spacing.x`)
    __obj.updateDynamic("spacing.y")(`spacing.y`)
    __obj.asInstanceOf[RetroFontConfig]
  }
}

