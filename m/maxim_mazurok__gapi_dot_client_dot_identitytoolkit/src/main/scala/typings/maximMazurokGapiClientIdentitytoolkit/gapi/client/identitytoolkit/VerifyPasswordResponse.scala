package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyPasswordResponse extends js.Object {
  
  /** The name of the user. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The email returned by the IdP. NOTE: The federated login user may not own the email. */
  var email: js.UndefOr[String] = js.native
  
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[String] = js.native
  
  /** The GITKit token for authenticated user. */
  var idToken: js.UndefOr[String] = js.native
  
  /** The fixed string "identitytoolkit#VerifyPasswordResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The RP local ID if it's already been mapped to the IdP account identified by the federated ID. */
  var localId: js.UndefOr[String] = js.native
  
  /** The OAuth2 access token. */
  var oauthAccessToken: js.UndefOr[String] = js.native
  
  /** The OAuth2 authorization code. */
  var oauthAuthorizationCode: js.UndefOr[String] = js.native
  
  /** The lifetime in seconds of the OAuth2 access token. */
  var oauthExpireIn: js.UndefOr[Double] = js.native
  
  /** The URI of the user's photo at IdP */
  var photoUrl: js.UndefOr[String] = js.native
  
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[String] = js.native
  
  /** Whether the email is registered. */
  var registered: js.UndefOr[Boolean] = js.native
}
object VerifyPasswordResponse {
  
  @scala.inline
  def apply(): VerifyPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyPasswordResponse]
  }
  
  @scala.inline
  implicit class VerifyPasswordResponseOps[Self <: VerifyPasswordResponse] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: String): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalId: Self = this.set("localId", js.undefined)
    
    @scala.inline
    def setOauthAccessToken(value: String): Self = this.set("oauthAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauthAccessToken: Self = this.set("oauthAccessToken", js.undefined)
    
    @scala.inline
    def setOauthAuthorizationCode(value: String): Self = this.set("oauthAuthorizationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauthAuthorizationCode: Self = this.set("oauthAuthorizationCode", js.undefined)
    
    @scala.inline
    def setOauthExpireIn(value: Double): Self = this.set("oauthExpireIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauthExpireIn: Self = this.set("oauthExpireIn", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    
    @scala.inline
    def setRegistered(value: Boolean): Self = this.set("registered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistered: Self = this.set("registered", js.undefined)
  }
}
