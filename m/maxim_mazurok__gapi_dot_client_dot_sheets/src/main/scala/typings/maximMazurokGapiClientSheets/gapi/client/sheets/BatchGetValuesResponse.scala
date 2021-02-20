package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetValuesResponse extends StObject {
  
  /** The ID of the spreadsheet the data was retrieved from. */
  var spreadsheetId: js.UndefOr[String] = js.native
  
  /** The requested values. The order of the ValueRanges is the same as the order of the requested ranges. */
  var valueRanges: js.UndefOr[js.Array[ValueRange]] = js.native
}
object BatchGetValuesResponse {
  
  @scala.inline
  def apply(): BatchGetValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetValuesResponse]
  }
  
  @scala.inline
  implicit class BatchGetValuesResponseMutableBuilder[Self <: BatchGetValuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setValueRanges(value: js.Array[ValueRange]): Self = StObject.set(x, "valueRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangesUndefined: Self = StObject.set(x, "valueRanges", js.undefined)
    
    @scala.inline
    def setValueRangesVarargs(value: ValueRange*): Self = StObject.set(x, "valueRanges", js.Array(value :_*))
  }
}
