package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsPingHookEndpoint extends js.Object {
  var hook_id: Double
  @JSName("org")
  var org_ : String
}

object OrgsPingHookEndpoint {
  @scala.inline
  def apply(hook_id: Double, org_ : String): OrgsPingHookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsPingHookEndpoint]
  }
}

