package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPartnersResponse extends js.Object {
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListPartners` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of partners. This list will be absent if empty. */
  var partners: js.UndefOr[js.Array[Partner]] = js.native
}
object ListPartnersResponse {
  
  @scala.inline
  def apply(): ListPartnersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartnersResponse]
  }
  
  @scala.inline
  implicit class ListPartnersResponseOps[Self <: ListPartnersResponse] (val x: Self) extends AnyVal {
    
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
    def setPartnersVarargs(value: Partner*): Self = this.set("partners", js.Array(value :_*))
    
    @scala.inline
    def setPartners(value: js.Array[Partner]): Self = this.set("partners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartners: Self = this.set("partners", js.undefined)
  }
}
