package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionApp extends js.Object {
  // If true, app is denied protection or exemption.
  var denied: js.UndefOr[scala.Boolean] = js.undefined
  // The app's description.
  var description: js.UndefOr[java.lang.String] = js.undefined
  // App display name.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // The product name.
  var productName: js.UndefOr[java.lang.String] = js.undefined
  // The publisher name
  var publisherName: js.UndefOr[java.lang.String] = js.undefined
}

object WindowsInformationProtectionApp {
  @scala.inline
  def apply(
    denied: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    productName: java.lang.String = null,
    publisherName: java.lang.String = null
  ): WindowsInformationProtectionApp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(denied)) __obj.updateDynamic("denied")(denied)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (productName != null) __obj.updateDynamic("productName")(productName)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    __obj.asInstanceOf[WindowsInformationProtectionApp]
  }
}

