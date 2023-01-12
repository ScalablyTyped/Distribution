package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserList extends StObject {
  
  /** The description for the user list. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. Display name of the user list. This must be unique across all user lists for a given account. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Required. The number of days a user's cookie stays on the user list. The field must be between 0 and 540 inclusive. */
  var membershipDurationDays: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Name of the user list that must follow the pattern `buyers/{buyer}/userLists/{user_list}`, where `{buyer}` represents the account ID of the buyer who owns the user
    * list. For a bidder accessing user lists on behalf of a child seat buyer, `{buyer}` represents the account ID of the child seat buyer. `{user_list}` is an int64 identifier assigned
    * by Google to uniquely identify a user list.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The status of the user list. A new user list starts out as open. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Required. The URL restriction for the user list. */
  var urlRestriction: js.UndefOr[UrlRestriction] = js.undefined
}
object UserList {
  
  inline def apply(): UserList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserList] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMembershipDurationDays(value: String): Self = StObject.set(x, "membershipDurationDays", value.asInstanceOf[js.Any])
    
    inline def setMembershipDurationDaysUndefined: Self = StObject.set(x, "membershipDurationDays", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUrlRestriction(value: UrlRestriction): Self = StObject.set(x, "urlRestriction", value.asInstanceOf[js.Any])
    
    inline def setUrlRestrictionUndefined: Self = StObject.set(x, "urlRestriction", js.undefined)
  }
}
