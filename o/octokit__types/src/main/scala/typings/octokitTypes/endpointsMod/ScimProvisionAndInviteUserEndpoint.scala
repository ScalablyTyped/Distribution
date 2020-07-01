package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScimProvisionAndInviteUserEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
}

object ScimProvisionAndInviteUserEndpoint {
  @scala.inline
  def apply(org_ : String): ScimProvisionAndInviteUserEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimProvisionAndInviteUserEndpoint]
  }
}

