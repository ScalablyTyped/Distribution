package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeliveryMessage extends js.Object {
  var DeliveryMessage: String
  var DestinationIP: String
  var DestinationServer: String
}

object AnonDeliveryMessage {
  @scala.inline
  def apply(DeliveryMessage: String, DestinationIP: String, DestinationServer: String): AnonDeliveryMessage = {
    val __obj = js.Dynamic.literal(DeliveryMessage = DeliveryMessage.asInstanceOf[js.Any], DestinationIP = DestinationIP.asInstanceOf[js.Any], DestinationServer = DestinationServer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeliveryMessage]
  }
}

