package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertTableRowRequest extends StObject {
  
  /** Whether to insert new row below the reference cell location. - `True`: insert below the cell. - `False`: insert above the cell. */
  var insertBelow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The reference table cell location from which rows will be inserted. A new row will be inserted above (or below) the row where the reference cell is. If the reference cell is a
    * merged cell, a new row will be inserted above (or below) the merged cell.
    */
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.undefined
}
object InsertTableRowRequest {
  
  inline def apply(): InsertTableRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTableRowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertTableRowRequest] (val x: Self) extends AnyVal {
    
    inline def setInsertBelow(value: Boolean): Self = StObject.set(x, "insertBelow", value.asInstanceOf[js.Any])
    
    inline def setInsertBelowUndefined: Self = StObject.set(x, "insertBelow", js.undefined)
    
    inline def setTableCellLocation(value: TableCellLocation): Self = StObject.set(x, "tableCellLocation", value.asInstanceOf[js.Any])
    
    inline def setTableCellLocationUndefined: Self = StObject.set(x, "tableCellLocation", js.undefined)
  }
}
