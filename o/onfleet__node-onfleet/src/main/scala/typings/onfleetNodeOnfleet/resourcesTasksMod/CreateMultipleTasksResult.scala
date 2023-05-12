package typings.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMultipleTasksResult extends StObject {
  
  var tasks: js.Array[OnfleetTask]
}
object CreateMultipleTasksResult {
  
  inline def apply(tasks: js.Array[OnfleetTask]): CreateMultipleTasksResult = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultipleTasksResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMultipleTasksResult] (val x: Self) extends AnyVal {
    
    inline def setTasks(value: js.Array[OnfleetTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: OnfleetTask*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
