package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListUsers` method to retrieve the next page of results. This token
    * will be absent if there are no more results to return.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of users. This list will be absent if empty. */
  var users: js.UndefOr[js.Array[User]] = js.undefined
}
object ListUsersResponse {
  
  @scala.inline
  def apply(): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsersResponse]
  }
  
  @scala.inline
  implicit class ListUsersResponseMutableBuilder[Self <: ListUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUsers(value: js.Array[User]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: User*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
