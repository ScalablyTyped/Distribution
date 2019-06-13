package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosDeviceFeaturesConfiguration extends DeviceConfiguration {
  /** Asset tag information for the device, displayed on the login window and lock screen. */
  var assetTagTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements. */
  var homeScreenDockIcons: js.UndefOr[js.Array[IosHomeScreenItem]] = js.undefined
  /** A list of pages on the Home Screen. This collection can contain a maximum of 500 elements. */
  var homeScreenPages: js.UndefOr[js.Array[IosHomeScreenPage]] = js.undefined
  /** A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later. */
  var lockScreenFootnote: js.UndefOr[java.lang.String] = js.undefined
  /** Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements. */
  var notificationSettings: js.UndefOr[js.Array[IosNotificationSettings]] = js.undefined
}

object IosDeviceFeaturesConfiguration {
  @scala.inline
  def apply(
    assetTagTemplate: java.lang.String = null,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: java.lang.String = null,
    homeScreenDockIcons: js.Array[IosHomeScreenItem] = null,
    homeScreenPages: js.Array[IosHomeScreenPage] = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    lockScreenFootnote: java.lang.String = null,
    notificationSettings: js.Array[IosNotificationSettings] = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: scala.Int | scala.Double = null
  ): IosDeviceFeaturesConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assetTagTemplate != null) __obj.updateDynamic("assetTagTemplate")(assetTagTemplate)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (homeScreenDockIcons != null) __obj.updateDynamic("homeScreenDockIcons")(homeScreenDockIcons)
    if (homeScreenPages != null) __obj.updateDynamic("homeScreenPages")(homeScreenPages)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (lockScreenFootnote != null) __obj.updateDynamic("lockScreenFootnote")(lockScreenFootnote)
    if (notificationSettings != null) __obj.updateDynamic("notificationSettings")(notificationSettings)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosDeviceFeaturesConfiguration]
  }
}

