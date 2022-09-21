package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingParticipantInfo extends StObject {
  
  // Identity information of the participant.
  var identity: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Specifies the participant's role in the meeting. Possible values are attendee, presenter, producer, and
    * unknownFutureValue.
    */
  var role: js.UndefOr[NullableOption[OnlineMeetingRole]] = js.undefined
  
  // User principal name of the participant.
  var upn: js.UndefOr[NullableOption[String]] = js.undefined
}
object MeetingParticipantInfo {
  
  inline def apply(): MeetingParticipantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingParticipantInfo]
  }
  
  extension [Self <: MeetingParticipantInfo](x: Self) {
    
    inline def setIdentity(value: NullableOption[IdentitySet]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityNull: Self = StObject.set(x, "identity", null)
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setRole(value: NullableOption[OnlineMeetingRole]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setUpn(value: NullableOption[String]): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
    
    inline def setUpnNull: Self = StObject.set(x, "upn", null)
    
    inline def setUpnUndefined: Self = StObject.set(x, "upn", js.undefined)
  }
}
