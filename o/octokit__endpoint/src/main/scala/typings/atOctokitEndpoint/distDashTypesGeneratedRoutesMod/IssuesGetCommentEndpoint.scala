package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetCommentEndpoint extends js.Object {
  var comment_id: Double
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object IssuesGetCommentEndpoint {
  @scala.inline
  def apply(
    comment_id: Double,
    owner: String,
    repo: String,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): IssuesGetCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id, owner = owner, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesGetCommentEndpoint]
  }
}

