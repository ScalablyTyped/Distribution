package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerAssignedToTaskBoardTaskFormat
  extends StObject
     with Entity {
  
  /**
    * Dictionary of hints used to order tasks on the AssignedTo view of the Task Board. The key of each entry is one of the
    * users the task is assigned to and the value is the order hint. The format of each value is defined as outlined here.
    */
  var orderHintsByAssignee: js.UndefOr[NullableOption[PlannerOrderHintsByAssignee]] = js.undefined
  
  /**
    * Hint value used to order the task on the AssignedTo view of the Task Board when the task is not assigned to anyone, or
    * if the orderHintsByAssignee dictionary does not provide an order hint for the user the task is assigned to. The format
    * is defined as outlined here.
    */
  var unassignedOrderHint: js.UndefOr[NullableOption[String]] = js.undefined
}
object PlannerAssignedToTaskBoardTaskFormat {
  
  inline def apply(): PlannerAssignedToTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerAssignedToTaskBoardTaskFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlannerAssignedToTaskBoardTaskFormat] (val x: Self) extends AnyVal {
    
    inline def setOrderHintsByAssignee(value: NullableOption[PlannerOrderHintsByAssignee]): Self = StObject.set(x, "orderHintsByAssignee", value.asInstanceOf[js.Any])
    
    inline def setOrderHintsByAssigneeNull: Self = StObject.set(x, "orderHintsByAssignee", null)
    
    inline def setOrderHintsByAssigneeUndefined: Self = StObject.set(x, "orderHintsByAssignee", js.undefined)
    
    inline def setUnassignedOrderHint(value: NullableOption[String]): Self = StObject.set(x, "unassignedOrderHint", value.asInstanceOf[js.Any])
    
    inline def setUnassignedOrderHintNull: Self = StObject.set(x, "unassignedOrderHint", null)
    
    inline def setUnassignedOrderHintUndefined: Self = StObject.set(x, "unassignedOrderHint", js.undefined)
  }
}
