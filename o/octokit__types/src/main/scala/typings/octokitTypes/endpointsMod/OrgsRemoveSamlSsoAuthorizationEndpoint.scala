package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgsRemoveSamlSsoAuthorizationEndpoint extends StObject {
  
  var credential_id: Double
  
  @JSName("org")
  var org_ : String
}
object OrgsRemoveSamlSsoAuthorizationEndpoint {
  
  inline def apply(credential_id: Double, org_ : String): OrgsRemoveSamlSsoAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(credential_id = credential_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsRemoveSamlSsoAuthorizationEndpoint]
  }
  
  extension [Self <: OrgsRemoveSamlSsoAuthorizationEndpoint](x: Self) {
    
    inline def setCredential_id(value: Double): Self = StObject.set(x, "credential_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
