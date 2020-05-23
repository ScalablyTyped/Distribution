package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScimProvisionAndInviteUsersEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
}

object ScimProvisionAndInviteUsersEndpoint {
  @scala.inline
  def apply(org_ : String): ScimProvisionAndInviteUsersEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimProvisionAndInviteUsersEndpoint]
  }
}

