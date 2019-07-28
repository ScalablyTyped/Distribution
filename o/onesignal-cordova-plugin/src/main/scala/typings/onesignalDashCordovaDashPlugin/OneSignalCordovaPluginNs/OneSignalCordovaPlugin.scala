package typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs

import org.scalablytyped.runtime.StringDictionary
import typings.onesignalDashCordovaDashPlugin.Anon_LogLevel
import typings.onesignalDashCordovaDashPlugin.Anon_PushToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OneSignalCordovaPlugin extends js.Object {
  def addPermissionObserver(callback: js.Function1[/* state */ OSPermissionState, Unit]): Unit
  def addSubscriptionObserver(callback: js.Function1[/* state */ OSSubscriptionState, Unit]): Unit
  def clearOneSignalNotifications(): Unit
  def deleteTag(key: String): Unit
  def deleteTags(keys: js.Array[String]): Unit
  def enableSound(enable: Boolean): Unit
  def enableVibrate(enable: Boolean): Unit
  def getIds(callback: js.Function1[/* id */ Anon_PushToken, Unit]): Unit
  def getPermissionSubscriptionState(callback: js.Function1[/* status */ OSPermissionSubscriptionState, Unit]): Unit
  def getTags(callback: js.Function1[/* tags */ js.Any, Unit]): Unit
  def postNotification(
    notificationObj: js.Any,
    onSuccess: js.Function1[/* json */ js.Any, Unit],
    onFailure: js.Function1[/* json */ js.Any, Unit]
  ): Unit
  def promptForPushNotificationsWithUserResponse(callback: js.Function1[/* accepted */ Boolean, Unit]): Unit
  def promptLocation(): Unit
  def registerForPushNotifications(): Unit
  def sendTag(key: String, value: String): Unit
  def sendTags(tags: StringDictionary[String]): Unit
  def setLogLevel(logLevel: Anon_LogLevel): Unit
  def setSubscription(enable: Boolean): Unit
  def startInit(appId: String): OneSignalBuilder
  def syncHashedEmail(email: String): Unit
}

object OneSignalCordovaPlugin {
  @scala.inline
  def apply(
    addPermissionObserver: js.Function1[/* state */ OSPermissionState, Unit] => Unit,
    addSubscriptionObserver: js.Function1[/* state */ OSSubscriptionState, Unit] => Unit,
    clearOneSignalNotifications: () => Unit,
    deleteTag: String => Unit,
    deleteTags: js.Array[String] => Unit,
    enableSound: Boolean => Unit,
    enableVibrate: Boolean => Unit,
    getIds: js.Function1[/* id */ Anon_PushToken, Unit] => Unit,
    getPermissionSubscriptionState: js.Function1[/* status */ OSPermissionSubscriptionState, Unit] => Unit,
    getTags: js.Function1[/* tags */ js.Any, Unit] => Unit,
    postNotification: (js.Any, js.Function1[/* json */ js.Any, Unit], js.Function1[/* json */ js.Any, Unit]) => Unit,
    promptForPushNotificationsWithUserResponse: js.Function1[/* accepted */ Boolean, Unit] => Unit,
    promptLocation: () => Unit,
    registerForPushNotifications: () => Unit,
    sendTag: (String, String) => Unit,
    sendTags: StringDictionary[String] => Unit,
    setLogLevel: Anon_LogLevel => Unit,
    setSubscription: Boolean => Unit,
    startInit: String => OneSignalBuilder,
    syncHashedEmail: String => Unit
  ): OneSignalCordovaPlugin = {
    val __obj = js.Dynamic.literal(addPermissionObserver = js.Any.fromFunction1(addPermissionObserver), addSubscriptionObserver = js.Any.fromFunction1(addSubscriptionObserver), clearOneSignalNotifications = js.Any.fromFunction0(clearOneSignalNotifications), deleteTag = js.Any.fromFunction1(deleteTag), deleteTags = js.Any.fromFunction1(deleteTags), enableSound = js.Any.fromFunction1(enableSound), enableVibrate = js.Any.fromFunction1(enableVibrate), getIds = js.Any.fromFunction1(getIds), getPermissionSubscriptionState = js.Any.fromFunction1(getPermissionSubscriptionState), getTags = js.Any.fromFunction1(getTags), postNotification = js.Any.fromFunction3(postNotification), promptForPushNotificationsWithUserResponse = js.Any.fromFunction1(promptForPushNotificationsWithUserResponse), promptLocation = js.Any.fromFunction0(promptLocation), registerForPushNotifications = js.Any.fromFunction0(registerForPushNotifications), sendTag = js.Any.fromFunction2(sendTag), sendTags = js.Any.fromFunction1(sendTags), setLogLevel = js.Any.fromFunction1(setLogLevel), setSubscription = js.Any.fromFunction1(setSubscription), startInit = js.Any.fromFunction1(startInit), syncHashedEmail = js.Any.fromFunction1(syncHashedEmail))
  
    __obj.asInstanceOf[OneSignalCordovaPlugin]
  }
}

