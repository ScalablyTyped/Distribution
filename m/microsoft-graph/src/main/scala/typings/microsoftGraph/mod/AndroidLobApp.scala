package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidLobApp extends MobileLobApp {
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[AndroidMinimumOperatingSystem] = js.native
  // The package identifier.
  var packageId: js.UndefOr[String] = js.native
  // The version code of Android Line of Business (LoB) app.
  var versionCode: js.UndefOr[String] = js.native
  // The version name of Android Line of Business (LoB) app.
  var versionName: js.UndefOr[String] = js.native
}

object AndroidLobApp {
  @scala.inline
  def apply(): AndroidLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidLobApp]
  }
  @scala.inline
  implicit class AndroidLobAppOps[Self <: AndroidLobApp] (val x: Self) extends AnyVal {
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
    def setMinimumSupportedOperatingSystem(value: AndroidMinimumOperatingSystem): Self = this.set("minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumSupportedOperatingSystem: Self = this.set("minimumSupportedOperatingSystem", js.undefined)
    @scala.inline
    def setPackageId(value: String): Self = this.set("packageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageId: Self = this.set("packageId", js.undefined)
    @scala.inline
    def setVersionCode(value: String): Self = this.set("versionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionCode: Self = this.set("versionCode", js.undefined)
    @scala.inline
    def setVersionName(value: String): Self = this.set("versionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionName: Self = this.set("versionName", js.undefined)
  }
  
}

