package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGoogleAudiencesResponse extends js.Object {
  
  /** The list of Google audiences. This list will be absent if empty. */
  var googleAudiences: js.UndefOr[js.Array[GoogleAudience]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListGoogleAudiences` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListGoogleAudiencesResponse {
  
  @scala.inline
  def apply(): ListGoogleAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGoogleAudiencesResponse]
  }
  
  @scala.inline
  implicit class ListGoogleAudiencesResponseOps[Self <: ListGoogleAudiencesResponse] (val x: Self) extends AnyVal {
    
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
    def setGoogleAudiencesVarargs(value: GoogleAudience*): Self = this.set("googleAudiences", js.Array(value :_*))
    
    @scala.inline
    def setGoogleAudiences(value: js.Array[GoogleAudience]): Self = this.set("googleAudiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAudiences: Self = this.set("googleAudiences", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
