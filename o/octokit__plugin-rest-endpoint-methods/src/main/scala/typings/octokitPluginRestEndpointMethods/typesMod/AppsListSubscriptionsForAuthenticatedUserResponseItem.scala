package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListSubscriptionsForAuthenticatedUserResponseItem extends js.Object {
  var account: AppsListSubscriptionsForAuthenticatedUserResponseItemAccount
  var billing_cycle: String
  var free_trial_ends_on: String
  var next_billing_date: String
  var on_free_trial: Boolean
  var plan: AppsListSubscriptionsForAuthenticatedUserResponseItemPlan
  var unit_count: Null
  var updated_at: String
}

object AppsListSubscriptionsForAuthenticatedUserResponseItem {
  @scala.inline
  def apply(
    account: AppsListSubscriptionsForAuthenticatedUserResponseItemAccount,
    billing_cycle: String,
    free_trial_ends_on: String,
    next_billing_date: String,
    on_free_trial: Boolean,
    plan: AppsListSubscriptionsForAuthenticatedUserResponseItemPlan,
    unit_count: Null,
    updated_at: String
  ): AppsListSubscriptionsForAuthenticatedUserResponseItem = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], billing_cycle = billing_cycle.asInstanceOf[js.Any], free_trial_ends_on = free_trial_ends_on.asInstanceOf[js.Any], next_billing_date = next_billing_date.asInstanceOf[js.Any], on_free_trial = on_free_trial.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListSubscriptionsForAuthenticatedUserResponseItem]
  }
}

