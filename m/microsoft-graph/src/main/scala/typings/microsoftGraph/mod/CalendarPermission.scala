package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarPermission extends Entity {
  
  /**
    * List of allowed sharing or delegating permission levels for the calendar. Possible values are: none, freeBusyRead,
    * limitedRead, read, write, delegateWithoutPrivateEventAccess, delegateWithPrivateEventAccess, custom.
    */
  var allowedRoles: js.UndefOr[NullableOption[js.Array[CalendarRoleType]]] = js.native
  
  /**
    * Represents a sharee or delegate who has access to the calendar. For the 'My Organization' sharee, the address property
    * is null. Read-only.
    */
  var emailAddress: js.UndefOr[NullableOption[EmailAddress]] = js.native
  
  // True if the user in context (sharee or delegate) is inside the same organization as the calendar owner.
  var isInsideOrganization: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * True if the user can be removed from the list of sharees or delegates for the specified calendar, false otherwise. The
    * 'My organization' user determines the permissions other people within your organization have to the given calendar. You
    * cannot remove 'My organization' as a sharee to a calendar.
    */
  var isRemovable: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Current permission level of the calendar sharee or delegate.
  var role: js.UndefOr[NullableOption[CalendarRoleType]] = js.native
}
object CalendarPermission {
  
  @scala.inline
  def apply(): CalendarPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarPermission]
  }
  
  @scala.inline
  implicit class CalendarPermissionOps[Self <: CalendarPermission] (val x: Self) extends AnyVal {
    
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
    def setAllowedRolesVarargs(value: CalendarRoleType*): Self = this.set("allowedRoles", js.Array(value :_*))
    
    @scala.inline
    def setAllowedRoles(value: NullableOption[js.Array[CalendarRoleType]]): Self = this.set("allowedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedRoles: Self = this.set("allowedRoles", js.undefined)
    
    @scala.inline
    def setAllowedRolesNull: Self = this.set("allowedRoles", null)
    
    @scala.inline
    def setEmailAddress(value: NullableOption[EmailAddress]): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setEmailAddressNull: Self = this.set("emailAddress", null)
    
    @scala.inline
    def setIsInsideOrganization(value: NullableOption[Boolean]): Self = this.set("isInsideOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInsideOrganization: Self = this.set("isInsideOrganization", js.undefined)
    
    @scala.inline
    def setIsInsideOrganizationNull: Self = this.set("isInsideOrganization", null)
    
    @scala.inline
    def setIsRemovable(value: NullableOption[Boolean]): Self = this.set("isRemovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRemovable: Self = this.set("isRemovable", js.undefined)
    
    @scala.inline
    def setIsRemovableNull: Self = this.set("isRemovable", null)
    
    @scala.inline
    def setRole(value: NullableOption[CalendarRoleType]): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRoleNull: Self = this.set("role", null)
  }
}
