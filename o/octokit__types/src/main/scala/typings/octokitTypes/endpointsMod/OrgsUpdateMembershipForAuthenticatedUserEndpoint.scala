package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgsUpdateMembershipForAuthenticatedUserEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
  
  /**
    * The state that the membership should be in. Only `"active"` will be accepted.
    */
  var state: active
}
object OrgsUpdateMembershipForAuthenticatedUserEndpoint {
  
  inline def apply(org_ : String): OrgsUpdateMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(state = "active")
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateMembershipForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: OrgsUpdateMembershipForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setState(value: active): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
