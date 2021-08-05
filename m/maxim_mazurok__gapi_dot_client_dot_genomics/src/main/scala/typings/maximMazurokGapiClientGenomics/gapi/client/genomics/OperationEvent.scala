package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationEvent extends StObject {
  
  /** Required description of event. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Optional time of when event finished. An event can have a start time and no finish time. If an event has a finish time, there must be a start time. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Optional time of when event started. */
  var startTime: js.UndefOr[String] = js.undefined
}
object OperationEvent {
  
  inline def apply(): OperationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationEvent]
  }
  
  extension [Self <: OperationEvent](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
