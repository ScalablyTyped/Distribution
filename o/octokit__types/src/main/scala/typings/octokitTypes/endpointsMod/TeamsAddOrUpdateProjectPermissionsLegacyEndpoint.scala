package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`10`
import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.read
import typings.octokitTypes.octokitTypesStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  team_id :number,   project_id :number,   permission :'read' | 'write' | 'admin' | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait TeamsAddOrUpdateProjectPermissionsLegacyEndpoint extends js.Object {
  var mediaType: `10` = js.native
  /**
    * The permission to grant to the team for this project. Can be one of:
    * \* `read` - team members can read, but not write to or administer this project.
    * \* `write` - team members can read and write, but not administer this project.
    * \* `admin` - team members can read, write and administer this project.
    * Default: the team's `permission` attribute will be used to determine what permission to grant the team on this project. Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  var permission: js.UndefOr[read | write | admin] = js.native
  var project_id: Double = js.native
  var team_id: Double = js.native
}

object TeamsAddOrUpdateProjectPermissionsLegacyEndpoint {
  @scala.inline
  def apply(mediaType: `10`, project_id: Double, team_id: Double): TeamsAddOrUpdateProjectPermissionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateProjectPermissionsLegacyEndpoint]
  }
  @scala.inline
  implicit class TeamsAddOrUpdateProjectPermissionsLegacyEndpointOps[Self <: TeamsAddOrUpdateProjectPermissionsLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setProject_id(value: Double): Self = this.set("project_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam_id(value: Double): Self = this.set("team_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermission(value: read | write | admin): Self = this.set("permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
  }
  
}

