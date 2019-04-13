package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsRemoveMemberParams extends js.Object {
  var org: java.lang.String
  var username: java.lang.String
}

object OrgsRemoveMemberParams {
  @scala.inline
  def apply(org: java.lang.String, username: java.lang.String): OrgsRemoveMemberParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsRemoveMemberParams]
  }
}

