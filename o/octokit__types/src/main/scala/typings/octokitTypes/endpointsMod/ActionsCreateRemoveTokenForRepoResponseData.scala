package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsCreateRemoveTokenForRepoResponseData extends js.Object {
  var expires_at: String
  var token: String
}

object ActionsCreateRemoveTokenForRepoResponseData {
  @scala.inline
  def apply(expires_at: String, token: String): ActionsCreateRemoveTokenForRepoResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateRemoveTokenForRepoResponseData]
  }
}

