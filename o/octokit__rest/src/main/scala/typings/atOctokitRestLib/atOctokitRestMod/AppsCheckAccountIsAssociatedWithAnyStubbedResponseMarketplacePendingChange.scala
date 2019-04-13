package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChange extends js.Object {
  var effective_date: java.lang.String
  var id: scala.Double
  var plan: AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan
  var unit_count: scala.Null
}

object AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChange {
  @scala.inline
  def apply(
    effective_date: java.lang.String,
    id: scala.Double,
    plan: AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan,
    unit_count: scala.Null
  ): AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChange = {
    val __obj = js.Dynamic.literal(effective_date = effective_date, id = id, plan = plan, unit_count = unit_count)
  
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChange]
  }
}

