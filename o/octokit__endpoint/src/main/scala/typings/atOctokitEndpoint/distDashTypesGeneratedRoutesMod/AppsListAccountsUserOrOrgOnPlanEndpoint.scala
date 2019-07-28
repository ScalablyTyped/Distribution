package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListAccountsUserOrOrgOnPlanEndpoint extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var plan_id: Double
  var sort: js.UndefOr[String] = js.undefined
}

object AppsListAccountsUserOrOrgOnPlanEndpoint {
  @scala.inline
  def apply(
    plan_id: Double,
    direction: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: String = null
  ): AppsListAccountsUserOrOrgOnPlanEndpoint = {
    val __obj = js.Dynamic.literal(plan_id = plan_id)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[AppsListAccountsUserOrOrgOnPlanEndpoint]
  }
}

