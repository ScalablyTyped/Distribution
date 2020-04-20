package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySetRepoSubscriptionResponse extends js.Object {
  var created_at: String
  var ignored: Boolean
  var reason: Null
  var repository_url: String
  var subscribed: Boolean
  var url: String
}

object ActivitySetRepoSubscriptionResponse {
  @scala.inline
  def apply(
    created_at: String,
    ignored: Boolean,
    reason: Null,
    repository_url: String,
    subscribed: Boolean,
    url: String
  ): ActivitySetRepoSubscriptionResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySetRepoSubscriptionResponse]
  }
}

