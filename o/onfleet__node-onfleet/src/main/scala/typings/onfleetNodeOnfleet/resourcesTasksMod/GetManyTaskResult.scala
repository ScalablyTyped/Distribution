package typings.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManyTaskResult extends StObject {
  
  var lastId: js.UndefOr[String] = js.undefined
  
  var tasks: js.Array[GetTaskResult]
}
object GetManyTaskResult {
  
  inline def apply(tasks: js.Array[GetTaskResult]): GetManyTaskResult = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManyTaskResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetManyTaskResult] (val x: Self) extends AnyVal {
    
    inline def setLastId(value: String): Self = StObject.set(x, "lastId", value.asInstanceOf[js.Any])
    
    inline def setLastIdUndefined: Self = StObject.set(x, "lastId", js.undefined)
    
    inline def setTasks(value: js.Array[GetTaskResult]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: GetTaskResult*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
