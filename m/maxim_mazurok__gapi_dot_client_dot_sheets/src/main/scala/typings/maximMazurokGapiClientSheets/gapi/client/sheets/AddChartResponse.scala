package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddChartResponse extends StObject {
  
  /** The newly added chart. */
  var chart: js.UndefOr[EmbeddedChart] = js.undefined
}
object AddChartResponse {
  
  inline def apply(): AddChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddChartResponse]
  }
  
  extension [Self <: AddChartResponse](x: Self) {
    
    inline def setChart(value: EmbeddedChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
  }
}
