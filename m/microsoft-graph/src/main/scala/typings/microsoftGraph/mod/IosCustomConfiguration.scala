package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosCustomConfiguration extends DeviceConfiguration {
  // Payload. (UTF8 encoded byte array)
  var payload: js.UndefOr[Double] = js.native
  // Payload file name (.mobileconfig
  var payloadFileName: js.UndefOr[String] = js.native
  // Name that is displayed to the user.
  var payloadName: js.UndefOr[String] = js.native
}

object IosCustomConfiguration {
  @scala.inline
  def apply(): IosCustomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosCustomConfiguration]
  }
  @scala.inline
  implicit class IosCustomConfigurationOps[Self <: IosCustomConfiguration] (val x: Self) extends AnyVal {
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
    def setPayload(value: Double): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setPayloadFileName(value: String): Self = this.set("payloadFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloadFileName: Self = this.set("payloadFileName", js.undefined)
    @scala.inline
    def setPayloadName(value: String): Self = this.set("payloadName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloadName: Self = this.set("payloadName", js.undefined)
  }
  
}

