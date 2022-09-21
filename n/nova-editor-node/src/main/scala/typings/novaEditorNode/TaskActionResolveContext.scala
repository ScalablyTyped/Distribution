package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/task-action-resolve-context/
trait TaskActionResolveContext[T /* <: Transferrable */] extends StObject {
  
  var action: TaskName
  
  val data: js.UndefOr[T] = js.undefined
}
object TaskActionResolveContext {
  
  inline def apply[T /* <: Transferrable */](action: TaskName): TaskActionResolveContext[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskActionResolveContext[T]]
  }
  
  extension [Self <: TaskActionResolveContext[?], T /* <: Transferrable */](x: Self & TaskActionResolveContext[T]) {
    
    inline def setAction(value: TaskName): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
