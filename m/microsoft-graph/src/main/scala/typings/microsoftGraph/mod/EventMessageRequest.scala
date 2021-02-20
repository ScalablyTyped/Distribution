package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class EventMessageRequestMutableBuilder[Self <: EventMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNewTimeProposals(value: NullableOption[Boolean]): Self = StObject.set(x, "allowNewTimeProposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNewTimeProposalsNull: Self = StObject.set(x, "allowNewTimeProposals", null)
    
    @scala.inline
    def setAllowNewTimeProposalsUndefined: Self = StObject.set(x, "allowNewTimeProposals", js.undefined)
    
    @scala.inline
    def setMeetingRequestType(value: NullableOption[MeetingRequestType]): Self = StObject.set(x, "meetingRequestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingRequestTypeNull: Self = StObject.set(x, "meetingRequestType", null)
    
    @scala.inline
    def setMeetingRequestTypeUndefined: Self = StObject.set(x, "meetingRequestType", js.undefined)
    
    @scala.inline
    def setPreviousEndDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "previousEndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousEndDateTimeNull: Self = StObject.set(x, "previousEndDateTime", null)
    
    @scala.inline
    def setPreviousEndDateTimeUndefined: Self = StObject.set(x, "previousEndDateTime", js.undefined)
    
    @scala.inline
    def setPreviousLocation(value: NullableOption[Location]): Self = StObject.set(x, "previousLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousLocationNull: Self = StObject.set(x, "previousLocation", null)
    
    @scala.inline
    def setPreviousLocationUndefined: Self = StObject.set(x, "previousLocation", js.undefined)
    
    @scala.inline
    def setPreviousStartDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "previousStartDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousStartDateTimeNull: Self = StObject.set(x, "previousStartDateTime", null)
    
    @scala.inline
    def setPreviousStartDateTimeUndefined: Self = StObject.set(x, "previousStartDateTime", js.undefined)
    
    @scala.inline
    def setResponseRequested(value: NullableOption[Boolean]): Self = StObject.set(x, "responseRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseRequestedNull: Self = StObject.set(x, "responseRequested", null)
    
    @scala.inline
    def setResponseRequestedUndefined: Self = StObject.set(x, "responseRequested", js.undefined)
  }
}
