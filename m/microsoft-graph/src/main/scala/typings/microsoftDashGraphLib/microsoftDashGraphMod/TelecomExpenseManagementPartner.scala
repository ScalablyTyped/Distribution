package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TelecomExpenseManagementPartner extends Entity {
  // Whether the partner's AAD app has been authorized to access Intune.
  var appAuthorized: js.UndefOr[scala.Boolean] = js.undefined
  // Display name of the TEM partner.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Whether Intune's connection to the TEM service is currently enabled or disabled.
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  // Timestamp of the last request sent to Intune by the TEM partner.
  var lastConnectionDateTime: js.UndefOr[java.lang.String] = js.undefined
  // URL of the TEM partner's administrative control panel, where an administrator can configure their TEM service.
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object TelecomExpenseManagementPartner {
  @scala.inline
  def apply(
    appAuthorized: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    lastConnectionDateTime: java.lang.String = null,
    url: java.lang.String = null
  ): TelecomExpenseManagementPartner = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appAuthorized)) __obj.updateDynamic("appAuthorized")(appAuthorized)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastConnectionDateTime != null) __obj.updateDynamic("lastConnectionDateTime")(lastConnectionDateTime)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TelecomExpenseManagementPartner]
  }
}

