package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyRequiresWriterPermission extends StObject {
  
  /** Whether administrative privileges on this Team Drive are required to modify restrictions. */
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the options to copy, print, or download files inside this Team Drive, should be disabled for readers and commenters. When this restriction is set to true, it will
    * override the similarly named field to true for any file inside this Team Drive.
    */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether access to this Team Drive and items inside this Team Drive is restricted to users of the domain to which this Team Drive belongs. This restriction may be overridden by
    * other sharing policies controlled outside of this Team Drive.
    */
  var domainUsersOnly: js.UndefOr[Boolean] = js.native
  
  /** Whether access to items inside this Team Drive is restricted to members of this Team Drive. */
  var teamMembersOnly: js.UndefOr[Boolean] = js.native
}
object CopyRequiresWriterPermission {
  
  @scala.inline
  def apply(): CopyRequiresWriterPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyRequiresWriterPermission]
  }
  
  @scala.inline
  implicit class CopyRequiresWriterPermissionMutableBuilder[Self <: CopyRequiresWriterPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminManagedRestrictions(value: Boolean): Self = StObject.set(x, "adminManagedRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminManagedRestrictionsUndefined: Self = StObject.set(x, "adminManagedRestrictions", js.undefined)
    
    @scala.inline
    def setCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "copyRequiresWriterPermission", js.undefined)
    
    @scala.inline
    def setDomainUsersOnly(value: Boolean): Self = StObject.set(x, "domainUsersOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUsersOnlyUndefined: Self = StObject.set(x, "domainUsersOnly", js.undefined)
    
    @scala.inline
    def setTeamMembersOnly(value: Boolean): Self = StObject.set(x, "teamMembersOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamMembersOnlyUndefined: Self = StObject.set(x, "teamMembersOnly", js.undefined)
  }
}
