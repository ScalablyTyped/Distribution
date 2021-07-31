package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the data label of a chart point.
  *
  * [Api set: ExcelApi 1.7]
  */
trait ChartDataLabelLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the data label automatically generates appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the format of chart data label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartDataLabelFormatLoadOptions] = js.undefined
  
  /**
    *
    * String value that represents the formula of chart data label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the height, in points, of the chart data label. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the horizontal alignment for chart data label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of data label is -90, 90, or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the distance, in points, from the left edge of chart data label to the left edge of chart area. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * String value that represents the format code for data label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * DataLabelPosition value that represents the position of the data label. See Excel.ChartDataLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * String representing the separator used for the data label on a chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var separator: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the data label bubble size is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showBubbleSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the data label category name is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showCategoryName: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the data label legend key is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showLegendKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the data label percentage is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showPercentage: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the data label series name is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showSeriesName: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the data label value is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * String representing the text of the data label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the angle to which the text is oriented for the chart data label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the distance, in points, from the top edge of chart data label to the top of chart area. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the vertical alignment of chart data label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of data label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the width, in points, of the chart data label. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object ChartDataLabelLoadOptions {
  
  @scala.inline
  def apply(): ChartDataLabelLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataLabelLoadOptions]
  }
  
  @scala.inline
  implicit class ChartDataLabelLoadOptionsMutableBuilder[Self <: ChartDataLabelLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAutoText(value: Boolean): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartDataLabelFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormula(value: Boolean): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: Boolean): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLinkNumberFormat(value: Boolean): Self = StObject.set(x, "linkNumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkNumberFormatUndefined: Self = StObject.set(x, "linkNumberFormat", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setShowBubbleSize(value: Boolean): Self = StObject.set(x, "showBubbleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBubbleSizeUndefined: Self = StObject.set(x, "showBubbleSize", js.undefined)
    
    @scala.inline
    def setShowCategoryName(value: Boolean): Self = StObject.set(x, "showCategoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCategoryNameUndefined: Self = StObject.set(x, "showCategoryName", js.undefined)
    
    @scala.inline
    def setShowLegendKey(value: Boolean): Self = StObject.set(x, "showLegendKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLegendKeyUndefined: Self = StObject.set(x, "showLegendKey", js.undefined)
    
    @scala.inline
    def setShowPercentage(value: Boolean): Self = StObject.set(x, "showPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPercentageUndefined: Self = StObject.set(x, "showPercentage", js.undefined)
    
    @scala.inline
    def setShowSeriesName(value: Boolean): Self = StObject.set(x, "showSeriesName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSeriesNameUndefined: Self = StObject.set(x, "showSeriesName", js.undefined)
    
    @scala.inline
    def setShowValue(value: Boolean): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValueUndefined: Self = StObject.set(x, "showValue", js.undefined)
    
    @scala.inline
    def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOrientation(value: Boolean): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: Boolean): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
