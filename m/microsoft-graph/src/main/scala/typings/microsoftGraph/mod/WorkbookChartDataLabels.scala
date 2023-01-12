package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartDataLabels
  extends StObject
     with Entity {
  
  // Represents the format of chart data labels, which includes fill and font formatting. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartDataLabelFormat]] = js.undefined
  
  /**
    * DataLabelPosition value that represents the position of the data label. The possible values are: None, Center,
    * InsideEnd, InsideBase, OutsideEnd, Left, Right, Top, Bottom, BestFit, Callout.
    */
  var position: js.UndefOr[NullableOption[String]] = js.undefined
  
  // String representing the separator used for the data labels on a chart.
  var separator: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Boolean value representing if the data label bubble size is visible or not.
  var showBubbleSize: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Boolean value representing if the data label category name is visible or not.
  var showCategoryName: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Boolean value representing if the data label legend key is visible or not.
  var showLegendKey: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Boolean value representing if the data label percentage is visible or not.
  var showPercentage: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Boolean value representing if the data label series name is visible or not.
  var showSeriesName: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Boolean value representing if the data label value is visible or not.
  var showValue: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object WorkbookChartDataLabels {
  
  inline def apply(): WorkbookChartDataLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartDataLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookChartDataLabels] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: NullableOption[WorkbookChartDataLabelFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPosition(value: NullableOption[String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSeparator(value: NullableOption[String]): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorNull: Self = StObject.set(x, "separator", null)
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setShowBubbleSize(value: NullableOption[Boolean]): Self = StObject.set(x, "showBubbleSize", value.asInstanceOf[js.Any])
    
    inline def setShowBubbleSizeNull: Self = StObject.set(x, "showBubbleSize", null)
    
    inline def setShowBubbleSizeUndefined: Self = StObject.set(x, "showBubbleSize", js.undefined)
    
    inline def setShowCategoryName(value: NullableOption[Boolean]): Self = StObject.set(x, "showCategoryName", value.asInstanceOf[js.Any])
    
    inline def setShowCategoryNameNull: Self = StObject.set(x, "showCategoryName", null)
    
    inline def setShowCategoryNameUndefined: Self = StObject.set(x, "showCategoryName", js.undefined)
    
    inline def setShowLegendKey(value: NullableOption[Boolean]): Self = StObject.set(x, "showLegendKey", value.asInstanceOf[js.Any])
    
    inline def setShowLegendKeyNull: Self = StObject.set(x, "showLegendKey", null)
    
    inline def setShowLegendKeyUndefined: Self = StObject.set(x, "showLegendKey", js.undefined)
    
    inline def setShowPercentage(value: NullableOption[Boolean]): Self = StObject.set(x, "showPercentage", value.asInstanceOf[js.Any])
    
    inline def setShowPercentageNull: Self = StObject.set(x, "showPercentage", null)
    
    inline def setShowPercentageUndefined: Self = StObject.set(x, "showPercentage", js.undefined)
    
    inline def setShowSeriesName(value: NullableOption[Boolean]): Self = StObject.set(x, "showSeriesName", value.asInstanceOf[js.Any])
    
    inline def setShowSeriesNameNull: Self = StObject.set(x, "showSeriesName", null)
    
    inline def setShowSeriesNameUndefined: Self = StObject.set(x, "showSeriesName", js.undefined)
    
    inline def setShowValue(value: NullableOption[Boolean]): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
    
    inline def setShowValueNull: Self = StObject.set(x, "showValue", null)
    
    inline def setShowValueUndefined: Self = StObject.set(x, "showValue", js.undefined)
  }
}
