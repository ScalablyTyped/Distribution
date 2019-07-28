package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCheckPublicMembershipParams extends js.Object {
  var org: String
  var username: String
}

object OrgsCheckPublicMembershipParams {
  @scala.inline
  def apply(org: String, username: String): OrgsCheckPublicMembershipParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsCheckPublicMembershipParams]
  }
}

