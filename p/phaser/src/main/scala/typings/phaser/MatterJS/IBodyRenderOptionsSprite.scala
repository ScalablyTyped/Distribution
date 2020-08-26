package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBodyRenderOptionsSprite extends js.Object {
  /**
    * A `Number` that defines the scaling in the x-axis for the sprite, if any.
    *
    * @property xOffset
    * @type number
    * @default 0
    */
  var xOffset: Double = js.native
  /**
    * A `Number` that defines the scaling in the y-axis for the sprite, if any.
    *
    * @property yOffset
    * @type number
    * @default 0
    */
  var yOffset: Double = js.native
}

object IBodyRenderOptionsSprite {
  @scala.inline
  def apply(xOffset: Double, yOffset: Double): IBodyRenderOptionsSprite = {
    val __obj = js.Dynamic.literal(xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBodyRenderOptionsSprite]
  }
  @scala.inline
  implicit class IBodyRenderOptionsSpriteOps[Self <: IBodyRenderOptionsSprite] (val x: Self) extends AnyVal {
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
    def setXOffset(value: Double): Self = this.set("xOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setYOffset(value: Double): Self = this.set("yOffset", value.asInstanceOf[js.Any])
  }
  
}

