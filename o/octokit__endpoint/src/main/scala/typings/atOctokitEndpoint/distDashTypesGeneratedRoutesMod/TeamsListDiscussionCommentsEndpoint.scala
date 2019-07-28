package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListDiscussionCommentsEndpoint extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var discussion_number: Double
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var team_id: Double
}

object TeamsListDiscussionCommentsEndpoint {
  @scala.inline
  def apply(
    discussion_number: Double,
    team_id: Double,
    direction: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): TeamsListDiscussionCommentsEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number, team_id = team_id)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListDiscussionCommentsEndpoint]
  }
}

