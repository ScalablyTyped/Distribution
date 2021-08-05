package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthAuthorizationsGetAuthorizationEndpoint extends StObject {
  
  var authorization_id: Double
}
object OauthAuthorizationsGetAuthorizationEndpoint {
  
  inline def apply(authorization_id: Double): OauthAuthorizationsGetAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetAuthorizationEndpoint]
  }
  
  extension [Self <: OauthAuthorizationsGetAuthorizationEndpoint](x: Self) {
    
    inline def setAuthorization_id(value: Double): Self = StObject.set(x, "authorization_id", value.asInstanceOf[js.Any])
  }
}
