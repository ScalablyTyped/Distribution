package typings.openfin.mod.fin

import typings.openfin.anon.Top
import typings.openfin.openfinStrings.`desktop-icon-clicked`
import typings.openfin.openfinStrings.system
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesktopIconClickedEvent extends StObject {
  
  var mouse: Top
  
  /**
    * the number of milliseconds that have elapsed since the system was started,
    */
  var tickCount: Double
  
  var topic: system
  
  var `type`: `desktop-icon-clicked`
}
object DesktopIconClickedEvent {
  
  inline def apply(mouse: Top, tickCount: Double): DesktopIconClickedEvent = {
    val __obj = js.Dynamic.literal(mouse = mouse.asInstanceOf[js.Any], tickCount = tickCount.asInstanceOf[js.Any], topic = "system")
    __obj.updateDynamic("type")("desktop-icon-clicked")
    __obj.asInstanceOf[DesktopIconClickedEvent]
  }
  
  extension [Self <: DesktopIconClickedEvent](x: Self) {
    
    inline def setMouse(value: Top): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: system): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setType(value: `desktop-icon-clicked`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
