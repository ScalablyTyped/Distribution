package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionContextDestroyedEventDataType extends StObject {
  
  /**
    * Id of the destroyed context
    */
  var executionContextId: ExecutionContextId
}
object ExecutionContextDestroyedEventDataType {
  
  inline def apply(executionContextId: ExecutionContextId): ExecutionContextDestroyedEventDataType = {
    val __obj = js.Dynamic.literal(executionContextId = executionContextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextDestroyedEventDataType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionContextDestroyedEventDataType] (val x: Self) extends AnyVal {
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
  }
}
