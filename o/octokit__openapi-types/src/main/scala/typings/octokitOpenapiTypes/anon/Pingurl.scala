package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pingurl extends StObject {
  
  /** @description Determines whether the hook is actually triggered for the events it subscribes to. */
  var active: Boolean
  
  /** @description Only included for GitHub Apps. When you register a new GitHub App, GitHub sends a ping event to the webhook URL you specified during registration. The GitHub App ID sent in this field is required for authenticating an app. */
  var app_id: js.UndefOr[Double] = js.undefined
  
  var config: ContenttypeInsecuresslSecret
  
  /** Format: date-time */
  var created_at: String
  
  /** Format: uri */
  var deliveries_url: js.UndefOr[String] = js.undefined
  
  /** @description Determines what events the hook is triggered for. Default: ['push']. */
  var events: js.Array[String]
  
  /** @description Unique identifier of the webhook. */
  var id: Double
  
  var last_response: js.UndefOr[MessageStatus] = js.undefined
  
  /**
    * @description The type of webhook. The only valid value is 'web'.
    * @enum {string}
    */
  var name: web
  
  /** Format: uri */
  var ping_url: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var test_url: js.UndefOr[String] = js.undefined
  
  var `type`: String
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: js.UndefOr[String] = js.undefined
}
object Pingurl {
  
  inline def apply(
    active: Boolean,
    config: ContenttypeInsecuresslSecret,
    created_at: String,
    events: js.Array[String],
    id: Double,
    `type`: String,
    updated_at: String
  ): Pingurl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = "web", updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pingurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pingurl] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    inline def setConfig(value: ContenttypeInsecuresslSecret): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDeliveries_url(value: String): Self = StObject.set(x, "deliveries_url", value.asInstanceOf[js.Any])
    
    inline def setDeliveries_urlUndefined: Self = StObject.set(x, "deliveries_url", js.undefined)
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_response(value: MessageStatus): Self = StObject.set(x, "last_response", value.asInstanceOf[js.Any])
    
    inline def setLast_responseUndefined: Self = StObject.set(x, "last_response", js.undefined)
    
    inline def setName(value: web): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPing_url(value: String): Self = StObject.set(x, "ping_url", value.asInstanceOf[js.Any])
    
    inline def setPing_urlUndefined: Self = StObject.set(x, "ping_url", js.undefined)
    
    inline def setTest_url(value: String): Self = StObject.set(x, "test_url", value.asInstanceOf[js.Any])
    
    inline def setTest_urlUndefined: Self = StObject.set(x, "test_url", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
