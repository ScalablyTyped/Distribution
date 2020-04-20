package typings.openfin.interappbusChannelMod

import typings.openfin.transportMod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelPayload extends js.Object {
  var payload: Payload
}

object ChannelPayload {
  @scala.inline
  def apply(payload: Payload): ChannelPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelPayload]
  }
}

