package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChange extends js.Object {
  var effective_date: String
  var id: Double
  var plan: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChangePlan
  var unit_count: Null
}

object AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChange {
  @scala.inline
  def apply(
    effective_date: String,
    id: Double,
    plan: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChangePlan,
    unit_count: Null
  ): AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChange = {
    val __obj = js.Dynamic.literal(effective_date = effective_date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChange]
  }
}

