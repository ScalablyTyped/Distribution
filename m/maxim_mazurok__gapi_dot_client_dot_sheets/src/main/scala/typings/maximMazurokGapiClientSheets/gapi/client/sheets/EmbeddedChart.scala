package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedChart extends StObject {
  
  /** The ID of the chart. */
  var chartId: js.UndefOr[Double] = js.native
  
  /** The position of the chart. */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.native
  
  /** The specification of the chart. */
  var spec: js.UndefOr[ChartSpec] = js.native
}
object EmbeddedChart {
  
  @scala.inline
  def apply(): EmbeddedChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedChart]
  }
  
  @scala.inline
  implicit class EmbeddedChartMutableBuilder[Self <: EmbeddedChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    @scala.inline
    def setPosition(value: EmbeddedObjectPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSpec(value: ChartSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
