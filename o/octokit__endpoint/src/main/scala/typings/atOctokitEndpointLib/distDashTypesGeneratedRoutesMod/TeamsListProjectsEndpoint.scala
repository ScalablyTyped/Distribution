package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListProjectsEndpoint extends js.Object {
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var team_id: scala.Double
}

object TeamsListProjectsEndpoint {
  @scala.inline
  def apply(
    team_id: scala.Double,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): TeamsListProjectsEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListProjectsEndpoint]
  }
}

