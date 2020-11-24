package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ListJobTriggersResponse extends js.Object {
  
  /** List of triggeredJobs, up to page_size in ListJobTriggersRequest. */
  var jobTriggers: js.UndefOr[js.Array[GooglePrivacyDlpV2JobTrigger]] = js.native
  
  /** If the next page is available then the next page token to be used in following ListJobTriggers request. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2ListJobTriggersResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ListJobTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ListJobTriggersResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ListJobTriggersResponseOps[Self <: GooglePrivacyDlpV2ListJobTriggersResponse] (val x: Self) extends AnyVal {
    
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
    def setJobTriggersVarargs(value: GooglePrivacyDlpV2JobTrigger*): Self = this.set("jobTriggers", js.Array(value :_*))
    
    @scala.inline
    def setJobTriggers(value: js.Array[GooglePrivacyDlpV2JobTrigger]): Self = this.set("jobTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTriggers: Self = this.set("jobTriggers", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
