package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosMobileAppIdentifier extends MobileAppIdentifier {
  // The identifier for an app, as specified in the app store.
  var bundleId: js.UndefOr[String] = js.native
}

object IosMobileAppIdentifier {
  @scala.inline
  def apply(): IosMobileAppIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosMobileAppIdentifier]
  }
  @scala.inline
  implicit class IosMobileAppIdentifierOps[Self <: IosMobileAppIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
  }
  
}

