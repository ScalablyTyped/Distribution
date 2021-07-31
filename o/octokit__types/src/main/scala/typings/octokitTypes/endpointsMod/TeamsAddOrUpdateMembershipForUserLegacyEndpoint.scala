package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.maintainer
import typings.octokitTypes.octokitTypesStrings.member
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAddOrUpdateMembershipForUserLegacyEndpoint extends StObject {
  
  /**
    * The role that this user should have in the team. Can be one of:
    * \* `member` - a normal member of the team.
    * \* `maintainer` - a team maintainer. Able to add/remove other team members, promote other team members to team maintainer, and edit the team's name and description.
    */
  var role: js.UndefOr[member | maintainer] = js.undefined
  
  var team_id: Double
  
  var username: String
}
object TeamsAddOrUpdateMembershipForUserLegacyEndpoint {
  
  @scala.inline
  def apply(team_id: Double, username: String): TeamsAddOrUpdateMembershipForUserLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipForUserLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsAddOrUpdateMembershipForUserLegacyEndpointMutableBuilder[Self <: TeamsAddOrUpdateMembershipForUserLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: member | maintainer): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
