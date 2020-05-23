package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditionUpgradeConfiguration extends DeviceConfiguration {
  // Edition Upgrade License File Content.
  var license: js.UndefOr[String] = js.undefined
  // Edition Upgrade License Type. Possible values are: productKey, licenseFile.
  var licenseType: js.UndefOr[EditionUpgradeLicenseType] = js.undefined
  // Edition Upgrade Product Key.
  var productKey: js.UndefOr[String] = js.undefined
  /**
    * Edition Upgrade Target Edition. Possible values are: windows10Enterprise, windows10EnterpriseN, windows10Education,
    * windows10EducationN, windows10MobileEnterprise, windows10HolographicEnterprise, windows10Professional,
    * windows10ProfessionalN, windows10ProfessionalEducation, windows10ProfessionalEducationN,
    * windows10ProfessionalWorkstation, windows10ProfessionalWorkstationN.
    */
  var targetEdition: js.UndefOr[Windows10EditionType] = js.undefined
}

object EditionUpgradeConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    license: String = null,
    licenseType: EditionUpgradeLicenseType = null,
    productKey: String = null,
    targetEdition: Windows10EditionType = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined
  ): EditionUpgradeConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (licenseType != null) __obj.updateDynamic("licenseType")(licenseType.asInstanceOf[js.Any])
    if (productKey != null) __obj.updateDynamic("productKey")(productKey.asInstanceOf[js.Any])
    if (targetEdition != null) __obj.updateDynamic("targetEdition")(targetEdition.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditionUpgradeConfiguration]
  }
}

