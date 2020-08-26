package typings.ol.overlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanIntoViewOptions extends js.Object {
  var animation: js.UndefOr[PanOptions] = js.native
  var margin: js.UndefOr[Double] = js.native
}

object PanIntoViewOptions {
  @scala.inline
  def apply(): PanIntoViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanIntoViewOptions]
  }
  @scala.inline
  implicit class PanIntoViewOptionsOps[Self <: PanIntoViewOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: PanOptions): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
  }
  
}

