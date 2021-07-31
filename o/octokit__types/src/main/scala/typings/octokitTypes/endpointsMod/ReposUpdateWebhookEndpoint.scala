package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUpdateWebhookEndpoint extends StObject {
  
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines a list of events to be added to the list of events that the Hook triggers for.
    */
  var add_events: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](https://developer.github.com/v3/repos/hooks/#create-hook-config-params).
    */
  var config: js.UndefOr[ReposUpdateWebhookParamsConfig] = js.undefined
  
  /**
    * Determines what [events](https://developer.github.com/webhooks/event-payloads) the hook is triggered for. This replaces the entire array of events.
    */
  var events: js.UndefOr[js.Array[String]] = js.undefined
  
  var hook_id: Double
  
  var owner: String
  
  /**
    * Determines a list of events to be removed from the list of events that the Hook triggers for.
    */
  var remove_events: js.UndefOr[js.Array[String]] = js.undefined
  
  var repo: String
}
object ReposUpdateWebhookEndpoint {
  
  @scala.inline
  def apply(hook_id: Double, owner: String, repo: String): ReposUpdateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ReposUpdateWebhookEndpointMutableBuilder[Self <: ReposUpdateWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAdd_events(value: js.Array[String]): Self = StObject.set(x, "add_events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd_eventsUndefined: Self = StObject.set(x, "add_events", js.undefined)
    
    @scala.inline
    def setAdd_eventsVarargs(value: String*): Self = StObject.set(x, "add_events", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: ReposUpdateWebhookParamsConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setHook_id(value: Double): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove_events(value: js.Array[String]): Self = StObject.set(x, "remove_events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove_eventsUndefined: Self = StObject.set(x, "remove_events", js.undefined)
    
    @scala.inline
    def setRemove_eventsVarargs(value: String*): Self = StObject.set(x, "remove_events", js.Array(value :_*))
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
