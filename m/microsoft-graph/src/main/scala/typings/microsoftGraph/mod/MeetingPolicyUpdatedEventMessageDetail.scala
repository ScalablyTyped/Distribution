package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingPolicyUpdatedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Represents whether the meeting chat is enabled or not.
  var meetingChatEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Unique identifier of the meeting chat.
  var meetingChatId: js.UndefOr[NullableOption[String]] = js.undefined
}
object MeetingPolicyUpdatedEventMessageDetail {
  
  inline def apply(): MeetingPolicyUpdatedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingPolicyUpdatedEventMessageDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeetingPolicyUpdatedEventMessageDetail] (val x: Self) extends AnyVal {
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setMeetingChatEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "meetingChatEnabled", value.asInstanceOf[js.Any])
    
    inline def setMeetingChatEnabledNull: Self = StObject.set(x, "meetingChatEnabled", null)
    
    inline def setMeetingChatEnabledUndefined: Self = StObject.set(x, "meetingChatEnabled", js.undefined)
    
    inline def setMeetingChatId(value: NullableOption[String]): Self = StObject.set(x, "meetingChatId", value.asInstanceOf[js.Any])
    
    inline def setMeetingChatIdNull: Self = StObject.set(x, "meetingChatId", null)
    
    inline def setMeetingChatIdUndefined: Self = StObject.set(x, "meetingChatId", js.undefined)
  }
}
