package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsRemoveProjectInOrgEndpoint extends js.Object {
  @JSName("org")
  var org_ : String = js.native
  var project_id: Double = js.native
  var team_slug: String = js.native
}

object TeamsRemoveProjectInOrgEndpoint {
  @scala.inline
  def apply(org_ : String, project_id: Double, team_slug: String): TeamsRemoveProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsRemoveProjectInOrgEndpoint]
  }
  @scala.inline
  implicit class TeamsRemoveProjectInOrgEndpointOps[Self <: TeamsRemoveProjectInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setProject_id(value: Double): Self = this.set("project_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam_slug(value: String): Self = this.set("team_slug", value.asInstanceOf[js.Any])
  }
  
}

