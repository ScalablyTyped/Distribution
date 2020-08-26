package typings.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadResult extends js.Object {
  var upload: UploadRecord = js.native
}

object UploadResult {
  @scala.inline
  def apply(upload: UploadRecord): UploadResult = {
    val __obj = js.Dynamic.literal(upload = upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadResult]
  }
  @scala.inline
  implicit class UploadResultOps[Self <: UploadResult] (val x: Self) extends AnyVal {
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
    def setUpload(value: UploadRecord): Self = this.set("upload", value.asInstanceOf[js.Any])
  }
  
}

