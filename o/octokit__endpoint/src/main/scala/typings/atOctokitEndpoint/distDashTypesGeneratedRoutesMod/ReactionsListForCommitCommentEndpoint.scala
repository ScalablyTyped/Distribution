package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsListForCommitCommentEndpoint extends js.Object {
  var comment_id: Double
  var content: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReactionsListForCommitCommentEndpoint {
  @scala.inline
  def apply(
    comment_id: Double,
    owner: String,
    repo: String,
    content: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReactionsListForCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id, owner = owner, repo = repo)
    if (content != null) __obj.updateDynamic("content")(content)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForCommitCommentEndpoint]
  }
}

