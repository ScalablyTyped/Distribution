package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionScope extends js.Object {
  /**
    * A description of the delegated permissions, intended to be read by an administrator granting the permission on behalf
    * of all users. This text appears in tenant-wide admin consent experiences.
    */
  var adminConsentDescription: js.UndefOr[String] = js.native
  // The permission's title, intended to be read by an administrator granting the permission on behalf of all users.
  var adminConsentDisplayName: js.UndefOr[String] = js.native
  /**
    * Unique delegated permission identifier inside the collection of delegated permissions defined for a resource
    * application.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * When creating or updating a permission, this property must be set to true (which is the default). To delete a
    * permission, this property must first be set to false. At that point, in a subsequent call, the permission may be
    * removed.
    */
  var isEnabled: js.UndefOr[Boolean] = js.native
  var origin: js.UndefOr[String] = js.native
  /**
    * Specifies whether this delegated permission should be considered safe for non-admin users to consent to on behalf of
    * themselves, or whether an administrator should be required for consent to the permissions. This will be the default
    * behavior, but each customer can choose to customize the behavior in their organization (by allowing, restricting or
    * limiting user consent to this delegated permission.)
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * A description of the delegated permissions, intended to be read by a user granting the permission on their own behalf.
    * This text appears in consent experiences where the user is consenting only on behalf of themselves.
    */
  var userConsentDescription: js.UndefOr[String] = js.native
  /**
    * A title for the permission, intended to be read by a user granting the permission on their own behalf. This text
    * appears in consent experiences where the user is consenting only on behalf of themselves.
    */
  var userConsentDisplayName: js.UndefOr[String] = js.native
  /**
    * Specifies the value to include in the scp (scope) claim in access tokens. Must not exceed 120 characters in length.
    * Allowed characters are : ! # $ % &amp; ' ( ) * + , - . / : ; = ? @ [ ] ^ + _ { } ~, as well as characters in the ranges
    * 0-9, A-Z and a-z. Any other character, including the space character, are not allowed.
    */
  var value: js.UndefOr[String] = js.native
}

object PermissionScope {
  @scala.inline
  def apply(): PermissionScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionScope]
  }
  @scala.inline
  implicit class PermissionScopeOps[Self <: PermissionScope] (val x: Self) extends AnyVal {
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
    def setAdminConsentDescription(value: String): Self = this.set("adminConsentDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminConsentDescription: Self = this.set("adminConsentDescription", js.undefined)
    @scala.inline
    def setAdminConsentDisplayName(value: String): Self = this.set("adminConsentDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminConsentDisplayName: Self = this.set("adminConsentDisplayName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUserConsentDescription(value: String): Self = this.set("userConsentDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserConsentDescription: Self = this.set("userConsentDescription", js.undefined)
    @scala.inline
    def setUserConsentDisplayName(value: String): Self = this.set("userConsentDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserConsentDisplayName: Self = this.set("userConsentDisplayName", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

