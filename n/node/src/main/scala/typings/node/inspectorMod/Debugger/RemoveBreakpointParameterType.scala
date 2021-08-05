package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveBreakpointParameterType extends StObject {
  
  var breakpointId: BreakpointId
}
object RemoveBreakpointParameterType {
  
  inline def apply(breakpointId: BreakpointId): RemoveBreakpointParameterType = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveBreakpointParameterType]
  }
  
  extension [Self <: RemoveBreakpointParameterType](x: Self) {
    
    inline def setBreakpointId(value: BreakpointId): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
  }
}
