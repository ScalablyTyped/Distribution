package typings.naverDashWhale.whaleNs.contentSettingsNs

import typings.naverDashWhale.naverDashWhaleStrings.allow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullscreenSetDetails
  extends typings.chrome.chromeNs.contentSettingsNs.SetDetails {
  @JSName("setting")
  var setting_FullscreenSetDetails: allow
}

object FullscreenSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow,
    resourceIdentifier: typings.chrome.chromeNs.contentSettingsNs.ResourceIdentifier = null,
    scope: typings.chrome.chromeNs.contentSettingsNs.ScopeEnum = null,
    secondaryPattern: String = null
  ): FullscreenSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern, setting = setting)
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[FullscreenSetDetails]
  }
}

