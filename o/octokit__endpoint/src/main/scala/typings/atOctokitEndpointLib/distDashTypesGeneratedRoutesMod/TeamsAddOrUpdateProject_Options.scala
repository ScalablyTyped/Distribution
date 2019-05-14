package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateProject_Options extends js.Object {
  var permission: js.UndefOr[java.lang.String] = js.undefined
  var project_id: scala.Double
  var team_id: scala.Double
}

object TeamsAddOrUpdateProject_Options {
  @scala.inline
  def apply(project_id: scala.Double, team_id: scala.Double, permission: java.lang.String = null): TeamsAddOrUpdateProject_Options = {
    val __obj = js.Dynamic.literal(project_id = project_id, team_id = team_id)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[TeamsAddOrUpdateProject_Options]
  }
}

