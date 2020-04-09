package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityUnstarRepoForAuthenticatedUserParams extends js.Object {
  var owner: String
  var repo: String
}

object ActivityUnstarRepoForAuthenticatedUserParams {
  @scala.inline
  def apply(owner: String, repo: String): ActivityUnstarRepoForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityUnstarRepoForAuthenticatedUserParams]
  }
}

