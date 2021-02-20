package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchThreatListUpdatesRequest extends StObject {
  
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
  implicit class FetchThreatListUpdatesRequestMutableBuilder[Self <: FetchThreatListUpdatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: ClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setListUpdateRequests(value: js.Array[ListUpdateRequest]): Self = StObject.set(x, "listUpdateRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUpdateRequestsUndefined: Self = StObject.set(x, "listUpdateRequests", js.undefined)
    
    @scala.inline
    def setListUpdateRequestsVarargs(value: ListUpdateRequest*): Self = StObject.set(x, "listUpdateRequests", js.Array(value :_*))
  }
}
