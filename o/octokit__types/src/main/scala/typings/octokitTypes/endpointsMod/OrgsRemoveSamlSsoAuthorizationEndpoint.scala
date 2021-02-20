package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsRemoveSamlSsoAuthorizationEndpoint extends StObject {
  
  var credential_id: Double = js.native
  
  @JSName("org")
  var org_ : String = js.native
}
object OrgsRemoveSamlSsoAuthorizationEndpoint {
  
  @scala.inline
  def apply(credential_id: Double, org_ : String): OrgsRemoveSamlSsoAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(credential_id = credential_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsRemoveSamlSsoAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class OrgsRemoveSamlSsoAuthorizationEndpointMutableBuilder[Self <: OrgsRemoveSamlSsoAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential_id(value: Double): Self = StObject.set(x, "credential_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
