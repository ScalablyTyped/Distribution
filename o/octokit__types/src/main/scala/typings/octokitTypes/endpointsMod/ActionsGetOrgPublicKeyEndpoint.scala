package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsGetOrgPublicKeyEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
}
object ActionsGetOrgPublicKeyEndpoint {
  
  inline def apply(org_ : String): ActionsGetOrgPublicKeyEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetOrgPublicKeyEndpoint]
  }
  
  extension [Self <: ActionsGetOrgPublicKeyEndpoint](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
