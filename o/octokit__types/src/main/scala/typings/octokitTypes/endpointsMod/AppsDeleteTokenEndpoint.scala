package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDeleteTokenEndpoint extends StObject {
  
  /**
    * The OAuth access token used to authenticate to the GitHub API.
    */
  var access_token: js.UndefOr[String] = js.undefined
  
  var client_id: String
}
object AppsDeleteTokenEndpoint {
  
  @scala.inline
  def apply(client_id: String): AppsDeleteTokenEndpoint = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsDeleteTokenEndpoint]
  }
  
  @scala.inline
  implicit class AppsDeleteTokenEndpointMutableBuilder[Self <: AppsDeleteTokenEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
  }
}
