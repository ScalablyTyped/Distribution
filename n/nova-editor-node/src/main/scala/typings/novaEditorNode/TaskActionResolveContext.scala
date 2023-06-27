package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/task-action-resolve-context/
trait TaskActionResolveContext[T /* <: Transferrable */] extends StObject {
  
  var action: TaskName
  
  var config: Configuration
  
  val data: js.UndefOr[T] = js.undefined
}
object TaskActionResolveContext {
  
  inline def apply[T /* <: Transferrable */](action: TaskName, config: Configuration): TaskActionResolveContext[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskActionResolveContext[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskActionResolveContext[?], T /* <: Transferrable */] (val x: Self & TaskActionResolveContext[T]) extends AnyVal {
    
    inline def setAction(value: TaskName): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Configuration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
