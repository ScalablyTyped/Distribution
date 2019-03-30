package typings
package naverDashWhaleLib.whaleNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullscreenSetDetails
  extends chromeLib.chromeNs.contentSettingsNs.SetDetails {
  @JSName("setting")
  var setting_FullscreenSetDetails: naverDashWhaleLib.naverDashWhaleLibStrings.allow
}

object FullscreenSetDetails {
  @scala.inline
  def apply(
    primaryPattern: java.lang.String,
    setting: naverDashWhaleLib.naverDashWhaleLibStrings.allow,
    resourceIdentifier: chromeLib.chromeNs.contentSettingsNs.ResourceIdentifier = null,
    scope: chromeLib.chromeNs.contentSettingsNs.ScopeEnum = null,
    secondaryPattern: java.lang.String = null
  ): FullscreenSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern, setting = setting)
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[FullscreenSetDetails]
  }
}

