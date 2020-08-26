package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.maintainer
import typings.octokitTypes.octokitTypesStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsAddOrUpdateMembershipForUserInOrgEndpoint extends js.Object {
  @JSName("org")
  var org_ : String = js.native
  /**
    * The role that this user should have in the team. Can be one of:
    * \* `member` - a normal member of the team.
    * \* `maintainer` - a team maintainer. Able to add/remove other team members, promote other team members to team maintainer, and edit the team's name and description.
    */
  var role: js.UndefOr[member | maintainer] = js.native
  var team_slug: String = js.native
  var username: String = js.native
}

object TeamsAddOrUpdateMembershipForUserInOrgEndpoint {
  @scala.inline
  def apply(org_ : String, team_slug: String, username: String): TeamsAddOrUpdateMembershipForUserInOrgEndpoint = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipForUserInOrgEndpoint]
  }
  @scala.inline
  implicit class TeamsAddOrUpdateMembershipForUserInOrgEndpointOps[Self <: TeamsAddOrUpdateMembershipForUserInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam_slug(value: String): Self = this.set("team_slug", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: member | maintainer): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

