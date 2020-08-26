package typings.pixiJs.anon

import typings.pixiJs.PIXI.LINE_CAP
import typings.pixiJs.PIXI.LINE_JOIN
import typings.pixiJs.PIXI.Matrix
import typings.pixiJs.PIXI.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alignment extends js.Object {
  var alignment: js.UndefOr[Double] = js.native
  var alpha: js.UndefOr[Double] = js.native
  var cap: js.UndefOr[LINE_CAP] = js.native
  var color: js.UndefOr[Double] = js.native
  var join: js.UndefOr[LINE_JOIN] = js.native
  var matrix: js.UndefOr[Matrix] = js.native
  var miterLimit: js.UndefOr[Double] = js.native
  var native: js.UndefOr[Boolean] = js.native
  var texture: js.UndefOr[Texture] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Alignment {
  @scala.inline
  def apply(): Alignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alignment]
  }
  @scala.inline
  implicit class AlignmentOps[Self <: Alignment] (val x: Self) extends AnyVal {
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
    def setAlignment(value: Double): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setCap(value: LINE_CAP): Self = this.set("cap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCap: Self = this.set("cap", js.undefined)
    @scala.inline
    def setColor(value: Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setJoin(value: LINE_JOIN): Self = this.set("join", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    @scala.inline
    def setMatrix(value: Matrix): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatrix: Self = this.set("matrix", js.undefined)
    @scala.inline
    def setMiterLimit(value: Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiterLimit: Self = this.set("miterLimit", js.undefined)
    @scala.inline
    def setNative(value: Boolean): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative: Self = this.set("native", js.undefined)
    @scala.inline
    def setTexture(value: Texture): Self = this.set("texture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTexture: Self = this.set("texture", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

