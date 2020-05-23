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
    endFrame: js.UndefOr[integer] = js.undefined,
    frameHeight: js.UndefOr[integer] = js.undefined,
    margin: js.UndefOr[integer] = js.undefined,
    spacing: js.UndefOr[integer] = js.undefined,
    startFrame: js.UndefOr[integer] = js.undefined
  ): SpriteSheetConfig = {
    val __obj = js.Dynamic.literal(frameWidth = frameWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(endFrame)) __obj.updateDynamic("endFrame")(endFrame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frameHeight)) __obj.updateDynamic("frameHeight")(frameHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startFrame)) __obj.updateDynamic("startFrame")(startFrame.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheetConfig]
  }
}

