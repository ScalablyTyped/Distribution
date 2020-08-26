package typings.openfin.webcontentsWebcontentsMod

import typings.openfin.windowWindowMod.Area
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapturePageOptions extends js.Object {
  var area: js.UndefOr[Area] = js.native
  var format: js.UndefOr[ImageFormat] = js.native
  var quality: js.UndefOr[Double] = js.native
}

object CapturePageOptions {
  @scala.inline
  def apply(): CapturePageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapturePageOptions]
  }
  @scala.inline
  implicit class CapturePageOptionsOps[Self <: CapturePageOptions] (val x: Self) extends AnyVal {
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
    def setArea(value: Area): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setFormat(value: ImageFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

