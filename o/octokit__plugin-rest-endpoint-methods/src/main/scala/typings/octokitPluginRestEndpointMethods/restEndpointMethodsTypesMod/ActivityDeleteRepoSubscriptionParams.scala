package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityDeleteRepoSubscriptionParams extends js.Object {
  var owner: String
  var repo: String
}

object ActivityDeleteRepoSubscriptionParams {
  @scala.inline
  def apply(owner: String, repo: String): ActivityDeleteRepoSubscriptionParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityDeleteRepoSubscriptionParams]
  }
}

