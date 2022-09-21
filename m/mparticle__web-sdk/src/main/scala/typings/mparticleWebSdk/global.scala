package typings.mparticleWebSdk

import typings.mparticleWebSdk.mod.AliasUsers
import typings.mparticleWebSdk.mod.CreateAliasRequest
import typings.mparticleWebSdk.mod.CreateCCPAConsent
import typings.mparticleWebSdk.mod.CreateConsentState
import typings.mparticleWebSdk.mod.CreateGDPRConsent
import typings.mparticleWebSdk.mod.CreateImpression
import typings.mparticleWebSdk.mod.CreateProduct
import typings.mparticleWebSdk.mod.CreatePromotion
import typings.mparticleWebSdk.mod.CreateTransactionAttributes
import typings.mparticleWebSdk.mod.EndSession_
import typings.mparticleWebSdk.mod.GetAppName_
import typings.mparticleWebSdk.mod.GetAppVersion_
import typings.mparticleWebSdk.mod.GetCurrentUser
import typings.mparticleWebSdk.mod.GetDeviceId_
import typings.mparticleWebSdk.mod.GetIntegrationAttributes_
import typings.mparticleWebSdk.mod.GetSession
import typings.mparticleWebSdk.mod.GetUser
import typings.mparticleWebSdk.mod.GetUsers
import typings.mparticleWebSdk.mod.GetVersion_
import typings.mparticleWebSdk.mod.Identify
import typings.mparticleWebSdk.mod.Init_
import typings.mparticleWebSdk.mod.IsInitialized_
import typings.mparticleWebSdk.mod.LogBaseEvent_
import typings.mparticleWebSdk.mod.LogCheckout
import typings.mparticleWebSdk.mod.LogError_
import typings.mparticleWebSdk.mod.LogEvent_
import typings.mparticleWebSdk.mod.LogForm_
import typings.mparticleWebSdk.mod.LogImpression
import typings.mparticleWebSdk.mod.LogLink_
import typings.mparticleWebSdk.mod.LogPageView_
import typings.mparticleWebSdk.mod.LogProductAction
import typings.mparticleWebSdk.mod.LogPromotion
import typings.mparticleWebSdk.mod.LogPurchase
import typings.mparticleWebSdk.mod.LogRefund
import typings.mparticleWebSdk.mod.Login
import typings.mparticleWebSdk.mod.Logout
import typings.mparticleWebSdk.mod.Modify
import typings.mparticleWebSdk.mod.Ready_
import typings.mparticleWebSdk.mod.Reset_
import typings.mparticleWebSdk.mod.SetAppName_
import typings.mparticleWebSdk.mod.SetAppVersion_
import typings.mparticleWebSdk.mod.SetCurrencyCode
import typings.mparticleWebSdk.mod.SetDeviceId_
import typings.mparticleWebSdk.mod.SetIntegrationAttribute_
import typings.mparticleWebSdk.mod.SetLogLevel_
import typings.mparticleWebSdk.mod.SetOptOut_
import typings.mparticleWebSdk.mod.SetPosition_
import typings.mparticleWebSdk.mod.SetSessionAttribute_
import typings.mparticleWebSdk.mod.StartNewSession_
import typings.mparticleWebSdk.mod.StartTrackingLocation_
import typings.mparticleWebSdk.mod.StopTrackingLocation_
import typings.mparticleWebSdk.mod.Upload_
import typings.mparticleWebSdk.mod.mParticleInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object mParticle {
    
    @JSGlobal("mParticle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("mParticle.CommerceEventType")
    @js.native
    object CommerceEventType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.mparticleWebSdk.mod.CommerceEventType & Double] = js.native
      
      /* 10 */ val ProductAddToCart: typings.mparticleWebSdk.mod.CommerceEventType.ProductAddToCart & Double = js.native
      
      /* 20 */ val ProductAddToWishlist: typings.mparticleWebSdk.mod.CommerceEventType.ProductAddToWishlist & Double = js.native
      
      /* 12 */ val ProductCheckout: typings.mparticleWebSdk.mod.CommerceEventType.ProductCheckout & Double = js.native
      
      /* 13 */ val ProductCheckoutOption: typings.mparticleWebSdk.mod.CommerceEventType.ProductCheckoutOption & Double = js.native
      
      /* 14 */ val ProductClick: typings.mparticleWebSdk.mod.CommerceEventType.ProductClick & Double = js.native
      
      /* 22 */ val ProductImpression: typings.mparticleWebSdk.mod.CommerceEventType.ProductImpression & Double = js.native
      
      /* 16 */ val ProductPurchase: typings.mparticleWebSdk.mod.CommerceEventType.ProductPurchase & Double = js.native
      
      /* 17 */ val ProductRefund: typings.mparticleWebSdk.mod.CommerceEventType.ProductRefund & Double = js.native
      
      /* 11 */ val ProductRemoveFromCart: typings.mparticleWebSdk.mod.CommerceEventType.ProductRemoveFromCart & Double = js.native
      
      /* 21 */ val ProductRemoveFromWishlist: typings.mparticleWebSdk.mod.CommerceEventType.ProductRemoveFromWishlist & Double = js.native
      
      /* 15 */ val ProductViewDetail: typings.mparticleWebSdk.mod.CommerceEventType.ProductViewDetail & Double = js.native
      
      /* 19 */ val PromotionClick: typings.mparticleWebSdk.mod.CommerceEventType.PromotionClick & Double = js.native
      
      /* 18 */ val PromotionView: typings.mparticleWebSdk.mod.CommerceEventType.PromotionView & Double = js.native
    }
    
    object Consent {
      
      @JSGlobal("mParticle.Consent.createCCPAConsent")
      @js.native
      val createCCPAConsent: CreateCCPAConsent = js.native
      
      @JSGlobal("mParticle.Consent.createConsentState")
      @js.native
      val createConsentState: CreateConsentState = js.native
      
      @JSGlobal("mParticle.Consent.createGDPRConsent")
      @js.native
      val createGDPRConsent: CreateGDPRConsent = js.native
    }
    
    @JSGlobal("mParticle.EventType")
    @js.native
    object EventType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.mparticleWebSdk.mod.EventType & Double] = js.native
      
      /* 2 */ val Location: typings.mparticleWebSdk.mod.EventType.Location & Double = js.native
      
      /* 9 */ val Media: typings.mparticleWebSdk.mod.EventType.Media & Double = js.native
      
      /* 1 */ val Navigation: typings.mparticleWebSdk.mod.EventType.Navigation & Double = js.native
      
      /* 8 */ val Other: typings.mparticleWebSdk.mod.EventType.Other & Double = js.native
      
      /* 3 */ val Search: typings.mparticleWebSdk.mod.EventType.Search & Double = js.native
      
      /* 7 */ val Social: typings.mparticleWebSdk.mod.EventType.Social & Double = js.native
      
      /* 4 */ val Transaction: typings.mparticleWebSdk.mod.EventType.Transaction & Double = js.native
      
      /* 0 */ val Unknown: typings.mparticleWebSdk.mod.EventType.Unknown & Double = js.native
      
      /* 5 */ val UserContent: typings.mparticleWebSdk.mod.EventType.UserContent & Double = js.native
      
      /* 6 */ val UserPreference: typings.mparticleWebSdk.mod.EventType.UserPreference & Double = js.native
    }
    
    object Identity {
      
      @JSGlobal("mParticle.Identity.HTTPCodes")
      @js.native
      val HTTPCodes: Any = js.native
      
      @JSGlobal("mParticle.Identity.aliasUsers")
      @js.native
      val aliasUsers: AliasUsers = js.native
      
      @JSGlobal("mParticle.Identity.createAliasRequest")
      @js.native
      val createAliasRequest: CreateAliasRequest = js.native
      
      @JSGlobal("mParticle.Identity.getCurrentUser")
      @js.native
      val getCurrentUser: GetCurrentUser = js.native
      
      @JSGlobal("mParticle.Identity.getUser")
      @js.native
      val getUser: GetUser = js.native
      
      @JSGlobal("mParticle.Identity.getUsers")
      @js.native
      val getUsers: GetUsers = js.native
      
      @JSGlobal("mParticle.Identity.identify")
      @js.native
      val identify: Identify = js.native
      
      @JSGlobal("mParticle.Identity.login")
      @js.native
      val login: Login = js.native
      
      @JSGlobal("mParticle.Identity.logout")
      @js.native
      val logout: Logout = js.native
      
      @JSGlobal("mParticle.Identity.modify")
      @js.native
      val modify: Modify = js.native
    }
    
    @JSGlobal("mParticle.IdentityType")
    @js.native
    object IdentityType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.mparticleWebSdk.mod.IdentityType & Double] = js.native
      
      /* 1 */ val CustomerId: typings.mparticleWebSdk.mod.IdentityType.CustomerId & Double = js.native
      
      /* 7 */ val Email: typings.mparticleWebSdk.mod.IdentityType.Email & Double = js.native
      
      /* 2 */ val Facebook: typings.mparticleWebSdk.mod.IdentityType.Facebook & Double = js.native
      
      /* 9 */ val FacebookCustomAudienceId: typings.mparticleWebSdk.mod.IdentityType.FacebookCustomAudienceId & Double = js.native
      
      /* 4 */ val Google: typings.mparticleWebSdk.mod.IdentityType.Google & Double = js.native
      
      /* 5 */ val Microsoft: typings.mparticleWebSdk.mod.IdentityType.Microsoft & Double = js.native
      
      /* 19 */ val MobileNumber: typings.mparticleWebSdk.mod.IdentityType.MobileNumber & Double = js.native
      
      /* 0 */ val Other: typings.mparticleWebSdk.mod.IdentityType.Other & Double = js.native
      
      /* 18 */ val Other10: typings.mparticleWebSdk.mod.IdentityType.Other10 & Double = js.native
      
      /* 10 */ val Other2: typings.mparticleWebSdk.mod.IdentityType.Other2 & Double = js.native
      
      /* 11 */ val Other3: typings.mparticleWebSdk.mod.IdentityType.Other3 & Double = js.native
      
      /* 12 */ val Other4: typings.mparticleWebSdk.mod.IdentityType.Other4 & Double = js.native
      
      /* 13 */ val Other5: typings.mparticleWebSdk.mod.IdentityType.Other5 & Double = js.native
      
      /* 14 */ val Other6: typings.mparticleWebSdk.mod.IdentityType.Other6 & Double = js.native
      
      /* 15 */ val Other7: typings.mparticleWebSdk.mod.IdentityType.Other7 & Double = js.native
      
      /* 16 */ val Other8: typings.mparticleWebSdk.mod.IdentityType.Other8 & Double = js.native
      
      /* 17 */ val Other9: typings.mparticleWebSdk.mod.IdentityType.Other9 & Double = js.native
      
      /* 20 */ val PhoneNumber2: typings.mparticleWebSdk.mod.IdentityType.PhoneNumber2 & Double = js.native
      
      /* 21 */ val PhoneNumber3: typings.mparticleWebSdk.mod.IdentityType.PhoneNumber3 & Double = js.native
      
      /* 3 */ val Twitter: typings.mparticleWebSdk.mod.IdentityType.Twitter & Double = js.native
      
      /* 6 */ val Yahoo: typings.mparticleWebSdk.mod.IdentityType.Yahoo & Double = js.native
    }
    
    @JSGlobal("mParticle.ProductActionType")
    @js.native
    object ProductActionType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.mparticleWebSdk.mod.ProductActionType & Double] = js.native
      
      /* 1 */ val AddToCart: typings.mparticleWebSdk.mod.ProductActionType.AddToCart & Double = js.native
      
      /* 9 */ val AddToWishlist: typings.mparticleWebSdk.mod.ProductActionType.AddToWishlist & Double = js.native
      
      /* 3 */ val Checkout: typings.mparticleWebSdk.mod.ProductActionType.Checkout & Double = js.native
      
      /* 4 */ val CheckoutOption: typings.mparticleWebSdk.mod.ProductActionType.CheckoutOption & Double = js.native
      
      /* 5 */ val Click: typings.mparticleWebSdk.mod.ProductActionType.Click & Double = js.native
      
      /* 7 */ val Purchase: typings.mparticleWebSdk.mod.ProductActionType.Purchase & Double = js.native
      
      /* 8 */ val Refund: typings.mparticleWebSdk.mod.ProductActionType.Refund & Double = js.native
      
      /* 2 */ val RemoveFromCart: typings.mparticleWebSdk.mod.ProductActionType.RemoveFromCart & Double = js.native
      
      /* 10 */ val RemoveFromWishlist: typings.mparticleWebSdk.mod.ProductActionType.RemoveFromWishlist & Double = js.native
      
      /* 0 */ val Unknown: typings.mparticleWebSdk.mod.ProductActionType.Unknown & Double = js.native
      
      /* 6 */ val ViewDetail: typings.mparticleWebSdk.mod.ProductActionType.ViewDetail & Double = js.native
    }
    
    @JSGlobal("mParticle.PromotionType")
    @js.native
    object PromotionType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.mparticleWebSdk.mod.PromotionType & Double] = js.native
      
      /* 1 */ val PromotionClick: typings.mparticleWebSdk.mod.PromotionType.PromotionClick & Double = js.native
      
      /* 2 */ val PromotionView: typings.mparticleWebSdk.mod.PromotionType.PromotionView & Double = js.native
      
      /* 0 */ val Unknown: typings.mparticleWebSdk.mod.PromotionType.Unknown & Double = js.native
    }
    
    object eCommerce {
      
      // expandCommerceEvent function for internal use
      @JSGlobal("mParticle.eCommerce.Cart")
      @js.native
      val Cart: typings.mparticleWebSdk.mod.Cart = js.native
      
      @JSGlobal("mParticle.eCommerce.createImpression")
      @js.native
      val createImpression: CreateImpression = js.native
      
      @JSGlobal("mParticle.eCommerce.createProduct")
      @js.native
      val createProduct: CreateProduct = js.native
      
      @JSGlobal("mParticle.eCommerce.createPromotion")
      @js.native
      val createPromotion: CreatePromotion = js.native
      
      @JSGlobal("mParticle.eCommerce.createTransactionAttributes")
      @js.native
      val createTransactionAttributes: CreateTransactionAttributes = js.native
      
      @JSGlobal("mParticle.eCommerce.logCheckout")
      @js.native
      val logCheckout: LogCheckout = js.native
      
      @JSGlobal("mParticle.eCommerce.logImpression")
      @js.native
      val logImpression: LogImpression = js.native
      
      @JSGlobal("mParticle.eCommerce.logProductAction")
      @js.native
      val logProductAction: LogProductAction = js.native
      
      @JSGlobal("mParticle.eCommerce.logPromotion")
      @js.native
      val logPromotion: LogPromotion = js.native
      
      @JSGlobal("mParticle.eCommerce.logPurchase")
      @js.native
      val logPurchase: LogPurchase = js.native
      
      /**
        *
        * @deprecated logRefund has been deprecated
        */
      @JSGlobal("mParticle.eCommerce.logRefund")
      @js.native
      val logRefund: LogRefund = js.native
      
      @JSGlobal("mParticle.eCommerce.setCurrencyCode")
      @js.native
      val setCurrencyCode: SetCurrencyCode = js.native
    }
    
    @JSGlobal("mParticle.endSession")
    @js.native
    val endSession: EndSession_ = js.native
    
    @JSGlobal("mParticle.getAppName")
    @js.native
    val getAppName: GetAppName_ = js.native
    
    @JSGlobal("mParticle.getAppVersion")
    @js.native
    val getAppVersion: GetAppVersion_ = js.native
    
    @JSGlobal("mParticle.getDeviceId")
    @js.native
    val getDeviceId: GetDeviceId_ = js.native
    
    inline def getInstance(): mParticleInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[mParticleInstance]
    inline def getInstance(instanceName: String): mParticleInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(instanceName.asInstanceOf[js.Any]).asInstanceOf[mParticleInstance]
    
    @JSGlobal("mParticle.getIntegrationAttributes")
    @js.native
    val getIntegrationAttributes: GetIntegrationAttributes_ = js.native
    
    @JSGlobal("mParticle.getVersion")
    @js.native
    val getVersion: GetVersion_ = js.native
    
    @JSGlobal("mParticle.init")
    @js.native
    val init: Init_ = js.native
    
    @JSGlobal("mParticle.isInitialized")
    @js.native
    val isInitialized: IsInitialized_ = js.native
    
    @JSGlobal("mParticle.logBaseEvent")
    @js.native
    val logBaseEvent: LogBaseEvent_ = js.native
    
    @JSGlobal("mParticle.logError")
    @js.native
    val logError: LogError_ = js.native
    
    @JSGlobal("mParticle.logEvent")
    @js.native
    val logEvent: LogEvent_ = js.native
    
    @JSGlobal("mParticle.logForm")
    @js.native
    val logForm: LogForm_ = js.native
    
    @JSGlobal("mParticle.logLink")
    @js.native
    val logLink: LogLink_ = js.native
    
    @JSGlobal("mParticle.logPageView")
    @js.native
    val logPageView: LogPageView_ = js.native
    
    @JSGlobal("mParticle.ready")
    @js.native
    val ready: Ready_ = js.native
    
    @JSGlobal("mParticle.reset")
    @js.native
    val reset: Reset_ = js.native
    
    object sessionManager {
      
      @JSGlobal("mParticle.sessionManager.getSession")
      @js.native
      val getSession: GetSession = js.native
    }
    
    @JSGlobal("mParticle.setAppName")
    @js.native
    val setAppName: SetAppName_ = js.native
    
    @JSGlobal("mParticle.setAppVersion")
    @js.native
    val setAppVersion: SetAppVersion_ = js.native
    
    @JSGlobal("mParticle.setDeviceId")
    @js.native
    val setDeviceId: SetDeviceId_ = js.native
    
    @JSGlobal("mParticle.setIntegrationAttribute")
    @js.native
    val setIntegrationAttribute: SetIntegrationAttribute_ = js.native
    
    @JSGlobal("mParticle.setLogLevel")
    @js.native
    val setLogLevel: SetLogLevel_ = js.native
    
    @JSGlobal("mParticle.setOptOut")
    @js.native
    val setOptOut: SetOptOut_ = js.native
    
    @JSGlobal("mParticle.setPosition")
    @js.native
    val setPosition: SetPosition_ = js.native
    
    @JSGlobal("mParticle.setSessionAttribute")
    @js.native
    val setSessionAttribute: SetSessionAttribute_ = js.native
    
    @JSGlobal("mParticle.startNewSession")
    @js.native
    val startNewSession: StartNewSession_ = js.native
    
    @JSGlobal("mParticle.startTrackingLocation")
    @js.native
    val startTrackingLocation: StartTrackingLocation_ = js.native
    
    @JSGlobal("mParticle.stopTrackingLocation")
    @js.native
    val stopTrackingLocation: StopTrackingLocation_ = js.native
    
    @JSGlobal("mParticle.upload")
    @js.native
    val upload: Upload_ = js.native
  }
}
