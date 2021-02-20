package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchClearValuesByDataFilterResponse extends StObject {
  
  /**
    * The ranges that were cleared, in A1 notation. If the requests are for an unbounded range or a ranger larger than the bounds of the sheet, this is the actual ranges that were
    * cleared, bounded to the sheet's limits.
    */
  var clearedRanges: js.UndefOr[js.Array[String]] = js.native
  
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.native
}
object BatchClearValuesByDataFilterResponse {
  
  @scala.inline
  def apply(): BatchClearValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchClearValuesByDataFilterResponse]
  }
  
  @scala.inline
  implicit class BatchClearValuesByDataFilterResponseMutableBuilder[Self <: BatchClearValuesByDataFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearedRanges(value: js.Array[String]): Self = StObject.set(x, "clearedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearedRangesUndefined: Self = StObject.set(x, "clearedRanges", js.undefined)
    
    @scala.inline
    def setClearedRangesVarargs(value: String*): Self = StObject.set(x, "clearedRanges", js.Array(value :_*))
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
