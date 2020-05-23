package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosNotificationSettings extends js.Object {
  // Indicates the type of alert for notifications for this app. Possible values are: deviceDefault, banner, modal, none.
  var alertType: js.UndefOr[IosNotificationAlertType] = js.undefined
  // Application name to be associated with the bundleID.
  var appName: js.UndefOr[String] = js.undefined
  // Indicates whether badges are allowed for this app.
  var badgesEnabled: js.UndefOr[Boolean] = js.undefined
  // Bundle id of app to which to apply these notification settings.
  var bundleID: js.UndefOr[String] = js.undefined
  // Indicates whether notifications are allowed for this app.
  var enabled: js.UndefOr[Boolean] = js.undefined
  // Publisher to be associated with the bundleID.
  var publisher: js.UndefOr[String] = js.undefined
  // Indicates whether notifications can be shown in notification center.
  var showInNotificationCenter: js.UndefOr[Boolean] = js.undefined
  // Indicates whether notifications can be shown on the lock screen.
  var showOnLockScreen: js.UndefOr[Boolean] = js.undefined
  // Indicates whether sounds are allowed for this app.
  var soundsEnabled: js.UndefOr[Boolean] = js.undefined
}

object IosNotificationSettings {
  @scala.inline
  def apply(
    alertType: IosNotificationAlertType = null,
    appName: String = null,
    badgesEnabled: js.UndefOr[Boolean] = js.undefined,
    bundleID: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    publisher: String = null,
    showInNotificationCenter: js.UndefOr[Boolean] = js.undefined,
    showOnLockScreen: js.UndefOr[Boolean] = js.undefined,
    soundsEnabled: js.UndefOr[Boolean] = js.undefined
  ): IosNotificationSettings = {
    val __obj = js.Dynamic.literal()
    if (alertType != null) __obj.updateDynamic("alertType")(alertType.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (!js.isUndefined(badgesEnabled)) __obj.updateDynamic("badgesEnabled")(badgesEnabled.get.asInstanceOf[js.Any])
    if (bundleID != null) __obj.updateDynamic("bundleID")(bundleID.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (!js.isUndefined(showInNotificationCenter)) __obj.updateDynamic("showInNotificationCenter")(showInNotificationCenter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnLockScreen)) __obj.updateDynamic("showOnLockScreen")(showOnLockScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(soundsEnabled)) __obj.updateDynamic("soundsEnabled")(soundsEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosNotificationSettings]
  }
}

