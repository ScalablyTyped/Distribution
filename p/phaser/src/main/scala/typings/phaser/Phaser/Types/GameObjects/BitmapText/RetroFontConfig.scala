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
  @JSName("offset.x")
  var offsetDotx: Double
  /**
    * If the font set doesn't start at the top left of the given image, specify the Y coordinate offset here.
    */
  @JSName("offset.y")
  var offsetDoty: Double
  /**
    * If the characters in the font set have horizontal spacing between them set the required amount here.
    */
  @JSName("spacing.x")
  var spacingDotx: Double
  /**
    * If the characters in the font set have vertical spacing between them set the required amount here.
    */
  @JSName("spacing.y")
  var spacingDoty: Double
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
    offsetDotx: Double,
    offsetDoty: Double,
    spacingDotx: Double,
    spacingDoty: Double,
    width: Double
  ): RetroFontConfig = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], charsPerRow = charsPerRow.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("offset.x")(offsetDotx.asInstanceOf[js.Any])
    __obj.updateDynamic("offset.y")(offsetDoty.asInstanceOf[js.Any])
    __obj.updateDynamic("spacing.x")(spacingDotx.asInstanceOf[js.Any])
    __obj.updateDynamic("spacing.y")(spacingDoty.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetroFontConfig]
  }
}

