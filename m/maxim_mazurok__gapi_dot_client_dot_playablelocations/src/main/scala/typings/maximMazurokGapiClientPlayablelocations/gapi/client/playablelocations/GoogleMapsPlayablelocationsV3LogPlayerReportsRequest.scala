package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3LogPlayerReportsRequest extends js.Object {
  
  /** Required. Information about the client device (for example, device model and operating system). */
  var clientInfo: js.UndefOr[GoogleMapsUnityClientInfo] = js.native
  
  /** Required. Player reports. The maximum number of player reports that you can log at once is 50. */
  var playerReports: js.UndefOr[js.Array[GoogleMapsPlayablelocationsV3PlayerReport]] = js.native
  
  /**
    * Required. A string that uniquely identifies the log player reports request. This allows you to detect duplicate requests. We recommend that you use UUIDs for this value. The value
    * must not exceed 50 characters. You should reuse the `request_id` only when retrying a request in the case of a failure. In that case, the request must be identical to the one that
    * failed.
    */
  var requestId: js.UndefOr[String] = js.native
}
object GoogleMapsPlayablelocationsV3LogPlayerReportsRequest {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3LogPlayerReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3LogPlayerReportsRequest]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3LogPlayerReportsRequestOps[Self <: GoogleMapsPlayablelocationsV3LogPlayerReportsRequest] (val x: Self) extends AnyVal {
    
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
    def setPlayerReportsVarargs(value: GoogleMapsPlayablelocationsV3PlayerReport*): Self = this.set("playerReports", js.Array(value :_*))
    
    @scala.inline
    def setPlayerReports(value: js.Array[GoogleMapsPlayablelocationsV3PlayerReport]): Self = this.set("playerReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerReports: Self = this.set("playerReports", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
