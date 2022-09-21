package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.onesignalCordovaPlugin.anon.Authorized
import typings.onesignalCordovaPlugin.anon.From
import typings.onesignalCordovaPlugin.anon.FromTo
import typings.onesignalCordovaPlugin.anon.InAppAlert
import typings.onesignalCordovaPlugin.anon.LogLevel
import typings.onesignalCordovaPlugin.anon.PartialOSNotification
import typings.onesignalCordovaPlugin.anon.PushToken
import typings.onesignalCordovaPlugin.anon.To
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneSignalCordovaPlugin extends StObject {
  
  var OSInFocusDisplayOption: InAppAlert = js.native
  
  var OSNotificationPermission: Authorized = js.native
  
  def addEmailSubscriptionObserver(callback: js.Function1[/* change */ From, Unit]): Unit = js.native
  
  /**
    *  The passed in function will be fired when a notification permission
    *  setting changes.
    */
  def addPermissionObserver(callback: js.Function1[/* change */ To, Unit]): Unit = js.native
  
  /**
    *  The passed in function will be fired when a notification subscription
    *  property changes.
    */
  def addSubscriptionObserver(callback: js.Function1[/* change */ FromTo, Unit]): Unit = js.native
  
  /**
    *  Add a trigger, may show an In-App Message if its triggers conditions
    *  were met.
    */
  def addTrigger(key: String, value: String): Unit = js.native
  def addTrigger(key: String, value: Double): Unit = js.native
  
  /**
    *  Add a key-value Object of triggers, may show an In-App Message if
    *  its triggers conditions were met.
    */
  def addTriggers(triggers: Record[String, String | Double]): Unit = js.native
  
  /** Clear all notifications sent from OneSignal */
  def clearOneSignalNotifications(): Unit = js.native
  
  /**
    *  Deletes a single tag that was previously set on a user with sendTag
    *  or sendTags. Use deleteTags if you need to delete more than one.
    */
  def deleteTag(key: String): Unit = js.native
  
  /**
    *  Deletes one or more tags that were previously set on a user with
    *  sendTag or sendTags.
    */
  def deleteTags(keys: js.Array[String]): Unit = js.native
  
  def enableNotificationsWhenActive(enable: Boolean): Unit = js.native
  
  /**
    *  By default OneSignal plays the system's default notification sound
    *  when the device's notification system volume is turned on. You may
    *  also set custom sounds on notifications. Passing false means that the
    *  device will only vibrate unless the device is set to a total silent
    *  mode.
    */
  def enableSound(enable: Boolean): Unit = js.native
  
  /**
    *  By default OneSignal always vibrates the device when a notification
    *  is displayed unless the device is in a total silent mode. Passing
    *  false means that the device will only vibrate lightly when the
    *  device is in it's vibrate only mode.
    */
  def enableVibrate(enable: Boolean): Unit = js.native
  
  def getIds(IdsReceivedCallBack: js.Function1[/* id */ PushToken, Unit]): Unit = js.native
  
  /**
    *  Get the current notification and permission state. Returns an object
    *  of OSPermissionSubscriptionState type described below.
    */
  def getPermissionSubscriptionState(callback: js.Function1[/* status */ OSPermissionSubscriptionState, Unit]): Unit = js.native
  
  /**
    *  Retrieve a list of tags that have been set on the user from the
    *  OneSignal server.
    */
  def getTags(callback: js.Function1[/* tags */ Any, Unit]): Unit = js.native
  
  /** Gets a trigger value for a provided trigger key. */
  def getTriggerValueForKey(key: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
  
  /**
    *  Sets a In-App Message clicked handler. The instance will be called
    *  when an In-App Message action is tapped on.
    */
  def handleInAppMessageClicked(handler: js.Function1[/* action */ OSNotificationAction, Unit]): Unit = js.native
  
  /**
    *  If your app implements logout functionality, you can call logoutEmail
    *  to dissociate the email from the device:
    */
  def logoutEmail(onSuccess: js.Function1[/* success */ Any, Unit], onFailure: js.Function1[/* error */ Any, Unit]): Unit = js.native
  
  /**
    *  Allows you to temporarily pause all In-App Messages. You may want to
    *  do this while the user is watching a video playing a match in your
    *  game to make sure they don't get interrupted at a bad time.
    */
  def pauseInAppMessages(pause: Boolean): Unit = js.native
  
  /**
    *  Allows you to send notifications from user to user or schedule ones
    *  in the future to be delivered to the current device.
    */
  def postNotification(
    notificationObj: PartialOSNotification,
    onSuccess: js.Function1[/* json */ Any, Unit],
    onFailure: js.Function1[/* json */ Any, Unit]
  ): Unit = js.native
  
  /**
    *  Prompt the user for notification permissions. Callback fires as soon
    *  as the user accepts or declines notifications.
    */
  def promptForPushNotificationsWithUserResponse(callback: js.Function1[/* accepted */ Boolean, Unit]): Unit = js.native
  
  /**
    *  Prompts the user for location permissions. This allows for
    *  geotagging so you can send notifications to users based on location.
    */
  def promptLocation(): Unit = js.native
  
  /**
    *  If your application is set to require the user's privacy consent,
    *  you can provide this consent using this method. Until you call
    *  provideUserConsent(true), the SDK will not fully initialize and will
    *  not send any data to OneSignal.
    */
  def provideUserConsent(granted: Boolean): Unit = js.native
  
  def registerForPushNotifications(): Unit = js.native
  
  /**
    *  If your user logs out of your app and you would like to disassociate
    *  their custom user ID from your system with their OneSignal user ID,
    *  you will want to call this method.
    */
  def removeExternalUserId(): Unit = js.native
  
  /**
    *  Removes a single trigger for the given key, may show an In-App
    *  Message if its triggers conditions were met.
    */
  def removeTriggerForKey(key: String): Unit = js.native
  
  /**
    *  Removes a list of triggers based on a collection of keys, may show
    *  an In-App Message if its triggers conditions were met.
    */
  def removeTriggersForKeys(keys: js.Array[String]): Unit = js.native
  
  /**
    *  Tag a user based on an app event of your choosing so later you can
    *  create segments in Segments to target these users. Use sendTags if
    *  you need to set more than one tag on a user at a time.
    */
  def sendTag(key: String, value: String): Unit = js.native
  
  /**
    *  Tag a user based on an app event of your choosing so later you can
    *  create segments in Segments to target these users.
    */
  def sendTags(tags: StringDictionary[String]): Unit = js.native
  
  /** Allows you to set the user's email address with the OneSignal SDK */
  def setEmail(email: String): Unit = js.native
  /**
    *  If you have a backend server, we strongly recommend using Identity
    *  Verification with your users. Your backend can generate an email
    *  authentication token and send it to your app. The following code
    *  also includes callbacks:
    */
  def setEmail(
    email: String,
    emailAuthToken: String,
    onSuccess: js.Function1[/* success */ Any, Unit],
    onFailure: js.Function1[/* error */ Any, Unit]
  ): Unit = js.native
  
  /**
    *  If your system assigns unique identifiers to users, it can be
    *  annoying to have to also remember their OneSignal user ID's as well.
    *  To make things easier, OneSignal now allows you to set an
    *  external_id for your users. Simply call this method, pass in your
    *  custom user ID (as a string), and from now on when you send a push
    *  notification, you can use include_external_user_ids instead of
    *  include_player_ids.
    */
  def setExternalUserId(userId: String): Unit = js.native
  
  def setInFocusDisplaying(displayType: OSDisplayType): Unit = js.native
  
  def setLocationShared(shared: Any): Unit = js.native
  
  /**
    *  Enable logging to help debug if you run into an issue setting up
    *  OneSignal.
    */
  def setLogLevel(logLevel: LogLevel): Unit = js.native
  
  /**
    *  Allows you to delay the initialization of the SDK until the user
    *  provides privacy consent. The SDK will not be fully initialized
    *  until the provideUserConsent(true) method is called. If you set this
    *  to be true, the SDK will not fully initialize until consent is
    *  provided. You can still call OneSignal methods, but nothing will
    *  happen, and the user will not be registered for push notifications.
    */
  def setRequiresUserPrivacyConsent(required: Boolean): Unit = js.native
  
  /**
    *  You can call this method with false to opt users out of receiving
    *  all notifications through OneSignal. You can pass true later to opt
    *  users back into notifications. This unsubscribes the user from
    *  OneSignal, but the device will still show as subscribed to push.
    *  This method is helpful if you need to unsubscribe users momentarily
    *  or provide the option in a "settings" page.
    */
  def setSubscription(enable: Boolean): Unit = js.native
  
  /**
    *  Starts initialization of OneSignal, call this from the deviceready
    *  event.
    */
  def startInit(appId: String): OneSignalBuilder = js.native
  def startInit(appId: String, googleProjectNumber: String): OneSignalBuilder = js.native
  
  def syncHashedEmail(email: String): Unit = js.native
  
  /**
    *  Accepts a callback, which returns a boolean variable indicating if
    *  the user has given privacy consent yet.
    */
  def userProvidedPrivacyConsent(callback: js.Function1[/* providedConsent */ Boolean, Unit]): Unit = js.native
}
