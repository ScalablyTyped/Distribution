package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetMembershipEndpoint extends js.Object {
  var org: String
  var username: String
}

object OrgsGetMembershipEndpoint {
  @scala.inline
  def apply(org: String, username: String): OrgsGetMembershipEndpoint = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsGetMembershipEndpoint]
  }
}

