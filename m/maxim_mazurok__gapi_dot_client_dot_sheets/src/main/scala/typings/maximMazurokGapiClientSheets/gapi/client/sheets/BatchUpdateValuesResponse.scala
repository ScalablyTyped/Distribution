package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateValuesResponse extends StObject {
  
  /** One UpdateValuesResponse per requested range, in the same order as the requests appeared. */
  var responses: js.UndefOr[js.Array[UpdateValuesResponse]] = js.undefined
  
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /** The total number of cells updated. */
  var totalUpdatedCells: js.UndefOr[Double] = js.undefined
  
  /** The total number of columns where at least one cell in the column was updated. */
  var totalUpdatedColumns: js.UndefOr[Double] = js.undefined
  
  /** The total number of rows where at least one cell in the row was updated. */
  var totalUpdatedRows: js.UndefOr[Double] = js.undefined
  
  /** The total number of sheets where at least one cell in the sheet was updated. */
  var totalUpdatedSheets: js.UndefOr[Double] = js.undefined
}
object BatchUpdateValuesResponse {
  
  inline def apply(): BatchUpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateValuesResponse]
  }
  
  extension [Self <: BatchUpdateValuesResponse](x: Self) {
    
    inline def setResponses(value: js.Array[UpdateValuesResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: UpdateValuesResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    inline def setTotalUpdatedCells(value: Double): Self = StObject.set(x, "totalUpdatedCells", value.asInstanceOf[js.Any])
    
    inline def setTotalUpdatedCellsUndefined: Self = StObject.set(x, "totalUpdatedCells", js.undefined)
    
    inline def setTotalUpdatedColumns(value: Double): Self = StObject.set(x, "totalUpdatedColumns", value.asInstanceOf[js.Any])
    
    inline def setTotalUpdatedColumnsUndefined: Self = StObject.set(x, "totalUpdatedColumns", js.undefined)
    
    inline def setTotalUpdatedRows(value: Double): Self = StObject.set(x, "totalUpdatedRows", value.asInstanceOf[js.Any])
    
    inline def setTotalUpdatedRowsUndefined: Self = StObject.set(x, "totalUpdatedRows", js.undefined)
    
    inline def setTotalUpdatedSheets(value: Double): Self = StObject.set(x, "totalUpdatedSheets", value.asInstanceOf[js.Any])
    
    inline def setTotalUpdatedSheetsUndefined: Self = StObject.set(x, "totalUpdatedSheets", js.undefined)
  }
}
