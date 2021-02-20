package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallRoute extends StObject {
  
  // The identity that was resolved to in the call.
  var `final`: js.UndefOr[IdentitySet] = js.native
  
  // The identity that was originally used in the call.
  var original: js.UndefOr[IdentitySet] = js.native
  
  // Possible values are: forwarded, lookup, selfFork.
  var routingType: js.UndefOr[RoutingType] = js.native
}
object CallRoute {
  
  @scala.inline
  def apply(): CallRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallRoute]
  }
  
  @scala.inline
  implicit class CallRouteMutableBuilder[Self <: CallRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinal(value: IdentitySet): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
    
    @scala.inline
    def setOriginal(value: IdentitySet): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
    
    @scala.inline
    def setRoutingType(value: RoutingType): Self = StObject.set(x, "routingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingTypeUndefined: Self = StObject.set(x, "routingType", js.undefined)
  }
}
