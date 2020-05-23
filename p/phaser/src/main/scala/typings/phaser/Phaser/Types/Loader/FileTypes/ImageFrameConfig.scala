package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageFrameConfig extends js.Object {
  /**
    * The frame to stop parsing at. If not provided it will calculate the value based on the image and frame dimensions.
    */
  var endFrame: js.UndefOr[integer] = js.undefined
  /**
    * The height of the frame in pixels. Uses the `frameWidth` value if not provided.
    */
  var frameHeight: js.UndefOr[integer] = js.undefined
  /**
    * The width of the frame in pixels.
    */
  var frameWidth: integer
  /**
    * The margin in the image. This is the space around the edge of the frames.
    */
  var margin: js.UndefOr[integer] = js.undefined
  /**
    * The spacing between each frame in the image.
    */
  var spacing: js.UndefOr[integer] = js.undefined
  /**
    * The first frame to start parsing from.
    */
  var startFrame: js.UndefOr[integer] = js.undefined
}

object ImageFrameConfig {
  @scala.inline
  def apply(
    frameWidth: integer,
    endFrame: js.UndefOr[integer] = js.undefined,
    frameHeight: js.UndefOr[integer] = js.undefined,
    margin: js.UndefOr[integer] = js.undefined,
    spacing: js.UndefOr[integer] = js.undefined,
    startFrame: js.UndefOr[integer] = js.undefined
  ): ImageFrameConfig = {
    val __obj = js.Dynamic.literal(frameWidth = frameWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(endFrame)) __obj.updateDynamic("endFrame")(endFrame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frameHeight)) __obj.updateDynamic("frameHeight")(frameHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startFrame)) __obj.updateDynamic("startFrame")(startFrame.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFrameConfig]
  }
}

