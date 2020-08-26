package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageFrameConfig extends js.Object {
  /**
    * The frame to stop parsing at. If not provided it will calculate the value based on the image and frame dimensions.
    */
  var endFrame: js.UndefOr[integer] = js.native
  /**
    * The height of the frame in pixels. Uses the `frameWidth` value if not provided.
    */
  var frameHeight: js.UndefOr[integer] = js.native
  /**
    * The width of the frame in pixels.
    */
  var frameWidth: integer = js.native
  /**
    * The margin in the image. This is the space around the edge of the frames.
    */
  var margin: js.UndefOr[integer] = js.native
  /**
    * The spacing between each frame in the image.
    */
  var spacing: js.UndefOr[integer] = js.native
  /**
    * The first frame to start parsing from.
    */
  var startFrame: js.UndefOr[integer] = js.native
}

object ImageFrameConfig {
  @scala.inline
  def apply(frameWidth: integer): ImageFrameConfig = {
    val __obj = js.Dynamic.literal(frameWidth = frameWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFrameConfig]
  }
  @scala.inline
  implicit class ImageFrameConfigOps[Self <: ImageFrameConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrameWidth(value: integer): Self = this.set("frameWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndFrame(value: integer): Self = this.set("endFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndFrame: Self = this.set("endFrame", js.undefined)
    @scala.inline
    def setFrameHeight(value: integer): Self = this.set("frameHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameHeight: Self = this.set("frameHeight", js.undefined)
    @scala.inline
    def setMargin(value: integer): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setSpacing(value: integer): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setStartFrame(value: integer): Self = this.set("startFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartFrame: Self = this.set("startFrame", js.undefined)
  }
  
}

