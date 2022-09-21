package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a table cell in a Word document.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
trait TableCellLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the body object of the cell.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var body: js.UndefOr[BodyLoadOptions] = js.undefined
  
  /**
    * Gets the index of the cell in its row. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var cellIndex: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets and sets the width of the cell's column in points. This is applicable to uniform tables.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var columnWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets and sets the horizontal alignment of the cell. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the parent row of the cell.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentRow: js.UndefOr[TableRowLoadOptions] = js.undefined
  
  /**
    * Gets the parent table of the cell.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  
  /**
    * Gets the index of the cell's row in the table. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var rowIndex: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the shading color of the cell. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets and sets the text of the cell.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var value: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets and sets the vertical alignment of the cell. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the width of the cell in points. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object TableCellLoadOptions {
  
  inline def apply(): TableCellLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellLoadOptions]
  }
  
  extension [Self <: TableCellLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBody(value: BodyLoadOptions): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCellIndex(value: Boolean): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
    
    inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
    
    inline def setColumnWidth(value: Boolean): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setHorizontalAlignment(value: Boolean): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setParentRow(value: TableRowLoadOptions): Self = StObject.set(x, "parentRow", value.asInstanceOf[js.Any])
    
    inline def setParentRowUndefined: Self = StObject.set(x, "parentRow", js.undefined)
    
    inline def setParentTable(value: TableLoadOptions): Self = StObject.set(x, "parentTable", value.asInstanceOf[js.Any])
    
    inline def setParentTableUndefined: Self = StObject.set(x, "parentTable", js.undefined)
    
    inline def setRowIndex(value: Boolean): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setShadingColor(value: Boolean): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    inline def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVerticalAlignment(value: Boolean): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
