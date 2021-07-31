package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "tableRow.toJSON()". */
trait TableRowData extends StObject {
  
  /**
    *
    * Gets the number of cells in the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cellCount: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets the cells in the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cells: js.UndefOr[js.Array[TableCellData]] = js.undefined
  
  /**
    *
    * Gets the ID of the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
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
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
