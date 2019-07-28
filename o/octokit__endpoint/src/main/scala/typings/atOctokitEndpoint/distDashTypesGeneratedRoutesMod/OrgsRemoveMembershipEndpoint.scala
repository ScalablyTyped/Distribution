package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsRemoveMembershipEndpoint extends js.Object {
  var org: String
  var username: String
}

object OrgsRemoveMembershipEndpoint {
  @scala.inline
  def apply(org: String, username: String): OrgsRemoveMembershipEndpoint = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsRemoveMembershipEndpoint]
  }
}

