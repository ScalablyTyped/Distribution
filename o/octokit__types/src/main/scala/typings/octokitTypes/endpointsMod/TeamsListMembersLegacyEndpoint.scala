package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.maintainer
import typings.octokitTypes.octokitTypesStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListMembersLegacyEndpoint extends js.Object {
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * Filters members returned by their role in the team. Can be one of:
    * \* `member` - normal members of the team.
    * \* `maintainer` - team maintainers.
    * \* `all` - all members of the team.
    */
  var role: js.UndefOr[member | maintainer | all] = js.undefined
  var team_id: Double
}

object TeamsListMembersLegacyEndpoint {
  @scala.inline
  def apply(
    team_id: Double,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined,
    role: member | maintainer | all = null
  ): TeamsListMembersLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListMembersLegacyEndpoint]
  }
}

