package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieChartSpec extends StObject {
  
  /** The data that covers the domain of the pie chart. */
  var domain: js.UndefOr[ChartData] = js.native
  
  /** Where the legend of the pie chart should be drawn. */
  var legendPosition: js.UndefOr[String] = js.native
  
  /** The size of the hole in the pie chart. */
  var pieHole: js.UndefOr[Double] = js.native
  
  /** The data that covers the one and only series of the pie chart. */
  var series: js.UndefOr[ChartData] = js.native
  
  /** True if the pie is three dimensional. */
  var threeDimensional: js.UndefOr[Boolean] = js.native
}
object PieChartSpec {
  
  @scala.inline
  def apply(): PieChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartSpec]
  }
  
  @scala.inline
  implicit class PieChartSpecMutableBuilder[Self <: PieChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: ChartData): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    @scala.inline
    def setPieHole(value: Double): Self = StObject.set(x, "pieHole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieHoleUndefined: Self = StObject.set(x, "pieHole", js.undefined)
    
    @scala.inline
    def setSeries(value: ChartData): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setThreeDimensional(value: Boolean): Self = StObject.set(x, "threeDimensional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeDimensionalUndefined: Self = StObject.set(x, "threeDimensional", js.undefined)
  }
}
