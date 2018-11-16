package typings
package oidcDashTokenDashManagerLib.OidcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OidcTokenManager extends js.Object {
  var access_token: java.lang.String = js.native
  var expired: scala.Boolean = js.native
  var expires_at: scala.Double = js.native
  var expires_in: scala.Double = js.native
  var id_token: java.lang.String = js.native
  var profile: js.Any = js.native
  var scope: java.lang.String = js.native
  var scopes: js.Array[java.lang.String] = js.native
  var session_state: js.Any = js.native
  def addOnSilentTokenRenewFailed(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def addOnTokenExpired(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def addOnTokenExpiring(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def addOnTokenObtained(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def addOnTokenRemoved(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def openPopupForTokenAsync(): DefaultPromise = js.native
  def openPopupForTokenAsync(popupSettings: PopupSettings): DefaultPromise = js.native
  def processTokenCallbackAsync(): DefaultPromise = js.native
  def processTokenCallbackAsync(queryString: java.lang.String): DefaultPromise = js.native
  def processTokenCallbackSilent(): scala.Unit = js.native
  def processTokenCallbackSilent(hash: java.lang.String): scala.Unit = js.native
  def processTokenPopup(): scala.Unit = js.native
  def processTokenPopup(hash: java.lang.String): scala.Unit = js.native
  def redirectForLogout(): DefaultPromise = js.native
  def redirectForToken(): DefaultPromise = js.native
  def removeToken(): scala.Unit = js.native
  def renewTokenSilentAsync(): DefaultPromise = js.native
  def saveToken(token: OidcToken): scala.Unit = js.native
}

