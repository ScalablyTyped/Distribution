package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUnblockUserEndpoint extends js.Object {
  var org: String
  var username: String
}

object OrgsUnblockUserEndpoint {
  @scala.inline
  def apply(org: String, username: String): OrgsUnblockUserEndpoint = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsUnblockUserEndpoint]
  }
}

