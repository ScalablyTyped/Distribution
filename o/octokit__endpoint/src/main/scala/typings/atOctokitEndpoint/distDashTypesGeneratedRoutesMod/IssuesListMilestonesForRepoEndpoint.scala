package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListMilestonesForRepoEndpoint extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  var sort: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object IssuesListMilestonesForRepoEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    direction: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: String = null,
    state: String = null
  ): IssuesListMilestonesForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IssuesListMilestonesForRepoEndpoint]
  }
}

