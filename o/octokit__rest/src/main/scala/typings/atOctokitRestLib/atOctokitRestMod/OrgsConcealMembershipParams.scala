package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsConcealMembershipParams extends js.Object {
  var org: java.lang.String
  var username: java.lang.String
}

object OrgsConcealMembershipParams {
  @scala.inline
  def apply(org: java.lang.String, username: java.lang.String): OrgsConcealMembershipParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsConcealMembershipParams]
  }
}

