package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitytoolkitRelyingpartySignupNewUserRequest extends StObject {
  
  /** The captcha challenge. */
  var captchaChallenge: js.UndefOr[String] = js.native
  
  /** Response to the captcha. */
  var captchaResponse: js.UndefOr[String] = js.native
  
  /** Whether to disable the user. Only can be used by service account. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** The name of the user. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The email of the user. */
  var email: js.UndefOr[String] = js.native
  
  /** Mark the email as verified or not. Only can be used by service account. */
  var emailVerified: js.UndefOr[Boolean] = js.native
  
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[String] = js.native
  
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.native
  
  /** Privileged caller can create user with specified user id. */
  var localId: js.UndefOr[String] = js.native
  
  /** The new password of the user. */
  var password: js.UndefOr[String] = js.native
  
  /** Privileged caller can create user with specified phone number. */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /** The photo url of the user. */
  var photoUrl: js.UndefOr[String] = js.native
  
  /** For multi-tenant use cases, in order to construct sign-in URL with the correct IDP parameters, Firebear needs to know which Tenant to retrieve IDP configs from. */
  var tenantId: js.UndefOr[String] = js.native
  
  /** Tenant project number to be used for idp discovery. */
  var tenantProjectNumber: js.UndefOr[String] = js.native
}
object IdentitytoolkitRelyingpartySignupNewUserRequest {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartySignupNewUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySignupNewUserRequest]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartySignupNewUserRequestMutableBuilder[Self <: IdentitytoolkitRelyingpartySignupNewUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptchaChallenge(value: String): Self = StObject.set(x, "captchaChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptchaChallengeUndefined: Self = StObject.set(x, "captchaChallenge", js.undefined)
    
    @scala.inline
    def setCaptchaResponse(value: String): Self = StObject.set(x, "captchaResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptchaResponseUndefined: Self = StObject.set(x, "captchaResponse", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    @scala.inline
    def setTenantProjectNumber(value: String): Self = StObject.set(x, "tenantProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantProjectNumberUndefined: Self = StObject.set(x, "tenantProjectNumber", js.undefined)
  }
}
