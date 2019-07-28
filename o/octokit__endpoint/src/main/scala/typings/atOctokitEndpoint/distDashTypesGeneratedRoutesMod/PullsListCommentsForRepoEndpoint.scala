package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListCommentsForRepoEndpoint extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  var since: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
}

object PullsListCommentsForRepoEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    direction: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    since: String = null,
    sort: String = null
  ): PullsListCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[PullsListCommentsForRepoEndpoint]
  }
}

