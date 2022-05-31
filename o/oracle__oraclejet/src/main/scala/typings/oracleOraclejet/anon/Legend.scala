package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Legend extends StObject {
  
  var legend: DragEnter
  
  var plotArea: DragEnter
  
  var xAxis: DragEnter
  
  var y2Axis: DragEnter
  
  var yAxis: DragEnter
}
object Legend {
  
  inline def apply(legend: DragEnter, plotArea: DragEnter, xAxis: DragEnter, y2Axis: DragEnter, yAxis: DragEnter): Legend = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  
  extension [Self <: Legend](x: Self) {
    
    inline def setLegend(value: DragEnter): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setPlotArea(value: DragEnter): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: DragEnter): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setY2Axis(value: DragEnter): Self = StObject.set(x, "y2Axis", value.asInstanceOf[js.Any])
    
    inline def setYAxis(value: DragEnter): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
  }
}
