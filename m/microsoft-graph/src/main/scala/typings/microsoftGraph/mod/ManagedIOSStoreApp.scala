package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedIOSStoreApp extends ManagedApp {
  // The Apple AppStoreUrl.
  var appStoreUrl: js.UndefOr[String] = js.native
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.native
  // The app's Bundle ID.
  var bundleId: js.UndefOr[String] = js.native
  // The value for the minimum supported operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[IosMinimumOperatingSystem] = js.native
}

object ManagedIOSStoreApp {
  @scala.inline
  def apply(): ManagedIOSStoreApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedIOSStoreApp]
  }
  @scala.inline
  implicit class ManagedIOSStoreAppOps[Self <: ManagedIOSStoreApp] (val x: Self) extends AnyVal {
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
    def setAppStoreUrl(value: String): Self = this.set("appStoreUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppStoreUrl: Self = this.set("appStoreUrl", js.undefined)
    @scala.inline
    def setApplicableDeviceType(value: IosDeviceType): Self = this.set("applicableDeviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicableDeviceType: Self = this.set("applicableDeviceType", js.undefined)
    @scala.inline
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: IosMinimumOperatingSystem): Self = this.set("minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumSupportedOperatingSystem: Self = this.set("minimumSupportedOperatingSystem", js.undefined)
  }
  
}

