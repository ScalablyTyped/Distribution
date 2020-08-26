package typings.phaser.Phaser.Types.Textures

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpriteSheetConfig extends js.Object {
  /**
    * The total number of frames to extract from the Sprite Sheet. The default value of -1 means "extract all frames".
    */
  var endFrame: js.UndefOr[integer] = js.native
  /**
    * The fixed height of each frame. If not set it will use the frameWidth as the height.
    */
  var frameHeight: js.UndefOr[integer] = js.native
  /**
    * The fixed width of each frame.
    */
  var frameWidth: integer = js.native
  /**
    * If the frames have been drawn with a margin, specify the amount here.
    */
  var margin: js.UndefOr[integer] = js.native
  /**
    * If the frames have been drawn with spacing between them, specify the amount here.
    */
  var spacing: js.UndefOr[integer] = js.native
  /**
    * Skip a number of frames. Useful when there are multiple sprite sheets in one Texture.
    */
  var startFrame: js.UndefOr[integer] = js.native
}

object SpriteSheetConfig {
  @scala.inline
  def apply(frameWidth: integer): SpriteSheetConfig = {
    val __obj = js.Dynamic.literal(frameWidth = frameWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheetConfig]
  }
  @scala.inline
  implicit class SpriteSheetConfigOps[Self <: SpriteSheetConfig] (val x: Self) extends AnyVal {
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

