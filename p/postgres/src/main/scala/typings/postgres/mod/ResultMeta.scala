package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultMeta[T /* <: Double | Null */] extends StObject {
  
  // For tuples
  var command: String
  
  var count: T
  
  var state: State
  
  var statement: Statement
}
object ResultMeta {
  
  inline def apply[T /* <: Double | Null */](command: String, count: T, state: State, statement: Statement): ResultMeta[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultMeta[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultMeta[?], T /* <: Double | Null */] (val x: Self & ResultMeta[T]) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCount(value: T): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatement(value: Statement): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
  }
}
