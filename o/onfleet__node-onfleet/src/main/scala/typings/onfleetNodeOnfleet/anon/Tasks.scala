package typings.onfleetNodeOnfleet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tasks extends StObject {
  
  var tasks: js.Array[String] = js.native
}
object Tasks {
  
  @scala.inline
  def apply(tasks: js.Array[String]): Tasks = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tasks]
  }
  
  @scala.inline
  implicit class TasksMutableBuilder[Self <: Tasks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTasks(value: js.Array[String]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: String*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
