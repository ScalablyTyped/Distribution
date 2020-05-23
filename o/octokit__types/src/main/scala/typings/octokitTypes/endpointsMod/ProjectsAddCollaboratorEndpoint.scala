package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.read
import typings.octokitTypes.octokitTypesStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  project_id  :number,   username  :string,   permission ? :'read' | 'write' | 'admin'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsAddCollaboratorEndpoint extends js.Object {
  var mediaType: `8`
  /**
    * The permission to grant the collaborator. Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)." Can be one of:
    * \* `read` - can read, but not write to or administer this project.
    * \* `write` - can read and write, but not administer this project.
    * \* `admin` - can read, write and administer this project.
    */
  var permission: js.UndefOr[read | write | admin] = js.undefined
  var project_id: Double
  var username: String
}

object ProjectsAddCollaboratorEndpoint {
  @scala.inline
  def apply(mediaType: `8`, project_id: Double, username: String, permission: read | write | admin = null): ProjectsAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsAddCollaboratorEndpoint]
  }
}

