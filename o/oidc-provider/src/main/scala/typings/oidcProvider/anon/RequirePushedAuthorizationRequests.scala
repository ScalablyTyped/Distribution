package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequirePushedAuthorizationRequests extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var requirePushedAuthorizationRequests: js.UndefOr[Boolean] = js.undefined
}
object RequirePushedAuthorizationRequests {
  
  inline def apply(): RequirePushedAuthorizationRequests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequirePushedAuthorizationRequests]
  }
  
  extension [Self <: RequirePushedAuthorizationRequests](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setRequirePushedAuthorizationRequests(value: Boolean): Self = StObject.set(x, "requirePushedAuthorizationRequests", value.asInstanceOf[js.Any])
    
    inline def setRequirePushedAuthorizationRequestsUndefined: Self = StObject.set(x, "requirePushedAuthorizationRequests", js.undefined)
  }
}
