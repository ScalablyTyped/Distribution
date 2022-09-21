package typings.plotlyJs.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotHoverEvent
  extends StObject
     with PlotMouseEvent {
  
  var xvals: js.Array[Datum]
  
  var yvals: js.Array[Datum]
}
object PlotHoverEvent {
  
  inline def apply(event: MouseEvent, points: js.Array[PlotDatum], xvals: js.Array[Datum], yvals: js.Array[Datum]): PlotHoverEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], xvals = xvals.asInstanceOf[js.Any], yvals = yvals.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotHoverEvent]
  }
  
  extension [Self <: PlotHoverEvent](x: Self) {
    
    inline def setXvals(value: js.Array[Datum]): Self = StObject.set(x, "xvals", value.asInstanceOf[js.Any])
    
    inline def setXvalsVarargs(value: Datum*): Self = StObject.set(x, "xvals", js.Array(value*))
    
    inline def setYvals(value: js.Array[Datum]): Self = StObject.set(x, "yvals", value.asInstanceOf[js.Any])
    
    inline def setYvalsVarargs(value: Datum*): Self = StObject.set(x, "yvals", js.Array(value*))
  }
}
