package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsDeleteRepoSecretEndpoint extends js.Object {
  var owner: String
  var repo: String
  var secret_name: String
}

object ActionsDeleteRepoSecretEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, secret_name: String): ActionsDeleteRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteRepoSecretEndpoint]
  }
}

