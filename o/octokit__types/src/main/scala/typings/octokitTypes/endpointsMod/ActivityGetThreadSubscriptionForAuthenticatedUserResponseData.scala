package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityGetThreadSubscriptionForAuthenticatedUserResponseData extends js.Object {
  var created_at: String = js.native
  var ignored: Boolean = js.native
  var reason: String = js.native
  var subscribed: Boolean = js.native
  var thread_url: String = js.native
  var url: String = js.native
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
  @scala.inline
  implicit class ActivityGetThreadSubscriptionForAuthenticatedUserResponseDataOps[Self <: ActivityGetThreadSubscriptionForAuthenticatedUserResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnored(value: Boolean): Self = this.set("ignored", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscribed(value: Boolean): Self = this.set("subscribed", value.asInstanceOf[js.Any])
    @scala.inline
    def setThread_url(value: String): Self = this.set("thread_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

