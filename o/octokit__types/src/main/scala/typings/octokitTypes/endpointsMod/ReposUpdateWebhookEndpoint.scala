package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateWebhookEndpoint extends js.Object {
  
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines a list of events to be added to the list of events that the Hook triggers for.
    */
  var add_events: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](https://developer.github.com/v3/repos/hooks/#create-hook-config-params).
    */
  var config: js.UndefOr[ReposUpdateWebhookParamsConfig] = js.native
  
  /**
    * Determines what [events](https://developer.github.com/webhooks/event-payloads) the hook is triggered for. This replaces the entire array of events.
    */
  var events: js.UndefOr[js.Array[String]] = js.native
  
  var hook_id: Double = js.native
  
  var owner: String = js.native
  
  /**
    * Determines a list of events to be removed from the list of events that the Hook triggers for.
    */
  var remove_events: js.UndefOr[js.Array[String]] = js.native
  
  var repo: String = js.native
}
object ReposUpdateWebhookEndpoint {
  
  @scala.inline
  def apply(hook_id: Double, owner: String, repo: String): ReposUpdateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ReposUpdateWebhookEndpointOps[Self <: ReposUpdateWebhookEndpoint] (val x: Self) extends AnyVal {
    
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
    def setHook_id(value: Double): Self = this.set("hook_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAdd_eventsVarargs(value: String*): Self = this.set("add_events", js.Array(value :_*))
    
    @scala.inline
    def setAdd_events(value: js.Array[String]): Self = this.set("add_events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd_events: Self = this.set("add_events", js.undefined)
    
    @scala.inline
    def setConfig(value: ReposUpdateWebhookParamsConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setRemove_eventsVarargs(value: String*): Self = this.set("remove_events", js.Array(value :_*))
    
    @scala.inline
    def setRemove_events(value: js.Array[String]): Self = this.set("remove_events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove_events: Self = this.set("remove_events", js.undefined)
  }
}
