package typings.next.anon

import typings.next.distServerAppRenderMod.FlightRouterState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlightSegmentPath extends StObject {
  
  var flightSegmentPath: typings.next.distServerAppRenderMod.FlightSegmentPath
  
  var treePatch: FlightRouterState
}
object FlightSegmentPath {
  
  inline def apply(
    flightSegmentPath: typings.next.distServerAppRenderMod.FlightSegmentPath,
    treePatch: FlightRouterState
  ): FlightSegmentPath = {
    val __obj = js.Dynamic.literal(flightSegmentPath = flightSegmentPath.asInstanceOf[js.Any], treePatch = treePatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlightSegmentPath]
  }
  
  extension [Self <: FlightSegmentPath](x: Self) {
    
    inline def setFlightSegmentPath(value: typings.next.distServerAppRenderMod.FlightSegmentPath): Self = StObject.set(x, "flightSegmentPath", value.asInstanceOf[js.Any])
    
    inline def setFlightSegmentPathVarargs(value: Any*): Self = StObject.set(x, "flightSegmentPath", js.Array(value*))
    
    inline def setTreePatch(value: FlightRouterState): Self = StObject.set(x, "treePatch", value.asInstanceOf[js.Any])
  }
}
