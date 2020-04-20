package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityStarRepoForAuthenticatedUserParams extends js.Object {
  var owner: String
  var repo: String
}

object ActivityStarRepoForAuthenticatedUserParams {
  @scala.inline
  def apply(owner: String, repo: String): ActivityStarRepoForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityStarRepoForAuthenticatedUserParams]
  }
}

