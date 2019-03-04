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
    addPermissionObserver: js.Function1[js.Function1[/* state */ OSPermissionState, scala.Unit], scala.Unit],
    addSubscriptionObserver: js.Function1[js.Function1[/* state */ OSSubscriptionState, scala.Unit], scala.Unit],
    clearOneSignalNotifications: js.Function0[scala.Unit],
    deleteTag: js.Function1[java.lang.String, scala.Unit],
    deleteTags: js.Function1[js.Array[java.lang.String], scala.Unit],
    enableSound: js.Function1[scala.Boolean, scala.Unit],
    enableVibrate: js.Function1[scala.Boolean, scala.Unit],
    getIds: js.Function1[
      js.Function1[/* id */ onesignalDashCordovaDashPluginLib.Anon_PushToken, scala.Unit], 
      scala.Unit
    ],
    getPermissionSubscriptionState: js.Function1[js.Function1[/* status */ OSPermissionSubscriptionState, scala.Unit], scala.Unit],
    getTags: js.Function1[js.Function1[/* tags */ js.Any, scala.Unit], scala.Unit],
    postNotification: js.Function3[
      js.Any, 
      js.Function1[/* json */ js.Any, scala.Unit], 
      js.Function1[/* json */ js.Any, scala.Unit], 
      scala.Unit
    ],
    promptForPushNotificationsWithUserResponse: js.Function1[js.Function1[/* accepted */ scala.Boolean, scala.Unit], scala.Unit],
    promptLocation: js.Function0[scala.Unit],
    registerForPushNotifications: js.Function0[scala.Unit],
    sendTag: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    sendTags: js.Function1[org.scalablytyped.runtime.StringDictionary[java.lang.String], scala.Unit],
    setLogLevel: js.Function1[onesignalDashCordovaDashPluginLib.Anon_LogLevel, scala.Unit],
    setSubscription: js.Function1[scala.Boolean, scala.Unit],
    startInit: js.Function1[java.lang.String, OneSignalBuilder],
    syncHashedEmail: js.Function1[java.lang.String, scala.Unit]
  ): OneSignalCordovaPlugin = {
    val __obj = js.Dynamic.literal(addPermissionObserver = addPermissionObserver, addSubscriptionObserver = addSubscriptionObserver, clearOneSignalNotifications = clearOneSignalNotifications, deleteTag = deleteTag, deleteTags = deleteTags, enableSound = enableSound, enableVibrate = enableVibrate, getIds = getIds, getPermissionSubscriptionState = getPermissionSubscriptionState, getTags = getTags, postNotification = postNotification, promptForPushNotificationsWithUserResponse = promptForPushNotificationsWithUserResponse, promptLocation = promptLocation, registerForPushNotifications = registerForPushNotifications, sendTag = sendTag, sendTags = sendTags, setLogLevel = setLogLevel, setSubscription = setSubscription, startInit = startInit, syncHashedEmail = syncHashedEmail)
  
    __obj.asInstanceOf[OneSignalCordovaPlugin]
  }
}

