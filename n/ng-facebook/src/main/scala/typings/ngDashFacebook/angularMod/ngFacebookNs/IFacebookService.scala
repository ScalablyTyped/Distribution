package typings.ngDashFacebook.angularMod.ngFacebookNs

import typings.angular.angularMod.IPromise
import typings.fb.FBInitParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFacebookService extends js.Object {
  def api(path: String): IPromise[js.Object] = js.native
  def api(path: String, method: String): IPromise[js.Object] = js.native
  def api(path: String, method: String, params: js.Object): IPromise[js.Object] = js.native
  def api(path: String, params: js.Object): IPromise[js.Object] = js.native
  def cachedApi(path: String): IPromise[_] = js.native
  def clearCache(): Unit = js.native
  def config[T /* <: String | Double | FBInitParams */](property: String): T = js.native
  def getAuthResponse(): js.Object = js.native
  def getCache[T](attr: String): T = js.native
  def getLoginStatus(): IPromise[js.Object] = js.native
  def getLoginStatus(force: Boolean): IPromise[js.Object] = js.native
  def init(): Unit = js.native
  def isConnected(): Boolean = js.native
  def login(): IPromise[js.Object] = js.native
  def login(permissions: String): IPromise[js.Object] = js.native
  def login(permissions: String, rerequest: Boolean): IPromise[js.Object] = js.native
  def logout(): IPromise[Unit] = js.native
  def setCache[T](attr: String, `val`: T): Unit = js.native
  def ui(params: FBUIParams): IPromise[_] = js.native
}

