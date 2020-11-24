package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFirstAndThirdPartyAudiencesResponse extends js.Object {
  
  /** The list of first and third party audiences. Audience size properties will not be included. This list will be absent if empty. */
  var firstAndThirdPartyAudiences: js.UndefOr[js.Array[FirstAndThirdPartyAudience]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListFirstAndThirdPartyAudiences` method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListFirstAndThirdPartyAudiencesResponse {
  
  @scala.inline
  def apply(): ListFirstAndThirdPartyAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirstAndThirdPartyAudiencesResponse]
  }
  
  @scala.inline
  implicit class ListFirstAndThirdPartyAudiencesResponseOps[Self <: ListFirstAndThirdPartyAudiencesResponse] (val x: Self) extends AnyVal {
    
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
    def setFirstAndThirdPartyAudiencesVarargs(value: FirstAndThirdPartyAudience*): Self = this.set("firstAndThirdPartyAudiences", js.Array(value :_*))
    
    @scala.inline
    def setFirstAndThirdPartyAudiences(value: js.Array[FirstAndThirdPartyAudience]): Self = this.set("firstAndThirdPartyAudiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstAndThirdPartyAudiences: Self = this.set("firstAndThirdPartyAudiences", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
