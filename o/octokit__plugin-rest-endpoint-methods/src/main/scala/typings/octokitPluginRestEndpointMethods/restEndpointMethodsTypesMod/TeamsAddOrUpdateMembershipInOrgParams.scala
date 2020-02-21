package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.maintainer
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateMembershipInOrgParams extends js.Object {
  var org: String
  /**
    * The role that this user should have in the team. Can be one of:
    * \* `member` - a normal member of the team.
    * \* `maintainer` - a team maintainer. Able to add/remove other team members, promote other team members to team maintainer, and edit the team's name and description.
    */
  var role: js.UndefOr[member | maintainer] = js.undefined
  var team_slug: String
  var username: String
}

object TeamsAddOrUpdateMembershipInOrgParams {
  @scala.inline
  def apply(org: String, team_slug: String, username: String, role: member | maintainer = null): TeamsAddOrUpdateMembershipInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipInOrgParams]
  }
}

