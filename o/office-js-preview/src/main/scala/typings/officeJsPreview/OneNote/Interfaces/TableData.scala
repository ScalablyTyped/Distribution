package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `table.toJSON()`. */
trait TableData extends StObject {
  
  /**
    * Gets or sets whether the borders are visible or not. True if they are visible, false if they are hidden.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var borderVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the number of columns in the table.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the ID of the table. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the number of rows in the table.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets all of the table rows. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var rows: js.UndefOr[js.Array[TableRowData]] = js.undefined
}
object TableData {
  
  inline def apply(): TableData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableData]
  }
  
  extension [Self <: TableData](x: Self) {
    
    inline def setBorderVisible(value: Boolean): Self = StObject.set(x, "borderVisible", value.asInstanceOf[js.Any])
    
    inline def setBorderVisibleUndefined: Self = StObject.set(x, "borderVisible", js.undefined)
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRows(value: js.Array[TableRowData]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: TableRowData*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
