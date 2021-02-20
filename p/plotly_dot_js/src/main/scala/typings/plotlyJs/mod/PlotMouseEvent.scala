package typings.plotlyJs.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotMouseEvent extends StObject {
  
  var event: MouseEvent = js.native
  
  var points: js.Array[PlotDatum] = js.native
}
object PlotMouseEvent {
  
  @scala.inline
  def apply(event: MouseEvent, points: js.Array[PlotDatum]): PlotMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMouseEvent]
  }
  
  @scala.inline
  implicit class PlotMouseEventMutableBuilder[Self <: PlotMouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: js.Array[PlotDatum]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: PlotDatum*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
