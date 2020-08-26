package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosDeviceFeaturesConfiguration extends DeviceConfiguration {
  // Asset tag information for the device, displayed on the login window and lock screen.
  var assetTagTemplate: js.UndefOr[String] = js.native
  // A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
  var homeScreenDockIcons: js.UndefOr[js.Array[IosHomeScreenItem]] = js.native
  // A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
  var homeScreenPages: js.UndefOr[js.Array[IosHomeScreenPage]] = js.native
  // A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
  var lockScreenFootnote: js.UndefOr[String] = js.native
  /**
    * Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This
    * collection can contain a maximum of 500 elements.
    */
  var notificationSettings: js.UndefOr[js.Array[IosNotificationSettings]] = js.native
}

object IosDeviceFeaturesConfiguration {
  @scala.inline
  def apply(): IosDeviceFeaturesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceFeaturesConfiguration]
  }
  @scala.inline
  implicit class IosDeviceFeaturesConfigurationOps[Self <: IosDeviceFeaturesConfiguration] (val x: Self) extends AnyVal {
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
    def setAssetTagTemplate(value: String): Self = this.set("assetTagTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetTagTemplate: Self = this.set("assetTagTemplate", js.undefined)
    @scala.inline
    def setHomeScreenDockIconsVarargs(value: IosHomeScreenItem*): Self = this.set("homeScreenDockIcons", js.Array(value :_*))
    @scala.inline
    def setHomeScreenDockIcons(value: js.Array[IosHomeScreenItem]): Self = this.set("homeScreenDockIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeScreenDockIcons: Self = this.set("homeScreenDockIcons", js.undefined)
    @scala.inline
    def setHomeScreenPagesVarargs(value: IosHomeScreenPage*): Self = this.set("homeScreenPages", js.Array(value :_*))
    @scala.inline
    def setHomeScreenPages(value: js.Array[IosHomeScreenPage]): Self = this.set("homeScreenPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeScreenPages: Self = this.set("homeScreenPages", js.undefined)
    @scala.inline
    def setLockScreenFootnote(value: String): Self = this.set("lockScreenFootnote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockScreenFootnote: Self = this.set("lockScreenFootnote", js.undefined)
    @scala.inline
    def setNotificationSettingsVarargs(value: IosNotificationSettings*): Self = this.set("notificationSettings", js.Array(value :_*))
    @scala.inline
    def setNotificationSettings(value: js.Array[IosNotificationSettings]): Self = this.set("notificationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationSettings: Self = this.set("notificationSettings", js.undefined)
  }
  
}

