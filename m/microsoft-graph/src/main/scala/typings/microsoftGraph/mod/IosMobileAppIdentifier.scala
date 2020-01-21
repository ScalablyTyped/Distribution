package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosMobileAppIdentifier extends MobileAppIdentifier {
  // The identifier for an app, as specified in the app store.
  var bundleId: js.UndefOr[String] = js.undefined
}

object IosMobileAppIdentifier {
  @scala.inline
  def apply(bundleId: String = null): IosMobileAppIdentifier = {
    val __obj = js.Dynamic.literal()
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosMobileAppIdentifier]
  }
}

