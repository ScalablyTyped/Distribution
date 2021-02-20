package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContactGroupsResponse extends StObject {
  
  /** The list of contact groups. Members of the contact groups are not populated. */
  var contactGroups: js.UndefOr[js.Array[ContactGroup]] = js.native
  
  /** The token that can be used to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The token that can be used to retrieve changes since the last request. */
  var nextSyncToken: js.UndefOr[String] = js.native
  
  /** The total number of items in the list without pagination. */
  var totalItems: js.UndefOr[Double] = js.native
}
object ListContactGroupsResponse {
  
  @scala.inline
  def apply(): ListContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactGroupsResponse]
  }
  
  @scala.inline
  implicit class ListContactGroupsResponseMutableBuilder[Self <: ListContactGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactGroups(value: js.Array[ContactGroup]): Self = StObject.set(x, "contactGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactGroupsUndefined: Self = StObject.set(x, "contactGroups", js.undefined)
    
    @scala.inline
    def setContactGroupsVarargs(value: ContactGroup*): Self = StObject.set(x, "contactGroups", js.Array(value :_*))
    
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
  }
}
