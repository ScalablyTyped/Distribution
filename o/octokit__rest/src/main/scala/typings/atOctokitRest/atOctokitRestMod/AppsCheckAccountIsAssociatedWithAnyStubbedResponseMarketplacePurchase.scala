package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePurchase extends js.Object {
  var billing_cycle: String
  var free_trial_ends_on: String
  var next_billing_date: String
  var on_free_trial: Boolean
  var plan: AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePurchasePlan
  var unit_count: Null
  var updated_at: String
}

object AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePurchase {
  @scala.inline
  def apply(
    billing_cycle: String,
    free_trial_ends_on: String,
    next_billing_date: String,
    on_free_trial: Boolean,
    plan: AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePurchasePlan,
    unit_count: Null,
    updated_at: String
  ): AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePurchase = {
    val __obj = js.Dynamic.literal(billing_cycle = billing_cycle, free_trial_ends_on = free_trial_ends_on, next_billing_date = next_billing_date, on_free_trial = on_free_trial, plan = plan, unit_count = unit_count, updated_at = updated_at)
  
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePurchase]
  }
}

