package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WillMoveOrResize[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var height: Double = js.native
  
  var left: Double = js.native
  
  var monitorScaleFactor: Double = js.native
  
  var top: Double = js.native
  
  var width: Double = js.native
}
object WillMoveOrResize {
  
  @scala.inline
  def apply[Topic, Type](
    height: Double,
    left: Double,
    monitorScaleFactor: Double,
    name: String,
    top: Double,
    topic: Topic,
    `type`: Type,
    uuid: String,
    width: Double
  ): WillMoveOrResize[Topic, Type] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], monitorScaleFactor = monitorScaleFactor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WillMoveOrResize[Topic, Type]]
  }
  
  @scala.inline
  implicit class WillMoveOrResizeMutableBuilder[Self <: WillMoveOrResize[_, _], Topic, Type] (val x: Self with (WillMoveOrResize[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorScaleFactor(value: Double): Self = StObject.set(x, "monitorScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
