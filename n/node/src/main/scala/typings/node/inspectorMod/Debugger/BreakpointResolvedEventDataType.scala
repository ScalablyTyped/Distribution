package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointResolvedEventDataType extends StObject {
  
  /**
    * Breakpoint unique identifier.
    */
  var breakpointId: BreakpointId
  
  /**
    * Actual breakpoint location.
    */
  var location: Location
}
object BreakpointResolvedEventDataType {
  
  @scala.inline
  def apply(breakpointId: BreakpointId, location: Location): BreakpointResolvedEventDataType = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointResolvedEventDataType]
  }
  
  @scala.inline
  implicit class BreakpointResolvedEventDataTypeMutableBuilder[Self <: BreakpointResolvedEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpointId(value: BreakpointId): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
