package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListScanRunsResponse extends js.Object {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of ScanRuns returned. */
  var scanRuns: js.UndefOr[js.Array[ScanRun]] = js.native
}
object ListScanRunsResponse {
  
  @scala.inline
  def apply(): ListScanRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScanRunsResponse]
  }
  
  @scala.inline
  implicit class ListScanRunsResponseOps[Self <: ListScanRunsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setScanRunsVarargs(value: ScanRun*): Self = this.set("scanRuns", js.Array(value :_*))
    
    @scala.inline
    def setScanRuns(value: js.Array[ScanRun]): Self = this.set("scanRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanRuns: Self = this.set("scanRuns", js.undefined)
  }
}
