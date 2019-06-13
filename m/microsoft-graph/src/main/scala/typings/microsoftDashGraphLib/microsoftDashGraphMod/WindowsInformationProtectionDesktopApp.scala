package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionDesktopApp extends WindowsInformationProtectionApp {
  /** The binary name. */
  var binaryName: js.UndefOr[java.lang.String] = js.undefined
  /** The high binary version. */
  var binaryVersionHigh: js.UndefOr[java.lang.String] = js.undefined
  /** The lower binary version. */
  var binaryVersionLow: js.UndefOr[java.lang.String] = js.undefined
}

object WindowsInformationProtectionDesktopApp {
  @scala.inline
  def apply(
    binaryName: java.lang.String = null,
    binaryVersionHigh: java.lang.String = null,
    binaryVersionLow: java.lang.String = null,
    denied: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    productName: java.lang.String = null,
    publisherName: java.lang.String = null
  ): WindowsInformationProtectionDesktopApp = {
    val __obj = js.Dynamic.literal()
    if (binaryName != null) __obj.updateDynamic("binaryName")(binaryName)
    if (binaryVersionHigh != null) __obj.updateDynamic("binaryVersionHigh")(binaryVersionHigh)
    if (binaryVersionLow != null) __obj.updateDynamic("binaryVersionLow")(binaryVersionLow)
    if (!js.isUndefined(denied)) __obj.updateDynamic("denied")(denied)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (productName != null) __obj.updateDynamic("productName")(productName)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    __obj.asInstanceOf[WindowsInformationProtectionDesktopApp]
  }
}

