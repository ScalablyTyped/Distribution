package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsRemoveMemberEndpoint extends js.Object {
  var org: String
  var username: String
}

object OrgsRemoveMemberEndpoint {
  @scala.inline
  def apply(org: String, username: String): OrgsRemoveMemberEndpoint = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsRemoveMemberEndpoint]
  }
}

