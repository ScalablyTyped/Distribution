package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSession extends js.Object {
  /**
    * The date and time in UTC that the upload session will expire. The complete file must be uploaded before this expiration
    * time is reached.
    */
  var expirationDateTime: js.UndefOr[String] = js.native
  /**
    * A collection of byte ranges that the server is missing for the file. These ranges are zero indexed and of the format
    * 'start-end' (e.g. '0-26' to indicate the first 27 bytes of the file). When uploading files as Outlook attachments,
    * instead of a collection of ranges, this property always indicates a single value '{start}', the location in the file
    * where the next upload should begin.
    */
  var nextExpectedRanges: js.UndefOr[js.Array[String]] = js.native
  // The URL endpoint that accepts PUT requests for byte ranges of the file.
  var uploadUrl: js.UndefOr[String] = js.native
}

object UploadSession {
  @scala.inline
  def apply(): UploadSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSession]
  }
  @scala.inline
  implicit class UploadSessionOps[Self <: UploadSession] (val x: Self) extends AnyVal {
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
    def setExpirationDateTime(value: String): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    @scala.inline
    def setNextExpectedRangesVarargs(value: String*): Self = this.set("nextExpectedRanges", js.Array(value :_*))
    @scala.inline
    def setNextExpectedRanges(value: js.Array[String]): Self = this.set("nextExpectedRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextExpectedRanges: Self = this.set("nextExpectedRanges", js.undefined)
    @scala.inline
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadUrl: Self = this.set("uploadUrl", js.undefined)
  }
  
}

