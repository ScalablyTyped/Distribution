package typings.ngFileUpload.mod.angularAugmentingMod.angularFileUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileResizeOptions extends js.Object {
  var centerCrop: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var pattern: js.UndefOr[String] = js.native
  var quality: js.UndefOr[Double] = js.native
  var ratio: js.UndefOr[Double | String] = js.native
  var resizeIf: js.UndefOr[ResizeIfFunction] = js.native
  var restoreExif: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object FileResizeOptions {
  @scala.inline
  def apply(): FileResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileResizeOptions]
  }
  @scala.inline
  implicit class FileResizeOptionsOps[Self <: FileResizeOptions] (val x: Self) extends AnyVal {
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
    def setCenterCrop(value: Boolean): Self = this.set("centerCrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterCrop: Self = this.set("centerCrop", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setRatio(value: Double | String): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    @scala.inline
    def setResizeIf(value: (/* width */ Double, /* height */ Double) => Boolean): Self = this.set("resizeIf", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResizeIf: Self = this.set("resizeIf", js.undefined)
    @scala.inline
    def setRestoreExif(value: Boolean): Self = this.set("restoreExif", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreExif: Self = this.set("restoreExif", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

