package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryMessage extends js.Object {
  var DeliveryMessage: String
  var DestinationIP: String
  var DestinationServer: String
}

object DeliveryMessage {
  @scala.inline
  def apply(DeliveryMessage: String, DestinationIP: String, DestinationServer: String): DeliveryMessage = {
    val __obj = js.Dynamic.literal(DeliveryMessage = DeliveryMessage.asInstanceOf[js.Any], DestinationIP = DestinationIP.asInstanceOf[js.Any], DestinationServer = DestinationServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryMessage]
  }
}

