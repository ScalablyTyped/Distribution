package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordingInfo extends js.Object {
  
  // The identities of the recording initiator.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Possible values are: unknown, notRecording, recording, or failed.
  var recordingStatus: js.UndefOr[RecordingStatus] = js.native
}
object RecordingInfo {
  
  @scala.inline
  def apply(): RecordingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordingInfo]
  }
  
  @scala.inline
  implicit class RecordingInfoOps[Self <: RecordingInfo] (val x: Self) extends AnyVal {
    
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
    def setInitiator(value: NullableOption[IdentitySet]): Self = this.set("initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiator: Self = this.set("initiator", js.undefined)
    
    @scala.inline
    def setInitiatorNull: Self = this.set("initiator", null)
    
    @scala.inline
    def setRecordingStatus(value: RecordingStatus): Self = this.set("recordingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordingStatus: Self = this.set("recordingStatus", js.undefined)
  }
}
