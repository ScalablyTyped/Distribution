package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosDeviceFeaturesConfiguration extends DeviceConfiguration {
  // Asset tag information for the device, displayed on the login window and lock screen.
  var assetTagTemplate: js.UndefOr[String] = js.undefined
  // A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
  var homeScreenDockIcons: js.UndefOr[js.Array[IosHomeScreenItem]] = js.undefined
  // A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
  var homeScreenPages: js.UndefOr[js.Array[IosHomeScreenPage]] = js.undefined
  // A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
  var lockScreenFootnote: js.UndefOr[String] = js.undefined
  /**
    * Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This
    * collection can contain a maximum of 500 elements.
    */
  var notificationSettings: js.UndefOr[js.Array[IosNotificationSettings]] = js.undefined
}

object IosDeviceFeaturesConfiguration {
  @scala.inline
  def apply(
    assetTagTemplate: String = null,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: String = null,
    homeScreenDockIcons: js.Array[IosHomeScreenItem] = null,
    homeScreenPages: js.Array[IosHomeScreenPage] = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    lockScreenFootnote: String = null,
    notificationSettings: js.Array[IosNotificationSettings] = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined
  ): IosDeviceFeaturesConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assetTagTemplate != null) __obj.updateDynamic("assetTagTemplate")(assetTagTemplate.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (homeScreenDockIcons != null) __obj.updateDynamic("homeScreenDockIcons")(homeScreenDockIcons.asInstanceOf[js.Any])
    if (homeScreenPages != null) __obj.updateDynamic("homeScreenPages")(homeScreenPages.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (lockScreenFootnote != null) __obj.updateDynamic("lockScreenFootnote")(lockScreenFootnote.asInstanceOf[js.Any])
    if (notificationSettings != null) __obj.updateDynamic("notificationSettings")(notificationSettings.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosDeviceFeaturesConfiguration]
  }
}

