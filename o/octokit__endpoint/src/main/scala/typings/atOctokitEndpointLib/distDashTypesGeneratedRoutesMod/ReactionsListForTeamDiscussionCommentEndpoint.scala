package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsListForTeamDiscussionCommentEndpoint extends js.Object {
  var comment_number: scala.Double
  var content: js.UndefOr[java.lang.String] = js.undefined
  var discussion_number: scala.Double
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var team_id: scala.Double
}

object ReactionsListForTeamDiscussionCommentEndpoint {
  @scala.inline
  def apply(
    comment_number: scala.Double,
    discussion_number: scala.Double,
    team_id: scala.Double,
    content: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ReactionsListForTeamDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number, discussion_number = discussion_number, team_id = team_id)
    if (content != null) __obj.updateDynamic("content")(content)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForTeamDiscussionCommentEndpoint]
  }
}

