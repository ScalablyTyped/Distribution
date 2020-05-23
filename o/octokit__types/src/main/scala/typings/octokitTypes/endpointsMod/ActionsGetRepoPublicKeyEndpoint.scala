package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetRepoPublicKeyEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ActionsGetRepoPublicKeyEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ActionsGetRepoPublicKeyEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetRepoPublicKeyEndpoint]
  }
}

