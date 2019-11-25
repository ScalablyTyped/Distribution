package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChange extends js.Object {
  var effective_date: String
  var id: Double
  var plan: AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChangePlan
  var unit_count: Null
}

object AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChange {
  @scala.inline
  def apply(
    effective_date: String,
    id: Double,
    plan: AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChangePlan,
    unit_count: Null
  ): AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChange = {
    val __obj = js.Dynamic.literal(effective_date = effective_date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePendingChange]
  }
}

