package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsCheckAuthorizationEndpoint extends StObject {
  
  var access_token: String = js.native
  
  var client_id: String = js.native
}
object AppsCheckAuthorizationEndpoint {
  
  @scala.inline
  def apply(access_token: String, client_id: String): AppsCheckAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCheckAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class AppsCheckAuthorizationEndpointMutableBuilder[Self <: AppsCheckAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
  }
}
