package typings.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticallyAssignTaskResult extends StObject {
  
  var assignedTasks: StringDictionary[String]
  
  var assignedTasksCount: Double
}
object AutomaticallyAssignTaskResult {
  
  inline def apply(assignedTasks: StringDictionary[String], assignedTasksCount: Double): AutomaticallyAssignTaskResult = {
    val __obj = js.Dynamic.literal(assignedTasks = assignedTasks.asInstanceOf[js.Any], assignedTasksCount = assignedTasksCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticallyAssignTaskResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutomaticallyAssignTaskResult] (val x: Self) extends AnyVal {
    
    inline def setAssignedTasks(value: StringDictionary[String]): Self = StObject.set(x, "assignedTasks", value.asInstanceOf[js.Any])
    
    inline def setAssignedTasksCount(value: Double): Self = StObject.set(x, "assignedTasksCount", value.asInstanceOf[js.Any])
  }
}
