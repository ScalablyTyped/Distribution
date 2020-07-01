package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsRemoveSamlSsoAuthorizationEndpoint extends js.Object {
  var credential_id: Double
  @JSName("org")
  var org_ : String
}

object OrgsRemoveSamlSsoAuthorizationEndpoint {
  @scala.inline
  def apply(credential_id: Double, org_ : String): OrgsRemoveSamlSsoAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(credential_id = credential_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsRemoveSamlSsoAuthorizationEndpoint]
  }
}

