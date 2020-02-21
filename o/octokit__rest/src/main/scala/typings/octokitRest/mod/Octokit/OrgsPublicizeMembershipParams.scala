package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsPublicizeMembershipParams extends js.Object {
  var org: String
  var username: String
}

object OrgsPublicizeMembershipParams {
  @scala.inline
  def apply(org: String, username: String): OrgsPublicizeMembershipParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsPublicizeMembershipParams]
  }
}

