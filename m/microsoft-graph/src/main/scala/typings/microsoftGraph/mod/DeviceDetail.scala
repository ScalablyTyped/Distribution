package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceDetail extends js.Object {
  // Indicates the browser information of the used for signing in.
  var browser: js.UndefOr[String] = js.native
  // Refers to the UniqueID of the device used for signing in.
  var deviceId: js.UndefOr[String] = js.native
  // Refers to the name of the device used for signing in.
  var displayName: js.UndefOr[String] = js.native
  // Indicates whether the device is compliant.
  var isCompliant: js.UndefOr[Boolean] = js.native
  // Indicates whether the device is managed.
  var isManaged: js.UndefOr[Boolean] = js.native
  // Indicates the operating system name and version used for signing in.
  var operatingSystem: js.UndefOr[String] = js.native
  // Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
  var trustType: js.UndefOr[String] = js.native
}

object DeviceDetail {
  @scala.inline
  def apply(): DeviceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDetail]
  }
  @scala.inline
  implicit class DeviceDetailOps[Self <: DeviceDetail] (val x: Self) extends AnyVal {
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
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setIsCompliant(value: Boolean): Self = this.set("isCompliant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCompliant: Self = this.set("isCompliant", js.undefined)
    @scala.inline
    def setIsManaged(value: Boolean): Self = this.set("isManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsManaged: Self = this.set("isManaged", js.undefined)
    @scala.inline
    def setOperatingSystem(value: String): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystem: Self = this.set("operatingSystem", js.undefined)
    @scala.inline
    def setTrustType(value: String): Self = this.set("trustType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustType: Self = this.set("trustType", js.undefined)
  }
  
}

