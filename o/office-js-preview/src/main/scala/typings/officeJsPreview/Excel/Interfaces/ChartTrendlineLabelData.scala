package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartTextHorizontalAlignment
import typings.officeJsPreview.Excel.ChartTextVerticalAlignment
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.Distributed
import typings.officeJsPreview.officeJsPreviewStrings.Justify
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartTrendlineLabel.toJSON()`. */
trait ChartTrendlineLabelData extends StObject {
  
  /**
    *
    * Specifies if trendline label automatically generate appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The format of chart trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartTrendlineLabelFormatData] = js.undefined
  
  /**
    *
    * String value that represents the formula of chart trendline label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Returns the height, in points, of the chart trendline label. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the horizontal alignment for chart trendline label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of trendline label is -90, 90, or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.undefined
  
  /**
    *
    * Represents the distance, in points, from the left edge of chart trendline label to the left edge of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * String value that represents the format code for trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  
  /**
    *
    * String representing the text of the trendline label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the angle to which the text is oriented for the chart trendline label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the distance, in points, from the top edge of chart trendline label to the top of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the vertical alignment of chart trendline label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of trendline label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.undefined
  
  /**
    *
    * Returns the width, in points, of the chart trendline label. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ChartTrendlineLabelData {
  
  @scala.inline
  def apply(): ChartTrendlineLabelData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineLabelData]
  }
  
  @scala.inline
  implicit class ChartTrendlineLabelDataMutableBuilder[Self <: ChartTrendlineLabelData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoText(value: Boolean): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartTrendlineLabelFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
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
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
