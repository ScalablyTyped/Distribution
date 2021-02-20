package typings.openfin.mod.fin

import typings.openfin.anon.Top
import typings.openfin.openfinStrings.`desktop-icon-clicked`
import typings.openfin.openfinStrings.system
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesktopIconClickedEvent extends StObject {
  
  var mouse: Top = js.native
  
  /**
    * the number of milliseconds that have elapsed since the system was started,
    */
  var tickCount: Double = js.native
  
  var topic: system = js.native
  
  var `type`: `desktop-icon-clicked` = js.native
}
object DesktopIconClickedEvent {
  
  @scala.inline
  def apply(mouse: Top, tickCount: Double, topic: system, `type`: `desktop-icon-clicked`): DesktopIconClickedEvent = {
    val __obj = js.Dynamic.literal(mouse = mouse.asInstanceOf[js.Any], tickCount = tickCount.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesktopIconClickedEvent]
  }
  
  @scala.inline
  implicit class DesktopIconClickedEventMutableBuilder[Self <: DesktopIconClickedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMouse(value: Top): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: system): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `desktop-icon-clicked`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
