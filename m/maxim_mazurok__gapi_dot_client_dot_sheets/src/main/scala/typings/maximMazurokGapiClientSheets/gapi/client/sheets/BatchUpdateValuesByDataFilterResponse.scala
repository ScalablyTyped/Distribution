package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateValuesByDataFilterResponse extends StObject {
  
  /** The response for each range updated. */
  var responses: js.UndefOr[js.Array[UpdateValuesByDataFilterResponse]] = js.undefined
  
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
object BatchUpdateValuesByDataFilterResponse {
  
  @scala.inline
  def apply(): BatchUpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateValuesByDataFilterResponse]
  }
  
  @scala.inline
  implicit class BatchUpdateValuesByDataFilterResponseMutableBuilder[Self <: BatchUpdateValuesByDataFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[UpdateValuesByDataFilterResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: UpdateValuesByDataFilterResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setTotalUpdatedCells(value: Double): Self = StObject.set(x, "totalUpdatedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUpdatedCellsUndefined: Self = StObject.set(x, "totalUpdatedCells", js.undefined)
    
    @scala.inline
    def setTotalUpdatedColumns(value: Double): Self = StObject.set(x, "totalUpdatedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUpdatedColumnsUndefined: Self = StObject.set(x, "totalUpdatedColumns", js.undefined)
    
    @scala.inline
    def setTotalUpdatedRows(value: Double): Self = StObject.set(x, "totalUpdatedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUpdatedRowsUndefined: Self = StObject.set(x, "totalUpdatedRows", js.undefined)
    
    @scala.inline
    def setTotalUpdatedSheets(value: Double): Self = StObject.set(x, "totalUpdatedSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUpdatedSheetsUndefined: Self = StObject.set(x, "totalUpdatedSheets", js.undefined)
  }
}
