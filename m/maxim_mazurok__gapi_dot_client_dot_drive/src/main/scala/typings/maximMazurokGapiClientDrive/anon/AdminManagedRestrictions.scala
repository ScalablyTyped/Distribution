package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminManagedRestrictions extends StObject {
  
  /** Whether administrative privileges on this shared drive are required to modify restrictions. */
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the options to copy, print, or download files inside this shared drive, should be disabled for readers and commenters. When this restriction is set to true, it will
    * override the similarly named field to true for any file inside this shared drive.
    */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether access to this shared drive and items inside this shared drive is restricted to users of the domain to which this shared drive belongs. This restriction may be
    * overridden by other sharing policies controlled outside of this shared drive.
    */
  var domainUsersOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Whether access to items inside this shared drive is restricted to its members. */
  var driveMembersOnly: js.UndefOr[Boolean] = js.undefined
}
object AdminManagedRestrictions {
  
  inline def apply(): AdminManagedRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminManagedRestrictions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminManagedRestrictions] (val x: Self) extends AnyVal {
    
    inline def setAdminManagedRestrictions(value: Boolean): Self = StObject.set(x, "adminManagedRestrictions", value.asInstanceOf[js.Any])
    
    inline def setAdminManagedRestrictionsUndefined: Self = StObject.set(x, "adminManagedRestrictions", js.undefined)
    
    inline def setCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    inline def setCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "copyRequiresWriterPermission", js.undefined)
    
    inline def setDomainUsersOnly(value: Boolean): Self = StObject.set(x, "domainUsersOnly", value.asInstanceOf[js.Any])
    
    inline def setDomainUsersOnlyUndefined: Self = StObject.set(x, "domainUsersOnly", js.undefined)
    
    inline def setDriveMembersOnly(value: Boolean): Self = StObject.set(x, "driveMembersOnly", value.asInstanceOf[js.Any])
    
    inline def setDriveMembersOnlyUndefined: Self = StObject.set(x, "driveMembersOnly", js.undefined)
  }
}
