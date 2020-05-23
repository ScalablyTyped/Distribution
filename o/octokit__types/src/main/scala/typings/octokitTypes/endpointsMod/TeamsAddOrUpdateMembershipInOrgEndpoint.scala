package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.maintainer
import typings.octokitTypes.octokitTypesStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateMembershipInOrgEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  /**
    * The role that this user should have in the team. Can be one of:
    * \* `member` - a normal member of the team.
    * \* `maintainer` - a team maintainer. Able to add/remove other team members, promote other team members to team maintainer, and edit the team's name and description.
    */
  var role: js.UndefOr[member | maintainer] = js.undefined
  var team_slug: String
  var username: String
}

object TeamsAddOrUpdateMembershipInOrgEndpoint {
  @scala.inline
  def apply(org_ : String, team_slug: String, username: String, role: member | maintainer = null): TeamsAddOrUpdateMembershipInOrgEndpoint = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipInOrgEndpoint]
  }
}

