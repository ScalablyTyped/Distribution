package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraOptions extends js.Object {
  var allowEdit: js.UndefOr[Boolean] = js.native
  var correctOrientation: js.UndefOr[Boolean] = js.native
  var destinationType: js.UndefOr[Double] = js.native
  var encodingType: js.UndefOr[Double] = js.native
  var mediaType: js.UndefOr[Double] = js.native
  var popoverOptions: js.UndefOr[CameraPopoverOptions] = js.native
  var quality: js.UndefOr[Double] = js.native
  var saveToPhotoAlbum: js.UndefOr[Boolean] = js.native
  var sourceType: js.UndefOr[Double] = js.native
  var targetHeight: js.UndefOr[Double] = js.native
  var targetWidth: js.UndefOr[Double] = js.native
}

object CameraOptions {
  @scala.inline
  def apply(): CameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptions]
  }
  @scala.inline
  implicit class CameraOptionsOps[Self <: CameraOptions] (val x: Self) extends AnyVal {
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
    def setAllowEdit(value: Boolean): Self = this.set("allowEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEdit: Self = this.set("allowEdit", js.undefined)
    @scala.inline
    def setCorrectOrientation(value: Boolean): Self = this.set("correctOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrectOrientation: Self = this.set("correctOrientation", js.undefined)
    @scala.inline
    def setDestinationType(value: Double): Self = this.set("destinationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationType: Self = this.set("destinationType", js.undefined)
    @scala.inline
    def setEncodingType(value: Double): Self = this.set("encodingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodingType: Self = this.set("encodingType", js.undefined)
    @scala.inline
    def setMediaType(value: Double): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    @scala.inline
    def setPopoverOptions(value: CameraPopoverOptions): Self = this.set("popoverOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverOptions: Self = this.set("popoverOptions", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setSaveToPhotoAlbum(value: Boolean): Self = this.set("saveToPhotoAlbum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveToPhotoAlbum: Self = this.set("saveToPhotoAlbum", js.undefined)
    @scala.inline
    def setSourceType(value: Double): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    @scala.inline
    def setTargetHeight(value: Double): Self = this.set("targetHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetHeight: Self = this.set("targetHeight", js.undefined)
    @scala.inline
    def setTargetWidth(value: Double): Self = this.set("targetWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetWidth: Self = this.set("targetWidth", js.undefined)
  }
  
}

