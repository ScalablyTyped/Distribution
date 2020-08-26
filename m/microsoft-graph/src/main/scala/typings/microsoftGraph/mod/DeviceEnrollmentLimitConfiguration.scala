package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEnrollmentLimitConfiguration extends DeviceEnrollmentConfiguration {
  // Not yet documented
  var limit: js.UndefOr[Double] = js.native
}

object DeviceEnrollmentLimitConfiguration {
  @scala.inline
  def apply(): DeviceEnrollmentLimitConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentLimitConfiguration]
  }
  @scala.inline
  implicit class DeviceEnrollmentLimitConfigurationOps[Self <: DeviceEnrollmentLimitConfiguration] (val x: Self) extends AnyVal {
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
  
}

