package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCellsRequest extends StObject {
  
  /**
    * The fields of CellData that should be updated. At least one field must be specified. The root is the CellData; 'row.values.' should not be specified. A single `"*"` can be used as
    * short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The range to write data to. If the data in rows does not cover the entire requested range, the fields matching those set in fields will be cleared. */
  var range: js.UndefOr[GridRange] = js.undefined
  
  /** The data to write. */
  var rows: js.UndefOr[js.Array[RowData]] = js.undefined
  
  /** The coordinate to start writing data at. Any number of rows and columns (including a different number of columns per row) may be written. */
  var start: js.UndefOr[GridCoordinate] = js.undefined
}
object UpdateCellsRequest {
  
  inline def apply(): UpdateCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCellsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCellsRequest] (val x: Self) extends AnyVal {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRows(value: js.Array[RowData]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: RowData*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setStart(value: GridCoordinate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
