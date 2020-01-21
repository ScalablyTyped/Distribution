package typings.octokitRest.mod

import typings.octokitRest.octokitRestStrings.admin
import typings.octokitRest.octokitRestStrings.read
import typings.octokitRest.octokitRestStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateProjectInOrgParams extends js.Object {
  var org: String
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

object TeamsAddOrUpdateProjectInOrgParams {
  @scala.inline
  def apply(org: String, project_id: Double, team_slug: String, permission: read | write | admin = null): TeamsAddOrUpdateProjectInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateProjectInOrgParams]
  }
}

