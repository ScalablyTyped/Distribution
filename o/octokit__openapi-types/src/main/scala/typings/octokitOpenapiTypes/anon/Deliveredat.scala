package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deliveredat extends StObject {
  
  /**
    * @description The type of activity for the event that triggered the delivery.
    * @example opened
    */
  var action: String | Null
  
  /**
    * Format: date-time
    * @description Time when the webhook delivery occurred.
    * @example 2021-05-12T20:33:44Z
    */
  var delivered_at: String
  
  /**
    * @description Time spent delivering.
    * @example 0.03
    */
  var duration: Double
  
  /**
    * @description The event that triggered the delivery.
    * @example issues
    */
  var event: String
  
  /**
    * @description Unique identifier for the event (shared with all deliveries for all webhooks that subscribe to this event).
    * @example 58474f00-b361-11eb-836d-0e4f3503ccbe
    */
  var guid: String
  
  /**
    * @description Unique identifier of the webhook delivery.
    * @example 42
    */
  var id: Double
  
  /**
    * @description The id of the GitHub App installation associated with this event.
    * @example 123
    */
  var installation_id: Double | Null
  
  /**
    * @description Whether the webhook delivery is a redelivery.
    * @example false
    */
  var redelivery: Boolean
  
  /**
    * @description The id of the repository associated with this event.
    * @example 123
    */
  var repository_id: Double | Null
  
  /**
    * @description Describes the response returned after attempting the delivery.
    * @example failed to connect
    */
  var status: String
  
  /**
    * @description Status code received when delivery was made.
    * @example 502
    */
  var status_code: Double
}
object Deliveredat {
  
  inline def apply(
    delivered_at: String,
    duration: Double,
    event: String,
    guid: String,
    id: Double,
    redelivery: Boolean,
    status: String,
    status_code: Double
  ): Deliveredat = {
    val __obj = js.Dynamic.literal(delivered_at = delivered_at.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], redelivery = redelivery.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any], action = null, installation_id = null, repository_id = null)
    __obj.asInstanceOf[Deliveredat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deliveredat] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setDelivered_at(value: String): Self = StObject.set(x, "delivered_at", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstallation_id(value: Double): Self = StObject.set(x, "installation_id", value.asInstanceOf[js.Any])
    
    inline def setInstallation_idNull: Self = StObject.set(x, "installation_id", null)
    
    inline def setRedelivery(value: Boolean): Self = StObject.set(x, "redelivery", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setRepository_idNull: Self = StObject.set(x, "repository_id", null)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_code(value: Double): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
  }
}
