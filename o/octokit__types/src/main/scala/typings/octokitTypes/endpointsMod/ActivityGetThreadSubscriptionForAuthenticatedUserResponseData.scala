package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetThreadSubscriptionForAuthenticatedUserResponseData extends js.Object {
  var created_at: String
  var ignored: Boolean
  var reason: String
  var subscribed: Boolean
  var thread_url: String
  var url: String
}

object ActivityGetThreadSubscriptionForAuthenticatedUserResponseData {
  @scala.inline
  def apply(
    created_at: String,
    ignored: Boolean,
    reason: String,
    subscribed: Boolean,
    thread_url: String,
    url: String
  ): ActivityGetThreadSubscriptionForAuthenticatedUserResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], thread_url = thread_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetThreadSubscriptionForAuthenticatedUserResponseData]
  }
}

