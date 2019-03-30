package typings
package naverDashWhaleLib.whaleNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupsSetDetails
  extends chromeLib.chromeNs.contentSettingsNs.SetDetails {
  @JSName("setting")
  var setting_PopupsSetDetails: naverDashWhaleLib.naverDashWhaleLibStrings.allow | naverDashWhaleLib.naverDashWhaleLibStrings.block
}

object PopupsSetDetails {
  @scala.inline
  def apply(
    primaryPattern: java.lang.String,
    setting: naverDashWhaleLib.naverDashWhaleLibStrings.allow | naverDashWhaleLib.naverDashWhaleLibStrings.block,
    resourceIdentifier: chromeLib.chromeNs.contentSettingsNs.ResourceIdentifier = null,
    scope: chromeLib.chromeNs.contentSettingsNs.ScopeEnum = null,
    secondaryPattern: java.lang.String = null
  ): PopupsSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern, setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[PopupsSetDetails]
  }
}

