package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidNotification extends js.Object {
  
  /** The notification's body text. If present, it will override google.firebase.fcm.v1.Notification.body. */
  var body: js.UndefOr[String] = js.native
  
  /**
    * Variable string values to be used in place of the format specifiers in body_loc_key to use to localize the body text to the user's current localization. See [Formatting and
    * Styling](https://goo.gl/MalYE3) for more information.
    */
  var bodyLocArgs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The key to the body string in the app's string resources to use to localize the body text to the user's current localization. See [String Resources](https://goo.gl/NdFZGI) for more
    * information.
    */
  var bodyLocKey: js.UndefOr[String] = js.native
  
  /**
    * The [notification's channel id](https://developer.android.com/guide/topics/ui/notifiers/notifications#ManageChannels) (new in Android O). The app must create a channel with this
    * channel ID before any notification with this channel ID is received. If you don't send this channel ID in the request, or if the channel ID provided has not yet been created by the
    * app, FCM uses the channel ID specified in the app manifest.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /** The action associated with a user click on the notification. If specified, an activity with a matching intent filter is launched when a user clicks on the notification. */
  var clickAction: js.UndefOr[String] = js.native
  
  /** The notification's icon color, expressed in #rrggbb format. */
  var color: js.UndefOr[String] = js.native
  
  /**
    * If set to true, use the Android framework's default LED light settings for the notification. Default values are specified in
    * [config.xml](https://android.googlesource.com/platform/frameworks/base/+/master/core/res/res/values/config.xml). If `default_light_settings` is set to true and `light_settings` is
    * also set, the user-specified `light_settings` is used instead of the default value.
    */
  var defaultLightSettings: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, use the Android framework's default sound for the notification. Default values are specified in
    * [config.xml](https://android.googlesource.com/platform/frameworks/base/+/master/core/res/res/values/config.xml).
    */
  var defaultSound: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, use the Android framework's default vibrate pattern for the notification. Default values are specified in
    * [config.xml](https://android.googlesource.com/platform/frameworks/base/+/master/core/res/res/values/config.xml). If `default_vibrate_timings` is set to true and `vibrate_timings` is
    * also set, the default value is used instead of the user-specified `vibrate_timings`.
    */
  var defaultVibrateTimings: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the time that the event in the notification occurred. Notifications in the panel are sorted by this time. A point in time is represented using
    * [protobuf.Timestamp](https://developers.google.com/protocol-buffers/docs/reference/java/com/google/protobuf/Timestamp).
    */
  var eventTime: js.UndefOr[String] = js.native
  
  /**
    * The notification's icon. Sets the notification icon to myicon for drawable resource myicon. If you don't send this key in the request, FCM displays the launcher icon specified in
    * your app manifest.
    */
  var icon: js.UndefOr[String] = js.native
  
  /** Contains the URL of an image that is going to be displayed in a notification. If present, it will override google.firebase.fcm.v1.Notification.image. */
  var image: js.UndefOr[String] = js.native
  
  /** Settings to control the notification's LED blinking rate and color if LED is available on the device. The total blinking time is controlled by the OS. */
  var lightSettings: js.UndefOr[LightSettings] = js.native
  
  /**
    * Set whether or not this notification is relevant only to the current device. Some notifications can be bridged to other devices for remote display, such as a Wear OS watch. This
    * hint can be set to recommend this notification not be bridged. See [Wear OS
    * guides](https://developer.android.com/training/wearables/notifications/bridger#existing-method-of-preventing-bridging)
    */
  var localOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the number of items this notification represents. May be displayed as a badge count for launchers that support badging.See [Notification
    * Badge](https://developer.android.com/training/notify-user/badges). For example, this might be useful if you're using just one notification to represent multiple new messages but you
    * want the count here to represent the number of total new messages. If zero or unspecified, systems that support badging use the default, which is to increment a number displayed on
    * the long-press menu each time a new notification arrives.
    */
  var notificationCount: js.UndefOr[Double] = js.native
  
  /**
    * Set the relative priority for this notification. Priority is an indication of how much of the user's attention should be consumed by this notification. Low-priority notifications
    * may be hidden from the user in certain situations, while the user might be interrupted for a higher-priority notification. The effect of setting the same priorities may differ
    * slightly on different platforms. Note this priority differs from `AndroidMessagePriority`. This priority is processed by the client after the message has been delivered, whereas
    * [AndroidMessagePriority](https://firebase.google.com/docs/reference/fcm/rest/v1/projects.messages#androidmessagepriority) is an FCM concept that controls when the message is
    * delivered.
    */
  var notificationPriority: js.UndefOr[String] = js.native
  
  /** The sound to play when the device receives the notification. Supports "default" or the filename of a sound resource bundled in the app. Sound files must reside in /res/raw/. */
  var sound: js.UndefOr[String] = js.native
  
  /**
    * When set to false or unset, the notification is automatically dismissed when the user clicks it in the panel. When set to true, the notification persists even when the user clicks
    * it.
    */
  var sticky: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifier used to replace existing notifications in the notification drawer. If not specified, each request creates a new notification. If specified and a notification with the
    * same tag is already being shown, the new notification replaces the existing one in the notification drawer.
    */
  var tag: js.UndefOr[String] = js.native
  
  /**
    * Sets the "ticker" text, which is sent to accessibility services. Prior to API level 21 (`Lollipop`), sets the text that is displayed in the status bar when the notification first
    * arrives.
    */
  var ticker: js.UndefOr[String] = js.native
  
  /** The notification's title. If present, it will override google.firebase.fcm.v1.Notification.title. */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Variable string values to be used in place of the format specifiers in title_loc_key to use to localize the title text to the user's current localization. See [Formatting and
    * Styling](https://goo.gl/MalYE3) for more information.
    */
  var titleLocArgs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The key to the title string in the app's string resources to use to localize the title text to the user's current localization. See [String Resources](https://goo.gl/NdFZGI) for
    * more information.
    */
  var titleLocKey: js.UndefOr[String] = js.native
  
  /**
    * Set the vibration pattern to use. Pass in an array of [protobuf.Duration](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration) to
    * turn on or off the vibrator. The first value indicates the `Duration` to wait before turning the vibrator on. The next value indicates the `Duration` to keep the vibrator on.
    * Subsequent values alternate between `Duration` to turn the vibrator off and to turn the vibrator on. If `vibrate_timings` is set and `default_vibrate_timings` is set to `true`, the
    * default value is used instead of the user-specified `vibrate_timings`.
    */
  var vibrateTimings: js.UndefOr[js.Array[String]] = js.native
  
  /** Set the [Notification.visibility](https://developer.android.com/reference/android/app/Notification.html#visibility) of the notification. */
  var visibility: js.UndefOr[String] = js.native
}
object AndroidNotification {
  
  @scala.inline
  def apply(): AndroidNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidNotification]
  }
  
  @scala.inline
  implicit class AndroidNotificationOps[Self <: AndroidNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyLocArgsVarargs(value: String*): Self = this.set("bodyLocArgs", js.Array(value :_*))
    
    @scala.inline
    def setBodyLocArgs(value: js.Array[String]): Self = this.set("bodyLocArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyLocArgs: Self = this.set("bodyLocArgs", js.undefined)
    
    @scala.inline
    def setBodyLocKey(value: String): Self = this.set("bodyLocKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyLocKey: Self = this.set("bodyLocKey", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setClickAction(value: String): Self = this.set("clickAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickAction: Self = this.set("clickAction", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDefaultLightSettings(value: Boolean): Self = this.set("defaultLightSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLightSettings: Self = this.set("defaultLightSettings", js.undefined)
    
    @scala.inline
    def setDefaultSound(value: Boolean): Self = this.set("defaultSound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSound: Self = this.set("defaultSound", js.undefined)
    
    @scala.inline
    def setDefaultVibrateTimings(value: Boolean): Self = this.set("defaultVibrateTimings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVibrateTimings: Self = this.set("defaultVibrateTimings", js.undefined)
    
    @scala.inline
    def setEventTime(value: String): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTime: Self = this.set("eventTime", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setLightSettings(value: LightSettings): Self = this.set("lightSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightSettings: Self = this.set("lightSettings", js.undefined)
    
    @scala.inline
    def setLocalOnly(value: Boolean): Self = this.set("localOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalOnly: Self = this.set("localOnly", js.undefined)
    
    @scala.inline
    def setNotificationCount(value: Double): Self = this.set("notificationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationCount: Self = this.set("notificationCount", js.undefined)
    
    @scala.inline
    def setNotificationPriority(value: String): Self = this.set("notificationPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationPriority: Self = this.set("notificationPriority", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTicker(value: String): Self = this.set("ticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicker: Self = this.set("ticker", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleLocArgsVarargs(value: String*): Self = this.set("titleLocArgs", js.Array(value :_*))
    
    @scala.inline
    def setTitleLocArgs(value: js.Array[String]): Self = this.set("titleLocArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLocArgs: Self = this.set("titleLocArgs", js.undefined)
    
    @scala.inline
    def setTitleLocKey(value: String): Self = this.set("titleLocKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLocKey: Self = this.set("titleLocKey", js.undefined)
    
    @scala.inline
    def setVibrateTimingsVarargs(value: String*): Self = this.set("vibrateTimings", js.Array(value :_*))
    
    @scala.inline
    def setVibrateTimings(value: js.Array[String]): Self = this.set("vibrateTimings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVibrateTimings: Self = this.set("vibrateTimings", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
