package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyPasswordResponse extends StObject {
  
  /** The name of the user. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The email returned by the IdP. NOTE: The federated login user may not own the email. */
  var email: js.UndefOr[String] = js.undefined
  
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[String] = js.undefined
  
  /** The GITKit token for authenticated user. */
  var idToken: js.UndefOr[String] = js.undefined
  
  /** The fixed string "identitytoolkit#VerifyPasswordResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The RP local ID if it's already been mapped to the IdP account identified by the federated ID. */
  var localId: js.UndefOr[String] = js.undefined
  
  /** The OAuth2 access token. */
  var oauthAccessToken: js.UndefOr[String] = js.undefined
  
  /** The OAuth2 authorization code. */
  var oauthAuthorizationCode: js.UndefOr[String] = js.undefined
  
  /** The lifetime in seconds of the OAuth2 access token. */
  var oauthExpireIn: js.UndefOr[Double] = js.undefined
  
  /** The URI of the user's photo at IdP */
  var photoUrl: js.UndefOr[String] = js.undefined
  
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[String] = js.undefined
  
  /** Whether the email is registered. */
  var registered: js.UndefOr[Boolean] = js.undefined
}
object VerifyPasswordResponse {
  
  @scala.inline
  def apply(): VerifyPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyPasswordResponse]
  }
  
  @scala.inline
  implicit class VerifyPasswordResponseMutableBuilder[Self <: VerifyPasswordResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    @scala.inline
    def setOauthAccessToken(value: String): Self = StObject.set(x, "oauthAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthAccessTokenUndefined: Self = StObject.set(x, "oauthAccessToken", js.undefined)
    
    @scala.inline
    def setOauthAuthorizationCode(value: String): Self = StObject.set(x, "oauthAuthorizationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthAuthorizationCodeUndefined: Self = StObject.set(x, "oauthAuthorizationCode", js.undefined)
    
    @scala.inline
    def setOauthExpireIn(value: Double): Self = StObject.set(x, "oauthExpireIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthExpireInUndefined: Self = StObject.set(x, "oauthExpireIn", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    @scala.inline
    def setRegistered(value: Boolean): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredUndefined: Self = StObject.set(x, "registered", js.undefined)
  }
}
