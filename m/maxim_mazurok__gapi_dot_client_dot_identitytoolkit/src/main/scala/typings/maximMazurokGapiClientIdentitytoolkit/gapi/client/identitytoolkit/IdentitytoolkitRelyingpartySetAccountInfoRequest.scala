package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartySetAccountInfoRequest extends StObject {
  
  /** The captcha challenge. */
  var captchaChallenge: js.UndefOr[String] = js.undefined
  
  /** Response to the captcha. */
  var captchaResponse: js.UndefOr[String] = js.undefined
  
  /** The timestamp when the account is created. */
  var createdAt: js.UndefOr[String] = js.undefined
  
  /** The custom attributes to be set in the user's id token. */
  var customAttributes: js.UndefOr[String] = js.undefined
  
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.undefined
  
  /** The attributes users request to delete. */
  var deleteAttribute: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The IDPs the user request to delete. */
  var deleteProvider: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether to disable the user. */
  var disableUser: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the user. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The email of the user. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Mark the email as verified or not. */
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[String] = js.undefined
  
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /** Last login timestamp. */
  var lastLoginAt: js.UndefOr[String] = js.undefined
  
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.undefined
  
  /** The out-of-band code of the change email request. */
  var oobCode: js.UndefOr[String] = js.undefined
  
  /** The new password of the user. */
  var password: js.UndefOr[String] = js.undefined
  
  /** Privileged caller can update user with specified phone number. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /** The photo url of the user. */
  var photoUrl: js.UndefOr[String] = js.undefined
  
  /** The associated IDPs of the user. */
  var provider: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether return sts id token and refresh token instead of gitkit token. */
  var returnSecureToken: js.UndefOr[Boolean] = js.undefined
  
  /** Mark the user to upgrade to federated login. */
  var upgradeToFederatedLogin: js.UndefOr[Boolean] = js.undefined
  
  /** Timestamp in seconds for valid login token. */
  var validSince: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartySetAccountInfoRequest {
  
  inline def apply(): IdentitytoolkitRelyingpartySetAccountInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySetAccountInfoRequest]
  }
  
  extension [Self <: IdentitytoolkitRelyingpartySetAccountInfoRequest](x: Self) {
    
    inline def setCaptchaChallenge(value: String): Self = StObject.set(x, "captchaChallenge", value.asInstanceOf[js.Any])
    
    inline def setCaptchaChallengeUndefined: Self = StObject.set(x, "captchaChallenge", js.undefined)
    
    inline def setCaptchaResponse(value: String): Self = StObject.set(x, "captchaResponse", value.asInstanceOf[js.Any])
    
    inline def setCaptchaResponseUndefined: Self = StObject.set(x, "captchaResponse", js.undefined)
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCustomAttributes(value: String): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    inline def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    inline def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    inline def setDeleteAttribute(value: js.Array[String]): Self = StObject.set(x, "deleteAttribute", value.asInstanceOf[js.Any])
    
    inline def setDeleteAttributeUndefined: Self = StObject.set(x, "deleteAttribute", js.undefined)
    
    inline def setDeleteAttributeVarargs(value: String*): Self = StObject.set(x, "deleteAttribute", js.Array(value :_*))
    
    inline def setDeleteProvider(value: js.Array[String]): Self = StObject.set(x, "deleteProvider", value.asInstanceOf[js.Any])
    
    inline def setDeleteProviderUndefined: Self = StObject.set(x, "deleteProvider", js.undefined)
    
    inline def setDeleteProviderVarargs(value: String*): Self = StObject.set(x, "deleteProvider", js.Array(value :_*))
    
    inline def setDisableUser(value: Boolean): Self = StObject.set(x, "disableUser", value.asInstanceOf[js.Any])
    
    inline def setDisableUserUndefined: Self = StObject.set(x, "disableUser", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    inline def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setLastLoginAt(value: String): Self = StObject.set(x, "lastLoginAt", value.asInstanceOf[js.Any])
    
    inline def setLastLoginAtUndefined: Self = StObject.set(x, "lastLoginAt", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    inline def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setProvider(value: js.Array[String]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setProviderVarargs(value: String*): Self = StObject.set(x, "provider", js.Array(value :_*))
    
    inline def setReturnSecureToken(value: Boolean): Self = StObject.set(x, "returnSecureToken", value.asInstanceOf[js.Any])
    
    inline def setReturnSecureTokenUndefined: Self = StObject.set(x, "returnSecureToken", js.undefined)
    
    inline def setUpgradeToFederatedLogin(value: Boolean): Self = StObject.set(x, "upgradeToFederatedLogin", value.asInstanceOf[js.Any])
    
    inline def setUpgradeToFederatedLoginUndefined: Self = StObject.set(x, "upgradeToFederatedLogin", js.undefined)
    
    inline def setValidSince(value: String): Self = StObject.set(x, "validSince", value.asInstanceOf[js.Any])
    
    inline def setValidSinceUndefined: Self = StObject.set(x, "validSince", js.undefined)
  }
}
