package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterfallChartSeries extends StObject {
  
  /** Custom subtotal columns appearing in this series. The order in which subtotals are defined is not significant. Only one subtotal may be defined for each data point. */
  var customSubtotals: js.UndefOr[js.Array[WaterfallChartCustomSubtotal]] = js.native
  
  /** The data being visualized in this series. */
  var data: js.UndefOr[ChartData] = js.native
  
  /**
    * True to hide the subtotal column from the end of the series. By default, a subtotal column will appear at the end of each series. Setting this field to true will hide that subtotal
    * column for this series.
    */
  var hideTrailingSubtotal: js.UndefOr[Boolean] = js.native
  
  /** Styles for all columns in this series with negative values. */
  var negativeColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.native
  
  /** Styles for all columns in this series with positive values. */
  var positiveColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.native
  
  /** Styles for all subtotal columns in this series. */
  var subtotalColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.native
}
object WaterfallChartSeries {
  
  @scala.inline
  def apply(): WaterfallChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartSeries]
  }
  
  @scala.inline
  implicit class WaterfallChartSeriesMutableBuilder[Self <: WaterfallChartSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomSubtotals(value: js.Array[WaterfallChartCustomSubtotal]): Self = StObject.set(x, "customSubtotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSubtotalsUndefined: Self = StObject.set(x, "customSubtotals", js.undefined)
    
    @scala.inline
    def setCustomSubtotalsVarargs(value: WaterfallChartCustomSubtotal*): Self = StObject.set(x, "customSubtotals", js.Array(value :_*))
    
    @scala.inline
    def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHideTrailingSubtotal(value: Boolean): Self = StObject.set(x, "hideTrailingSubtotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTrailingSubtotalUndefined: Self = StObject.set(x, "hideTrailingSubtotal", js.undefined)
    
    @scala.inline
    def setNegativeColumnsStyle(value: WaterfallChartColumnStyle): Self = StObject.set(x, "negativeColumnsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeColumnsStyleUndefined: Self = StObject.set(x, "negativeColumnsStyle", js.undefined)
    
    @scala.inline
    def setPositiveColumnsStyle(value: WaterfallChartColumnStyle): Self = StObject.set(x, "positiveColumnsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveColumnsStyleUndefined: Self = StObject.set(x, "positiveColumnsStyle", js.undefined)
    
    @scala.inline
    def setSubtotalColumnsStyle(value: WaterfallChartColumnStyle): Self = StObject.set(x, "subtotalColumnsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtotalColumnsStyleUndefined: Self = StObject.set(x, "subtotalColumnsStyle", js.undefined)
  }
}
