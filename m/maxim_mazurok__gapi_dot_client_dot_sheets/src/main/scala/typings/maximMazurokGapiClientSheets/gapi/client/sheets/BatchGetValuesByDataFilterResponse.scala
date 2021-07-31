package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetValuesByDataFilterResponse extends StObject {
  
  /** The ID of the spreadsheet the data was retrieved from. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /** The requested values with the list of data filters that matched them. */
  var valueRanges: js.UndefOr[js.Array[MatchedValueRange]] = js.undefined
}
object BatchGetValuesByDataFilterResponse {
  
  @scala.inline
  def apply(): BatchGetValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetValuesByDataFilterResponse]
  }
  
  @scala.inline
  implicit class BatchGetValuesByDataFilterResponseMutableBuilder[Self <: BatchGetValuesByDataFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setValueRanges(value: js.Array[MatchedValueRange]): Self = StObject.set(x, "valueRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangesUndefined: Self = StObject.set(x, "valueRanges", js.undefined)
    
    @scala.inline
    def setValueRangesVarargs(value: MatchedValueRange*): Self = StObject.set(x, "valueRanges", js.Array(value :_*))
  }
}
