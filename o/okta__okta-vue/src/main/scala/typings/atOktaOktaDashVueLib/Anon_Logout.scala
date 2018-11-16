package typings
package atOktaOktaDashVueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Logout extends js.Object {
  def authRedirectGuardd(): stdLib.Promise[vueDashRouterLib.typesRouterMod.NavigationGuard] = js.native
  def getAccessToken(): stdLib.Promise[java.lang.String] = js.native
  def getFromUri(): java.lang.String = js.native
  def getIdToken(): stdLib.Promise[java.lang.String] = js.native
  def getUser(): stdLib.Promise[_] = js.native
  def handleAuthentication(): stdLib.Promise[scala.Unit] = js.native
  def isAuthenticated(): stdLib.Promise[scala.Boolean] = js.native
  def loginRedirect(): scala.Unit = js.native
  def loginRedirect(fromUri: java.lang.String): scala.Unit = js.native
  def loginRedirect(
    fromUri: java.lang.String,
    additionalParams: atOktaOktaDashVueLib.oktaDashVueMod.OktaVuePluginNs.OktaOpenIDOptions
  ): scala.Unit = js.native
  def logout(): stdLib.Promise[scala.Unit] = js.native
}

