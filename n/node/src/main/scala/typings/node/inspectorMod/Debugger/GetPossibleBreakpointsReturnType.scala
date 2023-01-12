package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPossibleBreakpointsReturnType extends StObject {
  
  /**
    * List of the possible breakpoint locations.
    */
  var locations: js.Array[BreakLocation]
}
object GetPossibleBreakpointsReturnType {
  
  inline def apply(locations: js.Array[BreakLocation]): GetPossibleBreakpointsReturnType = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPossibleBreakpointsReturnType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPossibleBreakpointsReturnType] (val x: Self) extends AnyVal {
    
    inline def setLocations(value: js.Array[BreakLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsVarargs(value: BreakLocation*): Self = StObject.set(x, "locations", js.Array(value*))
  }
}
