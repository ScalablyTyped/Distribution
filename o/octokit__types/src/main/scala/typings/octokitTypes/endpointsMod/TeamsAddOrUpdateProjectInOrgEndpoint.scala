package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.read
import typings.octokitTypes.octokitTypesStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org  :string,   team_slug  :string,   project_id  :number,   permission ? :'read' | 'write' | 'admin'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait TeamsAddOrUpdateProjectInOrgEndpoint extends js.Object {
  var mediaType: `8`
  @JSName("org")
  var org_ : String
  /**
    * The permission to grant to the team for this project. Can be one of:
    * \* `read` - team members can read, but not write to or administer this project.
    * \* `write` - team members can read and write, but not administer this project.
    * \* `admin` - team members can read, write and administer this project.
    * Default: the team's `permission` attribute will be used to determine what permission to grant the team on this project. Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  var permission: js.UndefOr[read | write | admin] = js.undefined
  var project_id: Double
  var team_slug: String
}

object TeamsAddOrUpdateProjectInOrgEndpoint {
  @scala.inline
  def apply(
    mediaType: `8`,
    org_ : String,
    project_id: Double,
    team_slug: String,
    permission: read | write | admin = null
  ): TeamsAddOrUpdateProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateProjectInOrgEndpoint]
  }
}

