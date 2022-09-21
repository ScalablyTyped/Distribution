package typings.oidcProvider.anon

import typings.oidcProvider.oidcProviderStrings.lax
import typings.oidcProvider.oidcProviderStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var mode: js.UndefOr[lax | strict] = js.undefined
  
  var request: js.UndefOr[Boolean] = js.undefined
  
  var requestUri: js.UndefOr[Boolean] = js.undefined
  
  var requireSignedRequestObject: js.UndefOr[Boolean] = js.undefined
  
  var requireUriRegistration: js.UndefOr[Boolean] = js.undefined
}
object Mode {
  
  inline def apply(): Mode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: lax | strict): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRequest(value: Boolean): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestUri(value: Boolean): Self = StObject.set(x, "requestUri", value.asInstanceOf[js.Any])
    
    inline def setRequestUriUndefined: Self = StObject.set(x, "requestUri", js.undefined)
    
    inline def setRequireSignedRequestObject(value: Boolean): Self = StObject.set(x, "requireSignedRequestObject", value.asInstanceOf[js.Any])
    
    inline def setRequireSignedRequestObjectUndefined: Self = StObject.set(x, "requireSignedRequestObject", js.undefined)
    
    inline def setRequireUriRegistration(value: Boolean): Self = StObject.set(x, "requireUriRegistration", value.asInstanceOf[js.Any])
    
    inline def setRequireUriRegistrationUndefined: Self = StObject.set(x, "requireUriRegistration", js.undefined)
  }
}
