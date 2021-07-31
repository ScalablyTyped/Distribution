package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaterfallChartSpec extends StObject {
  
  /** The line style for the connector lines. */
  var connectorLineStyle: js.UndefOr[LineStyle] = js.undefined
  
  /** The domain data (horizontal axis) for the waterfall chart. */
  var domain: js.UndefOr[WaterfallChartDomain] = js.undefined
  
  /** True to interpret the first value as a total. */
  var firstValueIsTotal: js.UndefOr[Boolean] = js.undefined
  
  /** True to hide connector lines between columns. */
  var hideConnectorLines: js.UndefOr[Boolean] = js.undefined
  
  /** The data this waterfall chart is visualizing. */
  var series: js.UndefOr[js.Array[WaterfallChartSeries]] = js.undefined
  
  /** The stacked type. */
  var stackedType: js.UndefOr[String] = js.undefined
}
object WaterfallChartSpec {
  
  @scala.inline
  def apply(): WaterfallChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartSpec]
  }
  
  @scala.inline
  implicit class WaterfallChartSpecMutableBuilder[Self <: WaterfallChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorLineStyle(value: LineStyle): Self = StObject.set(x, "connectorLineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorLineStyleUndefined: Self = StObject.set(x, "connectorLineStyle", js.undefined)
    
    @scala.inline
    def setDomain(value: WaterfallChartDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setFirstValueIsTotal(value: Boolean): Self = StObject.set(x, "firstValueIsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstValueIsTotalUndefined: Self = StObject.set(x, "firstValueIsTotal", js.undefined)
    
    @scala.inline
    def setHideConnectorLines(value: Boolean): Self = StObject.set(x, "hideConnectorLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideConnectorLinesUndefined: Self = StObject.set(x, "hideConnectorLines", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[WaterfallChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: WaterfallChartSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setStackedType(value: String): Self = StObject.set(x, "stackedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackedTypeUndefined: Self = StObject.set(x, "stackedType", js.undefined)
  }
}
