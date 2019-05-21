package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListAccountsUserOrOrgOnPlanStubbedEndpoint extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var plan_id: scala.Double
  var sort: js.UndefOr[java.lang.String] = js.undefined
}

object AppsListAccountsUserOrOrgOnPlanStubbedEndpoint {
  @scala.inline
  def apply(
    plan_id: scala.Double,
    direction: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    sort: java.lang.String = null
  ): AppsListAccountsUserOrOrgOnPlanStubbedEndpoint = {
    val __obj = js.Dynamic.literal(plan_id = plan_id)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[AppsListAccountsUserOrOrgOnPlanStubbedEndpoint]
  }
}

