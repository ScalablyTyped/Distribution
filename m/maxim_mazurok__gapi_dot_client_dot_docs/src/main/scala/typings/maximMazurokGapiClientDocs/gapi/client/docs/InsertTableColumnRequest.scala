package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertTableColumnRequest extends StObject {
  
  /** Whether to insert new column to the right of the reference cell location. - `True`: insert to the right. - `False`: insert to the left. */
  var insertRight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The reference table cell location from which columns will be inserted. A new column will be inserted to the left (or right) of the column where the reference cell is. If the
    * reference cell is a merged cell, a new column will be inserted to the left (or right) of the merged cell.
    */
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.undefined
}
object InsertTableColumnRequest {
  
  inline def apply(): InsertTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTableColumnRequest]
  }
  
  extension [Self <: InsertTableColumnRequest](x: Self) {
    
    inline def setInsertRight(value: Boolean): Self = StObject.set(x, "insertRight", value.asInstanceOf[js.Any])
    
    inline def setInsertRightUndefined: Self = StObject.set(x, "insertRight", js.undefined)
    
    inline def setTableCellLocation(value: TableCellLocation): Self = StObject.set(x, "tableCellLocation", value.asInstanceOf[js.Any])
    
    inline def setTableCellLocationUndefined: Self = StObject.set(x, "tableCellLocation", js.undefined)
  }
}
