package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsCreateInvitationResponseData extends js.Object {
  
  var created_at: String = js.native
  
  var email: String = js.native
  
  var id: Double = js.native
  
  var invitation_team_url: String = js.native
  
  var inviter: Avatarurl = js.native
  
  var login: String = js.native
  
  var role: String = js.native
  
  var team_count: Double = js.native
}
object OrgsCreateInvitationResponseData {
  
  @scala.inline
  def apply(
    created_at: String,
    email: String,
    id: Double,
    invitation_team_url: String,
    inviter: Avatarurl,
    login: String,
    role: String,
    team_count: Double
  ): OrgsCreateInvitationResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitation_team_url = invitation_team_url.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_count = team_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCreateInvitationResponseData]
  }
  
  @scala.inline
  implicit class OrgsCreateInvitationResponseDataOps[Self <: OrgsCreateInvitationResponseData] (val x: Self) extends AnyVal {
    
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitation_team_url(value: String): Self = this.set("invitation_team_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInviter(value: Avatarurl): Self = this.set("inviter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_count(value: Double): Self = this.set("team_count", value.asInstanceOf[js.Any])
  }
}
