package typings.nodemailer.sesTransportMod

import typings.nodemailer.mimeNodeMod.Envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentMessageInfo extends js.Object {
  /** an envelope object {from:‘address’, to:[‘address’]} */
  var envelope: Envelope = js.native
  /** the Message-ID header value. This value is derived from the response of SES API, so it differs from the Message-ID values used in logging. */
  var messageId: String = js.native
  var response: String = js.native
}

object SentMessageInfo {
  @scala.inline
  def apply(envelope: Envelope, messageId: String, response: String): SentMessageInfo = {
    val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
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
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

