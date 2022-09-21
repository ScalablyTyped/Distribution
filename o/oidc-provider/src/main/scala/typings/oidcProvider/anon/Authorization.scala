package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorization extends StObject {
  
  var authorization: js.UndefOr[String] = js.undefined
  
  var backchannel_authentication: js.UndefOr[String] = js.undefined
  
  var code_verification: js.UndefOr[String] = js.undefined
  
  var device_authorization: js.UndefOr[String] = js.undefined
  
  var end_session: js.UndefOr[String] = js.undefined
  
  var introspection: js.UndefOr[String] = js.undefined
  
  var jwks: js.UndefOr[String] = js.undefined
  
  var pushed_authorization_request: js.UndefOr[String] = js.undefined
  
  var registration: js.UndefOr[String] = js.undefined
  
  var revocation: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var userinfo: js.UndefOr[String] = js.undefined
}
object Authorization {
  
  inline def apply(): Authorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Authorization]
  }
  
  extension [Self <: Authorization](x: Self) {
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setBackchannel_authentication(value: String): Self = StObject.set(x, "backchannel_authentication", value.asInstanceOf[js.Any])
    
    inline def setBackchannel_authenticationUndefined: Self = StObject.set(x, "backchannel_authentication", js.undefined)
    
    inline def setCode_verification(value: String): Self = StObject.set(x, "code_verification", value.asInstanceOf[js.Any])
    
    inline def setCode_verificationUndefined: Self = StObject.set(x, "code_verification", js.undefined)
    
    inline def setDevice_authorization(value: String): Self = StObject.set(x, "device_authorization", value.asInstanceOf[js.Any])
    
    inline def setDevice_authorizationUndefined: Self = StObject.set(x, "device_authorization", js.undefined)
    
    inline def setEnd_session(value: String): Self = StObject.set(x, "end_session", value.asInstanceOf[js.Any])
    
    inline def setEnd_sessionUndefined: Self = StObject.set(x, "end_session", js.undefined)
    
    inline def setIntrospection(value: String): Self = StObject.set(x, "introspection", value.asInstanceOf[js.Any])
    
    inline def setIntrospectionUndefined: Self = StObject.set(x, "introspection", js.undefined)
    
    inline def setJwks(value: String): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
    
    inline def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
    
    inline def setPushed_authorization_request(value: String): Self = StObject.set(x, "pushed_authorization_request", value.asInstanceOf[js.Any])
    
    inline def setPushed_authorization_requestUndefined: Self = StObject.set(x, "pushed_authorization_request", js.undefined)
    
    inline def setRegistration(value: String): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
    
    inline def setRegistrationUndefined: Self = StObject.set(x, "registration", js.undefined)
    
    inline def setRevocation(value: String): Self = StObject.set(x, "revocation", value.asInstanceOf[js.Any])
    
    inline def setRevocationUndefined: Self = StObject.set(x, "revocation", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUserinfo(value: String): Self = StObject.set(x, "userinfo", value.asInstanceOf[js.Any])
    
    inline def setUserinfoUndefined: Self = StObject.set(x, "userinfo", js.undefined)
  }
}
