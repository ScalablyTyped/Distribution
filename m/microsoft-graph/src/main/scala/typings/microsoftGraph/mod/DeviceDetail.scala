package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceDetail extends js.Object {
  // Indicates the browser information of the used for signing in.
  var browser: js.UndefOr[String] = js.undefined
  // Refers to the UniqueID of the device used for signing in.
  var deviceId: js.UndefOr[String] = js.undefined
  // Refers to the name of the device used for signing in.
  var displayName: js.UndefOr[String] = js.undefined
  // Indicates whether the device is compliant.
  var isCompliant: js.UndefOr[Boolean] = js.undefined
  // Indicates whether the device is managed.
  var isManaged: js.UndefOr[Boolean] = js.undefined
  // Indicates the operating system name and version used for signing in.
  var operatingSystem: js.UndefOr[String] = js.undefined
  // Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
  var trustType: js.UndefOr[String] = js.undefined
}

object DeviceDetail {
  @scala.inline
  def apply(
    browser: String = null,
    deviceId: String = null,
    displayName: String = null,
    isCompliant: js.UndefOr[Boolean] = js.undefined,
    isManaged: js.UndefOr[Boolean] = js.undefined,
    operatingSystem: String = null,
    trustType: String = null
  ): DeviceDetail = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompliant)) __obj.updateDynamic("isCompliant")(isCompliant.asInstanceOf[js.Any])
    if (!js.isUndefined(isManaged)) __obj.updateDynamic("isManaged")(isManaged.asInstanceOf[js.Any])
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem.asInstanceOf[js.Any])
    if (trustType != null) __obj.updateDynamic("trustType")(trustType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDetail]
  }
}

