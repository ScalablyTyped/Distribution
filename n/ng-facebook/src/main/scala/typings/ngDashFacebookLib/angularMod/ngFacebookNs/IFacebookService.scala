package typings
package ngDashFacebookLib.angularMod.ngFacebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFacebookService extends js.Object {
  def api(path: java.lang.String): angularLib.angularMod.angularNs.IPromise[js.Object] = js.native
  def api(path: java.lang.String, method: java.lang.String): angularLib.angularMod.angularNs.IPromise[js.Object] = js.native
  def api(path: java.lang.String, method: java.lang.String, params: js.Object): angularLib.angularMod.angularNs.IPromise[js.Object] = js.native
  def api(path: java.lang.String, params: js.Object): angularLib.angularMod.angularNs.IPromise[js.Object] = js.native
  def cachedApi(path: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def clearCache(): scala.Unit = js.native
  def config[T /* <: java.lang.String | scala.Double | fbLib.FBInitParams */](property: java.lang.String): T = js.native
  def getAuthResponse(): js.Object = js.native
  def getCache[T](attr: java.lang.String): T = js.native
  def getLoginStatus(): angularLib.angularMod.angularNs.IPromise[js.Object] = js.native
  def getLoginStatus(force: scala.Boolean): angularLib.angularMod.angularNs.IPromise[js.Object] = js.native
  def init(): scala.Unit = js.native
  def isConnected(): scala.Boolean = js.native
  def login(): angularLib.angularMod.angularNs.IPromise[js.Object] = js.native
  def login(permissions: java.lang.String): angularLib.angularMod.angularNs.IPromise[js.Object] = js.native
  def login(permissions: java.lang.String, rerequest: scala.Boolean): angularLib.angularMod.angularNs.IPromise[js.Object] = js.native
  def logout(): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def setCache[T](attr: java.lang.String, `val`: T): scala.Unit = js.native
  def ui(params: FBUIParams): angularLib.angularMod.angularNs.IPromise[_] = js.native
}

