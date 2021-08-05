package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvitationParticipantInfo extends StObject {
  
  // The identitySet associated with this invitation.
  var identity: js.UndefOr[IdentitySet] = js.undefined
  
  /**
    * Optional. The call which the target identity is currently a part of. This call will be dropped once the participant is
    * added.
    */
  var replacesCallId: js.UndefOr[NullableOption[String]] = js.undefined
}
object InvitationParticipantInfo {
  
  inline def apply(): InvitationParticipantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationParticipantInfo]
  }
  
  extension [Self <: InvitationParticipantInfo](x: Self) {
    
    inline def setIdentity(value: IdentitySet): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setReplacesCallId(value: NullableOption[String]): Self = StObject.set(x, "replacesCallId", value.asInstanceOf[js.Any])
    
    inline def setReplacesCallIdNull: Self = StObject.set(x, "replacesCallId", null)
    
    inline def setReplacesCallIdUndefined: Self = StObject.set(x, "replacesCallId", js.undefined)
  }
}
