package typings.opentelemetryApi.timedEventMod

import typings.opentelemetryApi.eventMod.Event
import typings.opentelemetryApi.timeMod.HrTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimedEvent extends Event {
  
  var time: HrTime = js.native
}
object TimedEvent {
  
  @scala.inline
  def apply(name: String, time: HrTime): TimedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedEvent]
  }
  
  @scala.inline
  implicit class TimedEventOps[Self <: TimedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTime(value: HrTime): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
