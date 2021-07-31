package typings.phonegapPluginPush

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.phonegapPluginPush.anon.Alert
import typings.phonegapPluginPush.anon.ApplicationServerKey
import typings.phonegapPluginPush.anon.ClearBadge
import typings.phonegapPluginPush.phonegapPluginPushStrings.error
import typings.phonegapPluginPush.phonegapPluginPushStrings.notification
import typings.phonegapPluginPush.phonegapPluginPushStrings.registration
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PhonegapPluginPush {
  
  trait CategoryAction extends StObject {
    
    var maybe: js.UndefOr[CategoryActionData] = js.undefined
    
    var no: js.UndefOr[CategoryActionData] = js.undefined
    
    var yes: js.UndefOr[CategoryActionData] = js.undefined
  }
  object CategoryAction {
    
    @scala.inline
    def apply(): CategoryAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CategoryAction]
    }
    
    @scala.inline
    implicit class CategoryActionMutableBuilder[Self <: CategoryAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaybe(value: CategoryActionData): Self = StObject.set(x, "maybe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaybeUndefined: Self = StObject.set(x, "maybe", js.undefined)
      
      @scala.inline
      def setNo(value: CategoryActionData): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUndefined: Self = StObject.set(x, "no", js.undefined)
      
      @scala.inline
      def setYes(value: CategoryActionData): Self = StObject.set(x, "yes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYesUndefined: Self = StObject.set(x, "yes", js.undefined)
    }
  }
  
  trait CategoryActionData extends StObject {
    
    var callback: String
    
    var destructive: Boolean
    
    var foreground: Boolean
    
    var title: String
  }
  object CategoryActionData {
    
    @scala.inline
    def apply(callback: String, destructive: Boolean, foreground: Boolean, title: String): CategoryActionData = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], destructive = destructive.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CategoryActionData]
    }
    
    @scala.inline
    implicit class CategoryActionDataMutableBuilder[Self <: CategoryActionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestructive(value: Boolean): Self = StObject.set(x, "destructive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForeground(value: Boolean): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type CategoryArray = StringDictionary[CategoryAction]
  
  /* Rewritten from type alias, can be one of: 
    - typings.phonegapPluginPush.PhonegapPluginPush.RegistrationEventResponse
    - typings.phonegapPluginPush.PhonegapPluginPush.NotificationEventResponse
    - typings.std.Error
  */
  type EventResponse = _EventResponse | Error
  
  /**
  	 * platform specific initialization options.
  	 */
  trait InitOptions extends StObject {
    
    /**
    		 * Android specific initialization options.
    		 */
    var android: js.UndefOr[ClearBadge] = js.undefined
    
    /**
    		 * Browser specific initialization options.
    		 */
    var browser: js.UndefOr[ApplicationServerKey] = js.undefined
    
    /**
    		 * iOS specific initialization options.
    		 */
    var ios: js.UndefOr[Alert] = js.undefined
    
    /**
    		 * Windows specific initialization options.
    		 */
    var windows: js.UndefOr[js.Object] = js.undefined
  }
  object InitOptions {
    
    @scala.inline
    def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroid(value: ClearBadge): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      @scala.inline
      def setBrowser(value: ApplicationServerKey): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setIos(value: Alert): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      @scala.inline
      def setWindows(value: js.Object): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
  
  /**
  	 * TODO: document all possible properties (I only got the android ones)
  	 *
  	 * Loosened up with a dictionary notation, but all non-defined properties need to use (map['prop']) notation
  	 *
  	 * Ideally the developer would overload (merged declaration) this or create a new interface that would extend this one
  	 * so that he could specify any custom code without having to use array notation (map['prop']) for all of them.
  	 */
  trait NotificationEventAdditionalData
    extends StObject
       with /* name */ StringDictionary[js.Any] {
    
    /**
    		 * Will be true if the application is started by clicking on the push notification, false if the app is already started. (Android/iOS only)
    		 */
    var coldstart: js.UndefOr[Boolean] = js.undefined
    
    var collapse_key: js.UndefOr[String] = js.undefined
    
    /**
    		 * Whether the notification was received while the app was in the foreground
    		 */
    var foreground: js.UndefOr[Boolean] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var notId: js.UndefOr[String] = js.undefined
  }
  object NotificationEventAdditionalData {
    
    @scala.inline
    def apply(): NotificationEventAdditionalData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationEventAdditionalData]
    }
    
    @scala.inline
    implicit class NotificationEventAdditionalDataMutableBuilder[Self <: NotificationEventAdditionalData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColdstart(value: Boolean): Self = StObject.set(x, "coldstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColdstartUndefined: Self = StObject.set(x, "coldstart", js.undefined)
      
      @scala.inline
      def setCollapse_key(value: String): Self = StObject.set(x, "collapse_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapse_keyUndefined: Self = StObject.set(x, "collapse_key", js.undefined)
      
      @scala.inline
      def setForeground(value: Boolean): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setNotId(value: String): Self = StObject.set(x, "notId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotIdUndefined: Self = StObject.set(x, "notId", js.undefined)
    }
  }
  
  trait NotificationEventResponse
    extends StObject
       with _EventResponse {
    
    /**
    		 * An optional collection of data sent by the 3rd party push service that does not fit in the above properties.
    		 */
    var additionalData: NotificationEventAdditionalData
    
    /**
    		 * The number of messages to be displayed in the badge iOS or message count in the notification shade in Android.
    		 * For windows, it represents the value in the badge notification which could be a number or a status glyph.
    		 */
    var count: String
    
    /**
    		 * The path of the image file to be displayed in the notification.
    		 */
    var image: String
    
    /**
    		 * The text of the push message sent from the 3rd party service.
    		 */
    var message: String
    
    /**
    		 * The name of the sound file to be played upon receipt of the notification.
    		 */
    var sound: String
    
    /**
    		 * The optional title of the push message sent from the 3rd party service.
    		 */
    var title: js.UndefOr[String] = js.undefined
  }
  object NotificationEventResponse {
    
    @scala.inline
    def apply(
      additionalData: NotificationEventAdditionalData,
      count: String,
      image: String,
      message: String,
      sound: String
    ): NotificationEventResponse = {
      val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationEventResponse]
    }
    
    @scala.inline
    implicit class NotificationEventResponseMutableBuilder[Self <: NotificationEventResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalData(value: NotificationEventAdditionalData): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait PushNotification extends StObject {
    
    /**
    		 * Tells the OS to clear all notifications from the Notification Center
    		 * @param successHandler Is called when the api successfully clears the notifications.
    		 * @param errorHandler Is called when the api encounters an error when attempting to clears the notifications.
    		 */
    def clearAllNotifications(successHandler: js.Function0[js.Any], errorHandler: js.Function0[js.Any]): Unit = js.native
    
    /**
    		 * iOS only
    		 * Tells the OS that you are done processing a background push notification.
    		 * successHandler gets called when background push processing is successfully completed.
    		 * @param successHandler
    		 * @param errorHandler
    		 * @param id
    		 */
    def finish(): Unit = js.native
    def finish(successHandler: js.Function0[js.Any]): Unit = js.native
    def finish(successHandler: js.Function0[js.Any], errorHandler: js.Function0[js.Any]): Unit = js.native
    def finish(successHandler: js.Function0[js.Any], errorHandler: js.Function0[js.Any], id: String): Unit = js.native
    def finish(successHandler: js.Function0[js.Any], errorHandler: Unit, id: String): Unit = js.native
    def finish(successHandler: Unit, errorHandler: js.Function0[js.Any]): Unit = js.native
    def finish(successHandler: Unit, errorHandler: js.Function0[js.Any], id: String): Unit = js.native
    def finish(successHandler: Unit, errorHandler: Unit, id: String): Unit = js.native
    
    /**
    		 * Get the current badge count visible when the app is not running
    		 * successHandler gets called with an integer which is the current badge count
    		 * @param successHandler
    		 * @param errorHandler
    		 */
    def getApplicationIconBadgeNumber(successHandler: js.Function1[/* count */ Double, js.Any], errorHandler: js.Function0[js.Any]): Unit = js.native
    
    /**
    		 * As stated in the example, you will have to store your event handler if you are planning to remove it.
    		 * @param event Name of the event type. The possible event names are the same as for the push.on function.
    		 * @param callback handle to the function to get removed.
    		 * @param event
    		 * @param callback
    		 */
    def off(event: String, callback: js.Function1[/* response */ EventResponse, js.Any]): Unit = js.native
    @JSName("off")
    def off_error(event: error, callback: js.Function1[/* response */ Error, js.Any]): Unit = js.native
    @JSName("off")
    def off_notification(event: notification, callback: js.Function1[/* response */ NotificationEventResponse, js.Any]): Unit = js.native
    @JSName("off")
    def off_registration(event: registration, callback: js.Function1[/* response */ RegistrationEventResponse, js.Any]): Unit = js.native
    
    /**
    		 *
    		 * @param event Name of the event to listen to. See below(above) for all the event names.
    		 * @param callback is called when the event is triggered.
    		 * @param event
    		 * @param callback
    		 */
    def on(event: String, callback: js.Function1[/* response */ EventResponse, js.Any]): Unit = js.native
    /**
    		 * The event error will trigger when an internal error occurs and the cache is aborted.
    		 * @param event
    		 * @param callback
    		 */
    @JSName("on")
    def on_error(event: error, callback: js.Function1[/* response */ Error, js.Any]): Unit = js.native
    /**
    		 * The event notification will be triggered each time a push notification is received by a 3rd party push service on the device.
    		 * @param event
    		 * @param callback
    		 */
    @JSName("on")
    def on_notification(event: notification, callback: js.Function1[/* response */ NotificationEventResponse, js.Any]): Unit = js.native
    /**
    		 * The event registration will be triggered on each successful registration with the 3rd party push service.
    		 * @param event
    		 * @param callback
    		 */
    @JSName("on")
    def on_registration(event: registration, callback: js.Function1[/* response */ RegistrationEventResponse, js.Any]): Unit = js.native
    
    /*TODO according to js source code, "errorHandler" is optional, but is "count" also optional? I can't read objetive-C code (can anyone at all? I wonder...)*/
    /**
    		 * Set the badge count visible when the app is not running
    		 *
    		 * The count is an integer indicating what number should show up in the badge.
    		 * Passing 0 will clear the badge.
    		 * Each notification event contains a data.count value which can be used to set the badge to correct number.
    		 * @param successHandler
    		 * @param errorHandler
    		 * @param count
    		 */
    def setApplicationIconBadgeNumber(successHandler: js.Function0[js.Any], errorHandler: js.Function0[js.Any], count: Double): Unit = js.native
    
    /**
    		 * The subscribe method is used when the application wants to subscribe a new topic to receive push notifications.
    		 * @param topic Topic to subscribe to.
    		 * @param successHandler Is called when the api successfully unregisters.
    		 * @param errorHandler Is called when the api encounters an error while unregistering.
    		 */
    def subscribe(topic: String, successHandler: js.Function0[js.Any], errorHandler: js.Function0[js.Any]): Unit = js.native
    
    /**
    		 * The unregister method is used when the application no longer wants to receive push notifications.
    		 * Beware that this cleans up all event handlers previously registered,
    		 * so you will need to re-register them if you want them to function again without an application reload.
    		 * @param successHandler
    		 * @param errorHandler
    		 * @param topics
    		 */
    def unregister(successHandler: js.Function0[js.Any]): Unit = js.native
    def unregister(successHandler: js.Function0[js.Any], errorHandler: js.Function0[js.Any]): Unit = js.native
    def unregister(successHandler: js.Function0[js.Any], errorHandler: js.Function0[js.Any], topics: js.Array[String]): Unit = js.native
    def unregister(successHandler: js.Function0[js.Any], errorHandler: Unit, topics: js.Array[String]): Unit = js.native
    
    /**
    		 * The unsubscribe method is used when the application no longer wants to receive push notifications
    		 * from a specific topic but continue to receive other push messages.
    		 * @param topic Topic to unsubscribe from.
    		 * @param successHandler Is called when the api successfully unregisters.
    		 * @param errorHandler Is called when the api encounters an error while unregistering.
    		 */
    def unsubscribe(topic: String, successHandler: js.Function0[js.Any], errorHandler: js.Function0[js.Any]): Unit = js.native
  }
  
  @js.native
  trait PushNotificationStatic
    extends StObject
       with Instantiable1[/* options */ InitOptions, PushNotification] {
    
    def init(options: InitOptions): PushNotification = js.native
  }
  
  trait RegistrationEventResponse
    extends StObject
       with _EventResponse {
    
    /**
    		 * The registration ID provided by the 3rd party remote push service.
    		 */
    var registrationId: String
  }
  object RegistrationEventResponse {
    
    @scala.inline
    def apply(registrationId: String): RegistrationEventResponse = {
      val __obj = js.Dynamic.literal(registrationId = registrationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegistrationEventResponse]
    }
    
    @scala.inline
    implicit class RegistrationEventResponseMutableBuilder[Self <: RegistrationEventResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegistrationId(value: String): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    }
  }
  
  trait _EventResponse extends StObject
  object _EventResponse {
    
    @scala.inline
    def NotificationEventResponse(
      additionalData: NotificationEventAdditionalData,
      count: String,
      image: String,
      message: String,
      sound: String
    ): typings.phonegapPluginPush.PhonegapPluginPush.NotificationEventResponse = {
      val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.phonegapPluginPush.PhonegapPluginPush.NotificationEventResponse]
    }
    
    @scala.inline
    def RegistrationEventResponse(registrationId: String): typings.phonegapPluginPush.PhonegapPluginPush.RegistrationEventResponse = {
      val __obj = js.Dynamic.literal(registrationId = registrationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.phonegapPluginPush.PhonegapPluginPush.RegistrationEventResponse]
    }
  }
}
