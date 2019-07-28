package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateMembershipEndpoint extends js.Object {
  var org: String
  var state: String
}

object OrgsUpdateMembershipEndpoint {
  @scala.inline
  def apply(org: String, state: String): OrgsUpdateMembershipEndpoint = {
    val __obj = js.Dynamic.literal(org = org, state = state)
  
    __obj.asInstanceOf[OrgsUpdateMembershipEndpoint]
  }
}

