package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerBucket extends Entity {
  /** Name of the bucket. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Hint used to order items of this type in a list view. The format is defined as outlined here. */
  var orderHint: js.UndefOr[java.lang.String] = js.undefined
  /** Plan ID to which the bucket belongs. */
  var planId: js.UndefOr[java.lang.String] = js.undefined
  /** Read-only. Nullable. The collection of tasks in the bucket. */
  var tasks: js.UndefOr[js.Array[PlannerTask]] = js.undefined
}

object PlannerBucket {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    name: java.lang.String = null,
    orderHint: java.lang.String = null,
    planId: java.lang.String = null,
    tasks: js.Array[PlannerTask] = null
  ): PlannerBucket = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint)
    if (planId != null) __obj.updateDynamic("planId")(planId)
    if (tasks != null) __obj.updateDynamic("tasks")(tasks)
    __obj.asInstanceOf[PlannerBucket]
  }
}

