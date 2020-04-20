package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsRemoveMembershipParams extends js.Object {
  var org: String
  var username: String
}

object OrgsRemoveMembershipParams {
  @scala.inline
  def apply(org: String, username: String): OrgsRemoveMembershipParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsRemoveMembershipParams]
  }
}

