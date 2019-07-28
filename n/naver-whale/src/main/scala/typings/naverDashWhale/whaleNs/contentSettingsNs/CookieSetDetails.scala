package typings.naverDashWhale.whaleNs.contentSettingsNs

import typings.naverDashWhale.naverDashWhaleStrings.allow
import typings.naverDashWhale.naverDashWhaleStrings.block
import typings.naverDashWhale.naverDashWhaleStrings.session_only
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieSetDetails
  extends typings.chrome.chromeNs.contentSettingsNs.SetDetails {
  @JSName("setting")
  var setting_CookieSetDetails: allow | block | session_only
}

object CookieSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow | block | session_only,
    resourceIdentifier: typings.chrome.chromeNs.contentSettingsNs.ResourceIdentifier = null,
    scope: typings.chrome.chromeNs.contentSettingsNs.ScopeEnum = null,
    secondaryPattern: String = null
  ): CookieSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern, setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[CookieSetDetails]
  }
}

