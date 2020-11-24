package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeetingParticipantInfo extends js.Object {
  
  // Identity information of the participant.
  var identity: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Specifies the participant's role in the meeting. Possible values are listed in the following table.
  var role: js.UndefOr[NullableOption[OnlineMeetingRole]] = js.native
  
  // User principal name of the participant.
  var upn: js.UndefOr[NullableOption[String]] = js.native
}
object MeetingParticipantInfo {
  
  @scala.inline
  def apply(): MeetingParticipantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingParticipantInfo]
  }
  
  @scala.inline
  implicit class MeetingParticipantInfoOps[Self <: MeetingParticipantInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentity(value: NullableOption[IdentitySet]): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setIdentityNull: Self = this.set("identity", null)
    
    @scala.inline
    def setRole(value: NullableOption[OnlineMeetingRole]): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRoleNull: Self = this.set("role", null)
    
    @scala.inline
    def setUpn(value: NullableOption[String]): Self = this.set("upn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpn: Self = this.set("upn", js.undefined)
    
    @scala.inline
    def setUpnNull: Self = this.set("upn", null)
  }
}
