package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetHookParams extends js.Object {
  var hook_id: Double
  var org: String
}

object OrgsGetHookParams {
  @scala.inline
  def apply(hook_id: Double, org: String): OrgsGetHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsGetHookParams]
  }
}

