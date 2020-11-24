package typings.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OidcClient extends js.Object {
  
  def createLogoutRequestAsync(id_token_hint: String): DefaultPromise = js.native
  
  def createTokenRequestAsync(): DefaultPromise = js.native
  
  var isOAuth: Boolean = js.native
  
  var isOidc: Boolean = js.native
  
  def loadAuthorizationEndpoint(): Unit = js.native
  
  def loadMetadataAsync(): DefaultPromise = js.native
  
  def loadUserProfile(access_token: String): DefaultPromise = js.native
  
  def loadX509SigningKeyAsync(): DefaultPromise = js.native
  
  def processResponseAsync(queryString: String): DefaultPromise = js.native
  
  def validateAccessTokenAsync(id_token_contents: String, access_token: String): DefaultPromise = js.native
  
  def validateIdTokenAndAccessTokenAsync(id_token: String, nonce: String, access_token: String): DefaultPromise = js.native
  
  def validateIdTokenAsync(id_token: String, nonce: String, access_token: String): DefaultPromise = js.native
}
object OidcClient {
  
  @scala.inline
  def apply(
    createLogoutRequestAsync: String => DefaultPromise,
    createTokenRequestAsync: () => DefaultPromise,
    isOAuth: Boolean,
    isOidc: Boolean,
    loadAuthorizationEndpoint: () => Unit,
    loadMetadataAsync: () => DefaultPromise,
    loadUserProfile: String => DefaultPromise,
    loadX509SigningKeyAsync: () => DefaultPromise,
    processResponseAsync: String => DefaultPromise,
    validateAccessTokenAsync: (String, String) => DefaultPromise,
    validateIdTokenAndAccessTokenAsync: (String, String, String) => DefaultPromise,
    validateIdTokenAsync: (String, String, String) => DefaultPromise
  ): OidcClient = {
    val __obj = js.Dynamic.literal(createLogoutRequestAsync = js.Any.fromFunction1(createLogoutRequestAsync), createTokenRequestAsync = js.Any.fromFunction0(createTokenRequestAsync), isOAuth = isOAuth.asInstanceOf[js.Any], isOidc = isOidc.asInstanceOf[js.Any], loadAuthorizationEndpoint = js.Any.fromFunction0(loadAuthorizationEndpoint), loadMetadataAsync = js.Any.fromFunction0(loadMetadataAsync), loadUserProfile = js.Any.fromFunction1(loadUserProfile), loadX509SigningKeyAsync = js.Any.fromFunction0(loadX509SigningKeyAsync), processResponseAsync = js.Any.fromFunction1(processResponseAsync), validateAccessTokenAsync = js.Any.fromFunction2(validateAccessTokenAsync), validateIdTokenAndAccessTokenAsync = js.Any.fromFunction3(validateIdTokenAndAccessTokenAsync), validateIdTokenAsync = js.Any.fromFunction3(validateIdTokenAsync))
    __obj.asInstanceOf[OidcClient]
  }
  
  @scala.inline
  implicit class OidcClientOps[Self <: OidcClient] (val x: Self) extends AnyVal {
    
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
    def setCreateLogoutRequestAsync(value: String => DefaultPromise): Self = this.set("createLogoutRequestAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateTokenRequestAsync(value: () => DefaultPromise): Self = this.set("createTokenRequestAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOAuth(value: Boolean): Self = this.set("isOAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOidc(value: Boolean): Self = this.set("isOidc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadAuthorizationEndpoint(value: () => Unit): Self = this.set("loadAuthorizationEndpoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadMetadataAsync(value: () => DefaultPromise): Self = this.set("loadMetadataAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadUserProfile(value: String => DefaultPromise): Self = this.set("loadUserProfile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadX509SigningKeyAsync(value: () => DefaultPromise): Self = this.set("loadX509SigningKeyAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProcessResponseAsync(value: String => DefaultPromise): Self = this.set("processResponseAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateAccessTokenAsync(value: (String, String) => DefaultPromise): Self = this.set("validateAccessTokenAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidateIdTokenAndAccessTokenAsync(value: (String, String, String) => DefaultPromise): Self = this.set("validateIdTokenAndAccessTokenAsync", js.Any.fromFunction3(value))
    
    @scala.inline
    def setValidateIdTokenAsync(value: (String, String, String) => DefaultPromise): Self = this.set("validateIdTokenAsync", js.Any.fromFunction3(value))
  }
}
