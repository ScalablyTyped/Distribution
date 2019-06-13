package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosMobileAppIdentifier extends MobileAppIdentifier {
  /** The identifier for an app, as specified in the app store. */
  var bundleId: js.UndefOr[java.lang.String] = js.undefined
}

object IosMobileAppIdentifier {
  @scala.inline
  def apply(bundleId: java.lang.String = null): IosMobileAppIdentifier = {
    val __obj = js.Dynamic.literal()
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    __obj.asInstanceOf[IosMobileAppIdentifier]
  }
}

