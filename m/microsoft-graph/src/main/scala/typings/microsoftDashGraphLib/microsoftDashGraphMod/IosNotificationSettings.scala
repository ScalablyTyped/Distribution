package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosNotificationSettings extends js.Object {
  /** Indicates the type of alert for notifications for this app. Possible values are: deviceDefault, banner, modal, none. */
  var alertType: js.UndefOr[IosNotificationAlertType] = js.undefined
  /** Application name to be associated with the bundleID. */
  var appName: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether badges are allowed for this app. */
  var badgesEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Bundle id of app to which to apply these notification settings. */
  var bundleID: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether notifications are allowed for this app. */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Publisher to be associated with the bundleID. */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether notifications can be shown in notification center. */
  var showInNotificationCenter: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether notifications can be shown on the lock screen. */
  var showOnLockScreen: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether sounds are allowed for this app. */
  var soundsEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object IosNotificationSettings {
  @scala.inline
  def apply(
    alertType: IosNotificationAlertType = null,
    appName: java.lang.String = null,
    badgesEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    bundleID: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    publisher: java.lang.String = null,
    showInNotificationCenter: js.UndefOr[scala.Boolean] = js.undefined,
    showOnLockScreen: js.UndefOr[scala.Boolean] = js.undefined,
    soundsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): IosNotificationSettings = {
    val __obj = js.Dynamic.literal()
    if (alertType != null) __obj.updateDynamic("alertType")(alertType)
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (!js.isUndefined(badgesEnabled)) __obj.updateDynamic("badgesEnabled")(badgesEnabled)
    if (bundleID != null) __obj.updateDynamic("bundleID")(bundleID)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (!js.isUndefined(showInNotificationCenter)) __obj.updateDynamic("showInNotificationCenter")(showInNotificationCenter)
    if (!js.isUndefined(showOnLockScreen)) __obj.updateDynamic("showOnLockScreen")(showOnLockScreen)
    if (!js.isUndefined(soundsEnabled)) __obj.updateDynamic("soundsEnabled")(soundsEnabled)
    __obj.asInstanceOf[IosNotificationSettings]
  }
}

