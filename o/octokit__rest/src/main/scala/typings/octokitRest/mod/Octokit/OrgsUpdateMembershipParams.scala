package typings.octokitRest.mod.Octokit

import typings.octokitRest.octokitRestStrings.active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateMembershipParams extends js.Object {
  var org: String
  /**
    * The state that the membership should be in. Only `"active"` will be accepted.
    */
  var state: active
}

object OrgsUpdateMembershipParams {
  @scala.inline
  def apply(org: String, state: active): OrgsUpdateMembershipParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsUpdateMembershipParams]
  }
}

