package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserListsResponse extends js.Object {
  
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
  implicit class ListUserListsResponseOps[Self <: ListUserListsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setUserListsVarargs(value: UserList*): Self = this.set("userLists", js.Array(value :_*))
    
    @scala.inline
    def setUserLists(value: js.Array[UserList]): Self = this.set("userLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLists: Self = this.set("userLists", js.undefined)
  }
}
