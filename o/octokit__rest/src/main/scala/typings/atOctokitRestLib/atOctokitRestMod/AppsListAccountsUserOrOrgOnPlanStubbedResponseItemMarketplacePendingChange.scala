package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePendingChange extends js.Object {
  var effective_date: java.lang.String
  var id: scala.Double
  var plan: AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePendingChangePlan
  var unit_count: scala.Null
}

object AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePendingChange {
  @scala.inline
  def apply(
    effective_date: java.lang.String,
    id: scala.Double,
    plan: AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePendingChangePlan,
    unit_count: scala.Null
  ): AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePendingChange = {
    val __obj = js.Dynamic.literal(effective_date = effective_date, id = id, plan = plan, unit_count = unit_count)
  
    __obj.asInstanceOf[AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePendingChange]
  }
}

