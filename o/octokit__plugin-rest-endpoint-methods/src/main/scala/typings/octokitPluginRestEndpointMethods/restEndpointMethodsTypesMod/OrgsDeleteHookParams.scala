package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsDeleteHookParams]
  }
}

