package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotDatum extends js.Object {
  
  var curveNumber: Double = js.native
  
  var customdata: Datum = js.native
  
  var data: PlotData = js.native
  
  var pointIndex: Double = js.native
  
  var pointNumber: Double = js.native
  
  var x: Datum = js.native
  
  var xaxis: LayoutAxis = js.native
  
  var y: Datum = js.native
  
  var yaxis: LayoutAxis = js.native
}
object PlotDatum {
  
  @scala.inline
  def apply(
    curveNumber: Double,
    data: PlotData,
    pointIndex: Double,
    pointNumber: Double,
    xaxis: LayoutAxis,
    yaxis: LayoutAxis
  ): PlotDatum = {
    val __obj = js.Dynamic.literal(curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], pointIndex = pointIndex.asInstanceOf[js.Any], pointNumber = pointNumber.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotDatum]
  }
  
  @scala.inline
  implicit class PlotDatumOps[Self <: PlotDatum] (val x: Self) extends AnyVal {
    
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
    def setCurveNumber(value: Double): Self = this.set("curveNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: PlotData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointIndex(value: Double): Self = this.set("pointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointNumber(value: Double): Self = this.set("pointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis(value: LayoutAxis): Self = this.set("xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis(value: LayoutAxis): Self = this.set("yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomdata(value: Datum): Self = this.set("customdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomdataNull: Self = this.set("customdata", null)
    
    @scala.inline
    def setX(value: Datum): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXNull: Self = this.set("x", null)
    
    @scala.inline
    def setY(value: Datum): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYNull: Self = this.set("y", null)
  }
}
