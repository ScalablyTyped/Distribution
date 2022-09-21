package typings.mparticleWebSdk.mod

import typings.mparticleWebSdk.anon.AddToCart
import typings.mparticleWebSdk.anon.CustomerId
import typings.mparticleWebSdk.anon.ProductAddToCart
import typings.mparticleWebSdk.anon.PromotionClick
import typings.mparticleWebSdk.mparticleWebSdkStrings.none
import typings.mparticleWebSdk.mparticleWebSdkStrings.verbose
import typings.mparticleWebSdk.mparticleWebSdkStrings.warning
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait mParticleInstance extends StObject {
  
  var CommerceEventType: ProductAddToCart
  
  // Future optional changes once we migrate all core SDK files to TS. These are used internally only and should not be used by consumers of mParticle
  // export function addForwarder
  // export function configurePixel
  // export function generateHash
  // export function _setIntegrationDelay
  // export function _getIntegrationDelay
  var Consent: typings.mparticleWebSdk.anon.CreateCCPAConsent
  
  var EventType: typings.mparticleWebSdk.anon.Location
  
  var Identity: typings.mparticleWebSdk.anon.AliasUsers
  
  var IdentityType: CustomerId
  
  var ProductActionType: AddToCart
  
  var PromotionType: PromotionClick
  
  var eCommerce: typings.mparticleWebSdk.anon.Cart
  
  def endSession(): Unit
  @JSName("endSession")
  var endSession_Original: EndSession_
  
  def getAppName(): String
  @JSName("getAppName")
  var getAppName_Original: GetAppName_
  
  def getAppVersion(): String
  @JSName("getAppVersion")
  var getAppVersion_Original: GetAppVersion_
  
  def getDeviceId(): String
  @JSName("getDeviceId")
  var getDeviceId_Original: GetDeviceId_
  
  def getIntegrationAttributes(integrationId: Double): Record[String, Any]
  @JSName("getIntegrationAttributes")
  var getIntegrationAttributes_Original: GetIntegrationAttributes_
  
  def getVersion(): String
  @JSName("getVersion")
  var getVersion_Original: GetVersion_
  
  def init(apiKey: String, config: MPConfiguration): Unit
  def init(apiKey: String, config: MPConfiguration, instanceName: String): Unit
  @JSName("init")
  var init_Original: Init_
  
  def isInitialized(): Boolean
  @JSName("isInitialized")
  var isInitialized_Original: IsInitialized_
  
  def logBaseEvent(event: BaseEvent): Unit
  def logBaseEvent(event: BaseEvent, eventOptions: SDKEventOptions): Unit
  @JSName("logBaseEvent")
  var logBaseEvent_Original: LogBaseEvent_
  
  def logError(error: String): Unit
  def logError(error: String, attrs: SDKEventAttrs): Unit
  def logError(error: errorObject): Unit
  def logError(error: errorObject, attrs: SDKEventAttrs): Unit
  @JSName("logError")
  var logError_Original: LogError_
  
  def logEvent(eventName: String): Unit
  def logEvent(
    eventName: String,
    eventType: Unit,
    eventInfo: Unit,
    customFlags: Unit,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(eventName: String, eventType: Unit, eventInfo: Unit, customFlags: SDKEventCustomFlags): Unit
  def logEvent(
    eventName: String,
    eventType: Unit,
    eventInfo: Unit,
    customFlags: SDKEventCustomFlags,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(eventName: String, eventType: Unit, eventInfo: SDKEventAttrs): Unit
  def logEvent(
    eventName: String,
    eventType: Unit,
    eventInfo: SDKEventAttrs,
    customFlags: Unit,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(eventName: String, eventType: Unit, eventInfo: SDKEventAttrs, customFlags: SDKEventCustomFlags): Unit
  def logEvent(
    eventName: String,
    eventType: Unit,
    eventInfo: SDKEventAttrs,
    customFlags: SDKEventCustomFlags,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(eventName: String, eventType: EventType): Unit
  def logEvent(
    eventName: String,
    eventType: EventType,
    eventInfo: Unit,
    customFlags: Unit,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(eventName: String, eventType: EventType, eventInfo: Unit, customFlags: SDKEventCustomFlags): Unit
  def logEvent(
    eventName: String,
    eventType: EventType,
    eventInfo: Unit,
    customFlags: SDKEventCustomFlags,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(eventName: String, eventType: EventType, eventInfo: SDKEventAttrs): Unit
  def logEvent(
    eventName: String,
    eventType: EventType,
    eventInfo: SDKEventAttrs,
    customFlags: Unit,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(
    eventName: String,
    eventType: EventType,
    eventInfo: SDKEventAttrs,
    customFlags: SDKEventCustomFlags
  ): Unit
  def logEvent(
    eventName: String,
    eventType: EventType,
    eventInfo: SDKEventAttrs,
    customFlags: SDKEventCustomFlags,
    eventOptions: SDKEventOptions
  ): Unit
  @JSName("logEvent")
  var logEvent_Original: LogEvent_
  
  def logForm(selector: String, eventName: String): Unit
  def logForm(selector: String, eventName: String, eventType: Unit, eventInfo: SDKEventAttrs): Unit
  def logForm(selector: String, eventName: String, eventType: EventType): Unit
  def logForm(selector: String, eventName: String, eventType: EventType, eventInfo: SDKEventAttrs): Unit
  def logForm(selector: HTMLElement, eventName: String): Unit
  def logForm(selector: HTMLElement, eventName: String, eventType: Unit, eventInfo: SDKEventAttrs): Unit
  def logForm(selector: HTMLElement, eventName: String, eventType: EventType): Unit
  def logForm(selector: HTMLElement, eventName: String, eventType: EventType, eventInfo: SDKEventAttrs): Unit
  @JSName("logForm")
  var logForm_Original: LogForm_
  
  def logLink(selector: String, eventName: String): Unit
  def logLink(selector: String, eventName: String, eventType: Unit, eventInfo: SDKEventAttrs): Unit
  def logLink(selector: String, eventName: String, eventType: EventType): Unit
  def logLink(selector: String, eventName: String, eventType: EventType, eventInfo: SDKEventAttrs): Unit
  def logLink(selector: HTMLElement, eventName: String): Unit
  def logLink(selector: HTMLElement, eventName: String, eventType: Unit, eventInfo: SDKEventAttrs): Unit
  def logLink(selector: HTMLElement, eventName: String, eventType: EventType): Unit
  def logLink(selector: HTMLElement, eventName: String, eventType: EventType, eventInfo: SDKEventAttrs): Unit
  @JSName("logLink")
  var logLink_Original: LogLink_
  
  def logPageView(): Unit
  def logPageView(eventName: String): Unit
  def logPageView(eventName: String, attrs: Unit, customFlags: Unit, eventOptions: SDKEventOptions): Unit
  def logPageView(eventName: String, attrs: Unit, customFlags: SDKEventCustomFlags): Unit
  def logPageView(eventName: String, attrs: Unit, customFlags: SDKEventCustomFlags, eventOptions: SDKEventOptions): Unit
  def logPageView(eventName: String, attrs: SDKEventAttrs): Unit
  def logPageView(eventName: String, attrs: SDKEventAttrs, customFlags: Unit, eventOptions: SDKEventOptions): Unit
  def logPageView(eventName: String, attrs: SDKEventAttrs, customFlags: SDKEventCustomFlags): Unit
  def logPageView(
    eventName: String,
    attrs: SDKEventAttrs,
    customFlags: SDKEventCustomFlags,
    eventOptions: SDKEventOptions
  ): Unit
  def logPageView(eventName: Unit, attrs: Unit, customFlags: Unit, eventOptions: SDKEventOptions): Unit
  def logPageView(eventName: Unit, attrs: Unit, customFlags: SDKEventCustomFlags): Unit
  def logPageView(eventName: Unit, attrs: Unit, customFlags: SDKEventCustomFlags, eventOptions: SDKEventOptions): Unit
  def logPageView(eventName: Unit, attrs: SDKEventAttrs): Unit
  def logPageView(eventName: Unit, attrs: SDKEventAttrs, customFlags: Unit, eventOptions: SDKEventOptions): Unit
  def logPageView(eventName: Unit, attrs: SDKEventAttrs, customFlags: SDKEventCustomFlags): Unit
  def logPageView(
    eventName: Unit,
    attrs: SDKEventAttrs,
    customFlags: SDKEventCustomFlags,
    eventOptions: SDKEventOptions
  ): Unit
  @JSName("logPageView")
  var logPageView_Original: LogPageView_
  
  def ready(callback: js.Function0[Unit]): Unit
  @JSName("ready")
  var ready_Original: Ready_
  
  /**
    * @warning Calling mParticle.reset may have unintended consequences. This function is primarily used for tests. You should only use mParticle.reset if you absolutely know what you are doing.
    */
  def reset(): Unit
  /**
    * @warning Calling mParticle.reset may have unintended consequences. This function is primarily used for tests. You should only use mParticle.reset if you absolutely know what you are doing.
    */
  @JSName("reset")
  var reset_Original: Reset_
  
  var sessionManager: typings.mparticleWebSdk.anon.GetSession
  
  def setAppName(name: String): Unit
  @JSName("setAppName")
  var setAppName_Original: SetAppName_
  
  def setAppVersion(version: String): Unit
  @JSName("setAppVersion")
  var setAppVersion_Original: SetAppVersion_
  
  def setDeviceId(uuid: String): Unit
  @JSName("setDeviceId")
  var setDeviceId_Original: SetDeviceId_
  
  def setIntegrationAttribute(integrationId: Double, attrs: Record[String, Any]): Unit
  @JSName("setIntegrationAttribute")
  var setIntegrationAttribute_Original: SetIntegrationAttribute_
  
  def setLogLevel(newLogLevel: verbose | warning | none): Unit
  @JSName("setLogLevel")
  var setLogLevel_Original: SetLogLevel_
  
  def setOptOut(isOptingOut: Boolean): Unit
  @JSName("setOptOut")
  var setOptOut_Original: SetOptOut_
  
  def setPosition(lat: Double, lng: Double): Unit
  @JSName("setPosition")
  var setPosition_Original: SetPosition_
  
  def setSessionAttribute(key: String): Unit
  def setSessionAttribute(key: String, value: String): Unit
  def setSessionAttribute(key: String, value: Boolean): Unit
  def setSessionAttribute(key: String, value: Double): Unit
  @JSName("setSessionAttribute")
  var setSessionAttribute_Original: SetSessionAttribute_
  
  def startNewSession(): Unit
  @JSName("startNewSession")
  var startNewSession_Original: StartNewSession_
  
  def startTrackingLocation(): Unit
  def startTrackingLocation(callback: TrackLocationCallback): Unit
  @JSName("startTrackingLocation")
  var startTrackingLocation_Original: StartTrackingLocation_
  
  def stopTrackingLocation(): Unit
  @JSName("stopTrackingLocation")
  var stopTrackingLocation_Original: StopTrackingLocation_
  
  def upload(): Unit
  @JSName("upload")
  var upload_Original: Upload_
}
object mParticleInstance {
  
  inline def apply(
    CommerceEventType: ProductAddToCart,
    Consent: typings.mparticleWebSdk.anon.CreateCCPAConsent,
    EventType: typings.mparticleWebSdk.anon.Location,
    Identity: typings.mparticleWebSdk.anon.AliasUsers,
    IdentityType: CustomerId,
    ProductActionType: AddToCart,
    PromotionType: PromotionClick,
    eCommerce: typings.mparticleWebSdk.anon.Cart,
    endSession: () => Unit,
    getAppName: () => String,
    getAppVersion: () => String,
    getDeviceId: () => String,
    getIntegrationAttributes: /* integrationId */ Double => Record[String, Any],
    getVersion: () => String,
    init: (/* apiKey */ String, /* config */ MPConfiguration, /* instanceName */ js.UndefOr[String]) => Unit,
    isInitialized: () => Boolean,
    logBaseEvent: (/* event */ BaseEvent, /* eventOptions */ js.UndefOr[SDKEventOptions]) => Unit,
    logError: (/* error */ String | errorObject, /* attrs */ js.UndefOr[SDKEventAttrs]) => Unit,
    logEvent: (/* eventName */ String, /* eventType */ js.UndefOr[EventType], /* eventInfo */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags], /* eventOptions */ js.UndefOr[SDKEventOptions]) => Unit,
    logForm: (/* selector */ String | HTMLElement, /* eventName */ String, /* eventType */ js.UndefOr[EventType], /* eventInfo */ js.UndefOr[SDKEventAttrs]) => Unit,
    logLink: (/* selector */ String | HTMLElement, /* eventName */ String, /* eventType */ js.UndefOr[EventType], /* eventInfo */ js.UndefOr[SDKEventAttrs]) => Unit,
    logPageView: (/* eventName */ js.UndefOr[String], /* attrs */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags], /* eventOptions */ js.UndefOr[SDKEventOptions]) => Unit,
    ready: /* callback */ js.Function0[Unit] => Unit,
    reset: () => Unit,
    sessionManager: typings.mparticleWebSdk.anon.GetSession,
    setAppName: /* name */ String => Unit,
    setAppVersion: /* version */ String => Unit,
    setDeviceId: /* uuid */ String => Unit,
    setIntegrationAttribute: (/* integrationId */ Double, /* attrs */ Record[String, Any]) => Unit,
    setLogLevel: /* newLogLevel */ verbose | warning | none => Unit,
    setOptOut: /* isOptingOut */ Boolean => Unit,
    setPosition: (/* lat */ Double, /* lng */ Double) => Unit,
    setSessionAttribute: (/* key */ String, /* value */ String | Double | Boolean | Null) => Unit,
    startNewSession: () => Unit,
    startTrackingLocation: /* callback */ js.UndefOr[TrackLocationCallback] => Unit,
    stopTrackingLocation: () => Unit,
    upload: () => Unit
  ): mParticleInstance = {
    val __obj = js.Dynamic.literal(CommerceEventType = CommerceEventType.asInstanceOf[js.Any], Consent = Consent.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any], IdentityType = IdentityType.asInstanceOf[js.Any], ProductActionType = ProductActionType.asInstanceOf[js.Any], PromotionType = PromotionType.asInstanceOf[js.Any], eCommerce = eCommerce.asInstanceOf[js.Any], endSession = js.Any.fromFunction0(endSession), getAppName = js.Any.fromFunction0(getAppName), getAppVersion = js.Any.fromFunction0(getAppVersion), getDeviceId = js.Any.fromFunction0(getDeviceId), getIntegrationAttributes = js.Any.fromFunction1(getIntegrationAttributes), getVersion = js.Any.fromFunction0(getVersion), init = js.Any.fromFunction3(init), isInitialized = js.Any.fromFunction0(isInitialized), logBaseEvent = js.Any.fromFunction2(logBaseEvent), logError = js.Any.fromFunction2(logError), logEvent = js.Any.fromFunction5(logEvent), logForm = js.Any.fromFunction4(logForm), logLink = js.Any.fromFunction4(logLink), logPageView = js.Any.fromFunction4(logPageView), ready = js.Any.fromFunction1(ready), reset = js.Any.fromFunction0(reset), sessionManager = sessionManager.asInstanceOf[js.Any], setAppName = js.Any.fromFunction1(setAppName), setAppVersion = js.Any.fromFunction1(setAppVersion), setDeviceId = js.Any.fromFunction1(setDeviceId), setIntegrationAttribute = js.Any.fromFunction2(setIntegrationAttribute), setLogLevel = js.Any.fromFunction1(setLogLevel), setOptOut = js.Any.fromFunction1(setOptOut), setPosition = js.Any.fromFunction2(setPosition), setSessionAttribute = js.Any.fromFunction2(setSessionAttribute), startNewSession = js.Any.fromFunction0(startNewSession), startTrackingLocation = js.Any.fromFunction1(startTrackingLocation), stopTrackingLocation = js.Any.fromFunction0(stopTrackingLocation), upload = js.Any.fromFunction0(upload))
    __obj.asInstanceOf[mParticleInstance]
  }
  
  extension [Self <: mParticleInstance](x: Self) {
    
    inline def setCommerceEventType(value: ProductAddToCart): Self = StObject.set(x, "CommerceEventType", value.asInstanceOf[js.Any])
    
    inline def setConsent(value: typings.mparticleWebSdk.anon.CreateCCPAConsent): Self = StObject.set(x, "Consent", value.asInstanceOf[js.Any])
    
    inline def setECommerce(value: typings.mparticleWebSdk.anon.Cart): Self = StObject.set(x, "eCommerce", value.asInstanceOf[js.Any])
    
    inline def setEndSession(value: () => Unit): Self = StObject.set(x, "endSession", js.Any.fromFunction0(value))
    
    inline def setEventType(value: typings.mparticleWebSdk.anon.Location): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setGetAppName(value: () => String): Self = StObject.set(x, "getAppName", js.Any.fromFunction0(value))
    
    inline def setGetAppVersion(value: () => String): Self = StObject.set(x, "getAppVersion", js.Any.fromFunction0(value))
    
    inline def setGetDeviceId(value: () => String): Self = StObject.set(x, "getDeviceId", js.Any.fromFunction0(value))
    
    inline def setGetIntegrationAttributes(value: /* integrationId */ Double => Record[String, Any]): Self = StObject.set(x, "getIntegrationAttributes", js.Any.fromFunction1(value))
    
    inline def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
    
    inline def setIdentity(value: typings.mparticleWebSdk.anon.AliasUsers): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityType(value: CustomerId): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    inline def setInit(
      value: (/* apiKey */ String, /* config */ MPConfiguration, /* instanceName */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    inline def setIsInitialized(value: () => Boolean): Self = StObject.set(x, "isInitialized", js.Any.fromFunction0(value))
    
    inline def setLogBaseEvent(value: (/* event */ BaseEvent, /* eventOptions */ js.UndefOr[SDKEventOptions]) => Unit): Self = StObject.set(x, "logBaseEvent", js.Any.fromFunction2(value))
    
    inline def setLogError(value: (/* error */ String | errorObject, /* attrs */ js.UndefOr[SDKEventAttrs]) => Unit): Self = StObject.set(x, "logError", js.Any.fromFunction2(value))
    
    inline def setLogEvent(
      value: (/* eventName */ String, /* eventType */ js.UndefOr[EventType], /* eventInfo */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags], /* eventOptions */ js.UndefOr[SDKEventOptions]) => Unit
    ): Self = StObject.set(x, "logEvent", js.Any.fromFunction5(value))
    
    inline def setLogForm(
      value: (/* selector */ String | HTMLElement, /* eventName */ String, /* eventType */ js.UndefOr[EventType], /* eventInfo */ js.UndefOr[SDKEventAttrs]) => Unit
    ): Self = StObject.set(x, "logForm", js.Any.fromFunction4(value))
    
    inline def setLogLink(
      value: (/* selector */ String | HTMLElement, /* eventName */ String, /* eventType */ js.UndefOr[EventType], /* eventInfo */ js.UndefOr[SDKEventAttrs]) => Unit
    ): Self = StObject.set(x, "logLink", js.Any.fromFunction4(value))
    
    inline def setLogPageView(
      value: (/* eventName */ js.UndefOr[String], /* attrs */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags], /* eventOptions */ js.UndefOr[SDKEventOptions]) => Unit
    ): Self = StObject.set(x, "logPageView", js.Any.fromFunction4(value))
    
    inline def setProductActionType(value: AddToCart): Self = StObject.set(x, "ProductActionType", value.asInstanceOf[js.Any])
    
    inline def setPromotionType(value: PromotionClick): Self = StObject.set(x, "PromotionType", value.asInstanceOf[js.Any])
    
    inline def setReady(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSessionManager(value: typings.mparticleWebSdk.anon.GetSession): Self = StObject.set(x, "sessionManager", value.asInstanceOf[js.Any])
    
    inline def setSetAppName(value: /* name */ String => Unit): Self = StObject.set(x, "setAppName", js.Any.fromFunction1(value))
    
    inline def setSetAppVersion(value: /* version */ String => Unit): Self = StObject.set(x, "setAppVersion", js.Any.fromFunction1(value))
    
    inline def setSetDeviceId(value: /* uuid */ String => Unit): Self = StObject.set(x, "setDeviceId", js.Any.fromFunction1(value))
    
    inline def setSetIntegrationAttribute(value: (/* integrationId */ Double, /* attrs */ Record[String, Any]) => Unit): Self = StObject.set(x, "setIntegrationAttribute", js.Any.fromFunction2(value))
    
    inline def setSetLogLevel(value: /* newLogLevel */ verbose | warning | none => Unit): Self = StObject.set(x, "setLogLevel", js.Any.fromFunction1(value))
    
    inline def setSetOptOut(value: /* isOptingOut */ Boolean => Unit): Self = StObject.set(x, "setOptOut", js.Any.fromFunction1(value))
    
    inline def setSetPosition(value: (/* lat */ Double, /* lng */ Double) => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction2(value))
    
    inline def setSetSessionAttribute(value: (/* key */ String, /* value */ String | Double | Boolean | Null) => Unit): Self = StObject.set(x, "setSessionAttribute", js.Any.fromFunction2(value))
    
    inline def setStartNewSession(value: () => Unit): Self = StObject.set(x, "startNewSession", js.Any.fromFunction0(value))
    
    inline def setStartTrackingLocation(value: /* callback */ js.UndefOr[TrackLocationCallback] => Unit): Self = StObject.set(x, "startTrackingLocation", js.Any.fromFunction1(value))
    
    inline def setStopTrackingLocation(value: () => Unit): Self = StObject.set(x, "stopTrackingLocation", js.Any.fromFunction0(value))
    
    inline def setUpload(value: () => Unit): Self = StObject.set(x, "upload", js.Any.fromFunction0(value))
  }
}
