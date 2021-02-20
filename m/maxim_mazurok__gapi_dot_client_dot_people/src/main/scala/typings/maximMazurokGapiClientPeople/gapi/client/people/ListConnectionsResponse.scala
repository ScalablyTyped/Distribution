package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConnectionsResponse extends StObject {
  
  /** The list of people that the requestor is connected to. */
  var connections: js.UndefOr[js.Array[Person]] = js.native
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * A token, which can be sent as `sync_token` to retrieve changes since the last request. Request must set `request_sync_token` to return the sync token. When the response is
    * paginated, only the last page will contain `nextSyncToken`.
    */
  var nextSyncToken: js.UndefOr[String] = js.native
  
  /** The total number of items in the list without pagination. */
  var totalItems: js.UndefOr[Double] = js.native
  
  /** **DEPRECATED** (Please use totalItems) The total number of people in the list without pagination. */
  var totalPeople: js.UndefOr[Double] = js.native
}
object ListConnectionsResponse {
  
  @scala.inline
  def apply(): ListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsResponse]
  }
  
  @scala.inline
  implicit class ListConnectionsResponseMutableBuilder[Self <: ListConnectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: js.Array[Person]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Person*): Self = StObject.set(x, "connections", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
    
    @scala.inline
    def setTotalPeople(value: Double): Self = StObject.set(x, "totalPeople", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPeopleUndefined: Self = StObject.set(x, "totalPeople", js.undefined)
  }
}
