package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartSpec extends StObject {
  
  /** The data that covers the domain of the pie chart. */
  var domain: js.UndefOr[ChartData] = js.undefined
  
  /** Where the legend of the pie chart should be drawn. */
  var legendPosition: js.UndefOr[String] = js.undefined
  
  /** The size of the hole in the pie chart. */
  var pieHole: js.UndefOr[Double] = js.undefined
  
  /** The data that covers the one and only series of the pie chart. */
  var series: js.UndefOr[ChartData] = js.undefined
  
  /** True if the pie is three dimensional. */
  var threeDimensional: js.UndefOr[Boolean] = js.undefined
}
object PieChartSpec {
  
  inline def apply(): PieChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartSpec]
  }
  
  extension [Self <: PieChartSpec](x: Self) {
    
    inline def setDomain(value: ChartData): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    inline def setPieHole(value: Double): Self = StObject.set(x, "pieHole", value.asInstanceOf[js.Any])
    
    inline def setPieHoleUndefined: Self = StObject.set(x, "pieHole", js.undefined)
    
    inline def setSeries(value: ChartData): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setThreeDimensional(value: Boolean): Self = StObject.set(x, "threeDimensional", value.asInstanceOf[js.Any])
    
    inline def setThreeDimensionalUndefined: Self = StObject.set(x, "threeDimensional", js.undefined)
  }
}
