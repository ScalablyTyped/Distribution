package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerBucket extends Entity {
  // Name of the bucket.
  var name: js.UndefOr[String] = js.undefined
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var orderHint: js.UndefOr[String] = js.undefined
  // Plan ID to which the bucket belongs.
  var planId: js.UndefOr[String] = js.undefined
  // Read-only. Nullable. The collection of tasks in the bucket.
  var tasks: js.UndefOr[js.Array[PlannerTask]] = js.undefined
}

object PlannerBucket {
  @scala.inline
  def apply(
    id: String = null,
    name: String = null,
    orderHint: String = null,
    planId: String = null,
    tasks: js.Array[PlannerTask] = null
  ): PlannerBucket = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    if (planId != null) __obj.updateDynamic("planId")(planId.asInstanceOf[js.Any])
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlannerBucket]
  }
}

