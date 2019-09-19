package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetRepoSubscriptionResponse extends js.Object {
  var created_at: String
  var ignored: Boolean
  var reason: Null
  var repository_url: String
  var subscribed: Boolean
  var url: String
}

object ActivityGetRepoSubscriptionResponse {
  @scala.inline
  def apply(
    created_at: String,
    ignored: Boolean,
    reason: Null,
    repository_url: String,
    subscribed: Boolean,
    url: String
  ): ActivityGetRepoSubscriptionResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, ignored = ignored, reason = reason, repository_url = repository_url, subscribed = subscribed, url = url)
  
    __obj.asInstanceOf[ActivityGetRepoSubscriptionResponse]
  }
}

