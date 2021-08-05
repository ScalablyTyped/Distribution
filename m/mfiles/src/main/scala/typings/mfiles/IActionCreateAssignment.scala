package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionCreateAssignment extends StObject {
  
  var AssignedTo: IUserOrUserGroupIDExs
  
  def Clone(): IActionCreateAssignment
  
  var Deadline: Boolean
  
  var DeadlineInDays: Double
  
  var Description: String
  
  var MonitoredBy: IUserOrUserGroupIDExs
  
  var Title: String
}
object IActionCreateAssignment {
  
  inline def apply(
    AssignedTo: IUserOrUserGroupIDExs,
    Clone: () => IActionCreateAssignment,
    Deadline: Boolean,
    DeadlineInDays: Double,
    Description: String,
    MonitoredBy: IUserOrUserGroupIDExs,
    Title: String
  ): IActionCreateAssignment = {
    val __obj = js.Dynamic.literal(AssignedTo = AssignedTo.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Deadline = Deadline.asInstanceOf[js.Any], DeadlineInDays = DeadlineInDays.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], MonitoredBy = MonitoredBy.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionCreateAssignment]
  }
  
  extension [Self <: IActionCreateAssignment](x: Self) {
    
    inline def setAssignedTo(value: IUserOrUserGroupIDExs): Self = StObject.set(x, "AssignedTo", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => IActionCreateAssignment): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setDeadline(value: Boolean): Self = StObject.set(x, "Deadline", value.asInstanceOf[js.Any])
    
    inline def setDeadlineInDays(value: Double): Self = StObject.set(x, "DeadlineInDays", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setMonitoredBy(value: IUserOrUserGroupIDExs): Self = StObject.set(x, "MonitoredBy", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
