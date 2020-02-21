package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetMembershipParams extends js.Object {
  var org: String
  var username: String
}

object OrgsGetMembershipParams {
  @scala.inline
  def apply(org: String, username: String): OrgsGetMembershipParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsGetMembershipParams]
  }
}

