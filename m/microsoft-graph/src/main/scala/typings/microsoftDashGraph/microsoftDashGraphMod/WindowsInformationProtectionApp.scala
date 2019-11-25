package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionApp extends js.Object {
  // If true, app is denied protection or exemption.
  var denied: js.UndefOr[Boolean] = js.undefined
  // The app's description.
  var description: js.UndefOr[String] = js.undefined
  // App display name.
  var displayName: js.UndefOr[String] = js.undefined
  // The product name.
  var productName: js.UndefOr[String] = js.undefined
  // The publisher name
  var publisherName: js.UndefOr[String] = js.undefined
}

object WindowsInformationProtectionApp {
  @scala.inline
  def apply(
    denied: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    displayName: String = null,
    productName: String = null,
    publisherName: String = null
  ): WindowsInformationProtectionApp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(denied)) __obj.updateDynamic("denied")(denied.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsInformationProtectionApp]
  }
}

