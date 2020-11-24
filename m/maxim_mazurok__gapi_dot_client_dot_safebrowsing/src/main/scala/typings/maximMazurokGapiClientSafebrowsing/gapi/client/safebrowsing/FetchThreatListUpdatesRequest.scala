package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchThreatListUpdatesRequest extends js.Object {
  
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.native
  
  /** The requested threat list updates. */
  var listUpdateRequests: js.UndefOr[js.Array[ListUpdateRequest]] = js.native
}
object FetchThreatListUpdatesRequest {
  
  @scala.inline
  def apply(): FetchThreatListUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchThreatListUpdatesRequest]
  }
  
  @scala.inline
  implicit class FetchThreatListUpdatesRequestOps[Self <: FetchThreatListUpdatesRequest] (val x: Self) extends AnyVal {
    
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
    def setClient(value: ClientInfo): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setListUpdateRequestsVarargs(value: ListUpdateRequest*): Self = this.set("listUpdateRequests", js.Array(value :_*))
    
    @scala.inline
    def setListUpdateRequests(value: js.Array[ListUpdateRequest]): Self = this.set("listUpdateRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListUpdateRequests: Self = this.set("listUpdateRequests", js.undefined)
  }
}
