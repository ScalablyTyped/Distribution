package typings.octokitRest.mod

import typings.octokitRest.octokitRestStrings.maintainer
import typings.octokitRest.octokitRestStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateMembershipLegacyParams extends js.Object {
  /**
    * The role that this user should have in the team. Can be one of:
    * \* `member` - a normal member of the team.
    * \* `maintainer` - a team maintainer. Able to add/remove other team members, promote other team members to team maintainer, and edit the team's name and description.
    */
  var role: js.UndefOr[member | maintainer] = js.undefined
  var team_id: Double
  var username: String
}

object TeamsAddOrUpdateMembershipLegacyParams {
  @scala.inline
  def apply(team_id: Double, username: String, role: member | maintainer = null): TeamsAddOrUpdateMembershipLegacyParams = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipLegacyParams]
  }
}

