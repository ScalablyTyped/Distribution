package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsRemoveMembershipForUserInOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
  
  var team_slug: String = js.native
  
  var username: String = js.native
}
object TeamsRemoveMembershipForUserInOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, team_slug: String, username: String): TeamsRemoveMembershipForUserInOrgEndpoint = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsRemoveMembershipForUserInOrgEndpoint]
  }
  
  @scala.inline
  implicit class TeamsRemoveMembershipForUserInOrgEndpointMutableBuilder[Self <: TeamsRemoveMembershipForUserInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
