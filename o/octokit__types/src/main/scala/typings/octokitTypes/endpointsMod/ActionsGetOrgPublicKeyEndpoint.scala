package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetOrgPublicKeyEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
}

object ActionsGetOrgPublicKeyEndpoint {
  @scala.inline
  def apply(org_ : String): ActionsGetOrgPublicKeyEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetOrgPublicKeyEndpoint]
  }
}

