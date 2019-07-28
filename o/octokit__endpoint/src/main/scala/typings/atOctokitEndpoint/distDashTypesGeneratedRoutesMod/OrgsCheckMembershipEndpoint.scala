package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCheckMembershipEndpoint extends js.Object {
  var org: String
  var username: String
}

object OrgsCheckMembershipEndpoint {
  @scala.inline
  def apply(org: String, username: String): OrgsCheckMembershipEndpoint = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsCheckMembershipEndpoint]
  }
}

