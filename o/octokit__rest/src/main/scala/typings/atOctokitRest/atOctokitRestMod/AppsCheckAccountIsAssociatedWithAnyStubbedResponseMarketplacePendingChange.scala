package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChange extends js.Object {
  var effective_date: String
  var id: Double
  var plan: AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan
  var unit_count: Null
}

object AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChange {
  @scala.inline
  def apply(
    effective_date: String,
    id: Double,
    plan: AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan,
    unit_count: Null
  ): AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChange = {
    val __obj = js.Dynamic.literal(effective_date = effective_date, id = id, plan = plan, unit_count = unit_count)
  
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChange]
  }
}

