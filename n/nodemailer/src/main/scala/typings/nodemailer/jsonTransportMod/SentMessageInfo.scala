package typings.nodemailer.jsonTransportMod

import typings.nodemailer.mimeNodeMod.Envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentMessageInfo extends js.Object {
  /** an envelope object {from:‘address’, to:[‘address’]} */
  var envelope: Envelope = js.native
  /** JSON string */
  var message: String = js.native
  /** the Message-ID header value */
  var messageId: String = js.native
}

object SentMessageInfo {
  @scala.inline
  def apply(envelope: Envelope, message: String, messageId: String): SentMessageInfo = {
    val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentMessageInfo]
  }
  @scala.inline
  implicit class SentMessageInfoOps[Self <: SentMessageInfo] (val x: Self) extends AnyVal {
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
    def setEnvelope(value: Envelope): Self = this.set("envelope", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
  }
  
}

