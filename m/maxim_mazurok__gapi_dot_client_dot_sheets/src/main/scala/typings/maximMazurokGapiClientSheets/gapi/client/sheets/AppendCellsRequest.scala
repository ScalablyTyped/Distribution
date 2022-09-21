package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendCellsRequest extends StObject {
  
  /**
    * The fields of CellData that should be updated. At least one field must be specified. The root is the CellData; 'row.values.' should not be specified. A single `"*"` can be used as
    * short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The data to append. */
  var rows: js.UndefOr[js.Array[RowData]] = js.undefined
  
  /** The sheet ID to append the data to. */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object AppendCellsRequest {
  
  inline def apply(): AppendCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendCellsRequest]
  }
  
  extension [Self <: AppendCellsRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setRows(value: js.Array[RowData]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: RowData*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
