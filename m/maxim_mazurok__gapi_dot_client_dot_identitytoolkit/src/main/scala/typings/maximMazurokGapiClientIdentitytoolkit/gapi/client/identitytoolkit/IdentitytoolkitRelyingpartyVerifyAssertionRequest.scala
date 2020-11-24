package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitytoolkitRelyingpartyVerifyAssertionRequest extends js.Object {
  
  /**
    * When it's true, automatically creates a new account if the user doesn't exist. When it's false, allows existing user to sign in normally and throws exception if the user doesn't
    * exist.
    */
  var autoCreate: js.UndefOr[Boolean] = js.native
  
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[String] = js.native
  
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.native
  
  /** The GITKit token for the non-trusted IDP pending to be confirmed by the user. */
  var pendingIdToken: js.UndefOr[String] = js.native
  
  /** The post body if the request is a HTTP POST. */
  var postBody: js.UndefOr[String] = js.native
  
  /** The URI to which the IDP redirects the user back. It may contain federated login result params added by the IDP. */
  var requestUri: js.UndefOr[String] = js.native
  
  /** Whether return 200 and IDP credential rather than throw exception when federated id is already linked. */
  var returnIdpCredential: js.UndefOr[Boolean] = js.native
  
  /** Whether to return refresh tokens. */
  var returnRefreshToken: js.UndefOr[Boolean] = js.native
  
  /** Whether return sts id token and refresh token instead of gitkit token. */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
  
  /** Session ID, which should match the one in previous createAuthUri request. */
  var sessionId: js.UndefOr[String] = js.native
  
  /** For multi-tenant use cases, in order to construct sign-in URL with the correct IDP parameters, Firebear needs to know which Tenant to retrieve IDP configs from. */
  var tenantId: js.UndefOr[String] = js.native
  
  /** Tenant project number to be used for idp discovery. */
  var tenantProjectNumber: js.UndefOr[String] = js.native
}
object IdentitytoolkitRelyingpartyVerifyAssertionRequest {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyVerifyAssertionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyAssertionRequest]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyVerifyAssertionRequestOps[Self <: IdentitytoolkitRelyingpartyVerifyAssertionRequest] (val x: Self) extends AnyVal {
    
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
    def setAutoCreate(value: Boolean): Self = this.set("autoCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCreate: Self = this.set("autoCreate", js.undefined)
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = this.set("delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegatedProjectNumber: Self = this.set("delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setPendingIdToken(value: String): Self = this.set("pendingIdToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingIdToken: Self = this.set("pendingIdToken", js.undefined)
    
    @scala.inline
    def setPostBody(value: String): Self = this.set("postBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostBody: Self = this.set("postBody", js.undefined)
    
    @scala.inline
    def setRequestUri(value: String): Self = this.set("requestUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestUri: Self = this.set("requestUri", js.undefined)
    
    @scala.inline
    def setReturnIdpCredential(value: Boolean): Self = this.set("returnIdpCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnIdpCredential: Self = this.set("returnIdpCredential", js.undefined)
    
    @scala.inline
    def setReturnRefreshToken(value: Boolean): Self = this.set("returnRefreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnRefreshToken: Self = this.set("returnRefreshToken", js.undefined)
    
    @scala.inline
    def setReturnSecureToken(value: Boolean): Self = this.set("returnSecureToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnSecureToken: Self = this.set("returnSecureToken", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
    
    @scala.inline
    def setTenantProjectNumber(value: String): Self = this.set("tenantProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantProjectNumber: Self = this.set("tenantProjectNumber", js.undefined)
  }
}
