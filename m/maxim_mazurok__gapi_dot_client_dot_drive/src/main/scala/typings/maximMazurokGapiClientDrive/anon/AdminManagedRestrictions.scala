package typings.maximMazurokGapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminManagedRestrictions extends js.Object {
  
  /** Whether administrative privileges on this shared drive are required to modify restrictions. */
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the options to copy, print, or download files inside this shared drive, should be disabled for readers and commenters. When this restriction is set to true, it will
    * override the similarly named field to true for any file inside this shared drive.
    */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether access to this shared drive and items inside this shared drive is restricted to users of the domain to which this shared drive belongs. This restriction may be
    * overridden by other sharing policies controlled outside of this shared drive.
    */
  var domainUsersOnly: js.UndefOr[Boolean] = js.native
  
  /** Whether access to items inside this shared drive is restricted to its members. */
  var driveMembersOnly: js.UndefOr[Boolean] = js.native
}
object AdminManagedRestrictions {
  
  @scala.inline
  def apply(): AdminManagedRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminManagedRestrictions]
  }
  
  @scala.inline
  implicit class AdminManagedRestrictionsOps[Self <: AdminManagedRestrictions] (val x: Self) extends AnyVal {
    
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
    def setAdminManagedRestrictions(value: Boolean): Self = this.set("adminManagedRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminManagedRestrictions: Self = this.set("adminManagedRestrictions", js.undefined)
    
    @scala.inline
    def setCopyRequiresWriterPermission(value: Boolean): Self = this.set("copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyRequiresWriterPermission: Self = this.set("copyRequiresWriterPermission", js.undefined)
    
    @scala.inline
    def setDomainUsersOnly(value: Boolean): Self = this.set("domainUsersOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainUsersOnly: Self = this.set("domainUsersOnly", js.undefined)
    
    @scala.inline
    def setDriveMembersOnly(value: Boolean): Self = this.set("driveMembersOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveMembersOnly: Self = this.set("driveMembersOnly", js.undefined)
  }
}
