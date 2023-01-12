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
  
  inline def apply(): PlotSelectedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSelectedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotSelectedData] (val x: Self) extends AnyVal {
    
    inline def setCurveNumber(value: Double): Self = StObject.set(x, "curveNumber", value.asInstanceOf[js.Any])
    
    inline def setCurveNumberUndefined: Self = StObject.set(x, "curveNumber", js.undefined)
    
    inline def setCustomdata(value: Datum): Self = StObject.set(x, "customdata", value.asInstanceOf[js.Any])
    
    inline def setCustomdataNull: Self = StObject.set(x, "customdata", null)
    
    inline def setCustomdataUndefined: Self = StObject.set(x, "customdata", js.undefined)
    
    inline def setData(value: PlotData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
    
    inline def setPointIndexUndefined: Self = StObject.set(x, "pointIndex", js.undefined)
    
    inline def setPointNumber(value: Double): Self = StObject.set(x, "pointNumber", value.asInstanceOf[js.Any])
    
    inline def setPointNumberUndefined: Self = StObject.set(x, "pointNumber", js.undefined)
    
    inline def setX(value: Datum): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXaxis(value: LayoutAxis): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    inline def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    inline def setY(value: Datum): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYaxis(value: LayoutAxis): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    inline def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
  }
}
