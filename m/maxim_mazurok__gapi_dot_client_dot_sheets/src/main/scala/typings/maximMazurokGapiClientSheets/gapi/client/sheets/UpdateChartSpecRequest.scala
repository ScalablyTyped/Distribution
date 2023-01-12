package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChartSpecRequest extends StObject {
  
  /** The ID of the chart to update. */
  var chartId: js.UndefOr[Double] = js.undefined
  
  /** The specification to apply to the chart. */
  var spec: js.UndefOr[ChartSpec] = js.undefined
}
object UpdateChartSpecRequest {
  
  inline def apply(): UpdateChartSpecRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChartSpecRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateChartSpecRequest] (val x: Self) extends AnyVal {
    
    inline def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    inline def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    inline def setSpec(value: ChartSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
