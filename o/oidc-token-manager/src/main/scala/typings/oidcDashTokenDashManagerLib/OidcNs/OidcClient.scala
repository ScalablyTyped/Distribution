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

