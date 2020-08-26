package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint extends js.Object {
  /**
    * The IdP groups you want to connect to a GitHub team. When updating, the new `groups` object will replace the original one. You must include any existing groups that you don't want to remove.
    */
  var groups: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups] = js.native
  @JSName("org")
  var org_ : String = js.native
  var team_slug: String = js.native
}

object TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint {
  @scala.inline
  def apply(
    groups: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups],
    org_ : String,
    team_slug: String
  ): TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint]
  }
  @scala.inline
  implicit class TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpointOps[Self <: TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam_slug(value: String): Self = this.set("team_slug", value.asInstanceOf[js.Any])
  }
  
}

