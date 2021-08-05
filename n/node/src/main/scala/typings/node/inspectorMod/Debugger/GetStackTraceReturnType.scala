package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.StackTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStackTraceReturnType extends StObject {
  
  var stackTrace: StackTrace
}
object GetStackTraceReturnType {
  
  inline def apply(stackTrace: StackTrace): GetStackTraceReturnType = {
    val __obj = js.Dynamic.literal(stackTrace = stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackTraceReturnType]
  }
  
  extension [Self <: GetStackTraceReturnType](x: Self) {
    
    inline def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
  }
}
