package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/task-resolvable-action/
trait TaskResolvableAction[T /* <: Transferrable */] extends StObject {
  
  val data: T
}
object TaskResolvableAction {
  
  inline def apply[T /* <: Transferrable */](data: T): TaskResolvableAction[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskResolvableAction[T]]
  }
  
  extension [Self <: TaskResolvableAction[?], T /* <: Transferrable */](x: Self & TaskResolvableAction[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
