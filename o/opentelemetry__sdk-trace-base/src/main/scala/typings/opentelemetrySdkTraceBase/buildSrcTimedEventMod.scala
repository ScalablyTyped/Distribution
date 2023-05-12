package typings.opentelemetrySdkTraceBase

import typings.opentelemetryApi.buildSrcCommonTimeMod.HrTime
import typings.opentelemetryApi.buildSrcTraceAttributesMod.SpanAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTimedEventMod {
  
  trait TimedEvent extends StObject {
    
    /** The attributes of the event. */
    var attributes: js.UndefOr[SpanAttributes] = js.undefined
    
    /** Count of attributes of the event that were dropped due to collection limits */
    var droppedAttributesCount: js.UndefOr[Double] = js.undefined
    
    /** The name of the event. */
    var name: String
    
    var time: HrTime
  }
  object TimedEvent {
    
    inline def apply(name: String, time: HrTime): TimedEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimedEvent] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: SpanAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDroppedAttributesCount(value: Double): Self = StObject.set(x, "droppedAttributesCount", value.asInstanceOf[js.Any])
      
      inline def setDroppedAttributesCountUndefined: Self = StObject.set(x, "droppedAttributesCount", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTime(value: HrTime): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
