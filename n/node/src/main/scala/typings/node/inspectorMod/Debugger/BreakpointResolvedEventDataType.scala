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
  
  inline def apply(breakpointId: BreakpointId, location: Location): BreakpointResolvedEventDataType = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointResolvedEventDataType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreakpointResolvedEventDataType] (val x: Self) extends AnyVal {
    
    inline def setBreakpointId(value: BreakpointId): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
