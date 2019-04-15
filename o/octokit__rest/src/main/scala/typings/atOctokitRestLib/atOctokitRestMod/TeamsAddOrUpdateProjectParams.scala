package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateProjectParams extends js.Object {
  /**
    * The permission to grant to the team for this project. Can be one of:
    * \* `read` - team members can read, but not write to or administer this project.
    * \* `write` - team members can read and write, but not administer this project.
    * \* `admin` - team members can read, write and administer this project.
    * Default: the team's `permission` attribute will be used to determine what permission to grant the team on this project. Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    * **Note**: If you pass the `hellcat-preview` media type, you can promote—but not demote—a `permission` attribute inherited from a parent team.
    */
  var permission: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.read | atOctokitRestLib.atOctokitRestLibStrings.write | atOctokitRestLib.atOctokitRestLibStrings.admin
  ] = js.undefined
  var project_id: scala.Double
  var team_id: scala.Double
}

object TeamsAddOrUpdateProjectParams {
  @scala.inline
  def apply(
    project_id: scala.Double,
    team_id: scala.Double,
    permission: atOctokitRestLib.atOctokitRestLibStrings.read | atOctokitRestLib.atOctokitRestLibStrings.write | atOctokitRestLib.atOctokitRestLibStrings.admin = null
  ): TeamsAddOrUpdateProjectParams = {
    val __obj = js.Dynamic.literal(project_id = project_id, team_id = team_id)
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateProjectParams]
  }
}

