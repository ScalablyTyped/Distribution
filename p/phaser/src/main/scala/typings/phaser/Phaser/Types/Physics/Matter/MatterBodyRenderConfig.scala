package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterBodyRenderConfig extends js.Object {
  /**
    * The color value of the fill when rendering this body.
    */
  var fillColor: js.UndefOr[Double] = js.native
  /**
    * The opacity of the fill when rendering this body, a value between 0 and 1.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * The color value of the line stroke when rendering this body.
    */
  var lineColor: js.UndefOr[Double] = js.native
  /**
    * The opacity of the line when rendering this body, a value between 0 and 1.
    */
  var lineOpacity: js.UndefOr[Double] = js.native
  /**
    * If rendering lines, the thickness of the line.
    */
  var lineThickness: js.UndefOr[Double] = js.native
  /**
    * The opacity of the body and all parts within it.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Controls the offset between the body and the parent Game Object, if it has one.
    */
  var sprite: js.UndefOr[js.Object] = js.native
  /**
    * The horizontal offset between the body and the parent Game Object texture, if it has one.
    */
  @JSName("sprite.xOffset")
  var spriteDotxOffset: js.UndefOr[Double] = js.native
  /**
    * The vertical offset between the body and the parent Game Object texture, if it has one.
    */
  @JSName("sprite.yOffset")
  var spriteDotyOffset: js.UndefOr[Double] = js.native
  /**
    * Should this body be rendered by the Debug Renderer?
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object MatterBodyRenderConfig {
  @scala.inline
  def apply(): MatterBodyRenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterBodyRenderConfig]
  }
  @scala.inline
  implicit class MatterBodyRenderConfigOps[Self <: MatterBodyRenderConfig] (val x: Self) extends AnyVal {
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
    def setFillColor(value: Double): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setLineColor(value: Double): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    @scala.inline
    def setLineOpacity(value: Double): Self = this.set("lineOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineOpacity: Self = this.set("lineOpacity", js.undefined)
    @scala.inline
    def setLineThickness(value: Double): Self = this.set("lineThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineThickness: Self = this.set("lineThickness", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSprite(value: js.Object): Self = this.set("sprite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSprite: Self = this.set("sprite", js.undefined)
    @scala.inline
    def setSpriteDotxOffset(value: Double): Self = this.set("sprite.xOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpriteDotxOffset: Self = this.set("sprite.xOffset", js.undefined)
    @scala.inline
    def setSpriteDotyOffset(value: Double): Self = this.set("sprite.yOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpriteDotyOffset: Self = this.set("sprite.yOffset", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

