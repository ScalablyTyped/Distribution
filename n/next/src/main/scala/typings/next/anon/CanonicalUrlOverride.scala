package typings.next.anon

import typings.next.distServerAppRenderMod.FlightRouterState
import typings.next.distServerAppRenderMod.FlightSegmentPath
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanonicalUrlOverride extends StObject {
  
  var canonicalUrlOverride: js.UndefOr[URL] = js.undefined
  
  var flightSegmentPath: FlightSegmentPath
  
  var tree: FlightRouterState
}
object CanonicalUrlOverride {
  
  inline def apply(flightSegmentPath: FlightSegmentPath, tree: FlightRouterState): CanonicalUrlOverride = {
    val __obj = js.Dynamic.literal(flightSegmentPath = flightSegmentPath.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanonicalUrlOverride]
  }
  
  extension [Self <: CanonicalUrlOverride](x: Self) {
    
    inline def setCanonicalUrlOverride(value: URL): Self = StObject.set(x, "canonicalUrlOverride", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlOverrideUndefined: Self = StObject.set(x, "canonicalUrlOverride", js.undefined)
    
    inline def setFlightSegmentPath(value: FlightSegmentPath): Self = StObject.set(x, "flightSegmentPath", value.asInstanceOf[js.Any])
    
    inline def setFlightSegmentPathVarargs(value: Any*): Self = StObject.set(x, "flightSegmentPath", js.Array(value*))
    
    inline def setTree(value: FlightRouterState): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
  }
}
