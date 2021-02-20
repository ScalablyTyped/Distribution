package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlannerAssignedToTaskBoardTaskFormat extends Entity {
  
  /**
    * Dictionary of hints used to order tasks on the AssignedTo view of the Task Board. The key of each entry is one of the
    * users the task is assigned to and the value is the order hint. The format of each value is defined as outlined here.
    */
  var orderHintsByAssignee: js.UndefOr[NullableOption[PlannerOrderHintsByAssignee]] = js.native
  
  /**
    * Hint value used to order the task on the AssignedTo view of the Task Board when the task is not assigned to anyone, or
    * if the orderHintsByAssignee dictionary does not provide an order hint for the user the task is assigned to. The format
    * is defined as outlined here.
    */
  var unassignedOrderHint: js.UndefOr[NullableOption[String]] = js.native
}
object PlannerAssignedToTaskBoardTaskFormat {
  
  @scala.inline
  def apply(): PlannerAssignedToTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerAssignedToTaskBoardTaskFormat]
  }
  
  @scala.inline
  implicit class PlannerAssignedToTaskBoardTaskFormatMutableBuilder[Self <: PlannerAssignedToTaskBoardTaskFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrderHintsByAssignee(value: NullableOption[PlannerOrderHintsByAssignee]): Self = StObject.set(x, "orderHintsByAssignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderHintsByAssigneeNull: Self = StObject.set(x, "orderHintsByAssignee", null)
    
    @scala.inline
    def setOrderHintsByAssigneeUndefined: Self = StObject.set(x, "orderHintsByAssignee", js.undefined)
    
    @scala.inline
    def setUnassignedOrderHint(value: NullableOption[String]): Self = StObject.set(x, "unassignedOrderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnassignedOrderHintNull: Self = StObject.set(x, "unassignedOrderHint", null)
    
    @scala.inline
    def setUnassignedOrderHintUndefined: Self = StObject.set(x, "unassignedOrderHint", js.undefined)
  }
}
