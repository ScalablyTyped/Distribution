package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgsCreateWebhookEndpoint extends StObject {
  
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](https://developer.github.com/v3/orgs/hooks/#create-hook-config-params).
    */
  var config: OrgsCreateWebhookParamsConfig
  
  /**
    * Determines what [events](https://developer.github.com/webhooks/event-payloads) the hook is triggered for.
    */
  var events: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Must be passed as "web".
    */
  var name: String
  
  @JSName("org")
  var org_ : String
}
object OrgsCreateWebhookEndpoint {
  
  inline def apply(config: OrgsCreateWebhookParamsConfig, name: String, org_ : String): OrgsCreateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCreateWebhookEndpoint]
  }
  
  extension [Self <: OrgsCreateWebhookEndpoint](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setConfig(value: OrgsCreateWebhookParamsConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
