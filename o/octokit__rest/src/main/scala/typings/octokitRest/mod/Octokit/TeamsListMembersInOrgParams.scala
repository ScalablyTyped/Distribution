package typings.octokitRest.mod.Octokit

import typings.octokitRest.octokitRestStrings.all
import typings.octokitRest.octokitRestStrings.maintainer
import typings.octokitRest.octokitRestStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListMembersInOrgParams extends js.Object {
  var org: String
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
  var team_slug: String
}

object TeamsListMembersInOrgParams {
  @scala.inline
  def apply(
    org: String,
    team_slug: String,
    page: Int | Double = null,
    per_page: Int | Double = null,
    role: member | maintainer | all = null
  ): TeamsListMembersInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListMembersInOrgParams]
  }
}

