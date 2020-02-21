package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCheckBlockedUserParams extends js.Object {
  var org: String
  var username: String
}

object OrgsCheckBlockedUserParams {
  @scala.inline
  def apply(org: String, username: String): OrgsCheckBlockedUserParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsCheckBlockedUserParams]
  }
}

