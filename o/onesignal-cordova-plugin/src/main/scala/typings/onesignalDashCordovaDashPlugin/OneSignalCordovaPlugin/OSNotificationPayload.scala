package typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSNotificationPayload extends js.Object {
  var actionButtons: js.Array[OSActionButton]
  var additionalData: js.UndefOr[js.Any] = js.undefined
  var backgroundImageLayout: js.UndefOr[OSBackgroundImageLayout] = js.undefined
  var bigPicture: js.UndefOr[String] = js.undefined
  var body: String
  var fromProjectNumber: js.UndefOr[String] = js.undefined
  var groupKey: js.UndefOr[String] = js.undefined
  var groupMessage: js.UndefOr[String] = js.undefined
  var largeIcon: js.UndefOr[String] = js.undefined
  var launchURL: js.UndefOr[String] = js.undefined
  var ledColor: js.UndefOr[String] = js.undefined
  var lockScreenVisibility: js.UndefOr[OSLockScreenVisibility] = js.undefined
  var notificationID: String
  var priority: js.UndefOr[Double] = js.undefined
  var rawPayload: String
  var smallIcon: js.UndefOr[String] = js.undefined
  var smallIconAccentColor: js.UndefOr[String] = js.undefined
  var sound: String
  var title: String
}

object OSNotificationPayload {
  @scala.inline
  def apply(
    actionButtons: js.Array[OSActionButton],
    body: String,
    notificationID: String,
    rawPayload: String,
    sound: String,
    title: String,
    additionalData: js.Any = null,
    backgroundImageLayout: OSBackgroundImageLayout = null,
    bigPicture: String = null,
    fromProjectNumber: String = null,
    groupKey: String = null,
    groupMessage: String = null,
    largeIcon: String = null,
    launchURL: String = null,
    ledColor: String = null,
    lockScreenVisibility: OSLockScreenVisibility = null,
    priority: Int | Double = null,
    smallIcon: String = null,
    smallIconAccentColor: String = null
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

