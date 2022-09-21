package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartDataLabelPosition
import typings.officeJs.Excel.ChartTextHorizontalAlignment
import typings.officeJs.Excel.ChartTextVerticalAlignment
import typings.officeJs.officeJsStrings.BestFit
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Callout
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.Distributed
import typings.officeJs.officeJsStrings.InsideBase
import typings.officeJs.officeJsStrings.InsideEnd
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.Justify
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.OutsideEnd
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartDataLabel.toJSON()`. */
trait ChartDataLabelData extends StObject {
  
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
  var format: js.UndefOr[ChartDataLabelFormatData] = js.undefined
  
  /**
    * String value that represents the formula of chart data label using A1-style notation.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the height, in points, of the chart data label. Value is `null` if the chart data label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the horizontal alignment for chart data label. See `Excel.ChartTextHorizontalAlignment` for details.
    This property is valid only when `TextOrientation` of data label is -90, 90, or 180.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.undefined
  
  /**
    * Represents the distance, in points, from the left edge of chart data label to the left edge of chart area. Value is `null` if the chart data label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.undefined
  
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
  var numberFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Value that represents the position of the data label. See `Excel.ChartDataLabelPosition` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var position: js.UndefOr[
    ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout
  ] = js.undefined
  
  /**
    * String representing the separator used for the data label on a chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var separator: js.UndefOr[String] = js.undefined
  
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
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the angle to which the text is oriented for the chart data label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the distance, in points, from the top edge of chart data label to the top of chart area. Value is `null` if the chart data label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the vertical alignment of chart data label. See `Excel.ChartTextVerticalAlignment` for details.
    This property is valid only when `TextOrientation` of data label is 0.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.undefined
  
  /**
    * Returns the width, in points, of the chart data label. Value is `null` if the chart data label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ChartDataLabelData {
  
  inline def apply(): ChartDataLabelData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataLabelData]
  }
  
  extension [Self <: ChartDataLabelData](x: Self) {
    
    inline def setAutoText(value: Boolean): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
    
    inline def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
    
    inline def setFormat(value: ChartDataLabelFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHorizontalAlignment(value: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLinkNumberFormat(value: Boolean): Self = StObject.set(x, "linkNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setLinkNumberFormatUndefined: Self = StObject.set(x, "linkNumberFormat", js.undefined)
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setPosition(
      value: ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
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
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextOrientation(value: Double): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    inline def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVerticalAlignment(value: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
