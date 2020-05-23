package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.maintainer
import typings.octokitTypes.octokitTypesStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateMembershipLegacyEndpoint extends js.Object {
  /**
    * The role that this user should have in the team. Can be one of:
    * \* `member` - a normal member of the team.
    * \* `maintainer` - a team maintainer. Able to add/remove other team members, promote other team members to team maintainer, and edit the team's name and description.
    */
  var role: js.UndefOr[member | maintainer] = js.undefined
  var team_id: Double
  var username: String
}

object TeamsAddOrUpdateMembershipLegacyEndpoint {
  @scala.inline
  def apply(team_id: Double, username: String, role: member | maintainer = null): TeamsAddOrUpdateMembershipLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipLegacyEndpoint]
  }
}

