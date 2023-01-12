package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topic extends StObject {
  
  /** The name of the topic. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id} */
  var name: js.UndefOr[String] = js.undefined
  
  /** The settings for this topic's partitions. */
  var partitionConfig: js.UndefOr[PartitionConfig] = js.undefined
  
  /** The settings for this topic's Reservation usage. */
  var reservationConfig: js.UndefOr[ReservationConfig] = js.undefined
  
  /** The settings for this topic's message retention. */
  var retentionConfig: js.UndefOr[RetentionConfig] = js.undefined
}
object Topic {
  
  inline def apply(): Topic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Topic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Topic] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartitionConfig(value: PartitionConfig): Self = StObject.set(x, "partitionConfig", value.asInstanceOf[js.Any])
    
    inline def setPartitionConfigUndefined: Self = StObject.set(x, "partitionConfig", js.undefined)
    
    inline def setReservationConfig(value: ReservationConfig): Self = StObject.set(x, "reservationConfig", value.asInstanceOf[js.Any])
    
    inline def setReservationConfigUndefined: Self = StObject.set(x, "reservationConfig", js.undefined)
    
    inline def setRetentionConfig(value: RetentionConfig): Self = StObject.set(x, "retentionConfig", value.asInstanceOf[js.Any])
    
    inline def setRetentionConfigUndefined: Self = StObject.set(x, "retentionConfig", js.undefined)
  }
}
