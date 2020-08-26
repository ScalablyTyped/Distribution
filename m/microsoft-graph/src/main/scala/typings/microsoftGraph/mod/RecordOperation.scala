package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordOperation extends CommsOperation {
  // The access token required to retrieve the recording.
  var recordingAccessToken: js.UndefOr[String] = js.native
  // The location where the recording is located.
  var recordingLocation: js.UndefOr[String] = js.native
}

object RecordOperation {
  @scala.inline
  def apply(): RecordOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordOperation]
  }
  @scala.inline
  implicit class RecordOperationOps[Self <: RecordOperation] (val x: Self) extends AnyVal {
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
    def setRecordingAccessToken(value: String): Self = this.set("recordingAccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordingAccessToken: Self = this.set("recordingAccessToken", js.undefined)
    @scala.inline
    def setRecordingLocation(value: String): Self = this.set("recordingLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordingLocation: Self = this.set("recordingLocation", js.undefined)
  }
  
}

