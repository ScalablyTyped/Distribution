package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsDeleteOrgSecretEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var secret_name: String
}

object ActionsDeleteOrgSecretEndpoint {
  @scala.inline
  def apply(org_ : String, secret_name: String): ActionsDeleteOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteOrgSecretEndpoint]
  }
}

