package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Legend extends StObject {
  
  var legend: DragEnter = js.native
  
  var plotArea: DragEnter = js.native
  
  var xAxis: DragEnter = js.native
  
  var y2Axis: DragEnter = js.native
  
  var yAxis: DragEnter = js.native
}
object Legend {
  
  @scala.inline
  def apply(legend: DragEnter, plotArea: DragEnter, xAxis: DragEnter, y2Axis: DragEnter, yAxis: DragEnter): Legend = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  
  @scala.inline
  implicit class LegendMutableBuilder[Self <: Legend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegend(value: DragEnter): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotArea(value: DragEnter): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxis(value: DragEnter): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Axis(value: DragEnter): Self = StObject.set(x, "y2Axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxis(value: DragEnter): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
  }
}
