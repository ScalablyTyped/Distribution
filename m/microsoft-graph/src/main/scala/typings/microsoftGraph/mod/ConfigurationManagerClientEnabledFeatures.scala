package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationManagerClientEnabledFeatures extends js.Object {
  // Whether compliance policy is managed by Intune
  var compliancePolicy: js.UndefOr[Boolean] = js.undefined
  // Whether device configuration is managed by Intune
  var deviceConfiguration: js.UndefOr[Boolean] = js.undefined
  // Whether inventory is managed by Intune
  var inventory: js.UndefOr[Boolean] = js.undefined
  // Whether modern application is managed by Intune
  var modernApps: js.UndefOr[Boolean] = js.undefined
  // Whether resource access is managed by Intune
  var resourceAccess: js.UndefOr[Boolean] = js.undefined
  // Whether Windows Update for Business is managed by Intune
  var windowsUpdateForBusiness: js.UndefOr[Boolean] = js.undefined
}

object ConfigurationManagerClientEnabledFeatures {
  @scala.inline
  def apply(
    compliancePolicy: js.UndefOr[Boolean] = js.undefined,
    deviceConfiguration: js.UndefOr[Boolean] = js.undefined,
    inventory: js.UndefOr[Boolean] = js.undefined,
    modernApps: js.UndefOr[Boolean] = js.undefined,
    resourceAccess: js.UndefOr[Boolean] = js.undefined,
    windowsUpdateForBusiness: js.UndefOr[Boolean] = js.undefined
  ): ConfigurationManagerClientEnabledFeatures = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compliancePolicy)) __obj.updateDynamic("compliancePolicy")(compliancePolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceConfiguration)) __obj.updateDynamic("deviceConfiguration")(deviceConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(inventory)) __obj.updateDynamic("inventory")(inventory.asInstanceOf[js.Any])
    if (!js.isUndefined(modernApps)) __obj.updateDynamic("modernApps")(modernApps.asInstanceOf[js.Any])
    if (!js.isUndefined(resourceAccess)) __obj.updateDynamic("resourceAccess")(resourceAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsUpdateForBusiness)) __obj.updateDynamic("windowsUpdateForBusiness")(windowsUpdateForBusiness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationManagerClientEnabledFeatures]
  }
}

