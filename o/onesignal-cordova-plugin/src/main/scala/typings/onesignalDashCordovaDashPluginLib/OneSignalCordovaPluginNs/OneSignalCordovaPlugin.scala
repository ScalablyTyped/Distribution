package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OneSignalCordovaPlugin extends js.Object {
  def addPermissionObserver(callback: js.Function1[/* state */ OSPermissionState, scala.Unit]): scala.Unit
  def addSubscriptionObserver(callback: js.Function1[/* state */ OSSubscriptionState, scala.Unit]): scala.Unit
  def clearOneSignalNotifications(): scala.Unit
  def deleteTag(key: java.lang.String): scala.Unit
  def deleteTags(keys: js.Array[java.lang.String]): scala.Unit
  def enableSound(enable: scala.Boolean): scala.Unit
  def enableVibrate(enable: scala.Boolean): scala.Unit
  def getIds(callback: js.Function1[/* id */ onesignalDashCordovaDashPluginLib.Anon_PushToken, scala.Unit]): scala.Unit
  def getPermissionSubscriptionState(callback: js.Function1[/* status */ OSPermissionSubscriptionState, scala.Unit]): scala.Unit
  def getTags(callback: js.Function1[/* tags */ js.Any, scala.Unit]): scala.Unit
  def postNotification(
    notificationObj: js.Any,
    onSuccess: js.Function1[/* json */ js.Any, scala.Unit],
    onFailure: js.Function1[/* json */ js.Any, scala.Unit]
  ): scala.Unit
  def promptForPushNotificationsWithUserResponse(callback: js.Function1[/* accepted */ scala.Boolean, scala.Unit]): scala.Unit
  def promptLocation(): scala.Unit
  def registerForPushNotifications(): scala.Unit
  def sendTag(key: java.lang.String, value: java.lang.String): scala.Unit
  def sendTags(tags: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit
  def setLogLevel(logLevel: onesignalDashCordovaDashPluginLib.Anon_LogLevel): scala.Unit
  def setSubscription(enable: scala.Boolean): scala.Unit
  def startInit(appId: java.lang.String): OneSignalBuilder
  def syncHashedEmail(email: java.lang.String): scala.Unit
}

object OneSignalCordovaPlugin {
  @scala.inline
  def apply(
    addPermissionObserver: js.Function1[/* state */ OSPermissionState, scala.Unit] => scala.Unit,
    addSubscriptionObserver: js.Function1[/* state */ OSSubscriptionState, scala.Unit] => scala.Unit,
    clearOneSignalNotifications: () => scala.Unit,
    deleteTag: java.lang.String => scala.Unit,
    deleteTags: js.Array[java.lang.String] => scala.Unit,
    enableSound: scala.Boolean => scala.Unit,
    enableVibrate: scala.Boolean => scala.Unit,
    getIds: js.Function1[/* id */ onesignalDashCordovaDashPluginLib.Anon_PushToken, scala.Unit] => scala.Unit,
    getPermissionSubscriptionState: js.Function1[/* status */ OSPermissionSubscriptionState, scala.Unit] => scala.Unit,
    getTags: js.Function1[/* tags */ js.Any, scala.Unit] => scala.Unit,
    postNotification: (js.Any, js.Function1[/* json */ js.Any, scala.Unit], js.Function1[/* json */ js.Any, scala.Unit]) => scala.Unit,
    promptForPushNotificationsWithUserResponse: js.Function1[/* accepted */ scala.Boolean, scala.Unit] => scala.Unit,
    promptLocation: () => scala.Unit,
    registerForPushNotifications: () => scala.Unit,
    sendTag: (java.lang.String, java.lang.String) => scala.Unit,
    sendTags: org.scalablytyped.runtime.StringDictionary[java.lang.String] => scala.Unit,
    setLogLevel: onesignalDashCordovaDashPluginLib.Anon_LogLevel => scala.Unit,
    setSubscription: scala.Boolean => scala.Unit,
    startInit: java.lang.String => OneSignalBuilder,
    syncHashedEmail: java.lang.String => scala.Unit
  ): OneSignalCordovaPlugin = {
    val __obj = js.Dynamic.literal(addPermissionObserver = js.Any.fromFunction1(addPermissionObserver), addSubscriptionObserver = js.Any.fromFunction1(addSubscriptionObserver), clearOneSignalNotifications = js.Any.fromFunction0(clearOneSignalNotifications), deleteTag = js.Any.fromFunction1(deleteTag), deleteTags = js.Any.fromFunction1(deleteTags), enableSound = js.Any.fromFunction1(enableSound), enableVibrate = js.Any.fromFunction1(enableVibrate), getIds = js.Any.fromFunction1(getIds), getPermissionSubscriptionState = js.Any.fromFunction1(getPermissionSubscriptionState), getTags = js.Any.fromFunction1(getTags), postNotification = js.Any.fromFunction3(postNotification), promptForPushNotificationsWithUserResponse = js.Any.fromFunction1(promptForPushNotificationsWithUserResponse), promptLocation = js.Any.fromFunction0(promptLocation), registerForPushNotifications = js.Any.fromFunction0(registerForPushNotifications), sendTag = js.Any.fromFunction2(sendTag), sendTags = js.Any.fromFunction1(sendTags), setLogLevel = js.Any.fromFunction1(setLogLevel), setSubscription = js.Any.fromFunction1(setSubscription), startInit = js.Any.fromFunction1(startInit), syncHashedEmail = js.Any.fromFunction1(syncHashedEmail))
  
    __obj.asInstanceOf[OneSignalCordovaPlugin]
  }
}

