package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListMembersParams extends js.Object {
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Filters members returned by their role in the team. Can be one of:
    * \* `member` - normal members of the team.
    * \* `maintainer` - team maintainers.
    * \* `all` - all members of the team.
    */
  var role: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.member | atOctokitRestLib.atOctokitRestLibStrings.maintainer | atOctokitRestLib.atOctokitRestLibStrings.all
  ] = js.undefined
  var team_id: scala.Double
}

object TeamsListMembersParams {
  @scala.inline
  def apply(
    team_id: scala.Double,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    role: atOctokitRestLib.atOctokitRestLibStrings.member | atOctokitRestLib.atOctokitRestLibStrings.maintainer | atOctokitRestLib.atOctokitRestLibStrings.all = null
  ): TeamsListMembersParams = {
    val __obj = js.Dynamic.literal(team_id = team_id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListMembersParams]
  }
}

