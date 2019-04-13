package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateMembershipParams extends js.Object {
  /**
    * The role that this user should have in the team. Can be one of:  ,* \* `member` - a normal member of the team.  ,* \* `maintainer` - a team maintainer. Able to add/remove other team members, promote other team members to team maintainer, and edit the team's name and description.
    */
  var role: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.member | atOctokitRestLib.atOctokitRestLibStrings.maintainer
  ] = js.undefined
  var team_id: scala.Double
  var username: java.lang.String
}

object TeamsAddOrUpdateMembershipParams {
  @scala.inline
  def apply(
    team_id: scala.Double,
    username: java.lang.String,
    role: atOctokitRestLib.atOctokitRestLibStrings.member | atOctokitRestLib.atOctokitRestLibStrings.maintainer = null
  ): TeamsAddOrUpdateMembershipParams = {
    val __obj = js.Dynamic.literal(team_id = team_id, username = username)
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipParams]
  }
}

