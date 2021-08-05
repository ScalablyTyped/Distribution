package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactGroupsResponse extends StObject {
  
  /** The list of contact groups. Members of the contact groups are not populated. */
  var contactGroups: js.UndefOr[js.Array[ContactGroup]] = js.undefined
  
  /** The token that can be used to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The token that can be used to retrieve changes since the last request. */
  var nextSyncToken: js.UndefOr[String] = js.undefined
  
  /** The total number of items in the list without pagination. */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object ListContactGroupsResponse {
  
  inline def apply(): ListContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactGroupsResponse]
  }
  
  extension [Self <: ListContactGroupsResponse](x: Self) {
    
    inline def setContactGroups(value: js.Array[ContactGroup]): Self = StObject.set(x, "contactGroups", value.asInstanceOf[js.Any])
    
    inline def setContactGroupsUndefined: Self = StObject.set(x, "contactGroups", js.undefined)
    
    inline def setContactGroupsVarargs(value: ContactGroup*): Self = StObject.set(x, "contactGroups", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
