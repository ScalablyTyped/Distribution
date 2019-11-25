package typings.nodemailer.libSmtpDashPoolMod

import typings.nodemailer.libMimeDashNodeMod.Envelope
import typings.nodemailer.libSmtpDashConnectionMod.SMTPError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo
  extends typings.nodemailer.libSmtpDashConnectionMod.SentMessageInfo {
  /** includes the envelope object for the message */
  var envelope: Envelope
  /** most transports should return the final Message-Id value used with this property */
  var messageId: String
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
    response: String,
    rejectedErrors: js.Array[SMTPError] = null
  ): SentMessageInfo = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], envelopeTime = envelopeTime.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], messageSize = messageSize.asInstanceOf[js.Any], messageTime = messageTime.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    if (rejectedErrors != null) __obj.updateDynamic("rejectedErrors")(rejectedErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentMessageInfo]
  }
}

