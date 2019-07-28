package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCheckMembershipParams extends js.Object {
  var org: String
  var username: String
}

object OrgsCheckMembershipParams {
  @scala.inline
  def apply(org: String, username: String): OrgsCheckMembershipParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsCheckMembershipParams]
  }
}

