package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsPingHookEndpoint extends js.Object {
  var hook_id: Double
  var org: String
}

object OrgsPingHookEndpoint {
  @scala.inline
  def apply(hook_id: Double, org: String): OrgsPingHookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id, org = org)
  
    __obj.asInstanceOf[OrgsPingHookEndpoint]
  }
}

