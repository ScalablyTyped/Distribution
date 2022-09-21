package typings.plotlyJs.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMouseEvent extends StObject {
  
  var event: MouseEvent
  
  var points: js.Array[PlotDatum]
}
object PlotMouseEvent {
  
  inline def apply(event: MouseEvent, points: js.Array[PlotDatum]): PlotMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMouseEvent]
  }
  
  extension [Self <: PlotMouseEvent](x: Self) {
    
    inline def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[PlotDatum]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: PlotDatum*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
