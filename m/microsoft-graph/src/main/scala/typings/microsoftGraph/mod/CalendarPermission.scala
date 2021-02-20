package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class CalendarPermissionMutableBuilder[Self <: CalendarPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedRoles(value: NullableOption[js.Array[CalendarRoleType]]): Self = StObject.set(x, "allowedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedRolesNull: Self = StObject.set(x, "allowedRoles", null)
    
    @scala.inline
    def setAllowedRolesUndefined: Self = StObject.set(x, "allowedRoles", js.undefined)
    
    @scala.inline
    def setAllowedRolesVarargs(value: CalendarRoleType*): Self = StObject.set(x, "allowedRoles", js.Array(value :_*))
    
    @scala.inline
    def setEmailAddress(value: NullableOption[EmailAddress]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setIsInsideOrganization(value: NullableOption[Boolean]): Self = StObject.set(x, "isInsideOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInsideOrganizationNull: Self = StObject.set(x, "isInsideOrganization", null)
    
    @scala.inline
    def setIsInsideOrganizationUndefined: Self = StObject.set(x, "isInsideOrganization", js.undefined)
    
    @scala.inline
    def setIsRemovable(value: NullableOption[Boolean]): Self = StObject.set(x, "isRemovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRemovableNull: Self = StObject.set(x, "isRemovable", null)
    
    @scala.inline
    def setIsRemovableUndefined: Self = StObject.set(x, "isRemovable", js.undefined)
    
    @scala.inline
    def setRole(value: NullableOption[CalendarRoleType]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNull: Self = StObject.set(x, "role", null)
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
