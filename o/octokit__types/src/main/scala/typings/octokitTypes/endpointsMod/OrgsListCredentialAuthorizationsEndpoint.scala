package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListCredentialAuthorizationsEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
}

object OrgsListCredentialAuthorizationsEndpoint {
  @scala.inline
  def apply(org_ : String): OrgsListCredentialAuthorizationsEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListCredentialAuthorizationsEndpoint]
  }
}

