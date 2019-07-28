package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommitsEndpoint extends js.Object {
  var author: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  var sha: js.UndefOr[String] = js.undefined
  var since: js.UndefOr[String] = js.undefined
  var until: js.UndefOr[String] = js.undefined
}

object ReposListCommitsEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    author: String = null,
    page: Int | Double = null,
    path: String = null,
    per_page: Int | Double = null,
    sha: String = null,
    since: String = null,
    until: String = null
  ): ReposListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (author != null) __obj.updateDynamic("author")(author)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha)
    if (since != null) __obj.updateDynamic("since")(since)
    if (until != null) __obj.updateDynamic("until")(until)
    __obj.asInstanceOf[ReposListCommitsEndpoint]
  }
}

