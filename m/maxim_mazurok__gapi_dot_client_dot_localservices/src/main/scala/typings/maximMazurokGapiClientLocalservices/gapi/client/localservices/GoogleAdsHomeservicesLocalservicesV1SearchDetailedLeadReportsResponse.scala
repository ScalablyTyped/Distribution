package typings.maximMazurokGapiClientLocalservices.gapi.client.localservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse extends js.Object {
  
  /** List of detailed lead reports uniquely identified by external lead id. */
  var detailedLeadReports: js.UndefOr[js.Array[GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport]] = js.native
  
  /** Pagination token to retrieve the next page of results. When `next_page_token` is not filled in, there is no next page and the list returned is the last page in the result set. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse {
  
  @scala.inline
  def apply(): GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse]
  }
  
  @scala.inline
  implicit class GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponseOps[Self <: GoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse] (val x: Self) extends AnyVal {
    
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
    def setDetailedLeadReportsVarargs(value: GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport*): Self = this.set("detailedLeadReports", js.Array(value :_*))
    
    @scala.inline
    def setDetailedLeadReports(value: js.Array[GoogleAdsHomeservicesLocalservicesV1DetailedLeadReport]): Self = this.set("detailedLeadReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailedLeadReports: Self = this.set("detailedLeadReports", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
