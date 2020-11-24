package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetValuesResponse extends js.Object {
  
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
  implicit class BatchGetValuesResponseOps[Self <: BatchGetValuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
    
    @scala.inline
    def setValueRangesVarargs(value: ValueRange*): Self = this.set("valueRanges", js.Array(value :_*))
    
    @scala.inline
    def setValueRanges(value: js.Array[ValueRange]): Self = this.set("valueRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueRanges: Self = this.set("valueRanges", js.undefined)
  }
}
