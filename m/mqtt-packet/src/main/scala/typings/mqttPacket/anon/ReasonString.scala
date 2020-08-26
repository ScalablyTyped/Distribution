package typings.mqttPacket.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReasonString extends js.Object {
  var reasonString: js.UndefOr[String] = js.native
  var userProperties: js.UndefOr[js.Object] = js.native
}

object ReasonString {
  @scala.inline
  def apply(): ReasonString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReasonString]
  }
  @scala.inline
  implicit class ReasonStringOps[Self <: ReasonString] (val x: Self) extends AnyVal {
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
    def setReasonString(value: String): Self = this.set("reasonString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonString: Self = this.set("reasonString", js.undefined)
    @scala.inline
    def setUserProperties(value: js.Object): Self = this.set("userProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProperties: Self = this.set("userProperties", js.undefined)
  }
  
}

