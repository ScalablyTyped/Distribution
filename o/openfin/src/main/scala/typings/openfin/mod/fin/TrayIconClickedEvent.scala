package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrayIconClickedEvent
  extends StObject
     with ApplicationBaseEvent {
  
  var button: Double
  
  // 0 for left, 1 for middle, 2 for right
  var monitorInfo: MonitorInfo
  
  var x: Double
  
  // the cursor x coordinate
  var y: Double
}
object TrayIconClickedEvent {
  
  inline def apply(
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
  
  extension [Self <: TrayIconClickedEvent](x: Self) {
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setMonitorInfo(value: MonitorInfo): Self = StObject.set(x, "monitorInfo", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
