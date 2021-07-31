package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListSelectedReposForOrgSecretEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
  
  var secret_name: String
}
object ActionsListSelectedReposForOrgSecretEndpoint {
  
  @scala.inline
  def apply(org_ : String, secret_name: String): ActionsListSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListSelectedReposForOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ActionsListSelectedReposForOrgSecretEndpointMutableBuilder[Self <: ActionsListSelectedReposForOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
