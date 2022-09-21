package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallTranscriptEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Unique identifier of the call.
  var callId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier for a call transcript.
  var callTranscriptICalUid: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The organizer of the meeting.
  var meetingOrganizer: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object CallTranscriptEventMessageDetail {
  
  inline def apply(): CallTranscriptEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallTranscriptEventMessageDetail]
  }
  
  extension [Self <: CallTranscriptEventMessageDetail](x: Self) {
    
    inline def setCallId(value: NullableOption[String]): Self = StObject.set(x, "callId", value.asInstanceOf[js.Any])
    
    inline def setCallIdNull: Self = StObject.set(x, "callId", null)
    
    inline def setCallIdUndefined: Self = StObject.set(x, "callId", js.undefined)
    
    inline def setCallTranscriptICalUid(value: NullableOption[String]): Self = StObject.set(x, "callTranscriptICalUid", value.asInstanceOf[js.Any])
    
    inline def setCallTranscriptICalUidNull: Self = StObject.set(x, "callTranscriptICalUid", null)
    
    inline def setCallTranscriptICalUidUndefined: Self = StObject.set(x, "callTranscriptICalUid", js.undefined)
    
    inline def setMeetingOrganizer(value: NullableOption[IdentitySet]): Self = StObject.set(x, "meetingOrganizer", value.asInstanceOf[js.Any])
    
    inline def setMeetingOrganizerNull: Self = StObject.set(x, "meetingOrganizer", null)
    
    inline def setMeetingOrganizerUndefined: Self = StObject.set(x, "meetingOrganizer", js.undefined)
  }
}
