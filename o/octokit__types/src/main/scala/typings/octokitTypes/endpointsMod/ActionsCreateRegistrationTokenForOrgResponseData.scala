package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsCreateRegistrationTokenForOrgResponseData extends StObject {
  
  var expires_at: String
  
  var token: String
}
object ActionsCreateRegistrationTokenForOrgResponseData {
  
  inline def apply(expires_at: String, token: String): ActionsCreateRegistrationTokenForOrgResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateRegistrationTokenForOrgResponseData]
  }
  
  extension [Self <: ActionsCreateRegistrationTokenForOrgResponseData](x: Self) {
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
