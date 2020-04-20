package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsGetSubscriptionPlanForAccountStubbedResponseMarketplacePendingChange extends js.Object {
  var effective_date: String
  var id: Double
  var plan: AppsGetSubscriptionPlanForAccountStubbedResponseMarketplacePendingChangePlan
  var unit_count: Null
}

object AppsGetSubscriptionPlanForAccountStubbedResponseMarketplacePendingChange {
  @scala.inline
  def apply(
    effective_date: String,
    id: Double,
    plan: AppsGetSubscriptionPlanForAccountStubbedResponseMarketplacePendingChangePlan,
    unit_count: Null
  ): AppsGetSubscriptionPlanForAccountStubbedResponseMarketplacePendingChange = {
    val __obj = js.Dynamic.literal(effective_date = effective_date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetSubscriptionPlanForAccountStubbedResponseMarketplacePendingChange]
  }
}

