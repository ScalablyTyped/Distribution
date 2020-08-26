package typings.nodeOpenload.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadParam extends js.Object {
  var contentType: js.UndefOr[String] = js.native
  var file: String | ArrayBuffer = js.native
  var filename: js.UndefOr[String] = js.native
  var folder: js.UndefOr[String] = js.native
}

object UploadParam {
  @scala.inline
  def apply(file: String | ArrayBuffer): UploadParam = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadParam]
  }
  @scala.inline
  implicit class UploadParamOps[Self <: UploadParam] (val x: Self) extends AnyVal {
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
    def setFile(value: String | ArrayBuffer): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
  }
  
}

