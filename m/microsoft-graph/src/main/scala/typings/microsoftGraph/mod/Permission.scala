package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends Entity {
  /**
    * A format of yyyy-MM-ddTHH:mm:ssZ of DateTimeOffset indicates the expiration time of the permission. DateTime.MinValue
    * indicates there is no expiration set for this permission. Optional.
    */
  var expirationDateTime: js.UndefOr[String] = js.native
  // For user type permissions, the details of the users &amp; applications for this permission. Read-only.
  var grantedTo: js.UndefOr[IdentitySet] = js.native
  // For link type permissions, the details of the users to whom permission was granted. Read-only.
  var grantedToIdentities: js.UndefOr[js.Array[IdentitySet]] = js.native
  /**
    * This indicates whether password is set for this permission, it's only showing in response. Optional and Read-only and
    * for OneDrive Personal only.
    */
  var hasPassword: js.UndefOr[Boolean] = js.native
  // Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only.
  var inheritedFrom: js.UndefOr[ItemReference] = js.native
  // Details of any associated sharing invitation for this permission. Read-only.
  var invitation: js.UndefOr[SharingInvitation] = js.native
  // Provides the link details of the current permission, if it is a link type permissions. Read-only.
  var link: js.UndefOr[SharingLink] = js.native
  // The type of permission, e.g. read. See below for the full list of roles. Read-only.
  var roles: js.UndefOr[js.Array[String]] = js.native
  // A unique token that can be used to access this shared item via the **shares** API. Read-only.
  var shareId: js.UndefOr[String] = js.native
}

object Permission {
  @scala.inline
  def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
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
    def setExpirationDateTime(value: String): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    @scala.inline
    def setGrantedTo(value: IdentitySet): Self = this.set("grantedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantedTo: Self = this.set("grantedTo", js.undefined)
    @scala.inline
    def setGrantedToIdentitiesVarargs(value: IdentitySet*): Self = this.set("grantedToIdentities", js.Array(value :_*))
    @scala.inline
    def setGrantedToIdentities(value: js.Array[IdentitySet]): Self = this.set("grantedToIdentities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantedToIdentities: Self = this.set("grantedToIdentities", js.undefined)
    @scala.inline
    def setHasPassword(value: Boolean): Self = this.set("hasPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasPassword: Self = this.set("hasPassword", js.undefined)
    @scala.inline
    def setInheritedFrom(value: ItemReference): Self = this.set("inheritedFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInheritedFrom: Self = this.set("inheritedFrom", js.undefined)
    @scala.inline
    def setInvitation(value: SharingInvitation): Self = this.set("invitation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitation: Self = this.set("invitation", js.undefined)
    @scala.inline
    def setLink(value: SharingLink): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setRolesVarargs(value: String*): Self = this.set("roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: js.Array[String]): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
    @scala.inline
    def setShareId(value: String): Self = this.set("shareId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareId: Self = this.set("shareId", js.undefined)
  }
  
}

