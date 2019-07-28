package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerAssignedToTaskBoardTaskFormat extends Entity {
  /**
    * Dictionary of hints used to order tasks on the AssignedTo view of the Task Board. The key of each entry is one of the
    * users the task is assigned to and the value is the order hint. The format of each value is defined as outlined here.
    */
  var orderHintsByAssignee: js.UndefOr[PlannerOrderHintsByAssignee] = js.undefined
  /**
    * Hint value used to order the task on the AssignedTo view of the Task Board when the task is not assigned to anyone, or
    * if the orderHintsByAssignee dictionary does not provide an order hint for the user the task is assigned to. The format
    * is defined as outlined here.
    */
  var unassignedOrderHint: js.UndefOr[String] = js.undefined
}

object PlannerAssignedToTaskBoardTaskFormat {
  @scala.inline
  def apply(
    id: String = null,
    orderHintsByAssignee: PlannerOrderHintsByAssignee = null,
    unassignedOrderHint: String = null
  ): PlannerAssignedToTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (orderHintsByAssignee != null) __obj.updateDynamic("orderHintsByAssignee")(orderHintsByAssignee)
    if (unassignedOrderHint != null) __obj.updateDynamic("unassignedOrderHint")(unassignedOrderHint)
    __obj.asInstanceOf[PlannerAssignedToTaskBoardTaskFormat]
  }
}

