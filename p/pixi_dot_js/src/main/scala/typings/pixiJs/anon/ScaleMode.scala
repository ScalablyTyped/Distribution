package typings.pixiJs.anon

import typings.pixiJs.PIXI.SCALE_MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleMode extends js.Object {
  var scaleMode: js.UndefOr[SCALE_MODES] = js.native
}

object ScaleMode {
  @scala.inline
  def apply(): ScaleMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleMode]
  }
  @scala.inline
  implicit class ScaleModeOps[Self <: ScaleMode] (val x: Self) extends AnyVal {
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
    def setScaleMode(value: SCALE_MODES): Self = this.set("scaleMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleMode: Self = this.set("scaleMode", js.undefined)
  }
  
}

