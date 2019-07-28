package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateProjectEndpoint extends js.Object {
  var permission: js.UndefOr[String] = js.undefined
  var project_id: Double
  var team_id: Double
}

object TeamsAddOrUpdateProjectEndpoint {
  @scala.inline
  def apply(project_id: Double, team_id: Double, permission: String = null): TeamsAddOrUpdateProjectEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id, team_id = team_id)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[TeamsAddOrUpdateProjectEndpoint]
  }
}

