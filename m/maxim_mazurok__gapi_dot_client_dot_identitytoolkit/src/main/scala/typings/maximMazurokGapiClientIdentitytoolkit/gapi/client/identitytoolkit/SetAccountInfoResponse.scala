package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typings.maximMazurokGapiClientIdentitytoolkit.anon.DisplayName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetAccountInfoResponse extends StObject {
  
  /** The name of the user. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The email of the user. */
  var email: js.UndefOr[String] = js.native
  
  /** If email has been verified. */
  var emailVerified: js.UndefOr[Boolean] = js.native
  
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[String] = js.native
  
  /** The Gitkit id token to login the newly sign up user. */
  var idToken: js.UndefOr[String] = js.native
  
  /** The fixed string "identitytoolkit#SetAccountInfoResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.native
  
  /** The new email the user attempts to change to. */
  var newEmail: js.UndefOr[String] = js.native
  
  /** The user's hashed password. */
  var passwordHash: js.UndefOr[String] = js.native
  
  /** The photo url of the user. */
  var photoUrl: js.UndefOr[String] = js.native
  
  /** The user's profiles at the associated IdPs. */
  var providerUserInfo: js.UndefOr[js.Array[DisplayName]] = js.native
  
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[String] = js.native
}
object SetAccountInfoResponse {
  
  @scala.inline
  def apply(): SetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetAccountInfoResponse]
  }
  
  @scala.inline
  implicit class SetAccountInfoResponseMutableBuilder[Self <: SetAccountInfoResponse] (val x: Self) extends AnyVal {
    
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
    def setNewEmail(value: String): Self = StObject.set(x, "newEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewEmailUndefined: Self = StObject.set(x, "newEmail", js.undefined)
    
    @scala.inline
    def setPasswordHash(value: String): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setProviderUserInfo(value: js.Array[DisplayName]): Self = StObject.set(x, "providerUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUserInfoUndefined: Self = StObject.set(x, "providerUserInfo", js.undefined)
    
    @scala.inline
    def setProviderUserInfoVarargs(value: DisplayName*): Self = StObject.set(x, "providerUserInfo", js.Array(value :_*))
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
