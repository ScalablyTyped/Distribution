package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsDeleteHookParams extends js.Object {
  var hook_id: Double
  var org: String
}

object OrgsDeleteHookParams {
  @scala.inline
  def apply(hook_id: Double, org: String): OrgsDeleteHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id, org = org)
  
    __obj.asInstanceOf[OrgsDeleteHookParams]
  }
}

