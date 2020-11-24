package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3LogImpressionsRequest extends js.Object {
  
  /** Required. Information about the client device. For example, device model and operating system. */
  var clientInfo: js.UndefOr[GoogleMapsUnityClientInfo] = js.native
  
  /** Required. Impression event details. The maximum number of impression reports that you can log at once is 50. */
  var impressions: js.UndefOr[js.Array[GoogleMapsPlayablelocationsV3Impression]] = js.native
  
  /**
    * Required. A string that uniquely identifies the log impressions request. This allows you to detect duplicate requests. We recommend that you use UUIDs for this value. The value must
    * not exceed 50 characters. You should reuse the `request_id` only when retrying a request in case of failure. In this case, the request must be identical to the one that failed.
    */
  var requestId: js.UndefOr[String] = js.native
}
object GoogleMapsPlayablelocationsV3LogImpressionsRequest {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3LogImpressionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3LogImpressionsRequest]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3LogImpressionsRequestOps[Self <: GoogleMapsPlayablelocationsV3LogImpressionsRequest] (val x: Self) extends AnyVal {
    
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
    def setClientInfo(value: GoogleMapsUnityClientInfo): Self = this.set("clientInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInfo: Self = this.set("clientInfo", js.undefined)
    
    @scala.inline
    def setImpressionsVarargs(value: GoogleMapsPlayablelocationsV3Impression*): Self = this.set("impressions", js.Array(value :_*))
    
    @scala.inline
    def setImpressions(value: js.Array[GoogleMapsPlayablelocationsV3Impression]): Self = this.set("impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpressions: Self = this.set("impressions", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
