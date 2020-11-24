package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateSpreadsheetRequest extends js.Object {
  
  /** Determines if the update response should include the spreadsheet resource. */
  var includeSpreadsheetInResponse: js.UndefOr[Boolean] = js.native
  
  /** A list of updates to apply to the spreadsheet. Requests will be applied in the order they are specified. If any request is not valid, no requests will be applied. */
  var requests: js.UndefOr[js.Array[Request]] = js.native
  
  /** True if grid data should be returned. Meaningful only if include_spreadsheet_in_response is 'true'. This parameter is ignored if a field mask was set in the request. */
  var responseIncludeGridData: js.UndefOr[Boolean] = js.native
  
  /** Limits the ranges included in the response spreadsheet. Meaningful only if include_spreadsheet_in_response is 'true'. */
  var responseRanges: js.UndefOr[js.Array[String]] = js.native
}
object BatchUpdateSpreadsheetRequest {
  
  @scala.inline
  def apply(): BatchUpdateSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateSpreadsheetRequest]
  }
  
  @scala.inline
  implicit class BatchUpdateSpreadsheetRequestOps[Self <: BatchUpdateSpreadsheetRequest] (val x: Self) extends AnyVal {
    
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
    def setIncludeSpreadsheetInResponse(value: Boolean): Self = this.set("includeSpreadsheetInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSpreadsheetInResponse: Self = this.set("includeSpreadsheetInResponse", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: Request*): Self = this.set("requests", js.Array(value :_*))
    
    @scala.inline
    def setRequests(value: js.Array[Request]): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
    
    @scala.inline
    def setResponseIncludeGridData(value: Boolean): Self = this.set("responseIncludeGridData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseIncludeGridData: Self = this.set("responseIncludeGridData", js.undefined)
    
    @scala.inline
    def setResponseRangesVarargs(value: String*): Self = this.set("responseRanges", js.Array(value :_*))
    
    @scala.inline
    def setResponseRanges(value: js.Array[String]): Self = this.set("responseRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseRanges: Self = this.set("responseRanges", js.undefined)
  }
}
