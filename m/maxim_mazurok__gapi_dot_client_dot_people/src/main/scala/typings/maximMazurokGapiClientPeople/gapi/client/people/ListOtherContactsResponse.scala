package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOtherContactsResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A token, which can be sent as `sync_token` to retrieve changes since the last request. Request must set `request_sync_token` to return the sync token. */
  var nextSyncToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of "Other contacts" returned as Person resources. "Other contacts" support a limited subset of fields. See ListOtherContactsRequest.request_mask for more detailed
    * information.
    */
  var otherContacts: js.UndefOr[js.Array[Person]] = js.undefined
  
  /** The total number of other contacts in the list without pagination. */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object ListOtherContactsResponse {
  
  inline def apply(): ListOtherContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOtherContactsResponse]
  }
  
  extension [Self <: ListOtherContactsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
    
    inline def setOtherContacts(value: js.Array[Person]): Self = StObject.set(x, "otherContacts", value.asInstanceOf[js.Any])
    
    inline def setOtherContactsUndefined: Self = StObject.set(x, "otherContacts", js.undefined)
    
    inline def setOtherContactsVarargs(value: Person*): Self = StObject.set(x, "otherContacts", js.Array(value*))
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
