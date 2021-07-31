package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.PlotDatum> */
trait PlotSelectedData extends StObject {
  
  var curveNumber: js.UndefOr[Double] = js.undefined
  
  var customdata: js.UndefOr[Datum] = js.undefined
  
  var data: js.UndefOr[PlotData] = js.undefined
  
  var pointIndex: js.UndefOr[Double] = js.undefined
  
  var pointNumber: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Datum] = js.undefined
  
  var xaxis: js.UndefOr[LayoutAxis] = js.undefined
  
  var y: js.UndefOr[Datum] = js.undefined
  
  var yaxis: js.UndefOr[LayoutAxis] = js.undefined
}
object PlotSelectedData {
  
  @scala.inline
  def apply(): PlotSelectedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSelectedData]
  }
  
  @scala.inline
  implicit class PlotSelectedDataMutableBuilder[Self <: PlotSelectedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurveNumber(value: Double): Self = StObject.set(x, "curveNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveNumberUndefined: Self = StObject.set(x, "curveNumber", js.undefined)
    
    @scala.inline
    def setCustomdata(value: Datum): Self = StObject.set(x, "customdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomdataNull: Self = StObject.set(x, "customdata", null)
    
    @scala.inline
    def setCustomdataUndefined: Self = StObject.set(x, "customdata", js.undefined)
    
    @scala.inline
    def setData(value: PlotData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointIndexUndefined: Self = StObject.set(x, "pointIndex", js.undefined)
    
    @scala.inline
    def setPointNumber(value: Double): Self = StObject.set(x, "pointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointNumberUndefined: Self = StObject.set(x, "pointNumber", js.undefined)
    
    @scala.inline
    def setX(value: Datum): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXNull: Self = StObject.set(x, "x", null)
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXaxis(value: LayoutAxis): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    @scala.inline
    def setY(value: Datum): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYNull: Self = StObject.set(x, "y", null)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYaxis(value: LayoutAxis): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
  }
}
