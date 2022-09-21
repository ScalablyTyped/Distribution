package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.HorizontalAlignment
import typings.officeJsPreview.Excel.ReadingOrder
import typings.officeJsPreview.Excel.VerticalAlignment
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.CenterAcrossSelection
import typings.officeJsPreview.officeJsPreviewStrings.Context
import typings.officeJsPreview.officeJsPreviewStrings.Distributed
import typings.officeJsPreview.officeJsPreviewStrings.Fill
import typings.officeJsPreview.officeJsPreviewStrings.General
import typings.officeJsPreview.officeJsPreviewStrings.Justify
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.LeftToRight
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.RightToLeft
import typings.officeJsPreview.officeJsPreviewStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeFormat.toJSON()`. */
trait RangeFormatData extends StObject {
  
  /**
    * Specifies if text is automatically indented when text alignment is set to equal distribution.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var autoIndent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Collection of border objects that apply to the overall range.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var borders: js.UndefOr[js.Array[RangeBorderData]] = js.undefined
  
  /**
    * Specifies the width of all colums within the range. If the column widths are not uniform, `null` will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var columnWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Returns the fill object defined on the overall range.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var fill: js.UndefOr[RangeFillData] = js.undefined
  
  /**
    * Returns the font object defined on the overall range.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[RangeFontData] = js.undefined
  
  /**
    * Represents the horizontal alignment for the specified object. See `Excel.HorizontalAlignment` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var horizontalAlignment: js.UndefOr[
    HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
  ] = js.undefined
  
  /**
    * An integer from 0 to 250 that indicates the indent level.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var indentLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Returns the format protection object for a range.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[FormatProtectionData] = js.undefined
  
  /**
    * The reading order for the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[ReadingOrder | Context | LeftToRight | RightToLeft] = js.undefined
  
  /**
    * The height of all rows in the range. If the row heights are not uniform, `null` will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var rowHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies if text automatically shrinks to fit in the available column width.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text orientation of all the cells within the range.
    The text orientation should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    If the orientation within a range are not uniform, then `null` will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var textOrientation: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines if the row height of the `Range` object equals the standard height of the sheet.
    Returns `true` if the row height of the `Range` object equals the standard height of the sheet.
    Returns `null` if the range contains more than one row and the rows aren't all the same height.
    Returns `false` otherwise.
    Note: This property is only intended to be set to `true`. Setting it to `false` has no effect.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var useStandardHeight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the column width of the `Range` object equals the standard width of the sheet.
    Returns `true` if the column width of the `Range` object equals the standard width of the sheet.
    Returns `null` if the range contains more than one column and the columns aren't all the same height.
    Returns `false` otherwise.
    Note: This property is only intended to be set to `true`. Setting it to `false` has no effect.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var useStandardWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the vertical alignment for the specified object. See `Excel.VerticalAlignment` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Top | Center | Bottom | Justify | Distributed] = js.undefined
  
  /**
    * Specifies if Excel wraps the text in the object. A `null` value indicates that the entire range doesn't have a uniform wrap setting
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var wrapText: js.UndefOr[Boolean] = js.undefined
}
object RangeFormatData {
  
  inline def apply(): RangeFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeFormatData]
  }
  
  extension [Self <: RangeFormatData](x: Self) {
    
    inline def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
    
    inline def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
    
    inline def setBorders(value: js.Array[RangeBorderData]): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setBordersVarargs(value: RangeBorderData*): Self = StObject.set(x, "borders", js.Array(value*))
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setFill(value: RangeFillData): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFont(value: RangeFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHorizontalAlignment(
      value: HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
    ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setIndentLevel(value: Double): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
    
    inline def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
    
    inline def setProtection(value: FormatProtectionData): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    inline def setReadingOrder(value: ReadingOrder | Context | LeftToRight | RightToLeft): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
    
    inline def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
    
    inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
    
    inline def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
    
    inline def setTextOrientation(value: Double): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    inline def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    inline def setUseStandardHeight(value: Boolean): Self = StObject.set(x, "useStandardHeight", value.asInstanceOf[js.Any])
    
    inline def setUseStandardHeightUndefined: Self = StObject.set(x, "useStandardHeight", js.undefined)
    
    inline def setUseStandardWidth(value: Boolean): Self = StObject.set(x, "useStandardWidth", value.asInstanceOf[js.Any])
    
    inline def setUseStandardWidthUndefined: Self = StObject.set(x, "useStandardWidth", js.undefined)
    
    inline def setVerticalAlignment(value: VerticalAlignment | Top | Center | Bottom | Justify | Distributed): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
    
    inline def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
  }
}
