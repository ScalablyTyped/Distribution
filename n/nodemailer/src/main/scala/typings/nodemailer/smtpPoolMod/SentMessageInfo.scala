package typings.nodemailer.smtpPoolMod

import typings.nodemailer.mimeNodeMod.Envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentMessageInfo
  extends typings.nodemailer.smtpConnectionMod.SentMessageInfo {
  /** includes the envelope object for the message */
  var envelope: Envelope = js.native
  /** most transports should return the final Message-Id value used with this property */
  var messageId: String = js.native
}

object SentMessageInfo {
  @scala.inline
  def apply(
    accepted: js.Array[String],
    envelope: Envelope,
    envelopeTime: Double,
    messageId: String,
    messageSize: Double,
    messageTime: Double,
    rejected: js.Array[String],
    response: String
  ): SentMessageInfo = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], envelopeTime = envelopeTime.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], messageSize = messageSize.asInstanceOf[js.Any], messageTime = messageTime.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
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
  }
  
}

