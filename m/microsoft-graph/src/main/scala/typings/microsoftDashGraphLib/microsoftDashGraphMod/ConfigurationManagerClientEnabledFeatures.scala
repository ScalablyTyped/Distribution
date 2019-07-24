package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationManagerClientEnabledFeatures extends js.Object {
  // Whether compliance policy is managed by Intune
  var compliancePolicy: js.UndefOr[scala.Boolean] = js.undefined
  // Whether device configuration is managed by Intune
  var deviceConfiguration: js.UndefOr[scala.Boolean] = js.undefined
  // Whether inventory is managed by Intune
  var inventory: js.UndefOr[scala.Boolean] = js.undefined
  // Whether modern application is managed by Intune
  var modernApps: js.UndefOr[scala.Boolean] = js.undefined
  // Whether resource access is managed by Intune
  var resourceAccess: js.UndefOr[scala.Boolean] = js.undefined
  // Whether Windows Update for Business is managed by Intune
  var windowsUpdateForBusiness: js.UndefOr[scala.Boolean] = js.undefined
}

object ConfigurationManagerClientEnabledFeatures {
  @scala.inline
  def apply(
    compliancePolicy: js.UndefOr[scala.Boolean] = js.undefined,
    deviceConfiguration: js.UndefOr[scala.Boolean] = js.undefined,
    inventory: js.UndefOr[scala.Boolean] = js.undefined,
    modernApps: js.UndefOr[scala.Boolean] = js.undefined,
    resourceAccess: js.UndefOr[scala.Boolean] = js.undefined,
    windowsUpdateForBusiness: js.UndefOr[scala.Boolean] = js.undefined
  ): ConfigurationManagerClientEnabledFeatures = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compliancePolicy)) __obj.updateDynamic("compliancePolicy")(compliancePolicy)
    if (!js.isUndefined(deviceConfiguration)) __obj.updateDynamic("deviceConfiguration")(deviceConfiguration)
    if (!js.isUndefined(inventory)) __obj.updateDynamic("inventory")(inventory)
    if (!js.isUndefined(modernApps)) __obj.updateDynamic("modernApps")(modernApps)
    if (!js.isUndefined(resourceAccess)) __obj.updateDynamic("resourceAccess")(resourceAccess)
    if (!js.isUndefined(windowsUpdateForBusiness)) __obj.updateDynamic("windowsUpdateForBusiness")(windowsUpdateForBusiness)
    __obj.asInstanceOf[ConfigurationManagerClientEnabledFeatures]
  }
}

