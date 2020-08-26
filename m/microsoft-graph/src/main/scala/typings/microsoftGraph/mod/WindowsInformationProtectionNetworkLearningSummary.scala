package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsInformationProtectionNetworkLearningSummary extends Entity {
  // Device Count
  var deviceCount: js.UndefOr[Double] = js.native
  // Website url
  var url: js.UndefOr[String] = js.native
}

object WindowsInformationProtectionNetworkLearningSummary {
  @scala.inline
  def apply(): WindowsInformationProtectionNetworkLearningSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionNetworkLearningSummary]
  }
  @scala.inline
  implicit class WindowsInformationProtectionNetworkLearningSummaryOps[Self <: WindowsInformationProtectionNetworkLearningSummary] (val x: Self) extends AnyVal {
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
    def setDeviceCount(value: Double): Self = this.set("deviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCount: Self = this.set("deviceCount", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

