package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addevents extends StObject {
  
  /**
    * @description Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    * @default true
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** @description Determines a list of events to be added to the list of events that the Hook triggers for. */
  var add_events: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description Key/value pairs to provide settings for this webhook. [These are defined below](https://docs.github.com/rest/reference/repos#create-hook-config-params). */
  var config: js.UndefOr[Address] = js.undefined
  
  /**
    * @description Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. This replaces the entire array of events.
    * @default [
    *   "push"
    * ]
    */
  var events: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description Determines a list of events to be removed from the list of events that the Hook triggers for. */
  var remove_events: js.UndefOr[js.Array[String]] = js.undefined
}
object Addevents {
  
  inline def apply(): Addevents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Addevents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Addevents] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAdd_events(value: js.Array[String]): Self = StObject.set(x, "add_events", value.asInstanceOf[js.Any])
    
    inline def setAdd_eventsUndefined: Self = StObject.set(x, "add_events", js.undefined)
    
    inline def setAdd_eventsVarargs(value: String*): Self = StObject.set(x, "add_events", js.Array(value*))
    
    inline def setConfig(value: Address): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setRemove_events(value: js.Array[String]): Self = StObject.set(x, "remove_events", value.asInstanceOf[js.Any])
    
    inline def setRemove_eventsUndefined: Self = StObject.set(x, "remove_events", js.undefined)
    
    inline def setRemove_eventsVarargs(value: String*): Self = StObject.set(x, "remove_events", js.Array(value*))
  }
}
