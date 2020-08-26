package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryMessage extends js.Object {
  var DeliveryMessage: String = js.native
  var DestinationIP: String = js.native
  var DestinationServer: String = js.native
}

object DeliveryMessage {
  @scala.inline
  def apply(DeliveryMessage: String, DestinationIP: String, DestinationServer: String): DeliveryMessage = {
    val __obj = js.Dynamic.literal(DeliveryMessage = DeliveryMessage.asInstanceOf[js.Any], DestinationIP = DestinationIP.asInstanceOf[js.Any], DestinationServer = DestinationServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryMessage]
  }
  @scala.inline
  implicit class DeliveryMessageOps[Self <: DeliveryMessage] (val x: Self) extends AnyVal {
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
    def setDeliveryMessage(value: String): Self = this.set("DeliveryMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationIP(value: String): Self = this.set("DestinationIP", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationServer(value: String): Self = this.set("DestinationServer", value.asInstanceOf[js.Any])
  }
  
}

