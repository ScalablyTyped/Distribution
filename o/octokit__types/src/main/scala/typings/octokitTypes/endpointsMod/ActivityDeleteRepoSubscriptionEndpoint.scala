package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityDeleteRepoSubscriptionEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ActivityDeleteRepoSubscriptionEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ActivityDeleteRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityDeleteRepoSubscriptionEndpoint]
  }
}

