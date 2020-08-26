package typings.omggif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var disposal: js.UndefOr[Double] = js.native
  var palette: js.UndefOr[js.Array[Double] | Null] = js.native
  var transparent: js.UndefOr[Double] = js.native
}

object FrameOptions {
  @scala.inline
  def apply(): FrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameOptions]
  }
  @scala.inline
  implicit class FrameOptionsOps[Self <: FrameOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDisposal(value: Double): Self = this.set("disposal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisposal: Self = this.set("disposal", js.undefined)
    @scala.inline
    def setPaletteVarargs(value: Double*): Self = this.set("palette", js.Array(value :_*))
    @scala.inline
    def setPalette(value: js.Array[Double]): Self = this.set("palette", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    @scala.inline
    def setPaletteNull: Self = this.set("palette", null)
    @scala.inline
    def setTransparent(value: Double): Self = this.set("transparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
  }
  
}

