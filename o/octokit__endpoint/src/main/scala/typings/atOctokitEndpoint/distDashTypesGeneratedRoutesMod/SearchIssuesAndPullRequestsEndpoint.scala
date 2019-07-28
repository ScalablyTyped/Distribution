package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesAndPullRequestsEndpoint extends js.Object {
  var order: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var q: String
  var sort: js.UndefOr[String] = js.undefined
}

object SearchIssuesAndPullRequestsEndpoint {
  @scala.inline
  def apply(
    q: String,
    order: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: String = null
  ): SearchIssuesAndPullRequestsEndpoint = {
    val __obj = js.Dynamic.literal(q = q)
    if (order != null) __obj.updateDynamic("order")(order)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[SearchIssuesAndPullRequestsEndpoint]
  }
}

