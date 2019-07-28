package typings.phaser.PhaserNs.TypesNs.TexturesNs

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteSheetFromAtlasConfig extends js.Object {
  /**
    * The key of the Texture Atlas in which this Sprite Sheet can be found.
    */
  var atlas: String
  /**
    * The total number of frames to extract from the Sprite Sheet. The default value of -1 means "extract all frames".
    */
  var endFrame: js.UndefOr[integer] = js.undefined
  /**
    * The key of the Texture Atlas Frame in which this Sprite Sheet can be found.
    */
  var frame: String
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

object SpriteSheetFromAtlasConfig {
  @scala.inline
  def apply(
    atlas: String,
    frame: String,
    frameWidth: integer,
    endFrame: js.UndefOr[integer] = js.undefined,
    frameHeight: js.UndefOr[integer] = js.undefined,
    margin: js.UndefOr[integer] = js.undefined,
    spacing: js.UndefOr[integer] = js.undefined,
    startFrame: js.UndefOr[integer] = js.undefined
  ): SpriteSheetFromAtlasConfig = {
    val __obj = js.Dynamic.literal(atlas = atlas, frame = frame, frameWidth = frameWidth)
    if (!js.isUndefined(endFrame)) __obj.updateDynamic("endFrame")(endFrame)
    if (!js.isUndefined(frameHeight)) __obj.updateDynamic("frameHeight")(frameHeight)
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin)
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing)
    if (!js.isUndefined(startFrame)) __obj.updateDynamic("startFrame")(startFrame)
    __obj.asInstanceOf[SpriteSheetFromAtlasConfig]
  }
}

