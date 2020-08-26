package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org :string,   team_slug :string,   project_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait TeamsCheckPermissionsForProjectInOrgEndpoint extends js.Object {
  var mediaType: `10` = js.native
  @JSName("org")
  var org_ : String = js.native
  var project_id: Double = js.native
  var team_slug: String = js.native
}

object TeamsCheckPermissionsForProjectInOrgEndpoint {
  @scala.inline
  def apply(mediaType: `10`, org_ : String, project_id: Double, team_slug: String): TeamsCheckPermissionsForProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForProjectInOrgEndpoint]
  }
  @scala.inline
  implicit class TeamsCheckPermissionsForProjectInOrgEndpointOps[Self <: TeamsCheckPermissionsForProjectInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setMediaType(value: `10`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject_id(value: Double): Self = this.set("project_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam_slug(value: String): Self = this.set("team_slug", value.asInstanceOf[js.Any])
  }
  
}

