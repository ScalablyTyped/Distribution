package typings.pixiJs.anon

import typings.pixiJs.PIXI.ALPHA_MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBitmap extends js.Object {
  var alphaMode: js.UndefOr[ALPHA_MODES] = js.native
  var autoLoad: js.UndefOr[Boolean] = js.native
  var createBitmap: js.UndefOr[Boolean] = js.native
  var crossorigin: js.UndefOr[Boolean] = js.native
}

object CreateBitmap {
  @scala.inline
  def apply(): CreateBitmap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBitmap]
  }
  @scala.inline
  implicit class CreateBitmapOps[Self <: CreateBitmap] (val x: Self) extends AnyVal {
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
    def setAlphaMode(value: ALPHA_MODES): Self = this.set("alphaMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphaMode: Self = this.set("alphaMode", js.undefined)
    @scala.inline
    def setAutoLoad(value: Boolean): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    @scala.inline
    def setCreateBitmap(value: Boolean): Self = this.set("createBitmap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateBitmap: Self = this.set("createBitmap", js.undefined)
    @scala.inline
    def setCrossorigin(value: Boolean): Self = this.set("crossorigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossorigin: Self = this.set("crossorigin", js.undefined)
  }
  
}

