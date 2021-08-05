package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleAPICalledEventDataType extends StObject {
  
  /**
    * Call arguments.
    */
  var args: js.Array[RemoteObject]
  
  /**
    * Console context descriptor for calls on non-default console context (not console.*): 'anonymous#unique-logger-id' for call on unnamed context, 'name#unique-logger-id' for call on named context.
    * @experimental
    */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the context where the call was made.
    */
  var executionContextId: ExecutionContextId
  
  /**
    * Stack trace captured when the call was made.
    */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  
  /**
    * Call timestamp.
    */
  var timestamp: Timestamp
  
  /**
    * Type of the call.
    */
  var `type`: String
}
object ConsoleAPICalledEventDataType {
  
  inline def apply(
    args: js.Array[RemoteObject],
    executionContextId: ExecutionContextId,
    timestamp: Timestamp,
    `type`: String
  ): ConsoleAPICalledEventDataType = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], executionContextId = executionContextId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleAPICalledEventDataType]
  }
  
  extension [Self <: ConsoleAPICalledEventDataType](x: Self) {
    
    inline def setArgs(value: js.Array[RemoteObject]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: RemoteObject*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    inline def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
