package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsListForTeamDiscussionCommentEndpoint extends js.Object {
  var comment_number: Double
  var content: js.UndefOr[String] = js.undefined
  var discussion_number: Double
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var team_id: Double
}

object ReactionsListForTeamDiscussionCommentEndpoint {
  @scala.inline
  def apply(
    comment_number: Double,
    discussion_number: Double,
    team_id: Double,
    content: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReactionsListForTeamDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number, discussion_number = discussion_number, team_id = team_id)
    if (content != null) __obj.updateDynamic("content")(content)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForTeamDiscussionCommentEndpoint]
  }
}

