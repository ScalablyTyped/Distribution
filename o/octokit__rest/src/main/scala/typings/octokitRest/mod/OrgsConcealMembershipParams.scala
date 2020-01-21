package typings.octokitRest.mod

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
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsConcealMembershipParams]
  }
}

