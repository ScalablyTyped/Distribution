package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookRangeFormat
  extends StObject
     with Entity {
  
  // Collection of border objects that apply to the overall range selected Read-only.
  var borders: js.UndefOr[NullableOption[js.Array[WorkbookRangeBorder]]] = js.undefined
  
  // Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned.
  var columnWidth: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Returns the fill object defined on the overall range. Read-only.
  var fill: js.UndefOr[NullableOption[WorkbookRangeFill]] = js.undefined
  
  // Returns the font object defined on the overall range selected Read-only.
  var font: js.UndefOr[NullableOption[WorkbookRangeFont]] = js.undefined
  
  /**
    * Represents the horizontal alignment for the specified object. The possible values are: General, Left, Center, Right,
    * Fill, Justify, CenterAcrossSelection, Distributed.
    */
  var horizontalAlignment: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Returns the format protection object for a range. Read-only.
  var protection: js.UndefOr[NullableOption[WorkbookFormatProtection]] = js.undefined
  
  // Gets or sets the height of all rows in the range. If the row heights are not uniform null will be returned.
  var rowHeight: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Represents the vertical alignment for the specified object. The possible values are: Top, Center, Bottom, Justify,
    * Distributed.
    */
  var verticalAlignment: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap
    * setting
    */
  var wrapText: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object WorkbookRangeFormat {
  
  inline def apply(): WorkbookRangeFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookRangeFormat] (val x: Self) extends AnyVal {
    
    inline def setBorders(value: NullableOption[js.Array[WorkbookRangeBorder]]): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersNull: Self = StObject.set(x, "borders", null)
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setBordersVarargs(value: WorkbookRangeBorder*): Self = StObject.set(x, "borders", js.Array(value*))
    
    inline def setColumnWidth(value: NullableOption[Double]): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthNull: Self = StObject.set(x, "columnWidth", null)
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setFill(value: NullableOption[WorkbookRangeFill]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillNull: Self = StObject.set(x, "fill", null)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFont(value: NullableOption[WorkbookRangeFont]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontNull: Self = StObject.set(x, "font", null)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHorizontalAlignment(value: NullableOption[String]): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentNull: Self = StObject.set(x, "horizontalAlignment", null)
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setProtection(value: NullableOption[WorkbookFormatProtection]): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionNull: Self = StObject.set(x, "protection", null)
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    inline def setRowHeight(value: NullableOption[Double]): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightNull: Self = StObject.set(x, "rowHeight", null)
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setVerticalAlignment(value: NullableOption[String]): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentNull: Self = StObject.set(x, "verticalAlignment", null)
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWrapText(value: NullableOption[Boolean]): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
    
    inline def setWrapTextNull: Self = StObject.set(x, "wrapText", null)
    
    inline def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
  }
}
