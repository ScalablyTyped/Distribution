package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddChartResponse extends StObject {
  
  /** The newly added chart. */
  var chart: js.UndefOr[EmbeddedChart] = js.undefined
}
object AddChartResponse {
  
  @scala.inline
  def apply(): AddChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddChartResponse]
  }
  
  @scala.inline
  implicit class AddChartResponseMutableBuilder[Self <: AddChartResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChart(value: EmbeddedChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
  }
}
