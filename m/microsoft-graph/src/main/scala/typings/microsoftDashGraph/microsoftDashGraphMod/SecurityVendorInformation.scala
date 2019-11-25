package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityVendorInformation extends js.Object {
  // Specific provider (product/service - not vendor company); for example, WindowsDefenderATP.
  var provider: js.UndefOr[String] = js.undefined
  // Version of the provider or subprovider, if it exists, that generated the alert. Required
  var providerVersion: js.UndefOr[String] = js.undefined
  // Specific subprovider (under aggregating provider); for example, WindowsDefenderATP.SmartScreen.
  var subProvider: js.UndefOr[String] = js.undefined
  // Name of the alert vendor (for example, Microsoft, Dell, FireEye). Required
  var vendor: js.UndefOr[String] = js.undefined
}

object SecurityVendorInformation {
  @scala.inline
  def apply(
    provider: String = null,
    providerVersion: String = null,
    subProvider: String = null,
    vendor: String = null
  ): SecurityVendorInformation = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (providerVersion != null) __obj.updateDynamic("providerVersion")(providerVersion.asInstanceOf[js.Any])
    if (subProvider != null) __obj.updateDynamic("subProvider")(subProvider.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityVendorInformation]
  }
}

