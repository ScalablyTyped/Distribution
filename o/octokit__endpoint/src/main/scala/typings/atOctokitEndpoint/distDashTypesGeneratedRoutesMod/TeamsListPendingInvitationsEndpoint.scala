package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListPendingInvitationsEndpoint extends js.Object {
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var team_id: Double
}

object TeamsListPendingInvitationsEndpoint {
  @scala.inline
  def apply(team_id: Double, page: Int | Double = null, per_page: Int | Double = null): TeamsListPendingInvitationsEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListPendingInvitationsEndpoint]
  }
}

