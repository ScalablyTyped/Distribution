package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsPingHookParams extends js.Object {
  var hook_id: Double
  var org: String
}

object OrgsPingHookParams {
  @scala.inline
  def apply(hook_id: Double, org: String): OrgsPingHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsPingHookParams]
  }
}

