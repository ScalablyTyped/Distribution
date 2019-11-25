package typings.phaser.Phaser.Types.Textures

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteSheetConfig extends js.Object {
  /**
    * The total number of frames to extract from the Sprite Sheet. The default value of -1 means "extract all frames".
    */
  var endFrame: js.UndefOr[integer] = js.undefined
  /**
    * The fixed height of each frame. If not set it will use the frameWidth as the height.
    */
  var frameHeight: js.UndefOr[integer] = js.undefined
  /**
    * The fixed width of each frame.
    */
  var frameWidth: integer
  /**
    * If the frames have been drawn with a margin, specify the amount here.
    */
  var margin: js.UndefOr[integer] = js.undefined
  /**
    * If the frames have been drawn with spacing between them, specify the amount here.
    */
  var spacing: js.UndefOr[integer] = js.undefined
  /**
    * Skip a number of frames. Useful when there are multiple sprite sheets in one Texture.
    */
  var startFrame: js.UndefOr[integer] = js.undefined
}

object SpriteSheetConfig {
  @scala.inline
  def apply(
    frameWidth: integer,
    endFrame: Int | Double = null,
    frameHeight: Int | Double = null,
    margin: Int | Double = null,
    spacing: Int | Double = null,
    startFrame: Int | Double = null
  ): SpriteSheetConfig = {
    val __obj = js.Dynamic.literal(frameWidth = frameWidth.asInstanceOf[js.Any])
    if (endFrame != null) __obj.updateDynamic("endFrame")(endFrame.asInstanceOf[js.Any])
    if (frameHeight != null) __obj.updateDynamic("frameHeight")(frameHeight.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (startFrame != null) __obj.updateDynamic("startFrame")(startFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheetConfig]
  }
}

