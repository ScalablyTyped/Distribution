package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListForRepo_Options extends js.Object {
  var assignee: js.UndefOr[java.lang.String] = js.undefined
  var creator: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.UndefOr[java.lang.String] = js.undefined
  var mentioned: js.UndefOr[java.lang.String] = js.undefined
  var milestone: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  var since: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object IssuesListForRepo_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    assignee: java.lang.String = null,
    creator: java.lang.String = null,
    direction: java.lang.String = null,
    labels: java.lang.String = null,
    mentioned: java.lang.String = null,
    milestone: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    since: java.lang.String = null,
    sort: java.lang.String = null,
    state: java.lang.String = null
  ): IssuesListForRepo_Options = {
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
    __obj.asInstanceOf[IssuesListForRepo_Options]
  }
}

