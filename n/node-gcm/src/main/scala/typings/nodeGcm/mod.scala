package typings.nodeGcm

import org.scalablytyped.runtime.StringDictionary
import typings.nodeGcm.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait IMessageOptions extends StObject {
    
    var collapseKey: js.UndefOr[String] = js.native
    
    var contentAvailable: js.UndefOr[Boolean] = js.native
    
    var data: js.UndefOr[StringDictionary[String]] = js.native
    
    var delayWhileIdle: js.UndefOr[Boolean] = js.native
    
    var dryRun: js.UndefOr[Boolean] = js.native
    
    var mutableContent: js.UndefOr[Boolean] = js.native
    
    var notification: js.UndefOr[INotificationOptions] = js.native
    
    var priority: js.UndefOr[String] = js.native
    
    var restrictedPackageName: js.UndefOr[String] = js.native
    
    var timeToLive: js.UndefOr[Double] = js.native
  }
  object IMessageOptions {
    
    @scala.inline
    def apply(): IMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMessageOptions]
    }
    
    @scala.inline
    implicit class IMessageOptionsMutableBuilder[Self <: IMessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseKey(value: String): Self = StObject.set(x, "collapseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseKeyUndefined: Self = StObject.set(x, "collapseKey", js.undefined)
      
      @scala.inline
      def setContentAvailable(value: Boolean): Self = StObject.set(x, "contentAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentAvailableUndefined: Self = StObject.set(x, "contentAvailable", js.undefined)
      
      @scala.inline
      def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDelayWhileIdle(value: Boolean): Self = StObject.set(x, "delayWhileIdle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayWhileIdleUndefined: Self = StObject.set(x, "delayWhileIdle", js.undefined)
      
      @scala.inline
      def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      @scala.inline
      def setMutableContent(value: Boolean): Self = StObject.set(x, "mutableContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutableContentUndefined: Self = StObject.set(x, "mutableContent", js.undefined)
      
      @scala.inline
      def setNotification(value: INotificationOptions): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
      
      @scala.inline
      def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setRestrictedPackageName(value: String): Self = StObject.set(x, "restrictedPackageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictedPackageNameUndefined: Self = StObject.set(x, "restrictedPackageName", js.undefined)
      
      @scala.inline
      def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
    }
  }
  
  @js.native
  trait INotificationOptions extends StObject {
    
    var badge: js.UndefOr[String] = js.native
    
    var body: js.UndefOr[String] = js.native
    
    var body_loc_args: js.UndefOr[String] = js.native
    
    var body_loc_key: js.UndefOr[String] = js.native
    
    var click_action: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var icon: String = js.native
    
    var sound: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var title: String = js.native
    
    var title_loc_args: js.UndefOr[String] = js.native
    
    var title_loc_key: js.UndefOr[String] = js.native
  }
  object INotificationOptions {
    
    @scala.inline
    def apply(icon: String, title: String): INotificationOptions = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotificationOptions]
    }
    
    @scala.inline
    implicit class INotificationOptionsMutableBuilder[Self <: INotificationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setBody_loc_args(value: String): Self = StObject.set(x, "body_loc_args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody_loc_argsUndefined: Self = StObject.set(x, "body_loc_args", js.undefined)
      
      @scala.inline
      def setBody_loc_key(value: String): Self = StObject.set(x, "body_loc_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody_loc_keyUndefined: Self = StObject.set(x, "body_loc_key", js.undefined)
      
      @scala.inline
      def setClick_action(value: String): Self = StObject.set(x, "click_action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClick_actionUndefined: Self = StObject.set(x, "click_action", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle_loc_args(value: String): Self = StObject.set(x, "title_loc_args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle_loc_argsUndefined: Self = StObject.set(x, "title_loc_args", js.undefined)
      
      @scala.inline
      def setTitle_loc_key(value: String): Self = StObject.set(x, "title_loc_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle_loc_keyUndefined: Self = StObject.set(x, "title_loc_key", js.undefined)
    }
  }
  
  @js.native
  trait IRecipient extends StObject {
    
    var condition: js.UndefOr[String] = js.native
    
    var notificationKey: js.UndefOr[String] = js.native
    
    var registrationIds: js.UndefOr[js.Array[String]] = js.native
    
    var registrationTokens: js.UndefOr[js.Array[String]] = js.native
    
    var to: js.UndefOr[String] = js.native
    
    var topic: js.UndefOr[String] = js.native
  }
  object IRecipient {
    
    @scala.inline
    def apply(): IRecipient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRecipient]
    }
    
    @scala.inline
    implicit class IRecipientMutableBuilder[Self <: IRecipient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setNotificationKey(value: String): Self = StObject.set(x, "notificationKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationKeyUndefined: Self = StObject.set(x, "notificationKey", js.undefined)
      
      @scala.inline
      def setRegistrationIds(value: js.Array[String]): Self = StObject.set(x, "registrationIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationIdsUndefined: Self = StObject.set(x, "registrationIds", js.undefined)
      
      @scala.inline
      def setRegistrationIdsVarargs(value: String*): Self = StObject.set(x, "registrationIds", js.Array(value :_*))
      
      @scala.inline
      def setRegistrationTokens(value: js.Array[String]): Self = StObject.set(x, "registrationTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationTokensUndefined: Self = StObject.set(x, "registrationTokens", js.undefined)
      
      @scala.inline
      def setRegistrationTokensVarargs(value: String*): Self = StObject.set(x, "registrationTokens", js.Array(value :_*))
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  @js.native
  trait IResponseBody extends StObject {
    
    var canonical_ids: Double = js.native
    
    var failure: Double = js.native
    
    var multicast_id: js.UndefOr[Double] = js.native
    
    var results: js.UndefOr[js.Array[Error]] = js.native
    
    var success: Double = js.native
  }
  object IResponseBody {
    
    @scala.inline
    def apply(canonical_ids: Double, failure: Double, success: Double): IResponseBody = {
      val __obj = js.Dynamic.literal(canonical_ids = canonical_ids.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponseBody]
    }
    
    @scala.inline
    implicit class IResponseBodyMutableBuilder[Self <: IResponseBody] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanonical_ids(value: Double): Self = StObject.set(x, "canonical_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure(value: Double): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulticast_id(value: Double): Self = StObject.set(x, "multicast_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulticast_idUndefined: Self = StObject.set(x, "multicast_id", js.undefined)
      
      @scala.inline
      def setResults(value: js.Array[Error]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setResultsVarargs(value: Error*): Self = StObject.set(x, "results", js.Array(value :_*))
      
      @scala.inline
      def setSuccess(value: Double): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISenderOptions extends StObject {
    
    var maxSockets: js.UndefOr[Double] = js.native
    
    var proxy: js.UndefOr[js.Any] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object ISenderOptions {
    
    @scala.inline
    def apply(): ISenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISenderOptions]
    }
    
    @scala.inline
    implicit class ISenderOptionsMutableBuilder[Self <: ISenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      @scala.inline
      def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait ISenderSendOptions extends StObject {
    
    var backoff: js.UndefOr[Double] = js.native
    
    var retries: js.UndefOr[Double] = js.native
  }
  object ISenderSendOptions {
    
    @scala.inline
    def apply(): ISenderSendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISenderSendOptions]
    }
    
    @scala.inline
    implicit class ISenderSendOptionsMutableBuilder[Self <: ISenderSendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
}
