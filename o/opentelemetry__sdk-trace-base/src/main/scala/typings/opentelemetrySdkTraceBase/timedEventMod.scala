package typings.opentelemetrySdkTraceBase

import typings.opentelemetryApi.timeMod.HrTime
import typings.opentelemetryApi.traceAttributesMod.SpanAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timedEventMod {
  
  trait TimedEvent extends StObject {
    
    /** The attributes of the event. */
    var attributes: js.UndefOr[SpanAttributes] = js.undefined
    
    /** The name of the event. */
    var name: String
    
    var time: HrTime
  }
  object TimedEvent {
    
    inline def apply(name: String, time: HrTime): TimedEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimedEvent]
    }
    
    extension [Self <: TimedEvent](x: Self) {
      
      inline def setAttributes(value: SpanAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTime(value: HrTime): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
