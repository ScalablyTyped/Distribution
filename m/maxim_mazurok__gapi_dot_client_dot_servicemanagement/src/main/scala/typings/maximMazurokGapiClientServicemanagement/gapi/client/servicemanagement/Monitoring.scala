package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Monitoring extends StObject {
  
  /**
    * Monitoring configurations for sending metrics to the consumer project. There can be multiple consumer destinations. A monitored resource type may appear in multiple monitoring
    * destinations if different aggregations are needed for different sets of metrics associated with that monitored resource type. A monitored resource and metric pair may only be used
    * once in the Monitoring configuration.
    */
  var consumerDestinations: js.UndefOr[js.Array[MonitoringDestination]] = js.undefined
  
  /**
    * Monitoring configurations for sending metrics to the producer project. There can be multiple producer destinations. A monitored resource type may appear in multiple monitoring
    * destinations if different aggregations are needed for different sets of metrics associated with that monitored resource type. A monitored resource and metric pair may only be used
    * once in the Monitoring configuration.
    */
  var producerDestinations: js.UndefOr[js.Array[MonitoringDestination]] = js.undefined
}
object Monitoring {
  
  inline def apply(): Monitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Monitoring]
  }
  
  extension [Self <: Monitoring](x: Self) {
    
    inline def setConsumerDestinations(value: js.Array[MonitoringDestination]): Self = StObject.set(x, "consumerDestinations", value.asInstanceOf[js.Any])
    
    inline def setConsumerDestinationsUndefined: Self = StObject.set(x, "consumerDestinations", js.undefined)
    
    inline def setConsumerDestinationsVarargs(value: MonitoringDestination*): Self = StObject.set(x, "consumerDestinations", js.Array(value :_*))
    
    inline def setProducerDestinations(value: js.Array[MonitoringDestination]): Self = StObject.set(x, "producerDestinations", value.asInstanceOf[js.Any])
    
    inline def setProducerDestinationsUndefined: Self = StObject.set(x, "producerDestinations", js.undefined)
    
    inline def setProducerDestinationsVarargs(value: MonitoringDestination*): Self = StObject.set(x, "producerDestinations", js.Array(value :_*))
  }
}
