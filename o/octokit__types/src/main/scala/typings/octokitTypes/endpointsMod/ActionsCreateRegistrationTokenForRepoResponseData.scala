package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsCreateRegistrationTokenForRepoResponseData extends js.Object {
  var expires_at: String
  var token: String
}

object ActionsCreateRegistrationTokenForRepoResponseData {
  @scala.inline
  def apply(expires_at: String, token: String): ActionsCreateRegistrationTokenForRepoResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateRegistrationTokenForRepoResponseData]
  }
}

