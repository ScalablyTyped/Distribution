package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsUpdateMembershipForAuthenticatedUserEndpoint extends js.Object {
  
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
  implicit class OrgsUpdateMembershipForAuthenticatedUserEndpointOps[Self <: OrgsUpdateMembershipForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: active): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
