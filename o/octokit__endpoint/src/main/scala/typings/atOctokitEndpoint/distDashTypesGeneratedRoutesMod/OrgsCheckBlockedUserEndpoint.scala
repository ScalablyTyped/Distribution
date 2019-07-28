package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCheckBlockedUserEndpoint extends js.Object {
  var org: String
  var username: String
}

object OrgsCheckBlockedUserEndpoint {
  @scala.inline
  def apply(org: String, username: String): OrgsCheckBlockedUserEndpoint = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsCheckBlockedUserEndpoint]
  }
}

