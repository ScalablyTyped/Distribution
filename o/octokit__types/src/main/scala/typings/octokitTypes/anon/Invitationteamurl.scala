package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invitationteamurl extends StObject {
  
  var created_at: String
  
  var email: String
  
  var id: Double
  
  var invitation_team_url: String
  
  var inviter: Avatarurl
  
  var login: String
  
  var role: String
  
  var team_count: Double
}
object Invitationteamurl {
  
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
  ): Invitationteamurl = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitation_team_url = invitation_team_url.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_count = team_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitationteamurl]
  }
  
  @scala.inline
  implicit class InvitationteamurlMutableBuilder[Self <: Invitationteamurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitation_team_url(value: String): Self = StObject.set(x, "invitation_team_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInviter(value: Avatarurl): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_count(value: Double): Self = StObject.set(x, "team_count", value.asInstanceOf[js.Any])
  }
}
