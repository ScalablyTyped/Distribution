package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListForRepoEndpoint extends js.Object {
  var assignee: js.UndefOr[String] = js.undefined
  var creator: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[String] = js.undefined
  var mentioned: js.UndefOr[String] = js.undefined
  var milestone: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  var since: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object IssuesListForRepoEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    assignee: String = null,
    creator: String = null,
    direction: String = null,
    labels: String = null,
    mentioned: String = null,
    milestone: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    since: String = null,
    sort: String = null,
    state: String = null
  ): IssuesListForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (creator != null) __obj.updateDynamic("creator")(creator)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (mentioned != null) __obj.updateDynamic("mentioned")(mentioned)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IssuesListForRepoEndpoint]
  }
}

