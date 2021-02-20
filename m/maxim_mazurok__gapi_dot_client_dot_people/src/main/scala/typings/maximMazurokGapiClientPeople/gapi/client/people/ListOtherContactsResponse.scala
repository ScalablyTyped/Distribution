package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOtherContactsResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A token, which can be sent as `sync_token` to retrieve changes since the last request. Request must set `request_sync_token` to return the sync token. */
  var nextSyncToken: js.UndefOr[String] = js.native
  
  /**
    * The list of "Other contacts" returned as Person resources. "Other contacts" support a limited subset of fields. See ListOtherContactsRequest.request_mask for more detailed
    * information.
    */
  var otherContacts: js.UndefOr[js.Array[Person]] = js.native
}
object ListOtherContactsResponse {
  
  @scala.inline
  def apply(): ListOtherContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOtherContactsResponse]
  }
  
  @scala.inline
  implicit class ListOtherContactsResponseMutableBuilder[Self <: ListOtherContactsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
    
    @scala.inline
    def setOtherContacts(value: js.Array[Person]): Self = StObject.set(x, "otherContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherContactsUndefined: Self = StObject.set(x, "otherContacts", js.undefined)
    
    @scala.inline
    def setOtherContactsVarargs(value: Person*): Self = StObject.set(x, "otherContacts", js.Array(value :_*))
  }
}
