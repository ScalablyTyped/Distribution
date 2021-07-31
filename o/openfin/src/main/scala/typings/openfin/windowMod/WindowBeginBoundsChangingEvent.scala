package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.maximized
import typings.openfin.openfinStrings.minimized
import typings.openfin.openfinStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowBeginBoundsChangingEvent[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var height: Double
  
  var left: Double
  
  var top: Double
  
  var width: Double
  
  var windowState: minimized | normal | maximized
}
object WindowBeginBoundsChangingEvent {
  
  @scala.inline
  def apply[Topic, Type](
    height: Double,
    left: Double,
    name: String,
    top: Double,
    topic: Topic,
    `type`: Type,
    uuid: String,
    width: Double,
    windowState: minimized | normal | maximized
  ): WindowBeginBoundsChangingEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], windowState = windowState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowBeginBoundsChangingEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowBeginBoundsChangingEventMutableBuilder[Self <: WindowBeginBoundsChangingEvent[?, ?], Topic, Type] (val x: Self & (WindowBeginBoundsChangingEvent[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowState(value: minimized | normal | maximized): Self = StObject.set(x, "windowState", value.asInstanceOf[js.Any])
  }
}
