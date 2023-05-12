package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessUsers extends StObject {
  
  // Group IDs excluded from scope of policy.
  var excludeGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  var excludeGuestsOrExternalUsers: js.UndefOr[NullableOption[ConditionalAccessGuestsOrExternalUsers]] = js.undefined
  
  // Role IDs excluded from scope of policy.
  var excludeRoles: js.UndefOr[js.Array[String]] = js.undefined
  
  // User IDs excluded from scope of policy and/or GuestsOrExternalUsers.
  var excludeUsers: js.UndefOr[js.Array[String]] = js.undefined
  
  // Group IDs in scope of policy unless explicitly excluded.
  var includeGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  var includeGuestsOrExternalUsers: js.UndefOr[NullableOption[ConditionalAccessGuestsOrExternalUsers]] = js.undefined
  
  // Role IDs in scope of policy unless explicitly excluded.
  var includeRoles: js.UndefOr[js.Array[String]] = js.undefined
  
  // User IDs in scope of policy unless explicitly excluded, None, All, or GuestsOrExternalUsers.
  var includeUsers: js.UndefOr[js.Array[String]] = js.undefined
}
object ConditionalAccessUsers {
  
  inline def apply(): ConditionalAccessUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessUsers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalAccessUsers] (val x: Self) extends AnyVal {
    
    inline def setExcludeGroups(value: js.Array[String]): Self = StObject.set(x, "excludeGroups", value.asInstanceOf[js.Any])
    
    inline def setExcludeGroupsUndefined: Self = StObject.set(x, "excludeGroups", js.undefined)
    
    inline def setExcludeGroupsVarargs(value: String*): Self = StObject.set(x, "excludeGroups", js.Array(value*))
    
    inline def setExcludeGuestsOrExternalUsers(value: NullableOption[ConditionalAccessGuestsOrExternalUsers]): Self = StObject.set(x, "excludeGuestsOrExternalUsers", value.asInstanceOf[js.Any])
    
    inline def setExcludeGuestsOrExternalUsersNull: Self = StObject.set(x, "excludeGuestsOrExternalUsers", null)
    
    inline def setExcludeGuestsOrExternalUsersUndefined: Self = StObject.set(x, "excludeGuestsOrExternalUsers", js.undefined)
    
    inline def setExcludeRoles(value: js.Array[String]): Self = StObject.set(x, "excludeRoles", value.asInstanceOf[js.Any])
    
    inline def setExcludeRolesUndefined: Self = StObject.set(x, "excludeRoles", js.undefined)
    
    inline def setExcludeRolesVarargs(value: String*): Self = StObject.set(x, "excludeRoles", js.Array(value*))
    
    inline def setExcludeUsers(value: js.Array[String]): Self = StObject.set(x, "excludeUsers", value.asInstanceOf[js.Any])
    
    inline def setExcludeUsersUndefined: Self = StObject.set(x, "excludeUsers", js.undefined)
    
    inline def setExcludeUsersVarargs(value: String*): Self = StObject.set(x, "excludeUsers", js.Array(value*))
    
    inline def setIncludeGroups(value: js.Array[String]): Self = StObject.set(x, "includeGroups", value.asInstanceOf[js.Any])
    
    inline def setIncludeGroupsUndefined: Self = StObject.set(x, "includeGroups", js.undefined)
    
    inline def setIncludeGroupsVarargs(value: String*): Self = StObject.set(x, "includeGroups", js.Array(value*))
    
    inline def setIncludeGuestsOrExternalUsers(value: NullableOption[ConditionalAccessGuestsOrExternalUsers]): Self = StObject.set(x, "includeGuestsOrExternalUsers", value.asInstanceOf[js.Any])
    
    inline def setIncludeGuestsOrExternalUsersNull: Self = StObject.set(x, "includeGuestsOrExternalUsers", null)
    
    inline def setIncludeGuestsOrExternalUsersUndefined: Self = StObject.set(x, "includeGuestsOrExternalUsers", js.undefined)
    
    inline def setIncludeRoles(value: js.Array[String]): Self = StObject.set(x, "includeRoles", value.asInstanceOf[js.Any])
    
    inline def setIncludeRolesUndefined: Self = StObject.set(x, "includeRoles", js.undefined)
    
    inline def setIncludeRolesVarargs(value: String*): Self = StObject.set(x, "includeRoles", js.Array(value*))
    
    inline def setIncludeUsers(value: js.Array[String]): Self = StObject.set(x, "includeUsers", value.asInstanceOf[js.Any])
    
    inline def setIncludeUsersUndefined: Self = StObject.set(x, "includeUsers", js.undefined)
    
    inline def setIncludeUsersVarargs(value: String*): Self = StObject.set(x, "includeUsers", js.Array(value*))
  }
}
