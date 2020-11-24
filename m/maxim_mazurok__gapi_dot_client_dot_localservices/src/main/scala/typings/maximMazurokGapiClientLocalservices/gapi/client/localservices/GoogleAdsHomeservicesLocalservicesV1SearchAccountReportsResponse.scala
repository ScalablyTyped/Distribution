package typings.maximMazurokGapiClientLocalservices.gapi.client.localservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse extends js.Object {
  
  /** List of account reports which maps 1:1 to a particular linked GLS account. */
  var accountReports: js.UndefOr[js.Array[GoogleAdsHomeservicesLocalservicesV1AccountReport]] = js.native
  
  /** Pagination token to retrieve the next page of results. When `next_page_token` is not filled in, there is no next page and the list returned is the last page in the result set. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse {
  
  @scala.inline
  def apply(): GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse]
  }
  
  @scala.inline
  implicit class GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponseOps[Self <: GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountReportsVarargs(value: GoogleAdsHomeservicesLocalservicesV1AccountReport*): Self = this.set("accountReports", js.Array(value :_*))
    
    @scala.inline
    def setAccountReports(value: js.Array[GoogleAdsHomeservicesLocalservicesV1AccountReport]): Self = this.set("accountReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountReports: Self = this.set("accountReports", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
