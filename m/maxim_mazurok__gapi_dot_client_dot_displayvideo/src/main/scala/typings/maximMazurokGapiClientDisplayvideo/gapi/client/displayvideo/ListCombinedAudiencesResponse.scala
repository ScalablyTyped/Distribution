package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCombinedAudiencesResponse extends js.Object {
  
  /** The list of combined audiences. This list will be absent if empty. */
  var combinedAudiences: js.UndefOr[js.Array[CombinedAudience]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCombinedAudiences` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCombinedAudiencesResponse {
  
  @scala.inline
  def apply(): ListCombinedAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCombinedAudiencesResponse]
  }
  
  @scala.inline
  implicit class ListCombinedAudiencesResponseOps[Self <: ListCombinedAudiencesResponse] (val x: Self) extends AnyVal {
    
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
    def setCombinedAudiencesVarargs(value: CombinedAudience*): Self = this.set("combinedAudiences", js.Array(value :_*))
    
    @scala.inline
    def setCombinedAudiences(value: js.Array[CombinedAudience]): Self = this.set("combinedAudiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCombinedAudiences: Self = this.set("combinedAudiences", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
