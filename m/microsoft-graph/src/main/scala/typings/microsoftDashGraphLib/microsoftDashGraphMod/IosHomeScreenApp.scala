package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosHomeScreenApp extends IosHomeScreenItem {
  // BundleID of app
  var bundleID: js.UndefOr[java.lang.String] = js.undefined
}

object IosHomeScreenApp {
  @scala.inline
  def apply(bundleID: java.lang.String = null, displayName: java.lang.String = null): IosHomeScreenApp = {
    val __obj = js.Dynamic.literal()
    if (bundleID != null) __obj.updateDynamic("bundleID")(bundleID)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[IosHomeScreenApp]
  }
}

