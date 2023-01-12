package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetValuesResponse extends StObject {
  
  /** The ID of the spreadsheet the data was retrieved from. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /** The requested values. The order of the ValueRanges is the same as the order of the requested ranges. */
  var valueRanges: js.UndefOr[js.Array[ValueRange]] = js.undefined
}
object BatchGetValuesResponse {
  
  inline def apply(): BatchGetValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetValuesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetValuesResponse] (val x: Self) extends AnyVal {
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    inline def setValueRanges(value: js.Array[ValueRange]): Self = StObject.set(x, "valueRanges", value.asInstanceOf[js.Any])
    
    inline def setValueRangesUndefined: Self = StObject.set(x, "valueRanges", js.undefined)
    
    inline def setValueRangesVarargs(value: ValueRange*): Self = StObject.set(x, "valueRanges", js.Array(value*))
  }
}
