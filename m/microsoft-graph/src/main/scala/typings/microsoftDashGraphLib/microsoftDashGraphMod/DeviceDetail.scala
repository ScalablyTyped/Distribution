package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceDetail extends js.Object {
  /** Indicates the browser information of the used for signing in. */
  var browser: js.UndefOr[java.lang.String] = js.undefined
  /** Refers to the UniqueID of the device used for signing in. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /** Refers to the name of the device used for signing in. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the device is compliant. */
  var isCompliant: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether the device is managed. */
  var isManaged: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates the operating system name and version used for signing in. */
  var operatingSystem: js.UndefOr[java.lang.String] = js.undefined
  /** Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined. */
  var trustType: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceDetail {
  @scala.inline
  def apply(
    browser: java.lang.String = null,
    deviceId: java.lang.String = null,
    displayName: java.lang.String = null,
    isCompliant: js.UndefOr[scala.Boolean] = js.undefined,
    isManaged: js.UndefOr[scala.Boolean] = js.undefined,
    operatingSystem: java.lang.String = null,
    trustType: java.lang.String = null
  ): DeviceDetail = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(isCompliant)) __obj.updateDynamic("isCompliant")(isCompliant)
    if (!js.isUndefined(isManaged)) __obj.updateDynamic("isManaged")(isManaged)
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem)
    if (trustType != null) __obj.updateDynamic("trustType")(trustType)
    __obj.asInstanceOf[DeviceDetail]
  }
}

