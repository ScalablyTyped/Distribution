package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileAssessmentRequest extends ThreatAssessmentRequest {
  // Base64 encoded file content. The file content cannot fetch back because it isn't stored.
  var contentData: js.UndefOr[String] = js.native
  // The file name.
  var fileName: js.UndefOr[String] = js.native
}

object FileAssessmentRequest {
  @scala.inline
  def apply(): FileAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileAssessmentRequest]
  }
  @scala.inline
  implicit class FileAssessmentRequestOps[Self <: FileAssessmentRequest] (val x: Self) extends AnyVal {
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
    def setContentData(value: String): Self = this.set("contentData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentData: Self = this.set("contentData", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
  }
  
}

