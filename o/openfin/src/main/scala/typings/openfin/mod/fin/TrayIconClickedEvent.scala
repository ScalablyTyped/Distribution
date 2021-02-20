package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
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
  implicit class TrayIconClickedEventMutableBuilder[Self <: TrayIconClickedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorInfo(value: MonitorInfo): Self = StObject.set(x, "monitorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
