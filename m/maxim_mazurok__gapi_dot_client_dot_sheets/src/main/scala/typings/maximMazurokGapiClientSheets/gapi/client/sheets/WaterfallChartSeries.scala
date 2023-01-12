package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaterfallChartSeries extends StObject {
  
  /** Custom subtotal columns appearing in this series. The order in which subtotals are defined is not significant. Only one subtotal may be defined for each data point. */
  var customSubtotals: js.UndefOr[js.Array[WaterfallChartCustomSubtotal]] = js.undefined
  
  /** The data being visualized in this series. */
  var data: js.UndefOr[ChartData] = js.undefined
  
  /** Information about the data labels for this series. */
  var dataLabel: js.UndefOr[DataLabel] = js.undefined
  
  /**
    * True to hide the subtotal column from the end of the series. By default, a subtotal column will appear at the end of each series. Setting this field to true will hide that subtotal
    * column for this series.
    */
  var hideTrailingSubtotal: js.UndefOr[Boolean] = js.undefined
  
  /** Styles for all columns in this series with negative values. */
  var negativeColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.undefined
  
  /** Styles for all columns in this series with positive values. */
  var positiveColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.undefined
  
  /** Styles for all subtotal columns in this series. */
  var subtotalColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.undefined
}
object WaterfallChartSeries {
  
  inline def apply(): WaterfallChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartSeries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaterfallChartSeries] (val x: Self) extends AnyVal {
    
    inline def setCustomSubtotals(value: js.Array[WaterfallChartCustomSubtotal]): Self = StObject.set(x, "customSubtotals", value.asInstanceOf[js.Any])
    
    inline def setCustomSubtotalsUndefined: Self = StObject.set(x, "customSubtotals", js.undefined)
    
    inline def setCustomSubtotalsVarargs(value: WaterfallChartCustomSubtotal*): Self = StObject.set(x, "customSubtotals", js.Array(value*))
    
    inline def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataLabel(value: DataLabel): Self = StObject.set(x, "dataLabel", value.asInstanceOf[js.Any])
    
    inline def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHideTrailingSubtotal(value: Boolean): Self = StObject.set(x, "hideTrailingSubtotal", value.asInstanceOf[js.Any])
    
    inline def setHideTrailingSubtotalUndefined: Self = StObject.set(x, "hideTrailingSubtotal", js.undefined)
    
    inline def setNegativeColumnsStyle(value: WaterfallChartColumnStyle): Self = StObject.set(x, "negativeColumnsStyle", value.asInstanceOf[js.Any])
    
    inline def setNegativeColumnsStyleUndefined: Self = StObject.set(x, "negativeColumnsStyle", js.undefined)
    
    inline def setPositiveColumnsStyle(value: WaterfallChartColumnStyle): Self = StObject.set(x, "positiveColumnsStyle", value.asInstanceOf[js.Any])
    
    inline def setPositiveColumnsStyleUndefined: Self = StObject.set(x, "positiveColumnsStyle", js.undefined)
    
    inline def setSubtotalColumnsStyle(value: WaterfallChartColumnStyle): Self = StObject.set(x, "subtotalColumnsStyle", value.asInstanceOf[js.Any])
    
    inline def setSubtotalColumnsStyleUndefined: Self = StObject.set(x, "subtotalColumnsStyle", js.undefined)
  }
}
