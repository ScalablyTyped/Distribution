package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthAuthorizationsDeleteAuthorizationEndpoint extends StObject {
  
  var authorization_id: Double = js.native
}
object OauthAuthorizationsDeleteAuthorizationEndpoint {
  
  @scala.inline
  def apply(authorization_id: Double): OauthAuthorizationsDeleteAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsDeleteAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class OauthAuthorizationsDeleteAuthorizationEndpointMutableBuilder[Self <: OauthAuthorizationsDeleteAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization_id(value: Double): Self = StObject.set(x, "authorization_id", value.asInstanceOf[js.Any])
  }
}
