package typings.opentelemetryApi

import typings.opentelemetryApi.eventMod.Event
import typings.opentelemetryApi.timeMod.HrTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timedEventMod {
  
  trait TimedEvent
    extends StObject
       with Event {
    
    var time: HrTime
  }
  object TimedEvent {
    
    @scala.inline
    def apply(name: String, time: HrTime): TimedEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimedEvent]
    }
    
    @scala.inline
    implicit class TimedEventMutableBuilder[Self <: TimedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTime(value: HrTime): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
