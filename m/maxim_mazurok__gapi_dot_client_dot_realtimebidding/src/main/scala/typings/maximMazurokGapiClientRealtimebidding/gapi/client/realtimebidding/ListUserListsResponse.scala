package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserListsResponse extends StObject {
  
  /**
    * The continuation page token to send back to the server in a subsequent request. Due to a currently known issue, it is recommended that the caller keep invoking the list method till
    * the time a next page token is not returned (even if the result set is empty).
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of user lists from the search. */
  var userLists: js.UndefOr[js.Array[UserList]] = js.native
}
object ListUserListsResponse {
  
  @scala.inline
  def apply(): ListUserListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserListsResponse]
  }
  
  @scala.inline
  implicit class ListUserListsResponseMutableBuilder[Self <: ListUserListsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUserLists(value: js.Array[UserList]): Self = StObject.set(x, "userLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserListsUndefined: Self = StObject.set(x, "userLists", js.undefined)
    
    @scala.inline
    def setUserListsVarargs(value: UserList*): Self = StObject.set(x, "userLists", js.Array(value :_*))
  }
}
