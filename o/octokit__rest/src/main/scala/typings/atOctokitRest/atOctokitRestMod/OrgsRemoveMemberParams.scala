package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsRemoveMemberParams extends js.Object {
  var org: String
  var username: String
}

object OrgsRemoveMemberParams {
  @scala.inline
  def apply(org: String, username: String): OrgsRemoveMemberParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsRemoveMemberParams]
  }
}

