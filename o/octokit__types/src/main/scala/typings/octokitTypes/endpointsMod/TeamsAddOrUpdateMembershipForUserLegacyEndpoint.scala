package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.maintainer
import typings.octokitTypes.octokitTypesStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsAddOrUpdateMembershipForUserLegacyEndpoint extends js.Object {
  /**
    * The role that this user should have in the team. Can be one of:
    * \* `member` - a normal member of the team.
    * \* `maintainer` - a team maintainer. Able to add/remove other team members, promote other team members to team maintainer, and edit the team's name and description.
    */
  var role: js.UndefOr[member | maintainer] = js.native
  var team_id: Double = js.native
  var username: String = js.native
}

object TeamsAddOrUpdateMembershipForUserLegacyEndpoint {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsAddOrUpdateMembershipForUserLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipForUserLegacyEndpoint]
  }
  @scala.inline
  implicit class TeamsAddOrUpdateMembershipForUserLegacyEndpointOps[Self <: TeamsAddOrUpdateMembershipForUserLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setTeam_id(value: Double): Self = this.set("team_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: member | maintainer): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

