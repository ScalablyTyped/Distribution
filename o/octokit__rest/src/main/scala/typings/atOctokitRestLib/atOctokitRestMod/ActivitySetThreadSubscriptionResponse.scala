package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySetThreadSubscriptionResponse extends js.Object {
  var created_at: java.lang.String
  var ignored: scala.Boolean
  var reason: scala.Null
  var subscribed: scala.Boolean
  var thread_url: java.lang.String
  var url: java.lang.String
}

object ActivitySetThreadSubscriptionResponse {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    ignored: scala.Boolean,
    reason: scala.Null,
    subscribed: scala.Boolean,
    thread_url: java.lang.String,
    url: java.lang.String
  ): ActivitySetThreadSubscriptionResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, ignored = ignored, reason = reason, subscribed = subscribed, thread_url = thread_url, url = url)
  
    __obj.asInstanceOf[ActivitySetThreadSubscriptionResponse]
  }
}

