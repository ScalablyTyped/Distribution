package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsUpdateMembershipForAuthenticatedUserEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * The state that the membership should be in. Only `"active"` will be accepted.
    */
  var state: active = js.native
}
object OrgsUpdateMembershipForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(org_ : String, state: active): OrgsUpdateMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateMembershipForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class OrgsUpdateMembershipForAuthenticatedUserEndpointMutableBuilder[Self <: OrgsUpdateMembershipForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: active): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
