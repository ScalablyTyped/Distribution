package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.all
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.maintainer
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListMembersLegacyParams extends js.Object {
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

object TeamsListMembersLegacyParams {
  @scala.inline
  def apply(
    team_id: Double,
    page: Int | Double = null,
    per_page: Int | Double = null,
    role: member | maintainer | all = null
  ): TeamsListMembersLegacyParams = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListMembersLegacyParams]
  }
}

