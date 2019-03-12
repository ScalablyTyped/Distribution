package typings
package oidcDashTokenDashManagerLib.OidcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OidcClient extends js.Object {
  var isOAuth: scala.Boolean
  var isOidc: scala.Boolean
  def createLogoutRequestAsync(id_token_hint: java.lang.String): DefaultPromise
  def createTokenRequestAsync(): DefaultPromise
  def loadAuthorizationEndpoint(): scala.Unit
  def loadMetadataAsync(): DefaultPromise
  def loadUserProfile(access_token: java.lang.String): DefaultPromise
  def loadX509SigningKeyAsync(): DefaultPromise
  def processResponseAsync(queryString: java.lang.String): DefaultPromise
  def validateAccessTokenAsync(id_token_contents: java.lang.String, access_token: java.lang.String): DefaultPromise
  def validateIdTokenAndAccessTokenAsync(id_token: java.lang.String, nonce: java.lang.String, access_token: java.lang.String): DefaultPromise
  def validateIdTokenAsync(id_token: java.lang.String, nonce: java.lang.String, access_token: java.lang.String): DefaultPromise
}

object OidcClient {
  @scala.inline
  def apply(
    createLogoutRequestAsync: java.lang.String => DefaultPromise,
    createTokenRequestAsync: () => DefaultPromise,
    isOAuth: scala.Boolean,
    isOidc: scala.Boolean,
    loadAuthorizationEndpoint: () => scala.Unit,
    loadMetadataAsync: () => DefaultPromise,
    loadUserProfile: java.lang.String => DefaultPromise,
    loadX509SigningKeyAsync: () => DefaultPromise,
    processResponseAsync: java.lang.String => DefaultPromise,
    validateAccessTokenAsync: (java.lang.String, java.lang.String) => DefaultPromise,
    validateIdTokenAndAccessTokenAsync: (java.lang.String, java.lang.String, java.lang.String) => DefaultPromise,
    validateIdTokenAsync: (java.lang.String, java.lang.String, java.lang.String) => DefaultPromise
  ): OidcClient = {
    val __obj = js.Dynamic.literal(createLogoutRequestAsync = js.Any.fromFunction1(createLogoutRequestAsync), createTokenRequestAsync = js.Any.fromFunction0(createTokenRequestAsync), isOAuth = isOAuth, isOidc = isOidc, loadAuthorizationEndpoint = js.Any.fromFunction0(loadAuthorizationEndpoint), loadMetadataAsync = js.Any.fromFunction0(loadMetadataAsync), loadUserProfile = js.Any.fromFunction1(loadUserProfile), loadX509SigningKeyAsync = js.Any.fromFunction0(loadX509SigningKeyAsync), processResponseAsync = js.Any.fromFunction1(processResponseAsync), validateAccessTokenAsync = js.Any.fromFunction2(validateAccessTokenAsync), validateIdTokenAndAccessTokenAsync = js.Any.fromFunction3(validateIdTokenAndAccessTokenAsync), validateIdTokenAsync = js.Any.fromFunction3(validateIdTokenAsync))
  
    __obj.asInstanceOf[OidcClient]
  }
}

