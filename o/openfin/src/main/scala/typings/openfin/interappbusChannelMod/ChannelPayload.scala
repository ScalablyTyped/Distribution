package typings.openfin.interappbusChannelMod

import typings.openfin.transportMod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelPayload extends js.Object {
  var payload: Payload = js.native
}

object ChannelPayload {
  @scala.inline
  def apply(payload: Payload): ChannelPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelPayload]
  }
  @scala.inline
  implicit class ChannelPayloadOps[Self <: ChannelPayload] (val x: Self) extends AnyVal {
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
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
  
}

