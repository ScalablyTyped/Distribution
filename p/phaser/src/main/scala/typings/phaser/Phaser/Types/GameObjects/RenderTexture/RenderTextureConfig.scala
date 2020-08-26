package typings.phaser.Phaser.Types.GameObjects.RenderTexture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderTextureConfig extends js.Object {
  /**
    * the frame to make the RenderTexture from.
    */
  var frame: js.UndefOr[String] = js.native
  /**
    * The height of the RenderTexture.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The texture key to make the RenderTexture from.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The width of the RenderTexture.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The x coordinate of the RenderTextures position.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y coordinate of the RenderTextures position.
    */
  var y: js.UndefOr[Double] = js.native
}

object RenderTextureConfig {
  @scala.inline
  def apply(): RenderTextureConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderTextureConfig]
  }
  @scala.inline
  implicit class RenderTextureConfigOps[Self <: RenderTextureConfig] (val x: Self) extends AnyVal {
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
    def setFrame(value: String): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

