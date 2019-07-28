package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsBlockUserEndpoint extends js.Object {
  var org: String
  var username: String
}

object OrgsBlockUserEndpoint {
  @scala.inline
  def apply(org: String, username: String): OrgsBlockUserEndpoint = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsBlockUserEndpoint]
  }
}

