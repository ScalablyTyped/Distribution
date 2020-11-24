package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvitationParticipantInfo extends js.Object {
  
  // The identitySet associated with this invitation.
  var identity: js.UndefOr[IdentitySet] = js.native
  
  /**
    * Optional. The call which the target identity is currently a part of. This call will be dropped once the participant is
    * added.
    */
  var replacesCallId: js.UndefOr[NullableOption[String]] = js.native
}
object InvitationParticipantInfo {
  
  @scala.inline
  def apply(): InvitationParticipantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationParticipantInfo]
  }
  
  @scala.inline
  implicit class InvitationParticipantInfoOps[Self <: InvitationParticipantInfo] (val x: Self) extends AnyVal {
    
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
    def setIdentity(value: IdentitySet): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setReplacesCallId(value: NullableOption[String]): Self = this.set("replacesCallId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacesCallId: Self = this.set("replacesCallId", js.undefined)
    
    @scala.inline
    def setReplacesCallIdNull: Self = this.set("replacesCallId", null)
  }
}
