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
    createLogoutRequestAsync: js.Function1[java.lang.String, DefaultPromise],
    createTokenRequestAsync: js.Function0[DefaultPromise],
    isOAuth: scala.Boolean,
    isOidc: scala.Boolean,
    loadAuthorizationEndpoint: js.Function0[scala.Unit],
    loadMetadataAsync: js.Function0[DefaultPromise],
    loadUserProfile: js.Function1[java.lang.String, DefaultPromise],
    loadX509SigningKeyAsync: js.Function0[DefaultPromise],
    processResponseAsync: js.Function1[java.lang.String, DefaultPromise],
    validateAccessTokenAsync: js.Function2[java.lang.String, java.lang.String, DefaultPromise],
    validateIdTokenAndAccessTokenAsync: js.Function3[java.lang.String, java.lang.String, java.lang.String, DefaultPromise],
    validateIdTokenAsync: js.Function3[java.lang.String, java.lang.String, java.lang.String, DefaultPromise]
  ): OidcClient = {
    val __obj = js.Dynamic.literal(createLogoutRequestAsync = createLogoutRequestAsync, createTokenRequestAsync = createTokenRequestAsync, isOAuth = isOAuth, isOidc = isOidc, loadAuthorizationEndpoint = loadAuthorizationEndpoint, loadMetadataAsync = loadMetadataAsync, loadUserProfile = loadUserProfile, loadX509SigningKeyAsync = loadX509SigningKeyAsync, processResponseAsync = processResponseAsync, validateAccessTokenAsync = validateAccessTokenAsync, validateIdTokenAndAccessTokenAsync = validateIdTokenAndAccessTokenAsync, validateIdTokenAsync = validateIdTokenAsync)
  
    __obj.asInstanceOf[OidcClient]
  }
}

