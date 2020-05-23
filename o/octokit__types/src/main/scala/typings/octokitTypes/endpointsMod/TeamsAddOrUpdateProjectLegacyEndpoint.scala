package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.read
import typings.octokitTypes.octokitTypesStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  team_id  :number,   project_id  :number,   permission ? :'read' | 'write' | 'admin'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait TeamsAddOrUpdateProjectLegacyEndpoint extends js.Object {
  var mediaType: `8`
  /**
    * The permission to grant to the team for this project. Can be one of:
    * \* `read` - team members can read, but not write to or administer this project.
    * \* `write` - team members can read and write, but not administer this project.
    * \* `admin` - team members can read, write and administer this project.
    * Default: the team's `permission` attribute will be used to determine what permission to grant the team on this project. Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  var permission: js.UndefOr[read | write | admin] = js.undefined
  var project_id: Double
  var team_id: Double
}

object TeamsAddOrUpdateProjectLegacyEndpoint {
  @scala.inline
  def apply(mediaType: `8`, project_id: Double, team_id: Double, permission: read | write | admin = null): TeamsAddOrUpdateProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateProjectLegacyEndpoint]
  }
}

