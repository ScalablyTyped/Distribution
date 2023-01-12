package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.HorizontalAlignment
import typings.officeJs.Excel.ReadingOrder
import typings.officeJs.Excel.VerticalAlignment
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.CenterAcrossSelection
import typings.officeJs.officeJsStrings.Context
import typings.officeJs.officeJsStrings.Distributed
import typings.officeJs.officeJsStrings.Fill
import typings.officeJs.officeJsStrings.General
import typings.officeJs.officeJsStrings.Justify
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.LeftToRight
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.RightToLeft
import typings.officeJs.officeJsStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RangeFormat object, for use in `rangeFormat.set({ ... })`. */
trait RangeFormatUpdateData extends StObject {
  
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
  var borders: js.UndefOr[RangeBorderCollectionUpdateData] = js.undefined
  
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
  var fill: js.UndefOr[RangeFillUpdateData] = js.undefined
  
  /**
    * Returns the font object defined on the overall range.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[RangeFontUpdateData] = js.undefined
  
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
  var protection: js.UndefOr[FormatProtectionUpdateData] = js.undefined
  
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
object RangeFormatUpdateData {
  
  inline def apply(): RangeFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeFormatUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeFormatUpdateData] (val x: Self) extends AnyVal {
    
    inline def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
    
    inline def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
    
    inline def setBorders(value: RangeBorderCollectionUpdateData): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setFill(value: RangeFillUpdateData): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFont(value: RangeFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHorizontalAlignment(
      value: HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
    ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setIndentLevel(value: Double): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
    
    inline def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
    
    inline def setProtection(value: FormatProtectionUpdateData): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
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
