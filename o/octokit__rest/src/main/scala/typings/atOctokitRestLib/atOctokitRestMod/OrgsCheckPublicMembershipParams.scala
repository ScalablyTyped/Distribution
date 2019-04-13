package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCheckPublicMembershipParams extends js.Object {
  var org: java.lang.String
  var username: java.lang.String
}

object OrgsCheckPublicMembershipParams {
  @scala.inline
  def apply(org: java.lang.String, username: java.lang.String): OrgsCheckPublicMembershipParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsCheckPublicMembershipParams]
  }
}

