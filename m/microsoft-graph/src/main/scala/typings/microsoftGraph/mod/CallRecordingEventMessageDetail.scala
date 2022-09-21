package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallRecordingEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Unique identifier of the call.
  var callId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name for the call recording.
  var callRecordingDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Duration of the call recording.
  var callRecordingDuration: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Status of the call recording. Possible values are: success, failure, initial, chunkFinished, unknownFutureValue.
  var callRecordingStatus: js.UndefOr[NullableOption[CallRecordingStatus]] = js.undefined
  
  // Call recording URL.
  var callRecordingUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Organizer of the meeting.
  var meetingOrganizer: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object CallRecordingEventMessageDetail {
  
  inline def apply(): CallRecordingEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallRecordingEventMessageDetail]
  }
  
  extension [Self <: CallRecordingEventMessageDetail](x: Self) {
    
    inline def setCallId(value: NullableOption[String]): Self = StObject.set(x, "callId", value.asInstanceOf[js.Any])
    
    inline def setCallIdNull: Self = StObject.set(x, "callId", null)
    
    inline def setCallIdUndefined: Self = StObject.set(x, "callId", js.undefined)
    
    inline def setCallRecordingDisplayName(value: NullableOption[String]): Self = StObject.set(x, "callRecordingDisplayName", value.asInstanceOf[js.Any])
    
    inline def setCallRecordingDisplayNameNull: Self = StObject.set(x, "callRecordingDisplayName", null)
    
    inline def setCallRecordingDisplayNameUndefined: Self = StObject.set(x, "callRecordingDisplayName", js.undefined)
    
    inline def setCallRecordingDuration(value: NullableOption[String]): Self = StObject.set(x, "callRecordingDuration", value.asInstanceOf[js.Any])
    
    inline def setCallRecordingDurationNull: Self = StObject.set(x, "callRecordingDuration", null)
    
    inline def setCallRecordingDurationUndefined: Self = StObject.set(x, "callRecordingDuration", js.undefined)
    
    inline def setCallRecordingStatus(value: NullableOption[CallRecordingStatus]): Self = StObject.set(x, "callRecordingStatus", value.asInstanceOf[js.Any])
    
    inline def setCallRecordingStatusNull: Self = StObject.set(x, "callRecordingStatus", null)
    
    inline def setCallRecordingStatusUndefined: Self = StObject.set(x, "callRecordingStatus", js.undefined)
    
    inline def setCallRecordingUrl(value: NullableOption[String]): Self = StObject.set(x, "callRecordingUrl", value.asInstanceOf[js.Any])
    
    inline def setCallRecordingUrlNull: Self = StObject.set(x, "callRecordingUrl", null)
    
    inline def setCallRecordingUrlUndefined: Self = StObject.set(x, "callRecordingUrl", js.undefined)
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setMeetingOrganizer(value: NullableOption[IdentitySet]): Self = StObject.set(x, "meetingOrganizer", value.asInstanceOf[js.Any])
    
    inline def setMeetingOrganizerNull: Self = StObject.set(x, "meetingOrganizer", null)
    
    inline def setMeetingOrganizerUndefined: Self = StObject.set(x, "meetingOrganizer", js.undefined)
  }
}
