package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSNotificationPayload extends js.Object {
  var actionButtons: js.Array[OSActionButton]
  var additionalData: js.UndefOr[js.Any] = js.undefined
  var backgroundImageLayout: js.UndefOr[OSBackgroundImageLayout] = js.undefined
  var bigPicture: js.UndefOr[java.lang.String] = js.undefined
  var body: java.lang.String
  var fromProjectNumber: js.UndefOr[java.lang.String] = js.undefined
  var groupKey: js.UndefOr[java.lang.String] = js.undefined
  var groupMessage: js.UndefOr[java.lang.String] = js.undefined
  var largeIcon: js.UndefOr[java.lang.String] = js.undefined
  var launchURL: js.UndefOr[java.lang.String] = js.undefined
  var ledColor: js.UndefOr[java.lang.String] = js.undefined
  var lockScreenVisibility: js.UndefOr[OSLockScreenVisibility] = js.undefined
  var notificationID: java.lang.String
  var priority: js.UndefOr[scala.Double] = js.undefined
  var rawPayload: java.lang.String
  var smallIcon: js.UndefOr[java.lang.String] = js.undefined
  var smallIconAccentColor: js.UndefOr[java.lang.String] = js.undefined
  var sound: java.lang.String
  var title: java.lang.String
}

object OSNotificationPayload {
  @scala.inline
  def apply(
    actionButtons: js.Array[OSActionButton],
    body: java.lang.String,
    notificationID: java.lang.String,
    rawPayload: java.lang.String,
    sound: java.lang.String,
    title: java.lang.String,
    additionalData: js.Any = null,
    backgroundImageLayout: OSBackgroundImageLayout = null,
    bigPicture: java.lang.String = null,
    fromProjectNumber: java.lang.String = null,
    groupKey: java.lang.String = null,
    groupMessage: java.lang.String = null,
    largeIcon: java.lang.String = null,
    launchURL: java.lang.String = null,
    ledColor: java.lang.String = null,
    lockScreenVisibility: OSLockScreenVisibility = null,
    priority: scala.Int | scala.Double = null,
    smallIcon: java.lang.String = null,
    smallIconAccentColor: java.lang.String = null
  ): OSNotificationPayload = {
    val __obj = js.Dynamic.literal(actionButtons = actionButtons, body = body, notificationID = notificationID, rawPayload = rawPayload, sound = sound, title = title)
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData)
    if (backgroundImageLayout != null) __obj.updateDynamic("backgroundImageLayout")(backgroundImageLayout)
    if (bigPicture != null) __obj.updateDynamic("bigPicture")(bigPicture)
    if (fromProjectNumber != null) __obj.updateDynamic("fromProjectNumber")(fromProjectNumber)
    if (groupKey != null) __obj.updateDynamic("groupKey")(groupKey)
    if (groupMessage != null) __obj.updateDynamic("groupMessage")(groupMessage)
    if (largeIcon != null) __obj.updateDynamic("largeIcon")(largeIcon)
    if (launchURL != null) __obj.updateDynamic("launchURL")(launchURL)
    if (ledColor != null) __obj.updateDynamic("ledColor")(ledColor)
    if (lockScreenVisibility != null) __obj.updateDynamic("lockScreenVisibility")(lockScreenVisibility)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (smallIcon != null) __obj.updateDynamic("smallIcon")(smallIcon)
    if (smallIconAccentColor != null) __obj.updateDynamic("smallIconAccentColor")(smallIconAccentColor)
    __obj.asInstanceOf[OSNotificationPayload]
  }
}

