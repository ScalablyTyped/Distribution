package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsDeleteHookEndpoint extends js.Object {
  var hook_id: Double
  @JSName("org")
  var org_ : String
}

object OrgsDeleteHookEndpoint {
  @scala.inline
  def apply(hook_id: Double, org_ : String): OrgsDeleteHookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsDeleteHookEndpoint]
  }
}

