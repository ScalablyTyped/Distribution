package typings.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OidcTokenManager extends js.Object {
  var access_token: String = js.native
  var expired: Boolean = js.native
  var expires_at: Double = js.native
  var expires_in: Double = js.native
  var id_token: String = js.native
  var profile: js.Any = js.native
  var scope: String = js.native
  var scopes: js.Array[String] = js.native
  var session_state: js.Any = js.native
  def addOnSilentTokenRenewFailed(cb: js.Function0[Unit]): Unit = js.native
  def addOnTokenExpired(cb: js.Function0[Unit]): Unit = js.native
  def addOnTokenExpiring(cb: js.Function0[Unit]): Unit = js.native
  def addOnTokenObtained(cb: js.Function0[Unit]): Unit = js.native
  def addOnTokenRemoved(cb: js.Function0[Unit]): Unit = js.native
  def openPopupForTokenAsync(): DefaultPromise = js.native
  def openPopupForTokenAsync(popupSettings: PopupSettings): DefaultPromise = js.native
  def processTokenCallbackAsync(): DefaultPromise = js.native
  def processTokenCallbackAsync(queryString: String): DefaultPromise = js.native
  def processTokenCallbackSilent(): Unit = js.native
  def processTokenCallbackSilent(hash: String): Unit = js.native
  def processTokenPopup(): Unit = js.native
  def processTokenPopup(hash: String): Unit = js.native
  def redirectForLogout(): DefaultPromise = js.native
  def redirectForToken(): DefaultPromise = js.native
  def removeToken(): Unit = js.native
  def renewTokenSilentAsync(): DefaultPromise = js.native
  def saveToken(token: OidcToken): Unit = js.native
}

