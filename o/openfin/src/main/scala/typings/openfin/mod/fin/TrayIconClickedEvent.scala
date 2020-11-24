package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrayIconClickedEvent extends ApplicationBaseEvent {
  
  var button: Double = js.native
  
   // 0 for left, 1 for middle, 2 for right
  var monitorInfo: MonitorInfo = js.native
  
  var x: Double = js.native
  
   // the cursor x coordinate
  var y: Double = js.native
}
object TrayIconClickedEvent {
  
  @scala.inline
  def apply(
    button: Double,
    monitorInfo: MonitorInfo,
    topic: String,
    `type`: OpenFinApplicationEventType,
    uuid: String,
    x: Double,
    y: Double
  ): TrayIconClickedEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], monitorInfo = monitorInfo.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrayIconClickedEvent]
  }
  
  @scala.inline
  implicit class TrayIconClickedEventOps[Self <: TrayIconClickedEvent] (val x: Self) extends AnyVal {
    
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
    def setButton(value: Double): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorInfo(value: MonitorInfo): Self = this.set("monitorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
