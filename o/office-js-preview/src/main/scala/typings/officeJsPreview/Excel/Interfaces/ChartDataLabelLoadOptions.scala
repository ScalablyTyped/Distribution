package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the data label of a chart point.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait ChartDataLabelLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the data label automatically generates appropriate text based on context.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the format of chart data label.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartDataLabelFormatLoadOptions] = js.undefined
  
  /**
    * String value that represents the formula of chart data label using A1-style notation.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the height, in points, of the chart data label. Value is `null` if the chart data label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the horizontal alignment for chart data label. See `Excel.ChartTextHorizontalAlignment` for details.
    This property is valid only when `TextOrientation` of data label is -90, 90, or 180.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the distance, in points, from the left edge of chart data label to the left edge of chart area. Value is `null` if the chart data label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String value that represents the format code for data label.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Value that represents the position of the data label. See `Excel.ChartDataLabelPosition` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String representing the separator used for the data label on a chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var separator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the data label bubble size is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showBubbleSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the data label category name is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showCategoryName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the data label legend key is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showLegendKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the data label percentage is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showPercentage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the data label series name is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showSeriesName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the data label value is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String representing the text of the data label on a chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the angle to which the text is oriented for the chart data label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the distance, in points, from the top edge of chart data label to the top of chart area. Value is `null` if the chart data label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the vertical alignment of chart data label. See `Excel.ChartTextVerticalAlignment` for details.
    This property is valid only when `TextOrientation` of data label is 0.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the width, in points, of the chart data label. Value is `null` if the chart data label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object ChartDataLabelLoadOptions {
  
  inline def apply(): ChartDataLabelLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataLabelLoadOptions]
  }
  
  extension [Self <: ChartDataLabelLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAutoText(value: Boolean): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
    
    inline def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
    
    inline def setFormat(value: ChartDataLabelFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormula(value: Boolean): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHorizontalAlignment(value: Boolean): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLinkNumberFormat(value: Boolean): Self = StObject.set(x, "linkNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setLinkNumberFormatUndefined: Self = StObject.set(x, "linkNumberFormat", js.undefined)
    
    inline def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setShowBubbleSize(value: Boolean): Self = StObject.set(x, "showBubbleSize", value.asInstanceOf[js.Any])
    
    inline def setShowBubbleSizeUndefined: Self = StObject.set(x, "showBubbleSize", js.undefined)
    
    inline def setShowCategoryName(value: Boolean): Self = StObject.set(x, "showCategoryName", value.asInstanceOf[js.Any])
    
    inline def setShowCategoryNameUndefined: Self = StObject.set(x, "showCategoryName", js.undefined)
    
    inline def setShowLegendKey(value: Boolean): Self = StObject.set(x, "showLegendKey", value.asInstanceOf[js.Any])
    
    inline def setShowLegendKeyUndefined: Self = StObject.set(x, "showLegendKey", js.undefined)
    
    inline def setShowPercentage(value: Boolean): Self = StObject.set(x, "showPercentage", value.asInstanceOf[js.Any])
    
    inline def setShowPercentageUndefined: Self = StObject.set(x, "showPercentage", js.undefined)
    
    inline def setShowSeriesName(value: Boolean): Self = StObject.set(x, "showSeriesName", value.asInstanceOf[js.Any])
    
    inline def setShowSeriesNameUndefined: Self = StObject.set(x, "showSeriesName", js.undefined)
    
    inline def setShowValue(value: Boolean): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
    
    inline def setShowValueUndefined: Self = StObject.set(x, "showValue", js.undefined)
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextOrientation(value: Boolean): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    inline def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVerticalAlignment(value: Boolean): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
