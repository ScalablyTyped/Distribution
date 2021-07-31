package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.Alignment
import typings.officeJsPreview.Word.VerticalAlignment
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.Centered
import typings.officeJsPreview.officeJsPreviewStrings.Justified
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Top
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableRow.toJSON()`. */
trait TableRowData extends StObject {
  
  /**
    *
    * Gets the number of cells in the row. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var cellCount: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets cells. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var cells: js.UndefOr[js.Array[TableCellData]] = js.undefined
  
  /**
    *
    * Gets the font. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontData] = js.undefined
  
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the row. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.undefined
  
  /**
    *
    * Checks whether the row is a header row. Read-only. To set the number of header rows, use HeaderRowCount on the Table object.
    *
    * [Api set: WordApi 1.3]
    */
  var isHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets and sets the preferred height of the row in points.
    *
    * [Api set: WordApi 1.3]
    */
  var preferredHeight: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets and sets the text values in the row, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  /**
    *
    * Gets and sets the vertical alignment of the cells in the row. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Mixed | Top | Center | Bottom] = js.undefined
}
object TableRowData {
  
  @scala.inline
  def apply(): TableRowData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowData]
  }
  
  @scala.inline
  implicit class TableRowDataMutableBuilder[Self <: TableRowData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellCount(value: Double): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellCountUndefined: Self = StObject.set(x, "cellCount", js.undefined)
    
    @scala.inline
    def setCells(value: js.Array[TableCellData]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    @scala.inline
    def setCellsVarargs(value: TableCellData*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    @scala.inline
    def setFont(value: FontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setIsHeader(value: Boolean): Self = StObject.set(x, "isHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeaderUndefined: Self = StObject.set(x, "isHeader", js.undefined)
    
    @scala.inline
    def setPreferredHeight(value: Double): Self = StObject.set(x, "preferredHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredHeightUndefined: Self = StObject.set(x, "preferredHeight", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setShadingColor(value: String): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[js.Array[String]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[String]*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    @scala.inline
    def setVerticalAlignment(value: VerticalAlignment | Mixed | Top | Center | Bottom): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
