package typings.nodeGcm

import org.scalablytyped.runtime.StringDictionary
import typings.nodeGcm.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-gcm", "Message")
  @js.native
  class Message () extends StObject {
    def this(options: IMessageOptions) = this()
    
    def addData(data: StringDictionary[String]): Unit = js.native
    def addData(key: String, value: String): Unit = js.native
    
    def addNotification(key: String, value: INotificationOptions): Unit = js.native
    def addNotification(value: INotificationOptions): Unit = js.native
    
    var collapseKey: String = js.native
    
    var delayWhileIdle: Boolean = js.native
    
    var dryRun: Boolean = js.native
    
    var timeToLive: Double = js.native
  }
  
  @JSImport("node-gcm", "Sender")
  @js.native
  class Sender protected () extends StObject {
    def this(key: String) = this()
    def this(key: String, options: ISenderOptions) = this()
    
    var key: String = js.native
    
    var options: ISenderOptions = js.native
    
    def send(
      message: Message,
      registrationIds: String,
      callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
    ): Unit = js.native
    def send(
      message: Message,
      registrationIds: String,
      options: ISenderSendOptions,
      callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
    ): Unit = js.native
    def send(
      message: Message,
      registrationIds: String,
      retries: Double,
      callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
    ): Unit = js.native
    def send(
      message: Message,
      registrationIds: js.Array[String],
      callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
    ): Unit = js.native
    def send(
      message: Message,
      registrationIds: js.Array[String],
      options: ISenderSendOptions,
      callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
    ): Unit = js.native
    def send(
      message: Message,
      registrationIds: js.Array[String],
      retries: Double,
      callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
    ): Unit = js.native
    def send(
      message: Message,
      registrationIds: IRecipient,
      callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
    ): Unit = js.native
    def send(
      message: Message,
      registrationIds: IRecipient,
      options: ISenderSendOptions,
      callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
    ): Unit = js.native
    def send(
      message: Message,
      registrationIds: IRecipient,
      retries: Double,
      callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
    ): Unit = js.native
    
    def sendNoRetry(
      message: Message,
      registrationIds: String,
      callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
    ): Unit = js.native
    def sendNoRetry(
      message: Message,
      registrationIds: js.Array[String],
      callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
    ): Unit = js.native
    def sendNoRetry(
      message: Message,
      registrationIds: IRecipient,
      callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
    ): Unit = js.native
  }
  
  trait IMessageOptions extends StObject {
    
    var collapseKey: js.UndefOr[String] = js.undefined
    
    var contentAvailable: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var delayWhileIdle: js.UndefOr[Boolean] = js.undefined
    
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    var mutableContent: js.UndefOr[Boolean] = js.undefined
    
    var notification: js.UndefOr[INotificationOptions] = js.undefined
    
    var priority: js.UndefOr[String] = js.undefined
    
    var restrictedPackageName: js.UndefOr[String] = js.undefined
    
    var timeToLive: js.UndefOr[Double] = js.undefined
  }
  object IMessageOptions {
    
    inline def apply(): IMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMessageOptions]
    }
    
    extension [Self <: IMessageOptions](x: Self) {
      
      inline def setCollapseKey(value: String): Self = StObject.set(x, "collapseKey", value.asInstanceOf[js.Any])
      
      inline def setCollapseKeyUndefined: Self = StObject.set(x, "collapseKey", js.undefined)
      
      inline def setContentAvailable(value: Boolean): Self = StObject.set(x, "contentAvailable", value.asInstanceOf[js.Any])
      
      inline def setContentAvailableUndefined: Self = StObject.set(x, "contentAvailable", js.undefined)
      
      inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDelayWhileIdle(value: Boolean): Self = StObject.set(x, "delayWhileIdle", value.asInstanceOf[js.Any])
      
      inline def setDelayWhileIdleUndefined: Self = StObject.set(x, "delayWhileIdle", js.undefined)
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setMutableContent(value: Boolean): Self = StObject.set(x, "mutableContent", value.asInstanceOf[js.Any])
      
      inline def setMutableContentUndefined: Self = StObject.set(x, "mutableContent", js.undefined)
      
      inline def setNotification(value: INotificationOptions): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
      
      inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setRestrictedPackageName(value: String): Self = StObject.set(x, "restrictedPackageName", value.asInstanceOf[js.Any])
      
      inline def setRestrictedPackageNameUndefined: Self = StObject.set(x, "restrictedPackageName", js.undefined)
      
      inline def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
    }
  }
  
  trait INotificationOptions extends StObject {
    
    var badge: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var body_loc_args: js.UndefOr[String] = js.undefined
    
    var body_loc_key: js.UndefOr[String] = js.undefined
    
    var click_action: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var icon: String
    
    var sound: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var title: String
    
    var title_loc_args: js.UndefOr[String] = js.undefined
    
    var title_loc_key: js.UndefOr[String] = js.undefined
  }
  object INotificationOptions {
    
    inline def apply(icon: String, title: String): INotificationOptions = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotificationOptions]
    }
    
    extension [Self <: INotificationOptions](x: Self) {
      
      inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBody_loc_args(value: String): Self = StObject.set(x, "body_loc_args", value.asInstanceOf[js.Any])
      
      inline def setBody_loc_argsUndefined: Self = StObject.set(x, "body_loc_args", js.undefined)
      
      inline def setBody_loc_key(value: String): Self = StObject.set(x, "body_loc_key", value.asInstanceOf[js.Any])
      
      inline def setBody_loc_keyUndefined: Self = StObject.set(x, "body_loc_key", js.undefined)
      
      inline def setClick_action(value: String): Self = StObject.set(x, "click_action", value.asInstanceOf[js.Any])
      
      inline def setClick_actionUndefined: Self = StObject.set(x, "click_action", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitle_loc_args(value: String): Self = StObject.set(x, "title_loc_args", value.asInstanceOf[js.Any])
      
      inline def setTitle_loc_argsUndefined: Self = StObject.set(x, "title_loc_args", js.undefined)
      
      inline def setTitle_loc_key(value: String): Self = StObject.set(x, "title_loc_key", value.asInstanceOf[js.Any])
      
      inline def setTitle_loc_keyUndefined: Self = StObject.set(x, "title_loc_key", js.undefined)
    }
  }
  
  trait IRecipient extends StObject {
    
    var condition: js.UndefOr[String] = js.undefined
    
    var notificationKey: js.UndefOr[String] = js.undefined
    
    var registrationIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var registrationTokens: js.UndefOr[js.Array[String]] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object IRecipient {
    
    inline def apply(): IRecipient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRecipient]
    }
    
    extension [Self <: IRecipient](x: Self) {
      
      inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setNotificationKey(value: String): Self = StObject.set(x, "notificationKey", value.asInstanceOf[js.Any])
      
      inline def setNotificationKeyUndefined: Self = StObject.set(x, "notificationKey", js.undefined)
      
      inline def setRegistrationIds(value: js.Array[String]): Self = StObject.set(x, "registrationIds", value.asInstanceOf[js.Any])
      
      inline def setRegistrationIdsUndefined: Self = StObject.set(x, "registrationIds", js.undefined)
      
      inline def setRegistrationIdsVarargs(value: String*): Self = StObject.set(x, "registrationIds", js.Array(value :_*))
      
      inline def setRegistrationTokens(value: js.Array[String]): Self = StObject.set(x, "registrationTokens", value.asInstanceOf[js.Any])
      
      inline def setRegistrationTokensUndefined: Self = StObject.set(x, "registrationTokens", js.undefined)
      
      inline def setRegistrationTokensVarargs(value: String*): Self = StObject.set(x, "registrationTokens", js.Array(value :_*))
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  trait IResponseBody extends StObject {
    
    var canonical_ids: Double
    
    var failure: Double
    
    var multicast_id: js.UndefOr[Double] = js.undefined
    
    var results: js.UndefOr[js.Array[Error]] = js.undefined
    
    var success: Double
  }
  object IResponseBody {
    
    inline def apply(canonical_ids: Double, failure: Double, success: Double): IResponseBody = {
      val __obj = js.Dynamic.literal(canonical_ids = canonical_ids.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponseBody]
    }
    
    extension [Self <: IResponseBody](x: Self) {
      
      inline def setCanonical_ids(value: Double): Self = StObject.set(x, "canonical_ids", value.asInstanceOf[js.Any])
      
      inline def setFailure(value: Double): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      inline def setMulticast_id(value: Double): Self = StObject.set(x, "multicast_id", value.asInstanceOf[js.Any])
      
      inline def setMulticast_idUndefined: Self = StObject.set(x, "multicast_id", js.undefined)
      
      inline def setResults(value: js.Array[Error]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setResultsVarargs(value: Error*): Self = StObject.set(x, "results", js.Array(value :_*))
      
      inline def setSuccess(value: Double): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISenderOptions extends StObject {
    
    var maxSockets: js.UndefOr[Double] = js.undefined
    
    var proxy: js.UndefOr[js.Any] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ISenderOptions {
    
    inline def apply(): ISenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISenderOptions]
    }
    
    extension [Self <: ISenderOptions](x: Self) {
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait ISenderSendOptions extends StObject {
    
    var backoff: js.UndefOr[Double] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
  }
  object ISenderSendOptions {
    
    inline def apply(): ISenderSendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISenderSendOptions]
    }
    
    extension [Self <: ISenderSendOptions](x: Self) {
      
      inline def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
}
