package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallEndedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Duration of the call.
  var callDuration: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue.
  var callEventType: js.UndefOr[NullableOption[TeamworkCallEventType]] = js.undefined
  
  // Unique identifier of the call.
  var callId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // List of call participants.
  var callParticipants: js.UndefOr[NullableOption[js.Array[CallParticipantInfo]]] = js.undefined
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object CallEndedEventMessageDetail {
  
  inline def apply(): CallEndedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallEndedEventMessageDetail]
  }
  
  extension [Self <: CallEndedEventMessageDetail](x: Self) {
    
    inline def setCallDuration(value: NullableOption[String]): Self = StObject.set(x, "callDuration", value.asInstanceOf[js.Any])
    
    inline def setCallDurationNull: Self = StObject.set(x, "callDuration", null)
    
    inline def setCallDurationUndefined: Self = StObject.set(x, "callDuration", js.undefined)
    
    inline def setCallEventType(value: NullableOption[TeamworkCallEventType]): Self = StObject.set(x, "callEventType", value.asInstanceOf[js.Any])
    
    inline def setCallEventTypeNull: Self = StObject.set(x, "callEventType", null)
    
    inline def setCallEventTypeUndefined: Self = StObject.set(x, "callEventType", js.undefined)
    
    inline def setCallId(value: NullableOption[String]): Self = StObject.set(x, "callId", value.asInstanceOf[js.Any])
    
    inline def setCallIdNull: Self = StObject.set(x, "callId", null)
    
    inline def setCallIdUndefined: Self = StObject.set(x, "callId", js.undefined)
    
    inline def setCallParticipants(value: NullableOption[js.Array[CallParticipantInfo]]): Self = StObject.set(x, "callParticipants", value.asInstanceOf[js.Any])
    
    inline def setCallParticipantsNull: Self = StObject.set(x, "callParticipants", null)
    
    inline def setCallParticipantsUndefined: Self = StObject.set(x, "callParticipants", js.undefined)
    
    inline def setCallParticipantsVarargs(value: CallParticipantInfo*): Self = StObject.set(x, "callParticipants", js.Array(value*))
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
  }
}
