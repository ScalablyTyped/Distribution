package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint extends js.Object {
  var thread_id: Double = js.native
}

object ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(thread_id: Double): ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ActivityGetThreadSubscriptionForAuthenticatedUserEndpointOps[Self <: ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setThread_id(value: Double): Self = this.set("thread_id", value.asInstanceOf[js.Any])
  }
  
}

