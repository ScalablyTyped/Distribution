package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityUnstarRepoForAuthenticatedUserEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ActivityUnstarRepoForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ActivityUnstarRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityUnstarRepoForAuthenticatedUserEndpoint]
  }
}

