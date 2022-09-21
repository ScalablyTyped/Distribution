package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallStartedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue.
  var callEventType: js.UndefOr[NullableOption[TeamworkCallEventType]] = js.undefined
  
  // Unique identifier of the call.
  var callId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object CallStartedEventMessageDetail {
  
  inline def apply(): CallStartedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallStartedEventMessageDetail]
  }
  
  extension [Self <: CallStartedEventMessageDetail](x: Self) {
    
    inline def setCallEventType(value: NullableOption[TeamworkCallEventType]): Self = StObject.set(x, "callEventType", value.asInstanceOf[js.Any])
    
    inline def setCallEventTypeNull: Self = StObject.set(x, "callEventType", null)
    
    inline def setCallEventTypeUndefined: Self = StObject.set(x, "callEventType", js.undefined)
    
    inline def setCallId(value: NullableOption[String]): Self = StObject.set(x, "callId", value.asInstanceOf[js.Any])
    
    inline def setCallIdNull: Self = StObject.set(x, "callId", null)
    
    inline def setCallIdUndefined: Self = StObject.set(x, "callId", js.undefined)
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
  }
}
