package typings.pixiJs.anon

import typings.pixiJs.PIXI.Matrix
import typings.pixiJs.PIXI.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var alpha: js.UndefOr[Double] = js.native
  var color: js.UndefOr[Double] = js.native
  var matrix: js.UndefOr[Matrix] = js.native
  var texture: js.UndefOr[Texture] = js.native
}

object Color {
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setColor(value: Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setMatrix(value: Matrix): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatrix: Self = this.set("matrix", js.undefined)
    @scala.inline
    def setTexture(value: Texture): Self = this.set("texture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTexture: Self = this.set("texture", js.undefined)
  }
  
}

