package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgsGetMembershipForAuthenticatedUserEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
}
object OrgsGetMembershipForAuthenticatedUserEndpoint {
  
  inline def apply(org_ : String): OrgsGetMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetMembershipForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: OrgsGetMembershipForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
