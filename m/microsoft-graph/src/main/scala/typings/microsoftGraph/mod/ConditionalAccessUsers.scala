package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessUsers extends StObject {
  
  // Group IDs excluded from scope of policy.
  var excludeGroups: js.UndefOr[js.Array[String]] = js.native
  
  // Role IDs excluded from scope of policy.
  var excludeRoles: js.UndefOr[js.Array[String]] = js.native
  
  // User IDs excluded from scope of policy and/or GuestsOrExternalUsers.
  var excludeUsers: js.UndefOr[js.Array[String]] = js.native
  
  // Group IDs in scope of policy unless explicitly excluded, or All.
  var includeGroups: js.UndefOr[js.Array[String]] = js.native
  
  // Role IDs in scope of policy unless explicitly excluded, or All.
  var includeRoles: js.UndefOr[js.Array[String]] = js.native
  
  // User IDs in scope of policy unless explicitly excluded, or None or All or GuestsOrExternalUsers.
  var includeUsers: js.UndefOr[js.Array[String]] = js.native
}
object ConditionalAccessUsers {
  
  @scala.inline
  def apply(): ConditionalAccessUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessUsers]
  }
  
  @scala.inline
  implicit class ConditionalAccessUsersMutableBuilder[Self <: ConditionalAccessUsers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeGroups(value: js.Array[String]): Self = StObject.set(x, "excludeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeGroupsUndefined: Self = StObject.set(x, "excludeGroups", js.undefined)
    
    @scala.inline
    def setExcludeGroupsVarargs(value: String*): Self = StObject.set(x, "excludeGroups", js.Array(value :_*))
    
    @scala.inline
    def setExcludeRoles(value: js.Array[String]): Self = StObject.set(x, "excludeRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeRolesUndefined: Self = StObject.set(x, "excludeRoles", js.undefined)
    
    @scala.inline
    def setExcludeRolesVarargs(value: String*): Self = StObject.set(x, "excludeRoles", js.Array(value :_*))
    
    @scala.inline
    def setExcludeUsers(value: js.Array[String]): Self = StObject.set(x, "excludeUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUsersUndefined: Self = StObject.set(x, "excludeUsers", js.undefined)
    
    @scala.inline
    def setExcludeUsersVarargs(value: String*): Self = StObject.set(x, "excludeUsers", js.Array(value :_*))
    
    @scala.inline
    def setIncludeGroups(value: js.Array[String]): Self = StObject.set(x, "includeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGroupsUndefined: Self = StObject.set(x, "includeGroups", js.undefined)
    
    @scala.inline
    def setIncludeGroupsVarargs(value: String*): Self = StObject.set(x, "includeGroups", js.Array(value :_*))
    
    @scala.inline
    def setIncludeRoles(value: js.Array[String]): Self = StObject.set(x, "includeRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRolesUndefined: Self = StObject.set(x, "includeRoles", js.undefined)
    
    @scala.inline
    def setIncludeRolesVarargs(value: String*): Self = StObject.set(x, "includeRoles", js.Array(value :_*))
    
    @scala.inline
    def setIncludeUsers(value: js.Array[String]): Self = StObject.set(x, "includeUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUsersUndefined: Self = StObject.set(x, "includeUsers", js.undefined)
    
    @scala.inline
    def setIncludeUsersVarargs(value: String*): Self = StObject.set(x, "includeUsers", js.Array(value :_*))
  }
}
