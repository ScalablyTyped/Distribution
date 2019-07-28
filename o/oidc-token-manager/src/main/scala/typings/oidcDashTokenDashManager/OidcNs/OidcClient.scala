package typings.oidcDashTokenDashManager.OidcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OidcClient extends js.Object {
  var isOAuth: Boolean
  var isOidc: Boolean
  def createLogoutRequestAsync(id_token_hint: String): DefaultPromise
  def createTokenRequestAsync(): DefaultPromise
  def loadAuthorizationEndpoint(): Unit
  def loadMetadataAsync(): DefaultPromise
  def loadUserProfile(access_token: String): DefaultPromise
  def loadX509SigningKeyAsync(): DefaultPromise
  def processResponseAsync(queryString: String): DefaultPromise
  def validateAccessTokenAsync(id_token_contents: String, access_token: String): DefaultPromise
  def validateIdTokenAndAccessTokenAsync(id_token: String, nonce: String, access_token: String): DefaultPromise
  def validateIdTokenAsync(id_token: String, nonce: String, access_token: String): DefaultPromise
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
    val __obj = js.Dynamic.literal(createLogoutRequestAsync = js.Any.fromFunction1(createLogoutRequestAsync), createTokenRequestAsync = js.Any.fromFunction0(createTokenRequestAsync), isOAuth = isOAuth, isOidc = isOidc, loadAuthorizationEndpoint = js.Any.fromFunction0(loadAuthorizationEndpoint), loadMetadataAsync = js.Any.fromFunction0(loadMetadataAsync), loadUserProfile = js.Any.fromFunction1(loadUserProfile), loadX509SigningKeyAsync = js.Any.fromFunction0(loadX509SigningKeyAsync), processResponseAsync = js.Any.fromFunction1(processResponseAsync), validateAccessTokenAsync = js.Any.fromFunction2(validateAccessTokenAsync), validateIdTokenAndAccessTokenAsync = js.Any.fromFunction3(validateIdTokenAndAccessTokenAsync), validateIdTokenAsync = js.Any.fromFunction3(validateIdTokenAsync))
  
    __obj.asInstanceOf[OidcClient]
  }
}

