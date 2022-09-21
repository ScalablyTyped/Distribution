package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mparticleWebSdk.anon.HttpCode
import typings.mparticleWebSdk.mod.^
import typings.mparticleWebSdk.mparticleWebSdkStrings.none
import typings.mparticleWebSdk.mparticleWebSdkStrings.verbose
import typings.mparticleWebSdk.mparticleWebSdkStrings.warning
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def endSession: EndSession_ = ^.asInstanceOf[js.Dynamic].selectDynamic("endSession").asInstanceOf[EndSession_]

inline def getAppName: GetAppName_ = ^.asInstanceOf[js.Dynamic].selectDynamic("getAppName").asInstanceOf[GetAppName_]

inline def getAppVersion: GetAppVersion_ = ^.asInstanceOf[js.Dynamic].selectDynamic("getAppVersion").asInstanceOf[GetAppVersion_]

inline def getDeviceId: GetDeviceId_ = ^.asInstanceOf[js.Dynamic].selectDynamic("getDeviceId").asInstanceOf[GetDeviceId_]

inline def getInstance(): mParticleInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[mParticleInstance]
inline def getInstance(instanceName: String): mParticleInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(instanceName.asInstanceOf[js.Any]).asInstanceOf[mParticleInstance]

inline def getIntegrationAttributes: GetIntegrationAttributes_ = ^.asInstanceOf[js.Dynamic].selectDynamic("getIntegrationAttributes").asInstanceOf[GetIntegrationAttributes_]

inline def getVersion: GetVersion_ = ^.asInstanceOf[js.Dynamic].selectDynamic("getVersion").asInstanceOf[GetVersion_]

inline def init: Init_ = ^.asInstanceOf[js.Dynamic].selectDynamic("init").asInstanceOf[Init_]

inline def isInitialized: IsInitialized_ = ^.asInstanceOf[js.Dynamic].selectDynamic("isInitialized").asInstanceOf[IsInitialized_]

inline def logBaseEvent: LogBaseEvent_ = ^.asInstanceOf[js.Dynamic].selectDynamic("logBaseEvent").asInstanceOf[LogBaseEvent_]

inline def logError: LogError_ = ^.asInstanceOf[js.Dynamic].selectDynamic("logError").asInstanceOf[LogError_]

inline def logEvent: LogEvent_ = ^.asInstanceOf[js.Dynamic].selectDynamic("logEvent").asInstanceOf[LogEvent_]

inline def logForm: LogForm_ = ^.asInstanceOf[js.Dynamic].selectDynamic("logForm").asInstanceOf[LogForm_]

inline def logLink: LogLink_ = ^.asInstanceOf[js.Dynamic].selectDynamic("logLink").asInstanceOf[LogLink_]

inline def logPageView: LogPageView_ = ^.asInstanceOf[js.Dynamic].selectDynamic("logPageView").asInstanceOf[LogPageView_]

inline def ready: Ready_ = ^.asInstanceOf[js.Dynamic].selectDynamic("ready").asInstanceOf[Ready_]

inline def reset: Reset_ = ^.asInstanceOf[js.Dynamic].selectDynamic("reset").asInstanceOf[Reset_]

inline def setAppName: SetAppName_ = ^.asInstanceOf[js.Dynamic].selectDynamic("setAppName").asInstanceOf[SetAppName_]

inline def setAppVersion: SetAppVersion_ = ^.asInstanceOf[js.Dynamic].selectDynamic("setAppVersion").asInstanceOf[SetAppVersion_]

inline def setDeviceId: SetDeviceId_ = ^.asInstanceOf[js.Dynamic].selectDynamic("setDeviceId").asInstanceOf[SetDeviceId_]

inline def setIntegrationAttribute: SetIntegrationAttribute_ = ^.asInstanceOf[js.Dynamic].selectDynamic("setIntegrationAttribute").asInstanceOf[SetIntegrationAttribute_]

inline def setLogLevel: SetLogLevel_ = ^.asInstanceOf[js.Dynamic].selectDynamic("setLogLevel").asInstanceOf[SetLogLevel_]

inline def setOptOut: SetOptOut_ = ^.asInstanceOf[js.Dynamic].selectDynamic("setOptOut").asInstanceOf[SetOptOut_]

inline def setPosition: SetPosition_ = ^.asInstanceOf[js.Dynamic].selectDynamic("setPosition").asInstanceOf[SetPosition_]

inline def setSessionAttribute: SetSessionAttribute_ = ^.asInstanceOf[js.Dynamic].selectDynamic("setSessionAttribute").asInstanceOf[SetSessionAttribute_]

inline def startNewSession: StartNewSession_ = ^.asInstanceOf[js.Dynamic].selectDynamic("startNewSession").asInstanceOf[StartNewSession_]

inline def startTrackingLocation: StartTrackingLocation_ = ^.asInstanceOf[js.Dynamic].selectDynamic("startTrackingLocation").asInstanceOf[StartTrackingLocation_]

inline def stopTrackingLocation: StopTrackingLocation_ = ^.asInstanceOf[js.Dynamic].selectDynamic("stopTrackingLocation").asInstanceOf[StopTrackingLocation_]

inline def upload: Upload_ = ^.asInstanceOf[js.Dynamic].selectDynamic("upload").asInstanceOf[Upload_]

type AliasUsers = js.Function2[
/* aliasRequest */ UserAliasRequest, 
/* callback */ js.UndefOr[AliasUsersCallback], 
Unit]

type AliasUsersCallback = js.Function1[/* result */ HttpCode, Unit]

type AllUserAttributes = Record[String, UserAttributesValue | js.Array[UserAttributesValue]]

type CCPAConsentState = PrivacyConsentState

type Callback = js.Function0[Unit]

type CreateAliasRequest = js.Function2[/* sourceUser */ User, /* destinationUser */ User, UserAliasRequest]

type CreateCCPAConsent = js.Function5[
/* consented */ Boolean, 
/* timestamp */ Double, 
/* consentDocument */ String, 
/* location */ String, 
/* hardwareId */ String, 
PrivacyConsentState]

type CreateConsentState = js.Function0[ConsentState]

type CreateGDPRConsent = js.Function5[
/* consented */ Boolean, 
/* timestamp */ Double, 
/* consentDocument */ String, 
/* location */ String, 
/* hardwareId */ String, 
PrivacyConsentState]

type CreateImpression = js.Function2[/* name */ String, /* product */ Product | js.Array[Product], Impression]

type CreateProduct = js.Function10[
/* name */ String, 
/* sku */ String, 
/* price */ Double, 
/* quantity */ js.UndefOr[Double], 
/* variant */ js.UndefOr[String], 
/* category */ js.UndefOr[String], 
/* brand */ js.UndefOr[String], 
/* position */ js.UndefOr[Double], 
/* coupon */ js.UndefOr[String], 
/* attributes */ js.UndefOr[SDKEventAttrs], 
Product]

type CreatePromotion = js.Function4[
/* id */ String, 
/* creative */ js.UndefOr[String], 
/* name */ js.UndefOr[String], 
/* position */ js.UndefOr[Double], 
Promotion]

type CreateTransactionAttributes = js.Function6[
/* id */ String | Double, 
/* affiliation */ js.UndefOr[String], 
/* couponCode */ js.UndefOr[String], 
/* revenue */ js.UndefOr[Double], 
/* shipping */ js.UndefOr[Double], 
/* tax */ js.UndefOr[Double], 
TransactionAttributes]

type EndSession_ = js.Function0[Unit]

type GDPRConsentState = StringDictionary[PrivacyConsentState]

type GetAppName_ = js.Function0[String]

type GetAppVersion_ = js.Function0[String]

type GetCurrentUser = js.Function0[User]

type GetDeviceId_ = js.Function0[String]

type GetIntegrationAttributes_ = js.Function1[/* integrationId */ Double, Record[String, Any]]

type GetSession = js.Function0[String]

type GetUser = js.Function1[/* mpid */ MPID, User]

type GetUsers = js.Function0[js.Array[User]]

type GetVersion_ = js.Function0[String]

type Identify = js.Function2[
/* identityApiData */ IdentityApiData, 
/* callback */ js.UndefOr[IdentityCallback], 
Unit]

type IdentityCallback = js.Function1[/* result */ IdentityResult, Unit]

type Init_ = js.Function3[
/* apiKey */ String, 
/* config */ MPConfiguration, 
/* instanceName */ js.UndefOr[String], 
Unit]

type IsInitialized_ = js.Function0[Boolean]

type LogBaseEvent_ = js.Function2[/* event */ BaseEvent, /* eventOptions */ js.UndefOr[SDKEventOptions], Unit]

type LogCheckout = js.Function4[
/* step */ Double, 
/* options */ js.UndefOr[String], 
/* attrs */ js.UndefOr[SDKEventAttrs], 
/* customFlags */ js.UndefOr[SDKEventCustomFlags], 
Unit]

type LogError_ = js.Function2[/* error */ String | errorObject, /* attrs */ js.UndefOr[SDKEventAttrs], Unit]

type LogEvent_ = js.Function5[
/* eventName */ String, 
/* eventType */ js.UndefOr[EventType], 
/* eventInfo */ js.UndefOr[SDKEventAttrs], 
/* customFlags */ js.UndefOr[SDKEventCustomFlags], 
/* eventOptions */ js.UndefOr[SDKEventOptions], 
Unit]

type LogForm_ = js.Function4[
/* selector */ String | HTMLElement, 
/* eventName */ String, 
/* eventType */ js.UndefOr[EventType], 
/* eventInfo */ js.UndefOr[SDKEventAttrs], 
Unit]

type LogImpression = js.Function4[
/* impression */ js.Array[Impression] | Impression, 
/* attrs */ js.UndefOr[Record[String, Any]], 
/* customFlags */ js.UndefOr[Record[String, Any]], 
/* eventOptions */ js.UndefOr[SDKEventOptions], 
Unit]

type LogLink_ = js.Function4[
/* selector */ String | HTMLElement, 
/* eventName */ String, 
/* eventType */ js.UndefOr[EventType], 
/* eventInfo */ js.UndefOr[SDKEventAttrs], 
Unit]

type LogPageView_ = js.Function4[
/* eventName */ js.UndefOr[String], 
/* attrs */ js.UndefOr[SDKEventAttrs], 
/* customFlags */ js.UndefOr[SDKEventCustomFlags], 
/* eventOptions */ js.UndefOr[SDKEventOptions], 
Unit]

type LogProductAction = js.Function6[
/* productActionType */ ProductActionType, 
/* product */ js.Array[Product] | Product, 
/* attrs */ js.UndefOr[SDKEventAttrs], 
/* customFlags */ js.UndefOr[SDKEventCustomFlags], 
/* transactionAttributes */ js.UndefOr[TransactionAttributes], 
/* eventOptions */ js.UndefOr[SDKEventOptions], 
Unit]

type LogPromotion = js.Function5[
/* type */ Double, 
/* promotion */ js.Array[Promotion] | Promotion, 
/* attrs */ js.UndefOr[SDKEventAttrs], 
/* customFlags */ js.UndefOr[SDKEventCustomFlags], 
/* eventOptions */ js.UndefOr[SDKEventOptions], 
Unit]

type LogPurchase = js.Function5[
/* transactionAttributes */ TransactionAttributes, 
/* product */ js.Array[Product] | Product, 
/* clearCart */ Boolean, 
/* attrs */ Record[String, Any], 
/* customFlags */ Record[String, Any], 
Unit]

type LogRefund = js.Function5[
/* transactionAttributes */ TransactionAttributes, 
/* product */ js.Array[Product] | Product, 
/* clearCart */ Boolean, 
/* attrs */ Record[String, Any], 
/* customFlags */ Record[String, Any], 
Unit]

type Login = js.Function2[
/* identityApiData */ IdentityApiData, 
/* callback */ js.UndefOr[IdentityCallback], 
Unit]

type Logout = js.Function2[
/* identityApiData */ js.UndefOr[IdentityApiData | js.Object | Null], 
/* callback */ js.UndefOr[IdentityCallback], 
Unit]

type MPID = String

type Modify = js.Function2[
/* identityApiData */ IdentityApiData, 
/* callback */ js.UndefOr[IdentityCallback], 
Unit]

type Ready_ = js.Function1[/* callback */ js.Function0[Unit], Unit]

type Reset_ = js.Function0[Unit]

type SDKEventAttrTypes = js.UndefOr[Double | String | Boolean | Null]

type SDKEventAttrs = StringDictionary[SDKEventAttrTypes]

type SDKEventCustomFlags = StringDictionary[Double | String | Boolean | js.Array[Any] | (Record[String, Any])]

type SetAppName_ = js.Function1[/* name */ String, Unit]

type SetAppVersion_ = js.Function1[/* version */ String, Unit]

type SetCurrencyCode = js.Function1[/* code */ String, Unit]

type SetDeviceId_ = js.Function1[/* uuid */ String, Unit]

type SetIntegrationAttribute_ = js.Function2[/* integrationId */ Double, /* attrs */ Record[String, Any], Unit]

type SetLogLevel_ = js.Function1[/* newLogLevel */ verbose | warning | none, Unit]

type SetOptOut_ = js.Function1[/* isOptingOut */ Boolean, Unit]

type SetPosition_ = js.Function2[/* lat */ Double, /* lng */ Double, Unit]

type SetSessionAttribute_ = js.Function2[/* key */ String, /* value */ String | Double | Boolean | Null, Unit]

type StartNewSession_ = js.Function0[Unit]

type StartTrackingLocation_ = js.Function1[/* callback */ js.UndefOr[TrackLocationCallback], Unit]

type StopTrackingLocation_ = js.Function0[Unit]

type TrackLocationCallback = js.Function1[/* location */ Location, Unit]

type Upload_ = js.Function0[Unit]

type UserAttributesValue = String | Double | Boolean | Null

type integrationAttributeAttrs = StringDictionary[String]

type onCreateBatch = js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Batch */ /* batch */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Batch */ Any]
