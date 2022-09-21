package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logging extends StObject {
  
  /**
    * Logging configurations for sending logs to the consumer project. There can be multiple consumer destinations, each one must have a different monitored resource type. A log can be
    * used in at most one consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[LoggingDestination]] = js.undefined
  
  /**
    * Logging configurations for sending logs to the producer project. There can be multiple producer destinations, each one must have a different monitored resource type. A log can be
    * used in at most one producer destination.
    */
  var producerDestinations: js.UndefOr[js.Array[LoggingDestination]] = js.undefined
}
object Logging {
  
  inline def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  
  extension [Self <: Logging](x: Self) {
    
    inline def setConsumerDestinations(value: js.Array[LoggingDestination]): Self = StObject.set(x, "consumerDestinations", value.asInstanceOf[js.Any])
    
    inline def setConsumerDestinationsUndefined: Self = StObject.set(x, "consumerDestinations", js.undefined)
    
    inline def setConsumerDestinationsVarargs(value: LoggingDestination*): Self = StObject.set(x, "consumerDestinations", js.Array(value*))
    
    inline def setProducerDestinations(value: js.Array[LoggingDestination]): Self = StObject.set(x, "producerDestinations", value.asInstanceOf[js.Any])
    
    inline def setProducerDestinationsUndefined: Self = StObject.set(x, "producerDestinations", js.undefined)
    
    inline def setProducerDestinationsVarargs(value: LoggingDestination*): Self = StObject.set(x, "producerDestinations", js.Array(value*))
  }
}
