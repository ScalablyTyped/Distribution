package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Legend extends js.Object {
  
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
  implicit class LegendOps[Self <: Legend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLegend(value: DragEnter): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotArea(value: DragEnter): Self = this.set("plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxis(value: DragEnter): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Axis(value: DragEnter): Self = this.set("y2Axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxis(value: DragEnter): Self = this.set("yAxis", value.asInstanceOf[js.Any])
  }
}
