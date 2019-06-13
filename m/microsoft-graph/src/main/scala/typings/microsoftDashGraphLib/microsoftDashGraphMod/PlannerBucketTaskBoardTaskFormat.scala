package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerBucketTaskBoardTaskFormat extends Entity {
  /** Hint used to order tasks in the Bucket view of the Task Board. The format is defined as outlined here. */
  var orderHint: js.UndefOr[java.lang.String] = js.undefined
}

object PlannerBucketTaskBoardTaskFormat {
  @scala.inline
  def apply(id: java.lang.String = null, orderHint: java.lang.String = null): PlannerBucketTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint)
    __obj.asInstanceOf[PlannerBucketTaskBoardTaskFormat]
  }
}

