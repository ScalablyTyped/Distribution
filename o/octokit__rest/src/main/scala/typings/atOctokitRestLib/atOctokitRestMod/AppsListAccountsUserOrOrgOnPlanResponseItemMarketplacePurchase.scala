package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchase extends js.Object {
  var billing_cycle: java.lang.String
  var free_trial_ends_on: java.lang.String
  var next_billing_date: java.lang.String
  var on_free_trial: scala.Boolean
  var plan: AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchasePlan
  var unit_count: scala.Null
  var updated_at: java.lang.String
}

object AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchase {
  @scala.inline
  def apply(
    billing_cycle: java.lang.String,
    free_trial_ends_on: java.lang.String,
    next_billing_date: java.lang.String,
    on_free_trial: scala.Boolean,
    plan: AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchasePlan,
    unit_count: scala.Null,
    updated_at: java.lang.String
  ): AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchase = {
    val __obj = js.Dynamic.literal(billing_cycle = billing_cycle, free_trial_ends_on = free_trial_ends_on, next_billing_date = next_billing_date, on_free_trial = on_free_trial, plan = plan, unit_count = unit_count, updated_at = updated_at)
  
    __obj.asInstanceOf[AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchase]
  }
}

