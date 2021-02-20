package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartDataLabelPosition
import typings.officeJsPreview.Excel.ChartTextHorizontalAlignment
import typings.officeJsPreview.Excel.ChartTextVerticalAlignment
import typings.officeJsPreview.officeJsPreviewStrings.BestFit
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.Callout
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.Distributed
import typings.officeJsPreview.officeJsPreviewStrings.InsideBase
import typings.officeJsPreview.officeJsPreviewStrings.InsideEnd
import typings.officeJsPreview.officeJsPreviewStrings.Invalid
import typings.officeJsPreview.officeJsPreviewStrings.Justify
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.OutsideEnd
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartDataLabel object, for use in `chartDataLabel.set({ ... })`. */
@js.native
trait ChartDataLabelUpdateData extends StObject {
  
  /**
    *
    * Specifies if the data label automatically generates appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the format of chart data label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartDataLabelFormatUpdateData] = js.native
  
  /**
    *
    * String value that represents the formula of chart data label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the horizontal alignment for chart data label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of data label is -90, 90, or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.native
  
  /**
    *
    * Represents the distance, in points, from the left edge of chart data label to the left edge of chart area. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * String value that represents the format code for data label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.native
  
  /**
    *
    * DataLabelPosition value that represents the position of the data label. See Excel.ChartDataLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var position: js.UndefOr[
    ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout
  ] = js.native
  
  /**
    *
    * String representing the separator used for the data label on a chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var separator: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies if the data label bubble size is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showBubbleSize: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the data label category name is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showCategoryName: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the data label legend key is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showLegendKey: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the data label percentage is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showPercentage: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the data label series name is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showSeriesName: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the data label value is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showValue: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * String representing the text of the data label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the angle to which the text is oriented for the chart data label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the distance, in points, from the top edge of chart data label to the top of chart area. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the vertical alignment of chart data label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of data label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.native
}
object ChartDataLabelUpdateData {
  
  @scala.inline
  def apply(): ChartDataLabelUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataLabelUpdateData]
  }
  
  @scala.inline
  implicit class ChartDataLabelUpdateDataMutableBuilder[Self <: ChartDataLabelUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoText(value: Boolean): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartDataLabelFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLinkNumberFormat(value: Boolean): Self = StObject.set(x, "linkNumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkNumberFormatUndefined: Self = StObject.set(x, "linkNumberFormat", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setPosition(
      value: ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
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
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOrientation(value: Double): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
