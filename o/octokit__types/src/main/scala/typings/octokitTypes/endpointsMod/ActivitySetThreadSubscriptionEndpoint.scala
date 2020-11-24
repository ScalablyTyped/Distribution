package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivitySetThreadSubscriptionEndpoint extends js.Object {
  
  /**
    * Unsubscribes and subscribes you to a conversation. Set `ignored` to `true` to block all notifications from this thread.
    */
  var ignored: js.UndefOr[Boolean] = js.native
  
  var thread_id: Double = js.native
}
object ActivitySetThreadSubscriptionEndpoint {
  
  @scala.inline
  def apply(thread_id: Double): ActivitySetThreadSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySetThreadSubscriptionEndpoint]
  }
  
  @scala.inline
  implicit class ActivitySetThreadSubscriptionEndpointOps[Self <: ActivitySetThreadSubscriptionEndpoint] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setIgnored(value: Boolean): Self = this.set("ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnored: Self = this.set("ignored", js.undefined)
  }
}
