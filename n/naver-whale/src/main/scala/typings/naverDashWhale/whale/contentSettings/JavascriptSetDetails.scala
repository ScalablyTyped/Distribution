package typings.naverDashWhale.whale.contentSettings

import typings.naverDashWhale.naverDashWhaleStrings.allow
import typings.naverDashWhale.naverDashWhaleStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JavascriptSetDetails
  extends typings.chrome.chrome.contentSettings.SetDetails {
  @JSName("setting")
  var setting_JavascriptSetDetails: allow | block
}

object JavascriptSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow | block,
    resourceIdentifier: typings.chrome.chrome.contentSettings.ResourceIdentifier = null,
    scope: typings.chrome.chrome.contentSettings.ScopeEnum = null,
    secondaryPattern: String = null
  ): JavascriptSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern, setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[JavascriptSetDetails]
  }
}

