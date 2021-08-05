package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Insecuressl
import typings.octokitTypes.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUpdateWebhookResponseData extends StObject {
  
  var active: Boolean
  
  var config: Insecuressl
  
  var created_at: String
  
  var events: js.Array[String]
  
  var id: Double
  
  var last_response: Message
  
  var name: String
  
  var ping_url: String
  
  var test_url: String
  
  var `type`: String
  
  var updated_at: String
  
  var url: String
}
object ReposUpdateWebhookResponseData {
  
  inline def apply(
    active: Boolean,
    config: Insecuressl,
    created_at: String,
    events: js.Array[String],
    id: Double,
    last_response: Message,
    name: String,
    ping_url: String,
    test_url: String,
    `type`: String,
    updated_at: String,
    url: String
  ): ReposUpdateWebhookResponseData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_response = last_response.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ping_url = ping_url.asInstanceOf[js.Any], test_url = test_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateWebhookResponseData]
  }
  
  extension [Self <: ReposUpdateWebhookResponseData](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Insecuressl): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_response(value: Message): Self = StObject.set(x, "last_response", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPing_url(value: String): Self = StObject.set(x, "ping_url", value.asInstanceOf[js.Any])
    
    inline def setTest_url(value: String): Self = StObject.set(x, "test_url", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
