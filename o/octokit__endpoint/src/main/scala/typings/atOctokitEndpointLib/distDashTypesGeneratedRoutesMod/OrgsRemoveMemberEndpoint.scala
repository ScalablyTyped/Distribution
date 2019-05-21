package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsRemoveMemberEndpoint extends js.Object {
  var org: java.lang.String
  var username: java.lang.String
}

object OrgsRemoveMemberEndpoint {
  @scala.inline
  def apply(org: java.lang.String, username: java.lang.String): OrgsRemoveMemberEndpoint = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsRemoveMemberEndpoint]
  }
}

