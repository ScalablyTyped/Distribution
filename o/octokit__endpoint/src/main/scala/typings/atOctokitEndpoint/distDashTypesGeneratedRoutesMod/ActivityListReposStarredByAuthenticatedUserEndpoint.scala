package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListReposStarredByAuthenticatedUserEndpoint extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
}

object ActivityListReposStarredByAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    direction: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: String = null
  ): ActivityListReposStarredByAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[ActivityListReposStarredByAuthenticatedUserEndpoint]
  }
}

