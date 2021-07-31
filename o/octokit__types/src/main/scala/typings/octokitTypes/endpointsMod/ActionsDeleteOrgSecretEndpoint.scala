package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsDeleteOrgSecretEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
  
  var secret_name: String
}
object ActionsDeleteOrgSecretEndpoint {
  
  @scala.inline
  def apply(org_ : String, secret_name: String): ActionsDeleteOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ActionsDeleteOrgSecretEndpointMutableBuilder[Self <: ActionsDeleteOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
