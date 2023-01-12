package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateSpreadsheetResponse extends StObject {
  
  /** The reply of the updates. This maps 1:1 with the updates, although replies to some requests may be empty. */
  var replies: js.UndefOr[js.Array[Response]] = js.undefined
  
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /** The spreadsheet after updates were applied. This is only set if BatchUpdateSpreadsheetRequest.include_spreadsheet_in_response is `true`. */
  var updatedSpreadsheet: js.UndefOr[Spreadsheet] = js.undefined
}
object BatchUpdateSpreadsheetResponse {
  
  inline def apply(): BatchUpdateSpreadsheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateSpreadsheetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateSpreadsheetResponse] (val x: Self) extends AnyVal {
    
    inline def setReplies(value: js.Array[Response]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setRepliesVarargs(value: Response*): Self = StObject.set(x, "replies", js.Array(value*))
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    inline def setUpdatedSpreadsheet(value: Spreadsheet): Self = StObject.set(x, "updatedSpreadsheet", value.asInstanceOf[js.Any])
    
    inline def setUpdatedSpreadsheetUndefined: Self = StObject.set(x, "updatedSpreadsheet", js.undefined)
  }
}
