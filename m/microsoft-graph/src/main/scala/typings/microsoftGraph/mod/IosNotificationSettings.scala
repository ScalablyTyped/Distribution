package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosNotificationSettings extends js.Object {
  // Indicates the type of alert for notifications for this app. Possible values are: deviceDefault, banner, modal, none.
  var alertType: js.UndefOr[IosNotificationAlertType] = js.native
  // Application name to be associated with the bundleID.
  var appName: js.UndefOr[String] = js.native
  // Indicates whether badges are allowed for this app.
  var badgesEnabled: js.UndefOr[Boolean] = js.native
  // Bundle id of app to which to apply these notification settings.
  var bundleID: js.UndefOr[String] = js.native
  // Indicates whether notifications are allowed for this app.
  var enabled: js.UndefOr[Boolean] = js.native
  // Publisher to be associated with the bundleID.
  var publisher: js.UndefOr[String] = js.native
  // Indicates whether notifications can be shown in notification center.
  var showInNotificationCenter: js.UndefOr[Boolean] = js.native
  // Indicates whether notifications can be shown on the lock screen.
  var showOnLockScreen: js.UndefOr[Boolean] = js.native
  // Indicates whether sounds are allowed for this app.
  var soundsEnabled: js.UndefOr[Boolean] = js.native
}

object IosNotificationSettings {
  @scala.inline
  def apply(): IosNotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosNotificationSettings]
  }
  @scala.inline
  implicit class IosNotificationSettingsOps[Self <: IosNotificationSettings] (val x: Self) extends AnyVal {
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
    def setAlertType(value: IosNotificationAlertType): Self = this.set("alertType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlertType: Self = this.set("alertType", js.undefined)
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    @scala.inline
    def setBadgesEnabled(value: Boolean): Self = this.set("badgesEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgesEnabled: Self = this.set("badgesEnabled", js.undefined)
    @scala.inline
    def setBundleID(value: String): Self = this.set("bundleID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleID: Self = this.set("bundleID", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setShowInNotificationCenter(value: Boolean): Self = this.set("showInNotificationCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInNotificationCenter: Self = this.set("showInNotificationCenter", js.undefined)
    @scala.inline
    def setShowOnLockScreen(value: Boolean): Self = this.set("showOnLockScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOnLockScreen: Self = this.set("showOnLockScreen", js.undefined)
    @scala.inline
    def setSoundsEnabled(value: Boolean): Self = this.set("soundsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoundsEnabled: Self = this.set("soundsEnabled", js.undefined)
  }
  
}

