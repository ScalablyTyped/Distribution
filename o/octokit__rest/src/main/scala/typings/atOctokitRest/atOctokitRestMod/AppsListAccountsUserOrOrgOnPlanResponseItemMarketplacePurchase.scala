package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchase extends js.Object {
  var billing_cycle: String
  var free_trial_ends_on: String
  var next_billing_date: String
  var on_free_trial: Boolean
  var plan: AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchasePlan
  var unit_count: Null
  var updated_at: String
}

object AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchase {
  @scala.inline
  def apply(
    billing_cycle: String,
    free_trial_ends_on: String,
    next_billing_date: String,
    on_free_trial: Boolean,
    plan: AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchasePlan,
    unit_count: Null,
    updated_at: String
  ): AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchase = {
    val __obj = js.Dynamic.literal(billing_cycle = billing_cycle, free_trial_ends_on = free_trial_ends_on, next_billing_date = next_billing_date, on_free_trial = on_free_trial, plan = plan, unit_count = unit_count, updated_at = updated_at)
  
    __obj.asInstanceOf[AppsListAccountsUserOrOrgOnPlanResponseItemMarketplacePurchase]
  }
}

