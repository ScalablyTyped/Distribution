package typings
package phaserLib.PhaserNs.TypesNs.TexturesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteSheetConfig extends js.Object {
  /**
    * The total number of frames to extract from the Sprite Sheet. The default value of -1 means "extract all frames".
    */
  var endFrame: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The fixed height of each frame. If not set it will use the frameWidth as the height.
    */
  var frameHeight: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The fixed width of each frame.
    */
  var frameWidth: phaserLib.integer
  /**
    * If the frames have been drawn with a margin, specify the amount here.
    */
  var margin: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * If the frames have been drawn with spacing between them, specify the amount here.
    */
  var spacing: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * Skip a number of frames. Useful when there are multiple sprite sheets in one Texture.
    */
  var startFrame: js.UndefOr[phaserLib.integer] = js.undefined
}

object SpriteSheetConfig {
  @scala.inline
  def apply(
    frameWidth: phaserLib.integer,
    endFrame: js.UndefOr[phaserLib.integer] = js.undefined,
    frameHeight: js.UndefOr[phaserLib.integer] = js.undefined,
    margin: js.UndefOr[phaserLib.integer] = js.undefined,
    spacing: js.UndefOr[phaserLib.integer] = js.undefined,
    startFrame: js.UndefOr[phaserLib.integer] = js.undefined
  ): SpriteSheetConfig = {
    val __obj = js.Dynamic.literal(frameWidth = frameWidth)
    if (!js.isUndefined(endFrame)) __obj.updateDynamic("endFrame")(endFrame)
    if (!js.isUndefined(frameHeight)) __obj.updateDynamic("frameHeight")(frameHeight)
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin)
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing)
    if (!js.isUndefined(startFrame)) __obj.updateDynamic("startFrame")(startFrame)
    __obj.asInstanceOf[SpriteSheetConfig]
  }
}

