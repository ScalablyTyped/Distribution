package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MtlsEndpointAliases extends StObject {
  
  var device_authorization_endpoint: js.UndefOr[String] = js.undefined
  
  var introspection_endpoint: js.UndefOr[String] = js.undefined
  
  var revocation_endpoint: js.UndefOr[String] = js.undefined
  
  var token_endpoint: js.UndefOr[String] = js.undefined
  
  var userinfo_endpoint: js.UndefOr[String] = js.undefined
}
object MtlsEndpointAliases {
  
  inline def apply(): MtlsEndpointAliases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MtlsEndpointAliases]
  }
  
  extension [Self <: MtlsEndpointAliases](x: Self) {
    
    inline def setDevice_authorization_endpoint(value: String): Self = StObject.set(x, "device_authorization_endpoint", value.asInstanceOf[js.Any])
    
    inline def setDevice_authorization_endpointUndefined: Self = StObject.set(x, "device_authorization_endpoint", js.undefined)
    
    inline def setIntrospection_endpoint(value: String): Self = StObject.set(x, "introspection_endpoint", value.asInstanceOf[js.Any])
    
    inline def setIntrospection_endpointUndefined: Self = StObject.set(x, "introspection_endpoint", js.undefined)
    
    inline def setRevocation_endpoint(value: String): Self = StObject.set(x, "revocation_endpoint", value.asInstanceOf[js.Any])
    
    inline def setRevocation_endpointUndefined: Self = StObject.set(x, "revocation_endpoint", js.undefined)
    
    inline def setToken_endpoint(value: String): Self = StObject.set(x, "token_endpoint", value.asInstanceOf[js.Any])
    
    inline def setToken_endpointUndefined: Self = StObject.set(x, "token_endpoint", js.undefined)
    
    inline def setUserinfo_endpoint(value: String): Self = StObject.set(x, "userinfo_endpoint", value.asInstanceOf[js.Any])
    
    inline def setUserinfo_endpointUndefined: Self = StObject.set(x, "userinfo_endpoint", js.undefined)
  }
}
