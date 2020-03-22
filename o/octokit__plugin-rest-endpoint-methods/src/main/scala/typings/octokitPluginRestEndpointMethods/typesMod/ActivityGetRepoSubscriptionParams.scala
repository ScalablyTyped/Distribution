package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetRepoSubscriptionParams extends js.Object {
  var owner: String
  var repo: String
}

object ActivityGetRepoSubscriptionParams {
  @scala.inline
  def apply(owner: String, repo: String): ActivityGetRepoSubscriptionParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityGetRepoSubscriptionParams]
  }
}

