package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsBlockUserParams extends js.Object {
  var org: String
  var username: String
}

object OrgsBlockUserParams {
  @scala.inline
  def apply(org: String, username: String): OrgsBlockUserParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsBlockUserParams]
  }
}

