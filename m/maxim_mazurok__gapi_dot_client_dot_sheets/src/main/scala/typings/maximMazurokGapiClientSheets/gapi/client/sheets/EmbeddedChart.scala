package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedChart extends StObject {
  
  /** The border of the chart. */
  var border: js.UndefOr[EmbeddedObjectBorder] = js.undefined
  
  /** The ID of the chart. */
  var chartId: js.UndefOr[Double] = js.undefined
  
  /** The position of the chart. */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.undefined
  
  /** The specification of the chart. */
  var spec: js.UndefOr[ChartSpec] = js.undefined
}
object EmbeddedChart {
  
  inline def apply(): EmbeddedChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedChart]
  }
  
  extension [Self <: EmbeddedChart](x: Self) {
    
    inline def setBorder(value: EmbeddedObjectBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    inline def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    inline def setPosition(value: EmbeddedObjectPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSpec(value: ChartSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
