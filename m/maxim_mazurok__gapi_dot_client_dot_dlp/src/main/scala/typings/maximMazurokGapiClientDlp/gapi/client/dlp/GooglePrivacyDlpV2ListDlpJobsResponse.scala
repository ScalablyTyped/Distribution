package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ListDlpJobsResponse extends js.Object {
  
  /** A list of DlpJobs that matches the specified filter in the request. */
  var jobs: js.UndefOr[js.Array[GooglePrivacyDlpV2DlpJob]] = js.native
  
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2ListDlpJobsResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ListDlpJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ListDlpJobsResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ListDlpJobsResponseOps[Self <: GooglePrivacyDlpV2ListDlpJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setJobsVarargs(value: GooglePrivacyDlpV2DlpJob*): Self = this.set("jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: js.Array[GooglePrivacyDlpV2DlpJob]): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
