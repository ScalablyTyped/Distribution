package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMessageRequest extends EventMessage {
  
  /**
    * True if the meeting organizer allows invitees to propose a new time when responding, false otherwise. Optional. Default
    * is true.
    */
  var allowNewTimeProposals: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var meetingRequestType: js.UndefOr[NullableOption[MeetingRequestType]] = js.native
  
  // If the meeting update changes the meeting end time, this property specifies the previous meeting end time.
  var previousEndDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  // If the meeting update changes the meeting location, this property specifies the previous meeting location.
  var previousLocation: js.UndefOr[NullableOption[Location]] = js.native
  
  // If the meeting update changes the meeting start time, this property specifies the previous meeting start time.
  var previousStartDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  // Set to true if the sender would like the invitee to send a response to the requested meeting.
  var responseRequested: js.UndefOr[NullableOption[Boolean]] = js.native
}
object EventMessageRequest {
  
  @scala.inline
  def apply(): EventMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventMessageRequest]
  }
  
  @scala.inline
  implicit class EventMessageRequestOps[Self <: EventMessageRequest] (val x: Self) extends AnyVal {
    
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
    def setAllowNewTimeProposals(value: NullableOption[Boolean]): Self = this.set("allowNewTimeProposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNewTimeProposals: Self = this.set("allowNewTimeProposals", js.undefined)
    
    @scala.inline
    def setAllowNewTimeProposalsNull: Self = this.set("allowNewTimeProposals", null)
    
    @scala.inline
    def setMeetingRequestType(value: NullableOption[MeetingRequestType]): Self = this.set("meetingRequestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeetingRequestType: Self = this.set("meetingRequestType", js.undefined)
    
    @scala.inline
    def setMeetingRequestTypeNull: Self = this.set("meetingRequestType", null)
    
    @scala.inline
    def setPreviousEndDateTime(value: NullableOption[DateTimeTimeZone]): Self = this.set("previousEndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousEndDateTime: Self = this.set("previousEndDateTime", js.undefined)
    
    @scala.inline
    def setPreviousEndDateTimeNull: Self = this.set("previousEndDateTime", null)
    
    @scala.inline
    def setPreviousLocation(value: NullableOption[Location]): Self = this.set("previousLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousLocation: Self = this.set("previousLocation", js.undefined)
    
    @scala.inline
    def setPreviousLocationNull: Self = this.set("previousLocation", null)
    
    @scala.inline
    def setPreviousStartDateTime(value: NullableOption[DateTimeTimeZone]): Self = this.set("previousStartDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousStartDateTime: Self = this.set("previousStartDateTime", js.undefined)
    
    @scala.inline
    def setPreviousStartDateTimeNull: Self = this.set("previousStartDateTime", null)
    
    @scala.inline
    def setResponseRequested(value: NullableOption[Boolean]): Self = this.set("responseRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseRequested: Self = this.set("responseRequested", js.undefined)
    
    @scala.inline
    def setResponseRequestedNull: Self = this.set("responseRequested", null)
  }
}
