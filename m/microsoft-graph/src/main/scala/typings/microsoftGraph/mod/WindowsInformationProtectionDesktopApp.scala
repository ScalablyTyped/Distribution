package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionDesktopApp extends WindowsInformationProtectionApp {
  // The binary name.
  var binaryName: js.UndefOr[String] = js.undefined
  // The high binary version.
  var binaryVersionHigh: js.UndefOr[String] = js.undefined
  // The lower binary version.
  var binaryVersionLow: js.UndefOr[String] = js.undefined
}

object WindowsInformationProtectionDesktopApp {
  @scala.inline
  def apply(
    binaryName: String = null,
    binaryVersionHigh: String = null,
    binaryVersionLow: String = null,
    denied: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    displayName: String = null,
    productName: String = null,
    publisherName: String = null
  ): WindowsInformationProtectionDesktopApp = {
    val __obj = js.Dynamic.literal()
    if (binaryName != null) __obj.updateDynamic("binaryName")(binaryName.asInstanceOf[js.Any])
    if (binaryVersionHigh != null) __obj.updateDynamic("binaryVersionHigh")(binaryVersionHigh.asInstanceOf[js.Any])
    if (binaryVersionLow != null) __obj.updateDynamic("binaryVersionLow")(binaryVersionLow.asInstanceOf[js.Any])
    if (!js.isUndefined(denied)) __obj.updateDynamic("denied")(denied.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsInformationProtectionDesktopApp]
  }
}

