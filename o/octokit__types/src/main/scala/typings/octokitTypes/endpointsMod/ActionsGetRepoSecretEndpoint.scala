package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetRepoSecretEndpoint extends js.Object {
  var owner: String
  var repo: String
  var secret_name: String
}

object ActionsGetRepoSecretEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, secret_name: String): ActionsGetRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetRepoSecretEndpoint]
  }
}

