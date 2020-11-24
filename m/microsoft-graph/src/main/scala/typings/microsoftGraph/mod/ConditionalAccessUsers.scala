package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessUsers extends js.Object {
  
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
  implicit class ConditionalAccessUsersOps[Self <: ConditionalAccessUsers] (val x: Self) extends AnyVal {
    
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
    def setExcludeGroupsVarargs(value: String*): Self = this.set("excludeGroups", js.Array(value :_*))
    
    @scala.inline
    def setExcludeGroups(value: js.Array[String]): Self = this.set("excludeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeGroups: Self = this.set("excludeGroups", js.undefined)
    
    @scala.inline
    def setExcludeRolesVarargs(value: String*): Self = this.set("excludeRoles", js.Array(value :_*))
    
    @scala.inline
    def setExcludeRoles(value: js.Array[String]): Self = this.set("excludeRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeRoles: Self = this.set("excludeRoles", js.undefined)
    
    @scala.inline
    def setExcludeUsersVarargs(value: String*): Self = this.set("excludeUsers", js.Array(value :_*))
    
    @scala.inline
    def setExcludeUsers(value: js.Array[String]): Self = this.set("excludeUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeUsers: Self = this.set("excludeUsers", js.undefined)
    
    @scala.inline
    def setIncludeGroupsVarargs(value: String*): Self = this.set("includeGroups", js.Array(value :_*))
    
    @scala.inline
    def setIncludeGroups(value: js.Array[String]): Self = this.set("includeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeGroups: Self = this.set("includeGroups", js.undefined)
    
    @scala.inline
    def setIncludeRolesVarargs(value: String*): Self = this.set("includeRoles", js.Array(value :_*))
    
    @scala.inline
    def setIncludeRoles(value: js.Array[String]): Self = this.set("includeRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeRoles: Self = this.set("includeRoles", js.undefined)
    
    @scala.inline
    def setIncludeUsersVarargs(value: String*): Self = this.set("includeUsers", js.Array(value :_*))
    
    @scala.inline
    def setIncludeUsers(value: js.Array[String]): Self = this.set("includeUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeUsers: Self = this.set("includeUsers", js.undefined)
  }
}
