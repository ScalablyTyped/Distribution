package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvitationParticipantInfo extends StObject {
  
  var hidden: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The identitySet associated with this invitation.
  var identity: js.UndefOr[IdentitySet] = js.undefined
  
  // Optional. The ID of the target participant.
  var participantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var removeFromDefaultAudioRoutingGroup: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Optional. The call which the target identity is currently a part of. For peer-to-peer case, the call will be dropped
    * once the participant is added successfully.
    */
  var replacesCallId: js.UndefOr[NullableOption[String]] = js.undefined
}
object InvitationParticipantInfo {
  
  inline def apply(): InvitationParticipantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationParticipantInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvitationParticipantInfo] (val x: Self) extends AnyVal {
    
    inline def setHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenNull: Self = StObject.set(x, "hidden", null)
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIdentity(value: IdentitySet): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setParticipantId(value: NullableOption[String]): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdNull: Self = StObject.set(x, "participantId", null)
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    inline def setRemoveFromDefaultAudioRoutingGroup(value: NullableOption[Boolean]): Self = StObject.set(x, "removeFromDefaultAudioRoutingGroup", value.asInstanceOf[js.Any])
    
    inline def setRemoveFromDefaultAudioRoutingGroupNull: Self = StObject.set(x, "removeFromDefaultAudioRoutingGroup", null)
    
    inline def setRemoveFromDefaultAudioRoutingGroupUndefined: Self = StObject.set(x, "removeFromDefaultAudioRoutingGroup", js.undefined)
    
    inline def setReplacesCallId(value: NullableOption[String]): Self = StObject.set(x, "replacesCallId", value.asInstanceOf[js.Any])
    
    inline def setReplacesCallIdNull: Self = StObject.set(x, "replacesCallId", null)
    
    inline def setReplacesCallIdUndefined: Self = StObject.set(x, "replacesCallId", js.undefined)
  }
}
