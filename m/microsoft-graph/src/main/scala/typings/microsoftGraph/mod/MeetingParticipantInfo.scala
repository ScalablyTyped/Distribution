package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingParticipantInfo extends StObject {
  
  // Identity information of the participant.
  var identity: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Specifies the participant's role in the meeting. Possible values are listed in the following table.
  var role: js.UndefOr[NullableOption[OnlineMeetingRole]] = js.undefined
  
  // User principal name of the participant.
  var upn: js.UndefOr[NullableOption[String]] = js.undefined
}
object MeetingParticipantInfo {
  
  @scala.inline
  def apply(): MeetingParticipantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingParticipantInfo]
  }
  
  @scala.inline
  implicit class MeetingParticipantInfoMutableBuilder[Self <: MeetingParticipantInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: NullableOption[IdentitySet]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityNull: Self = StObject.set(x, "identity", null)
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    @scala.inline
    def setRole(value: NullableOption[OnlineMeetingRole]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNull: Self = StObject.set(x, "role", null)
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setUpn(value: NullableOption[String]): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpnNull: Self = StObject.set(x, "upn", null)
    
    @scala.inline
    def setUpnUndefined: Self = StObject.set(x, "upn", js.undefined)
  }
}
