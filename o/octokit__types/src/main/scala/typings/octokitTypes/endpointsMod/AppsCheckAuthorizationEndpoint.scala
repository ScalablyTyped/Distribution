package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsCheckAuthorizationEndpoint extends StObject {
  
  var access_token: String
  
  var client_id: String
}
object AppsCheckAuthorizationEndpoint {
  
  inline def apply(access_token: String, client_id: String): AppsCheckAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCheckAuthorizationEndpoint]
  }
  
  extension [Self <: AppsCheckAuthorizationEndpoint](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
  }
}
