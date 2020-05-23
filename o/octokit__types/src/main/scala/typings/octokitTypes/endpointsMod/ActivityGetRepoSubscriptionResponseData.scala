package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetRepoSubscriptionResponseData extends js.Object {
  var created_at: String
  var ignored: Boolean
  var reason: String
  var repository_url: String
  var subscribed: Boolean
  var url: String
}

object ActivityGetRepoSubscriptionResponseData {
  @scala.inline
  def apply(
    created_at: String,
    ignored: Boolean,
    reason: String,
    repository_url: String,
    subscribed: Boolean,
    url: String
  ): ActivityGetRepoSubscriptionResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetRepoSubscriptionResponseData]
  }
}

