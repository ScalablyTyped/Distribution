package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventMessageRequest
  extends StObject
     with EventMessage {
  
  /**
    * True if the meeting organizer allows invitees to propose a new time when responding, false otherwise. Optional. Default
    * is true.
    */
  var allowNewTimeProposals: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var meetingRequestType: js.UndefOr[NullableOption[MeetingRequestType]] = js.undefined
  
  // If the meeting update changes the meeting end time, this property specifies the previous meeting end time.
  var previousEndDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  // If the meeting update changes the meeting location, this property specifies the previous meeting location.
  var previousLocation: js.UndefOr[NullableOption[Location]] = js.undefined
  
  // If the meeting update changes the meeting start time, this property specifies the previous meeting start time.
  var previousStartDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  // Set to true if the sender would like the invitee to send a response to the requested meeting.
  var responseRequested: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object EventMessageRequest {
  
  inline def apply(): EventMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventMessageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventMessageRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowNewTimeProposals(value: NullableOption[Boolean]): Self = StObject.set(x, "allowNewTimeProposals", value.asInstanceOf[js.Any])
    
    inline def setAllowNewTimeProposalsNull: Self = StObject.set(x, "allowNewTimeProposals", null)
    
    inline def setAllowNewTimeProposalsUndefined: Self = StObject.set(x, "allowNewTimeProposals", js.undefined)
    
    inline def setMeetingRequestType(value: NullableOption[MeetingRequestType]): Self = StObject.set(x, "meetingRequestType", value.asInstanceOf[js.Any])
    
    inline def setMeetingRequestTypeNull: Self = StObject.set(x, "meetingRequestType", null)
    
    inline def setMeetingRequestTypeUndefined: Self = StObject.set(x, "meetingRequestType", js.undefined)
    
    inline def setPreviousEndDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "previousEndDateTime", value.asInstanceOf[js.Any])
    
    inline def setPreviousEndDateTimeNull: Self = StObject.set(x, "previousEndDateTime", null)
    
    inline def setPreviousEndDateTimeUndefined: Self = StObject.set(x, "previousEndDateTime", js.undefined)
    
    inline def setPreviousLocation(value: NullableOption[Location]): Self = StObject.set(x, "previousLocation", value.asInstanceOf[js.Any])
    
    inline def setPreviousLocationNull: Self = StObject.set(x, "previousLocation", null)
    
    inline def setPreviousLocationUndefined: Self = StObject.set(x, "previousLocation", js.undefined)
    
    inline def setPreviousStartDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "previousStartDateTime", value.asInstanceOf[js.Any])
    
    inline def setPreviousStartDateTimeNull: Self = StObject.set(x, "previousStartDateTime", null)
    
    inline def setPreviousStartDateTimeUndefined: Self = StObject.set(x, "previousStartDateTime", js.undefined)
    
    inline def setResponseRequested(value: NullableOption[Boolean]): Self = StObject.set(x, "responseRequested", value.asInstanceOf[js.Any])
    
    inline def setResponseRequestedNull: Self = StObject.set(x, "responseRequested", null)
    
    inline def setResponseRequestedUndefined: Self = StObject.set(x, "responseRequested", js.undefined)
  }
}
