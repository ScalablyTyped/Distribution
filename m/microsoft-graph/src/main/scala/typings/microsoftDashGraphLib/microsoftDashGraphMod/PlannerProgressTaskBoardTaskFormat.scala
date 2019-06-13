package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerProgressTaskBoardTaskFormat extends Entity {
  /** Hint value used to order the task on the Progress view of the Task Board. The format is defined as outlined here. */
  var orderHint: js.UndefOr[java.lang.String] = js.undefined
}

object PlannerProgressTaskBoardTaskFormat {
  @scala.inline
  def apply(id: java.lang.String = null, orderHint: java.lang.String = null): PlannerProgressTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint)
    __obj.asInstanceOf[PlannerProgressTaskBoardTaskFormat]
  }
}

