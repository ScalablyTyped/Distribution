package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsListForTeamDiscussionEndpoint extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var discussion_number: Double
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var team_id: Double
}

object ReactionsListForTeamDiscussionEndpoint {
  @scala.inline
  def apply(
    discussion_number: Double,
    team_id: Double,
    content: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReactionsListForTeamDiscussionEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number, team_id = team_id)
    if (content != null) __obj.updateDynamic("content")(content)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForTeamDiscussionEndpoint]
  }
}

