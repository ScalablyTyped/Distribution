package typings.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMultipleTasksProps extends StObject {
  
  var tasks: js.Array[CreateTaskProps]
}
object CreateMultipleTasksProps {
  
  inline def apply(tasks: js.Array[CreateTaskProps]): CreateMultipleTasksProps = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultipleTasksProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMultipleTasksProps] (val x: Self) extends AnyVal {
    
    inline def setTasks(value: js.Array[CreateTaskProps]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: CreateTaskProps*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
