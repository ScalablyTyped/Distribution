package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListForAuthenticatedUserEndpoint extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var since: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object IssuesListForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    direction: String = null,
    filter: String = null,
    labels: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    since: String = null,
    sort: String = null,
    state: String = null
  ): IssuesListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IssuesListForAuthenticatedUserEndpoint]
  }
}

