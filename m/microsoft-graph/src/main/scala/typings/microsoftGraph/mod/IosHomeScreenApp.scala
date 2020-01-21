package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosHomeScreenApp extends IosHomeScreenItem {
  // BundleID of app
  var bundleID: js.UndefOr[String] = js.undefined
}

object IosHomeScreenApp {
  @scala.inline
  def apply(bundleID: String = null, displayName: String = null): IosHomeScreenApp = {
    val __obj = js.Dynamic.literal()
    if (bundleID != null) __obj.updateDynamic("bundleID")(bundleID.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosHomeScreenApp]
  }
}

