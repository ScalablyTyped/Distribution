package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotDatum extends StObject {
  
  var curveNumber: Double
  
  var customdata: Datum
  
  var data: PlotData
  
  var pointIndex: Double
  
  var pointNumber: Double
  
  var x: Datum
  
  var xaxis: LayoutAxis
  
  var y: Datum
  
  var yaxis: LayoutAxis
}
object PlotDatum {
  
  inline def apply(
    curveNumber: Double,
    data: PlotData,
    pointIndex: Double,
    pointNumber: Double,
    xaxis: LayoutAxis,
    yaxis: LayoutAxis
  ): PlotDatum = {
    val __obj = js.Dynamic.literal(curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], pointIndex = pointIndex.asInstanceOf[js.Any], pointNumber = pointNumber.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], customdata = null, x = null, y = null)
    __obj.asInstanceOf[PlotDatum]
  }
  
  extension [Self <: PlotDatum](x: Self) {
    
    inline def setCurveNumber(value: Double): Self = StObject.set(x, "curveNumber", value.asInstanceOf[js.Any])
    
    inline def setCustomdata(value: Datum): Self = StObject.set(x, "customdata", value.asInstanceOf[js.Any])
    
    inline def setCustomdataNull: Self = StObject.set(x, "customdata", null)
    
    inline def setData(value: PlotData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
    
    inline def setPointNumber(value: Double): Self = StObject.set(x, "pointNumber", value.asInstanceOf[js.Any])
    
    inline def setX(value: Datum): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setXaxis(value: LayoutAxis): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    inline def setY(value: Datum): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYaxis(value: LayoutAxis): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
  }
}
