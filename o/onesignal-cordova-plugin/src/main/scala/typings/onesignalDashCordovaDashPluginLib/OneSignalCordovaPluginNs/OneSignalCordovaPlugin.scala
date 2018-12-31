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
  def setLogLevel(logLevel: onesignalDashCordovaDashPluginLib.Anon_VisualLevel): scala.Unit
  def setSubscription(enable: scala.Boolean): scala.Unit
  def startInit(appId: java.lang.String): OneSignalBuilder
  def syncHashedEmail(email: java.lang.String): scala.Unit
}

