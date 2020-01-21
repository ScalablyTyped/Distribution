package typings.ngFacebook

import typings.angular.mod.IPromise
import typings.fb.FBInitParams
import typings.fb.FeedDialogParams
import typings.fb.PageTabDialogParams
import typings.fb.PayDialogParams
import typings.fb.RequestsDialogParams
import typings.fb.SendDialogParams
import typings.fb.ShareDialogParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("angular", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object ngFacebook extends js.Object {
    @js.native
    trait IFacebookProvider extends js.Object {
      def getAppId(): String = js.native
      def getCustomInit(): FBInitParams = js.native
      def getPermissions(): String = js.native
      def getVersion(): String = js.native
      def setAppId(appId: String): IFacebookProvider = js.native
      def setCustomInit(customInit: FBInitParams): IFacebookProvider = js.native
      def setPermissions(permissions: String): IFacebookProvider = js.native
      def setPermissions(permissions: js.Array[String]): IFacebookProvider = js.native
      def setVersion(version: String): IFacebookProvider = js.native
    }
    
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
    
    type FBUIParams = ShareDialogParams | PageTabDialogParams | RequestsDialogParams | SendDialogParams | PayDialogParams | FeedDialogParams
  }
  
}

