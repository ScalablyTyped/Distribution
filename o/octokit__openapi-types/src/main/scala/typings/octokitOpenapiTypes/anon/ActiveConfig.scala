package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveConfig extends StObject {
  
  /**
    * @description Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    * @default true
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** @description Key/value pairs to provide settings for this webhook. [These are defined below](https://docs.github.com/rest/reference/orgs#create-hook-config-params). */
  var config: InsecuresslPassword
  
  /**
    * @description Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for.
    * @default [
    *   "push"
    * ]
    */
  var events: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description Must be passed as "web". */
  var name: String
}
object ActiveConfig {
  
  inline def apply(config: InsecuresslPassword, name: String): ActiveConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveConfig] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setConfig(value: InsecuresslPassword): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
