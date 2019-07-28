package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsGetMembershipParams]
  }
}

