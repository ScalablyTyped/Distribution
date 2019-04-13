package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsBlockUserParams extends js.Object {
  var org: java.lang.String
  var username: java.lang.String
}

object OrgsBlockUserParams {
  @scala.inline
  def apply(org: java.lang.String, username: java.lang.String): OrgsBlockUserParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsBlockUserParams]
  }
}

