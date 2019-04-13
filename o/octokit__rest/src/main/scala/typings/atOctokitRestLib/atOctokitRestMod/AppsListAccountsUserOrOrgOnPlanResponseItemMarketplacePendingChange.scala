package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChange extends js.Object {
  var effective_date: java.lang.String
  var id: scala.Double
  var plan: AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChangePlan
  var unit_count: scala.Null
}

object AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChange {
  @scala.inline
  def apply(
    effective_date: java.lang.String,
    id: scala.Double,
    plan: AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChangePlan,
    unit_count: scala.Null
  ): AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChange = {
    val __obj = js.Dynamic.literal(effective_date = effective_date, id = id, plan = plan, unit_count = unit_count)
  
    __obj.asInstanceOf[AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChange]
  }
}

