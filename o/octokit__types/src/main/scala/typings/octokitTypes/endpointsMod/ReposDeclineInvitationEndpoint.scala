package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposDeclineInvitationEndpoint extends js.Object {
  
  var invitation_id: Double = js.native
}
object ReposDeclineInvitationEndpoint {
  
  @scala.inline
  def apply(invitation_id: Double): ReposDeclineInvitationEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeclineInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ReposDeclineInvitationEndpointOps[Self <: ReposDeclineInvitationEndpoint] (val x: Self) extends AnyVal {
    
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
    def setInvitation_id(value: Double): Self = this.set("invitation_id", value.asInstanceOf[js.Any])
  }
}
