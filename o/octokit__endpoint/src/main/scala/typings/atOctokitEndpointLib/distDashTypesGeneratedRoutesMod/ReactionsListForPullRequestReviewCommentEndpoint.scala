package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsListForPullRequestReviewCommentEndpoint extends js.Object {
  var comment_id: scala.Double
  var content: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
}

object ReactionsListForPullRequestReviewCommentEndpoint {
  @scala.inline
  def apply(
    comment_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    content: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ReactionsListForPullRequestReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id, owner = owner, repo = repo)
    if (content != null) __obj.updateDynamic("content")(content)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForPullRequestReviewCommentEndpoint]
  }
}

