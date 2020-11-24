package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserList extends js.Object {
  
  /** The description for the user list. */
  var description: js.UndefOr[String] = js.native
  
  /** Required. Display name of the user list. This must be unique across all user lists for a given account. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Required. The number of days a user's cookie stays on the user list. The field must be between 0 and 540 inclusive. */
  var membershipDurationDays: js.UndefOr[String] = js.native
  
  /**
    * Output only. Name of the user list that must follow the pattern `buyers/{buyer}/userLists/{user_list}`, where `{buyer}` represents the account ID of the buyer who owns the user
    * list. For a bidder accessing user lists on behalf of a child seat buyer, `{buyer}` represents the account ID of the child seat buyer. `{user_list}` is an int64 identifier assigned
    * by Google to uniquely identify a user list.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The status of the user list. A new user list starts out as open. */
  var status: js.UndefOr[String] = js.native
  
  /** Required. The URL restriction for the user list. */
  var urlRestriction: js.UndefOr[UrlRestriction] = js.native
}
object UserList {
  
  @scala.inline
  def apply(): UserList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserList]
  }
  
  @scala.inline
  implicit class UserListOps[Self <: UserList] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setMembershipDurationDays(value: String): Self = this.set("membershipDurationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembershipDurationDays: Self = this.set("membershipDurationDays", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUrlRestriction(value: UrlRestriction): Self = this.set("urlRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlRestriction: Self = this.set("urlRestriction", js.undefined)
  }
}
