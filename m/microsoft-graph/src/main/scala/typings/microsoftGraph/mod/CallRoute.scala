package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallRoute extends StObject {
  
  // The identity that was resolved to in the call.
  var `final`: js.UndefOr[IdentitySet] = js.undefined
  
  // The identity that was originally used in the call.
  var original: js.UndefOr[IdentitySet] = js.undefined
  
  // Possible values are: forwarded, lookup, selfFork.
  var routingType: js.UndefOr[RoutingType] = js.undefined
}
object CallRoute {
  
  inline def apply(): CallRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallRoute]
  }
  
  extension [Self <: CallRoute](x: Self) {
    
    inline def setFinal(value: IdentitySet): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    
    inline def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
    
    inline def setOriginal(value: IdentitySet): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
    
    inline def setRoutingType(value: RoutingType): Self = StObject.set(x, "routingType", value.asInstanceOf[js.Any])
    
    inline def setRoutingTypeUndefined: Self = StObject.set(x, "routingType", js.undefined)
  }
}
