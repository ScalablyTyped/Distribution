package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosHomeScreenApp extends IosHomeScreenItem {
  // BundleID of app
  var bundleID: js.UndefOr[String] = js.native
}

object IosHomeScreenApp {
  @scala.inline
  def apply(): IosHomeScreenApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenApp]
  }
  @scala.inline
  implicit class IosHomeScreenAppOps[Self <: IosHomeScreenApp] (val x: Self) extends AnyVal {
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
    def setBundleID(value: String): Self = this.set("bundleID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleID: Self = this.set("bundleID", js.undefined)
  }
  
}

