package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lastresponse extends StObject {
  
  /**
    * @description Determines whether the hook is actually triggered on pushes.
    * @example true
    */
  var active: Boolean
  
  var config: Password
  
  /**
    * Format: date-time
    * @example 2011-09-06T17:26:27Z
    */
  var created_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/hooks/1/deliveries
    */
  var deliveries_url: js.UndefOr[String] = js.undefined
  
  /**
    * @description Determines what events the hook is triggered for. Default: ['push'].
    * @example [
    *   "push",
    *   "pull_request"
    * ]
    */
  var events: js.Array[String]
  
  /**
    * @description Unique identifier of the webhook.
    * @example 42
    */
  var id: Double
  
  var last_response: MessageStatus
  
  /**
    * @description The name of a valid service, use 'web' for a webhook.
    * @example web
    */
  var name: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/hooks/1/pings
    */
  var ping_url: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/hooks/1/test
    */
  var test_url: String
  
  var `type`: String
  
  /**
    * Format: date-time
    * @example 2011-09-06T20:39:23Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/hooks/1
    */
  var url: String
}
object Lastresponse {
  
  inline def apply(
    active: Boolean,
    config: Password,
    created_at: String,
    events: js.Array[String],
    id: Double,
    last_response: MessageStatus,
    name: String,
    ping_url: String,
    test_url: String,
    `type`: String,
    updated_at: String,
    url: String
  ): Lastresponse = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_response = last_response.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ping_url = ping_url.asInstanceOf[js.Any], test_url = test_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastresponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lastresponse] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Password): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDeliveries_url(value: String): Self = StObject.set(x, "deliveries_url", value.asInstanceOf[js.Any])
    
    inline def setDeliveries_urlUndefined: Self = StObject.set(x, "deliveries_url", js.undefined)
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_response(value: MessageStatus): Self = StObject.set(x, "last_response", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPing_url(value: String): Self = StObject.set(x, "ping_url", value.asInstanceOf[js.Any])
    
    inline def setTest_url(value: String): Self = StObject.set(x, "test_url", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
