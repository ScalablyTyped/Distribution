package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearValuesResponse extends StObject {
  
  /**
    * The range (in A1 notation) that was cleared. (If the request was for an unbounded range or a ranger larger than the bounds of the sheet, this will be the actual range that was
    * cleared, bounded to the sheet's limits.)
    */
  var clearedRange: js.UndefOr[String] = js.native
  
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.native
}
object ClearValuesResponse {
  
  @scala.inline
  def apply(): ClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearValuesResponse]
  }
  
  @scala.inline
  implicit class ClearValuesResponseMutableBuilder[Self <: ClearValuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearedRange(value: String): Self = StObject.set(x, "clearedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearedRangeUndefined: Self = StObject.set(x, "clearedRange", js.undefined)
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
