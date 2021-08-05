package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendValuesResponse extends StObject {
  
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /** The range (in A1 notation) of the table that values are being appended to (before the values were appended). Empty if no table was found. */
  var tableRange: js.UndefOr[String] = js.undefined
  
  /** Information about the updates that were applied. */
  var updates: js.UndefOr[UpdateValuesResponse] = js.undefined
}
object AppendValuesResponse {
  
  inline def apply(): AppendValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendValuesResponse]
  }
  
  extension [Self <: AppendValuesResponse](x: Self) {
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    inline def setTableRange(value: String): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    inline def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
    
    inline def setUpdates(value: UpdateValuesResponse): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
  }
}
