package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSitesResponse extends js.Object {
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListSites` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of sites. This list will be absent if empty. */
  var sites: js.UndefOr[js.Array[Site]] = js.native
}
object ListSitesResponse {
  
  @scala.inline
  def apply(): ListSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSitesResponse]
  }
  
  @scala.inline
  implicit class ListSitesResponseOps[Self <: ListSitesResponse] (val x: Self) extends AnyVal {
    
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
    def setSitesVarargs(value: Site*): Self = this.set("sites", js.Array(value :_*))
    
    @scala.inline
    def setSites(value: js.Array[Site]): Self = this.set("sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSites: Self = this.set("sites", js.undefined)
  }
}
