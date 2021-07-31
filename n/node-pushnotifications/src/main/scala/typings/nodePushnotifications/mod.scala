package typings.nodePushnotifications

import org.scalablytyped.runtime.StringDictionary
import typings.nodePushnotifications.anon.AccessToken
import typings.nodePushnotifications.anon.Address
import typings.nodePushnotifications.anon.Clientid
import typings.nodePushnotifications.anon.Id
import typings.nodePushnotifications.anon.Options
import typings.std.Error
import typings.webPush.mod.PushSubscription
import typings.webPush.mod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-pushnotifications", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with PushNotifications {
    def this(settings: Settings) = this()
  }
  
  type Callback = js.Function2[/* err */ js.Any, /* result */ js.Any, Unit]
  
  trait Data extends StObject {
    
    /** apn and gcm for ios */
    var action: js.UndefOr[String] = js.undefined
    
    /** apn, will take precedence over title and body. It is also accepted a text message in alert */
    var alert: js.UndefOr[js.Object | String] = js.undefined
    
    /** gcm for ios, apn */
    var badge: js.UndefOr[Double] = js.undefined
    
    /** REQUIRED */
    var body: String
    
    /** gcm, apn */
    var bodyLocArgs: js.UndefOr[String] = js.undefined
    
    /** apn and gcm for ios */
    var category: js.UndefOr[String] = js.undefined
    
    /** gcm for android. In ios, category will be used if not supplied */
    var clickAction: js.UndefOr[String] = js.undefined
    
    /** gcm for android, used as collapseId in apn */
    var collapseKey: js.UndefOr[String] = js.undefined
    
    /** gcm for android */
    var color: js.UndefOr[String] = js.undefined
    
    /** ADM */
    var consolidationKey: js.UndefOr[String] = js.undefined
    
    /** gcm for android */
    var contentAvailable: js.UndefOr[Boolean | String] = js.undefined
    
    var custom: js.UndefOr[(StringDictionary[String | Double]) | String] = js.undefined
    
    /** gcm for android */
    var delayWhileIdle: js.UndefOr[Boolean] = js.undefined
    
    /** gcm for android */
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    /** wns */
    var duration: js.UndefOr[String] = js.undefined
    
    /** apn */
    var encoding: js.UndefOr[String] = js.undefined
    
    /** seconds */
    var expiry: js.UndefOr[Double] = js.undefined
    
    /** wns */
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    /** gcm for android */
    var icon: js.UndefOr[String] = js.undefined
    
    /** wns */
    var launch: js.UndefOr[String] = js.undefined
    
    /** apn and gcm for ios */
    var launchImage: js.UndefOr[String] = js.undefined
    
    /** gcm, apn */
    var locKey: js.UndefOr[String] = js.undefined
    
    /** apn and gcm for ios */
    var mdm: js.UndefOr[String] = js.undefined
    
    /** apn */
    var mutableContent: js.UndefOr[Double] = js.undefined
    
    /**
      * gcm, apn. Supported values are 'high' or 'normal' (gcm). Will be translated to 10 and 5 for apn. Defaults
      * to 'high'
      */
    var priority: js.UndefOr[String] = js.undefined
    
    /** gcm for android */
    var restrictedPackageName: js.UndefOr[String] = js.undefined
    
    /** gcm, apn */
    var retries: js.UndefOr[Double] = js.undefined
    
    /** gcm, apn */
    var sound: js.UndefOr[String] = js.undefined
    
    /** gcm for android */
    var tag: js.UndefOr[String] = js.undefined
    
    /** if both expiry and timeToLive are given, expiry will take precedency */
    var timeToLive: js.UndefOr[Double] = js.undefined
    
    /** REQUIRED */
    var title: String
    
    /** gcm, apn */
    var titleLocArgs: js.UndefOr[String] = js.undefined
    
    /** gcm, apn */
    var titleLocKey: js.UndefOr[String] = js.undefined
    
    /** apn and gcm for ios */
    var topic: js.UndefOr[String] = js.undefined
    
    /** apn and gcm for ios */
    var truncateAtWordEnd: js.UndefOr[Boolean] = js.undefined
    
    /** apn and gcm for ios */
    var urlArgs: js.UndefOr[String] = js.undefined
  }
  object Data {
    
    @scala.inline
    def apply(body: String, title: String): Data = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAlert(value: js.Object | String): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      @scala.inline
      def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyLocArgs(value: String): Self = StObject.set(x, "bodyLocArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyLocArgsUndefined: Self = StObject.set(x, "bodyLocArgs", js.undefined)
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setClickAction(value: String): Self = StObject.set(x, "clickAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickActionUndefined: Self = StObject.set(x, "clickAction", js.undefined)
      
      @scala.inline
      def setCollapseKey(value: String): Self = StObject.set(x, "collapseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseKeyUndefined: Self = StObject.set(x, "collapseKey", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setConsolidationKey(value: String): Self = StObject.set(x, "consolidationKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsolidationKeyUndefined: Self = StObject.set(x, "consolidationKey", js.undefined)
      
      @scala.inline
      def setContentAvailable(value: Boolean | String): Self = StObject.set(x, "contentAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentAvailableUndefined: Self = StObject.set(x, "contentAvailable", js.undefined)
      
      @scala.inline
      def setCustom(value: (StringDictionary[String | Double]) | String): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setDelayWhileIdle(value: Boolean): Self = StObject.set(x, "delayWhileIdle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayWhileIdleUndefined: Self = StObject.set(x, "delayWhileIdle", js.undefined)
      
      @scala.inline
      def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLaunch(value: String): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchImage(value: String): Self = StObject.set(x, "launchImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchImageUndefined: Self = StObject.set(x, "launchImage", js.undefined)
      
      @scala.inline
      def setLaunchUndefined: Self = StObject.set(x, "launch", js.undefined)
      
      @scala.inline
      def setLocKey(value: String): Self = StObject.set(x, "locKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocKeyUndefined: Self = StObject.set(x, "locKey", js.undefined)
      
      @scala.inline
      def setMdm(value: String): Self = StObject.set(x, "mdm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdmUndefined: Self = StObject.set(x, "mdm", js.undefined)
      
      @scala.inline
      def setMutableContent(value: Double): Self = StObject.set(x, "mutableContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutableContentUndefined: Self = StObject.set(x, "mutableContent", js.undefined)
      
      @scala.inline
      def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setRestrictedPackageName(value: String): Self = StObject.set(x, "restrictedPackageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictedPackageNameUndefined: Self = StObject.set(x, "restrictedPackageName", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLocArgs(value: String): Self = StObject.set(x, "titleLocArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLocArgsUndefined: Self = StObject.set(x, "titleLocArgs", js.undefined)
      
      @scala.inline
      def setTitleLocKey(value: String): Self = StObject.set(x, "titleLocKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLocKeyUndefined: Self = StObject.set(x, "titleLocKey", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
      
      @scala.inline
      def setTruncateAtWordEnd(value: Boolean): Self = StObject.set(x, "truncateAtWordEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateAtWordEndUndefined: Self = StObject.set(x, "truncateAtWordEnd", js.undefined)
      
      @scala.inline
      def setUrlArgs(value: String): Self = StObject.set(x, "urlArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlArgsUndefined: Self = StObject.set(x, "urlArgs", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    var error: js.UndefOr[Error | Null] = js.undefined
    
    var errorMsg: js.UndefOr[String] = js.undefined
    
    var messageId: js.UndefOr[String] = js.undefined
    
    var originalRegId: js.UndefOr[String] = js.undefined
    
    var regId: String
  }
  object Message {
    
    @scala.inline
    def apply(regId: String): Message = {
      val __obj = js.Dynamic.literal(regId = regId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMsgUndefined: Self = StObject.set(x, "errorMsg", js.undefined)
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      @scala.inline
      def setOriginalRegId(value: String): Self = StObject.set(x, "originalRegId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalRegIdUndefined: Self = StObject.set(x, "originalRegId", js.undefined)
      
      @scala.inline
      def setRegId(value: String): Self = StObject.set(x, "regId", value.asInstanceOf[js.Any])
    }
  }
  
  type PushMethod = js.Function3[/* regIds */ js.Array[String], /* data */ Data, /* settings */ Settings, Unit]
  
  @js.native
  trait PushNotifications extends StObject {
    
    def send(registrationIds: js.Array[RegistrationId], data: Data): js.Promise[js.Array[Result]] = js.native
    def send(registrationIds: js.Array[RegistrationId], data: Data, cb: Callback): Unit = js.native
    def send(registrationIds: RegistrationId, data: Data): js.Promise[js.Array[Result]] = js.native
    def send(registrationIds: RegistrationId, data: Data, cb: Callback): Unit = js.native
    
    def sendWith(method: PushMethod, regIds: js.Array[String], data: Data, cb: Callback): Unit = js.native
    
    def setOptions(opts: Settings): Unit = js.native
  }
  
  type RegistrationId = String | PushSubscription
  
  trait Result extends StObject {
    
    var failure: Double
    
    var message: js.Array[Message]
    
    var method: String
    
    var success: Double
  }
  object Result {
    
    @scala.inline
    def apply(failure: Double, message: js.Array[Message], method: String, success: Double): Result = {
      val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailure(value: Double): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: js.Array[Message]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageVarargs(value: Message*): Self = StObject.set(x, "message", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Double): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait Settings extends StObject {
    
    /** Amazon Device Messaging */
    var adm: js.UndefOr[Clientid] = js.undefined
    
    /** Apple Push Notifications */
    var apn: js.UndefOr[Address] = js.undefined
    
    /** Google Cloud Messaging  */
    var gcm: js.UndefOr[Id] = js.undefined
    
    /** Always use FCM? */
    var isAlwaysUseFCM: js.UndefOr[Boolean] = js.undefined
    
    /** Microsoft Push Notification Service */
    var mpns: js.UndefOr[Options] = js.undefined
    
    /** Web */
    var web: js.UndefOr[RequestOptions] = js.undefined
    
    /** Windows Push Notifications */
    var wns: js.UndefOr[AccessToken] = js.undefined
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdm(value: Clientid): Self = StObject.set(x, "adm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdmUndefined: Self = StObject.set(x, "adm", js.undefined)
      
      @scala.inline
      def setApn(value: Address): Self = StObject.set(x, "apn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApnUndefined: Self = StObject.set(x, "apn", js.undefined)
      
      @scala.inline
      def setGcm(value: Id): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGcmUndefined: Self = StObject.set(x, "gcm", js.undefined)
      
      @scala.inline
      def setIsAlwaysUseFCM(value: Boolean): Self = StObject.set(x, "isAlwaysUseFCM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlwaysUseFCMUndefined: Self = StObject.set(x, "isAlwaysUseFCM", js.undefined)
      
      @scala.inline
      def setMpns(value: Options): Self = StObject.set(x, "mpns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMpnsUndefined: Self = StObject.set(x, "mpns", js.undefined)
      
      @scala.inline
      def setWeb(value: RequestOptions): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
      
      @scala.inline
      def setWns(value: AccessToken): Self = StObject.set(x, "wns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWnsUndefined: Self = StObject.set(x, "wns", js.undefined)
    }
  }
}
