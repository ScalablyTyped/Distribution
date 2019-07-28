package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCheckPublicMembershipEndpoint extends js.Object {
  var org: String
  var username: String
}

object OrgsCheckPublicMembershipEndpoint {
  @scala.inline
  def apply(org: String, username: String): OrgsCheckPublicMembershipEndpoint = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsCheckPublicMembershipEndpoint]
  }
}

