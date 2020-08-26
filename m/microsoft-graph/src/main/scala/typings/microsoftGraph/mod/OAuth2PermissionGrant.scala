package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2PermissionGrant extends Entity {
  /**
    * The id of the client service principal for the application which is authorized to act on behalf of a signed-in user
    * when accessing an API. Required. Supports $filter (eq only).
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * Indicates if authorization is granted for the client application to impersonate all users or only a specific user.
    * AllPrincipals indicates authorization to impersonate all users. Principal indicates authorization to impersonate a
    * specific user. Consent on behalf of all users can be granted by an administrator. Non-admin users may be authorized to
    * consent on behalf of themselves in some cases, for some delegated permissions. Required. Supports $filter (eq only).
    */
  var consentType: js.UndefOr[String] = js.native
  /**
    * The id of the user on behalf of whom the client is authorized to access the resource, when consentType is Principal. If
    * consentType is AllPrincipals this value is null. Required when consentType is Principal.
    */
  var principalId: js.UndefOr[String] = js.native
  /**
    * The id of the resource service principal to which access is authorized. This identifies the API which the client is
    * authorized to attempt to call on behalf of a signed-in user.
    */
  var resourceId: js.UndefOr[String] = js.native
  /**
    * A space-separated list of the claim values for delegated permissions which should be included in access tokens for the
    * resource application (the API). For example, openid User.Read GroupMember.Read.All. Each claim value should match the
    * value field of one of the delegated permissions defined by the API, listed in the publishedPermissionScopes property of
    * the resource service principal.
    */
  var scope: js.UndefOr[String] = js.native
}

object OAuth2PermissionGrant {
  @scala.inline
  def apply(): OAuth2PermissionGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2PermissionGrant]
  }
  @scala.inline
  implicit class OAuth2PermissionGrantOps[Self <: OAuth2PermissionGrant] (val x: Self) extends AnyVal {
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setConsentType(value: String): Self = this.set("consentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsentType: Self = this.set("consentType", js.undefined)
    @scala.inline
    def setPrincipalId(value: String): Self = this.set("principalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalId: Self = this.set("principalId", js.undefined)
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

