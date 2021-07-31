package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBreakpointsActiveParameterType extends StObject {
  
  /**
    * New value for breakpoints active state.
    */
  var active: Boolean
}
object SetBreakpointsActiveParameterType {
  
  @scala.inline
  def apply(active: Boolean): SetBreakpointsActiveParameterType = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointsActiveParameterType]
  }
  
  @scala.inline
  implicit class SetBreakpointsActiveParameterTypeMutableBuilder[Self <: SetBreakpointsActiveParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
  }
}
