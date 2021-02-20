package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateChartSpecRequest extends StObject {
  
  /** The ID of the chart to update. */
  var chartId: js.UndefOr[Double] = js.native
  
  /** The specification to apply to the chart. */
  var spec: js.UndefOr[ChartSpec] = js.native
}
object UpdateChartSpecRequest {
  
  @scala.inline
  def apply(): UpdateChartSpecRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChartSpecRequest]
  }
  
  @scala.inline
  implicit class UpdateChartSpecRequestMutableBuilder[Self <: UpdateChartSpecRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    @scala.inline
    def setSpec(value: ChartSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
