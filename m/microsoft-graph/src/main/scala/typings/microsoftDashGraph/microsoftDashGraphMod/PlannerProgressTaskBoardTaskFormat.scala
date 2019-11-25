package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerProgressTaskBoardTaskFormat extends Entity {
  // Hint value used to order the task on the Progress view of the Task Board. The format is defined as outlined here.
  var orderHint: js.UndefOr[String] = js.undefined
}

object PlannerProgressTaskBoardTaskFormat {
  @scala.inline
  def apply(id: String = null, orderHint: String = null): PlannerProgressTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlannerProgressTaskBoardTaskFormat]
  }
}

