package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppRole extends js.Object {
  /**
    * Specifies whether this app role can be assigned to users and groups (by setting to ['User']), to other application's
    * (by setting to ['Application'], or both (by setting to ['User', 'Application']). App roles supporting assignment of
    * other applications' service principals are also known as application permissions.
    */
  var allowedMemberTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The description for the app role. This is displayed when the app role is being assigned and, if the app role functions
    * as an application permission, during consent experiences.
    */
  var description: js.UndefOr[String] = js.native
  // Display name for the permission that appears in the app role assignment and consent experiences.
  var displayName: js.UndefOr[String] = js.native
  /**
    * Unique role identifier inside the appRoles collection. When creating a new app role, a new Guid identifier must be
    * provided.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * When creating or updating an app role, this must be set to true (which is the default). To delete a role, this must
    * first be set to false. At that point, in a subsequent call, this role may be removed.
    */
  var isEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the app role is defined on the application object or on the servicePrincipal entity. Must not be included
    * in any POST or PATCH requests. Read-only.
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * Specifies the value to include in the roles claim in ID tokens and access tokens authenticating an assigned user or
    * service principal. Must not exceed 120 characters in length. Allowed characters are : ! # $ % &amp; ' ( ) * + , - . / :
    * ; = ? @ [ ] ^ + _ { } ~, as well as characters in the ranges 0-9, A-Z and a-z. Any other character, including the space
    * character, are not allowed.
    */
  var value: js.UndefOr[String] = js.native
}

object AppRole {
  @scala.inline
  def apply(): AppRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRole]
  }
  @scala.inline
  implicit class AppRoleOps[Self <: AppRole] (val x: Self) extends AnyVal {
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
    def setAllowedMemberTypesVarargs(value: String*): Self = this.set("allowedMemberTypes", js.Array(value :_*))
    @scala.inline
    def setAllowedMemberTypes(value: js.Array[String]): Self = this.set("allowedMemberTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedMemberTypes: Self = this.set("allowedMemberTypes", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

