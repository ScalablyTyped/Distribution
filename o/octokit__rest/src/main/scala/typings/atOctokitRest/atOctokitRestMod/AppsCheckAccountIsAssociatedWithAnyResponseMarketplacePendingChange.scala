package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(effective_date = effective_date, id = id, plan = plan, unit_count = unit_count)
  
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChange]
  }
}

