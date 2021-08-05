package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserListsResponse extends StObject {
  
  /**
    * The continuation page token to send back to the server in a subsequent request. Due to a currently known issue, it is recommended that the caller keep invoking the list method till
    * the time a next page token is not returned (even if the result set is empty).
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of user lists from the search. */
  var userLists: js.UndefOr[js.Array[UserList]] = js.undefined
}
object ListUserListsResponse {
  
  inline def apply(): ListUserListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserListsResponse]
  }
  
  extension [Self <: ListUserListsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUserLists(value: js.Array[UserList]): Self = StObject.set(x, "userLists", value.asInstanceOf[js.Any])
    
    inline def setUserListsUndefined: Self = StObject.set(x, "userLists", js.undefined)
    
    inline def setUserListsVarargs(value: UserList*): Self = StObject.set(x, "userLists", js.Array(value :_*))
  }
}
