package typings
package naverDashWhaleLib.whaleNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraSetDetails
  extends chromeLib.chromeNs.contentSettingsNs.SetDetails {
  @JSName("setting")
  var setting_CameraSetDetails: naverDashWhaleLib.naverDashWhaleLibStrings.allow | naverDashWhaleLib.naverDashWhaleLibStrings.block | naverDashWhaleLib.naverDashWhaleLibStrings.ask
}

object CameraSetDetails {
  @scala.inline
  def apply(
    primaryPattern: java.lang.String,
    setting: naverDashWhaleLib.naverDashWhaleLibStrings.allow | naverDashWhaleLib.naverDashWhaleLibStrings.block | naverDashWhaleLib.naverDashWhaleLibStrings.ask,
    resourceIdentifier: chromeLib.chromeNs.contentSettingsNs.ResourceIdentifier = null,
    scope: chromeLib.chromeNs.contentSettingsNs.ScopeEnum = null,
    secondaryPattern: java.lang.String = null
  ): CameraSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern, setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[CameraSetDetails]
  }
}

