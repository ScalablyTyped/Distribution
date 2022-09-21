package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSelectionEvent extends StObject {
  
  var lassoPoints: js.UndefOr[SelectionRange] = js.undefined
  
  var points: js.Array[PlotDatum]
  
  var range: js.UndefOr[SelectionRange] = js.undefined
}
object PlotSelectionEvent {
  
  inline def apply(points: js.Array[PlotDatum]): PlotSelectionEvent = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSelectionEvent]
  }
  
  extension [Self <: PlotSelectionEvent](x: Self) {
    
    inline def setLassoPoints(value: SelectionRange): Self = StObject.set(x, "lassoPoints", value.asInstanceOf[js.Any])
    
    inline def setLassoPointsUndefined: Self = StObject.set(x, "lassoPoints", js.undefined)
    
    inline def setPoints(value: js.Array[PlotDatum]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: PlotDatum*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setRange(value: SelectionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
