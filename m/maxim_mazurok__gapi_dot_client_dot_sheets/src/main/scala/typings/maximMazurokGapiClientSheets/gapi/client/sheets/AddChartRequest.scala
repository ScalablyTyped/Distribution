package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddChartRequest extends StObject {
  
  /**
    * The chart that should be added to the spreadsheet, including the position where it should be placed. The chartId field is optional; if one is not set, an id will be randomly
    * generated. (It is an error to specify the ID of an embedded object that already exists.)
    */
  var chart: js.UndefOr[EmbeddedChart] = js.undefined
}
object AddChartRequest {
  
  @scala.inline
  def apply(): AddChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddChartRequest]
  }
  
  @scala.inline
  implicit class AddChartRequestMutableBuilder[Self <: AddChartRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChart(value: EmbeddedChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
  }
}
