package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsAddCollaboratorParams extends js.Object {
  /**
    * The permission to grant the collaborator. Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)." Can be one of:
    * \* `read` - can read, but not write to or administer this project.
    * \* `write` - can read and write, but not administer this project.
    * \* `admin` - can read, write and administer this project.
    */
  var permission: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.read | atOctokitRestLib.atOctokitRestLibStrings.write | atOctokitRestLib.atOctokitRestLibStrings.admin
  ] = js.undefined
  var project_id: scala.Double
  var username: java.lang.String
}

object ProjectsAddCollaboratorParams {
  @scala.inline
  def apply(
    project_id: scala.Double,
    username: java.lang.String,
    permission: atOctokitRestLib.atOctokitRestLibStrings.read | atOctokitRestLib.atOctokitRestLibStrings.write | atOctokitRestLib.atOctokitRestLibStrings.admin = null
  ): ProjectsAddCollaboratorParams = {
    val __obj = js.Dynamic.literal(project_id = project_id, username = username)
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsAddCollaboratorParams]
  }
}

