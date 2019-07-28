package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetThreadSubscriptionResponse extends js.Object {
  var created_at: String
  var ignored: Boolean
  var reason: Null
  var subscribed: Boolean
  var thread_url: String
  var url: String
}

object ActivityGetThreadSubscriptionResponse {
  @scala.inline
  def apply(
    created_at: String,
    ignored: Boolean,
    reason: Null,
    subscribed: Boolean,
    thread_url: String,
    url: String
  ): ActivityGetThreadSubscriptionResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, ignored = ignored, reason = reason, subscribed = subscribed, thread_url = thread_url, url = url)
  
    __obj.asInstanceOf[ActivityGetThreadSubscriptionResponse]
  }
}

