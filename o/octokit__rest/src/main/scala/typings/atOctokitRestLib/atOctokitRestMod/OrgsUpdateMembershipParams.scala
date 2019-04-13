package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateMembershipParams extends js.Object {
  var org: java.lang.String
  /**
    * The state that the membership should be in. Only `"active"` will be accepted.
    */
  var state: atOctokitRestLib.atOctokitRestLibStrings.active
}

object OrgsUpdateMembershipParams {
  @scala.inline
  def apply(org: java.lang.String, state: atOctokitRestLib.atOctokitRestLibStrings.active): OrgsUpdateMembershipParams = {
    val __obj = js.Dynamic.literal(org = org, state = state)
  
    __obj.asInstanceOf[OrgsUpdateMembershipParams]
  }
}

