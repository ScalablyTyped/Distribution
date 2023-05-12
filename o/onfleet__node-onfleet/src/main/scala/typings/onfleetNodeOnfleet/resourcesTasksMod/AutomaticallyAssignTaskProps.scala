package typings.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticallyAssignTaskProps extends StObject {
  
  var options: js.UndefOr[TasksAutoAssign] = js.undefined
  
  var tasks: js.Array[String]
}
object AutomaticallyAssignTaskProps {
  
  inline def apply(tasks: js.Array[String]): AutomaticallyAssignTaskProps = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticallyAssignTaskProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutomaticallyAssignTaskProps] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: TasksAutoAssign): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTasks(value: js.Array[String]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: String*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
