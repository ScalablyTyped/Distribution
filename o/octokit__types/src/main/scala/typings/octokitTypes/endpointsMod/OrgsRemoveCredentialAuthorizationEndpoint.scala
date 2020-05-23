package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsRemoveCredentialAuthorizationEndpoint extends js.Object {
  var credential_id: Double
  @JSName("org")
  var org_ : String
}

object OrgsRemoveCredentialAuthorizationEndpoint {
  @scala.inline
  def apply(credential_id: Double, org_ : String): OrgsRemoveCredentialAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(credential_id = credential_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsRemoveCredentialAuthorizationEndpoint]
  }
}

