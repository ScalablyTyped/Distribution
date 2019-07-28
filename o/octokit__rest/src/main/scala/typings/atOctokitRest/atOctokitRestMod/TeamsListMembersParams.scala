package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.all
import typings.atOctokitRest.atOctokitRestStrings.maintainer
import typings.atOctokitRest.atOctokitRestStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListMembersParams extends js.Object {
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

object TeamsListMembersParams {
  @scala.inline
  def apply(
    team_id: Double,
    page: Int | Double = null,
    per_page: Int | Double = null,
    role: member | maintainer | all = null
  ): TeamsListMembersParams = {
    val __obj = js.Dynamic.literal(team_id = team_id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListMembersParams]
  }
}

