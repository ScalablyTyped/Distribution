package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookRangeFormat extends Entity {
  
  // Collection of border objects that apply to the overall range selected Read-only.
  var borders: js.UndefOr[NullableOption[js.Array[WorkbookRangeBorder]]] = js.native
  
  // Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned.
  var columnWidth: js.UndefOr[NullableOption[Double]] = js.native
  
  // Returns the fill object defined on the overall range. Read-only.
  var fill: js.UndefOr[NullableOption[WorkbookRangeFill]] = js.native
  
  // Returns the font object defined on the overall range selected Read-only.
  var font: js.UndefOr[NullableOption[WorkbookRangeFont]] = js.native
  
  /**
    * Represents the horizontal alignment for the specified object. The possible values are: General, Left, Center, Right,
    * Fill, Justify, CenterAcrossSelection, Distributed.
    */
  var horizontalAlignment: js.UndefOr[NullableOption[String]] = js.native
  
  // Returns the format protection object for a range. Read-only.
  var protection: js.UndefOr[NullableOption[WorkbookFormatProtection]] = js.native
  
  // Gets or sets the height of all rows in the range. If the row heights are not uniform null will be returned.
  var rowHeight: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Represents the vertical alignment for the specified object. The possible values are: Top, Center, Bottom, Justify,
    * Distributed.
    */
  var verticalAlignment: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap
    * setting
    */
  var wrapText: js.UndefOr[NullableOption[Boolean]] = js.native
}
object WorkbookRangeFormat {
  
  @scala.inline
  def apply(): WorkbookRangeFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeFormat]
  }
  
  @scala.inline
  implicit class WorkbookRangeFormatMutableBuilder[Self <: WorkbookRangeFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorders(value: NullableOption[js.Array[WorkbookRangeBorder]]): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersNull: Self = StObject.set(x, "borders", null)
    
    @scala.inline
    def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    @scala.inline
    def setBordersVarargs(value: WorkbookRangeBorder*): Self = StObject.set(x, "borders", js.Array(value :_*))
    
    @scala.inline
    def setColumnWidth(value: NullableOption[Double]): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthNull: Self = StObject.set(x, "columnWidth", null)
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    @scala.inline
    def setFill(value: NullableOption[WorkbookRangeFill]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillNull: Self = StObject.set(x, "fill", null)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFont(value: NullableOption[WorkbookRangeFont]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNull: Self = StObject.set(x, "font", null)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: NullableOption[String]): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentNull: Self = StObject.set(x, "horizontalAlignment", null)
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setProtection(value: NullableOption[WorkbookFormatProtection]): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionNull: Self = StObject.set(x, "protection", null)
    
    @scala.inline
    def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    @scala.inline
    def setRowHeight(value: NullableOption[Double]): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightNull: Self = StObject.set(x, "rowHeight", null)
    
    @scala.inline
    def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: NullableOption[String]): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentNull: Self = StObject.set(x, "verticalAlignment", null)
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    @scala.inline
    def setWrapText(value: NullableOption[Boolean]): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapTextNull: Self = StObject.set(x, "wrapText", null)
    
    @scala.inline
    def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
  }
}
