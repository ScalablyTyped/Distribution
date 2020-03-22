package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListAccountsForPlanResponseItemMarketplacePendingChange extends js.Object {
  var effective_date: String
  var id: Double
  var plan: AppsListAccountsForPlanResponseItemMarketplacePendingChangePlan
  var unit_count: Null
}

object AppsListAccountsForPlanResponseItemMarketplacePendingChange {
  @scala.inline
  def apply(
    effective_date: String,
    id: Double,
    plan: AppsListAccountsForPlanResponseItemMarketplacePendingChangePlan,
    unit_count: Null
  ): AppsListAccountsForPlanResponseItemMarketplacePendingChange = {
    val __obj = js.Dynamic.literal(effective_date = effective_date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsListAccountsForPlanResponseItemMarketplacePendingChange]
  }
}

