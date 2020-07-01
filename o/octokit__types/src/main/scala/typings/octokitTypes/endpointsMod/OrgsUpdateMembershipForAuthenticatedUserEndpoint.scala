package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateMembershipForAuthenticatedUserEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  /**
    * The state that the membership should be in. Only `"active"` will be accepted.
    */
  var state: active
}

object OrgsUpdateMembershipForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(org_ : String, state: active): OrgsUpdateMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateMembershipForAuthenticatedUserEndpoint]
  }
}

