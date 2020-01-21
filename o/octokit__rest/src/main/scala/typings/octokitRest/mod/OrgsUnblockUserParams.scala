package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUnblockUserParams extends js.Object {
  var org: String
  var username: String
}

object OrgsUnblockUserParams {
  @scala.inline
  def apply(org: String, username: String): OrgsUnblockUserParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsUnblockUserParams]
  }
}

