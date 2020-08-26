package typings.megajs.mod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadOptions extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.native
  var name: String = js.native
  var previewImage: js.UndefOr[Buffer | Readable] = js.native
  var size: js.UndefOr[js.Any] = js.native
  var thumbnailImage: js.UndefOr[Buffer | Readable] = js.native
}

object UploadOptions {
  @scala.inline
  def apply(name: String): UploadOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
  @scala.inline
  implicit class UploadOptionsOps[Self <: UploadOptions] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: js.Object): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setPreviewImage(value: Buffer | Readable): Self = this.set("previewImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewImage: Self = this.set("previewImage", js.undefined)
    @scala.inline
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setThumbnailImage(value: Buffer | Readable): Self = this.set("thumbnailImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailImage: Self = this.set("thumbnailImage", js.undefined)
  }
  
}

