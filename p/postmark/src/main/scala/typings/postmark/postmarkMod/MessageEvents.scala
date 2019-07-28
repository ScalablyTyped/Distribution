package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// message events
trait MessageEvents extends js.Object {
  var Details: MessageEventDetails
  var ReceivedAt: String
  var Recipient: String
  var Type: String
}

object MessageEvents {
  @scala.inline
  def apply(Details: MessageEventDetails, ReceivedAt: String, Recipient: String, Type: String): MessageEvents = {
    val __obj = js.Dynamic.literal(Details = Details, ReceivedAt = ReceivedAt, Recipient = Recipient, Type = Type)
  
    __obj.asInstanceOf[MessageEvents]
  }
}

