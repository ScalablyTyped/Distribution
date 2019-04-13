package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCheckMembershipParams extends js.Object {
  var org: java.lang.String
  var username: java.lang.String
}

object OrgsCheckMembershipParams {
  @scala.inline
  def apply(org: java.lang.String, username: java.lang.String): OrgsCheckMembershipParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsCheckMembershipParams]
  }
}

