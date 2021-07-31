package typings.ngFacebook

import typings.angular.mod.IPromise
import typings.facebookJsSdk.facebook.AddPageTabDialogParams
import typings.facebookJsSdk.facebook.CollectionAdsDialogParams
import typings.facebookJsSdk.facebook.CreateOfferDialogParams
import typings.facebookJsSdk.facebook.GameRequestDialogParams
import typings.facebookJsSdk.facebook.InitParams
import typings.facebookJsSdk.facebook.InstantExperiencesAdsDialogParams
import typings.facebookJsSdk.facebook.InstantExperiencesPreviewDialogParams
import typings.facebookJsSdk.facebook.LeadgenDialogParams
import typings.facebookJsSdk.facebook.LiveDialogParams
import typings.facebookJsSdk.facebook.PayDialogParams
import typings.facebookJsSdk.facebook.PaymentsLiteDialogParams
import typings.facebookJsSdk.facebook.SendDialogParams
import typings.facebookJsSdk.facebook.ShareDialogParams
import typings.facebookJsSdk.facebook.ShareOpenGraphDialogParams
import typings.ngFacebook.anon.PartialInitParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object ngFacebook {
    
    type FBUIParams = ShareDialogParams | ShareOpenGraphDialogParams | AddPageTabDialogParams | GameRequestDialogParams | SendDialogParams | PayDialogParams | PaymentsLiteDialogParams | LiveDialogParams | CreateOfferDialogParams | LeadgenDialogParams | InstantExperiencesAdsDialogParams | InstantExperiencesPreviewDialogParams | CollectionAdsDialogParams
    
    @js.native
    trait IFacebookProvider extends StObject {
      
      def getAppId(): String = js.native
      
      def getCustomInit(): InitParams = js.native
      
      def getPermissions(): String = js.native
      
      def getVersion(): String = js.native
      
      def setAppId(appId: String): IFacebookProvider = js.native
      
      def setCustomInit(customInit: PartialInitParams): IFacebookProvider = js.native
      
      def setPermissions(permissions: String): IFacebookProvider = js.native
      def setPermissions(permissions: js.Array[String]): IFacebookProvider = js.native
      
      def setVersion(version: String): IFacebookProvider = js.native
    }
    
    @js.native
    trait IFacebookService extends StObject {
      
      def api(path: String): IPromise[js.Object] = js.native
      def api(path: String, method: String): IPromise[js.Object] = js.native
      def api(path: String, method: String, params: js.Object): IPromise[js.Object] = js.native
      def api(path: String, params: js.Object): IPromise[js.Object] = js.native
      
      def cachedApi(path: String): IPromise[js.Any] = js.native
      
      def clearCache(): Unit = js.native
      
      def config[T /* <: String | Double | InitParams */](property: String): T = js.native
      
      def getAuthResponse(): js.Object = js.native
      
      def getCache[T](attr: String): T = js.native
      
      def getLoginStatus(): IPromise[js.Object] = js.native
      def getLoginStatus(force: Boolean): IPromise[js.Object] = js.native
      
      def init(): Unit = js.native
      
      def isConnected(): Boolean = js.native
      
      def login(): IPromise[js.Object] = js.native
      def login(permissions: String): IPromise[js.Object] = js.native
      def login(permissions: String, rerequest: Boolean): IPromise[js.Object] = js.native
      def login(permissions: Unit, rerequest: Boolean): IPromise[js.Object] = js.native
      
      def logout(): IPromise[Unit] = js.native
      
      def setCache[T](attr: String, `val`: T): Unit = js.native
      
      def ui(params: FBUIParams): IPromise[js.Any] = js.native
    }
  }
}
