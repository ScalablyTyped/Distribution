package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetHookEndpoint extends js.Object {
  var hook_id: Double
  @JSName("org")
  var org_ : String
}

object OrgsGetHookEndpoint {
  @scala.inline
  def apply(hook_id: Double, org_ : String): OrgsGetHookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetHookEndpoint]
  }
}

