package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveBreakpointParameterType extends StObject {
  
  var breakpointId: BreakpointId = js.native
}
object RemoveBreakpointParameterType {
  
  @scala.inline
  def apply(breakpointId: BreakpointId): RemoveBreakpointParameterType = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveBreakpointParameterType]
  }
  
  @scala.inline
  implicit class RemoveBreakpointParameterTypeMutableBuilder[Self <: RemoveBreakpointParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpointId(value: BreakpointId): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
  }
}
