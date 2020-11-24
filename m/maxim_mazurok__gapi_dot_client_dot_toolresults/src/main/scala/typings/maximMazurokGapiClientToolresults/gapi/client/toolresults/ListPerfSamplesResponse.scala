package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPerfSamplesResponse extends js.Object {
  
  /**
    * Optional, returned if result size exceeds the page size specified in the request (or the default page size, 500, if unspecified). It indicates the last sample timestamp to be used
    * as page_token in subsequent request
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  var perfSamples: js.UndefOr[js.Array[PerfSample]] = js.native
}
object ListPerfSamplesResponse {
  
  @scala.inline
  def apply(): ListPerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPerfSamplesResponse]
  }
  
  @scala.inline
  implicit class ListPerfSamplesResponseOps[Self <: ListPerfSamplesResponse] (val x: Self) extends AnyVal {
    
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
    def setPerfSamplesVarargs(value: PerfSample*): Self = this.set("perfSamples", js.Array(value :_*))
    
    @scala.inline
    def setPerfSamples(value: js.Array[PerfSample]): Self = this.set("perfSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerfSamples: Self = this.set("perfSamples", js.undefined)
  }
}
