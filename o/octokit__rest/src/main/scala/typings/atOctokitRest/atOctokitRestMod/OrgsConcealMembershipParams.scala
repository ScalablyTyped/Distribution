package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsConcealMembershipParams extends js.Object {
  var org: String
  var username: String
}

object OrgsConcealMembershipParams {
  @scala.inline
  def apply(org: String, username: String): OrgsConcealMembershipParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsConcealMembershipParams]
  }
}

