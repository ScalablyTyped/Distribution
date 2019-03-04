package typings
package nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo
  extends nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SentMessageInfo {
  /** includes the envelope object for the message */
  var envelope: nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Envelope
  /** most transports should return the final Message-Id value used with this property */
  var messageId: java.lang.String
}

object SentMessageInfo {
  @scala.inline
  def apply(
    accepted: js.Array[java.lang.String],
    envelope: nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Envelope,
    envelopeTime: scala.Double,
    messageId: java.lang.String,
    messageSize: scala.Double,
    messageTime: scala.Double,
    rejected: js.Array[java.lang.String],
    response: java.lang.String,
    rejectedErrors: js.Array[nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError] = null
  ): SentMessageInfo = {
    val __obj = js.Dynamic.literal(accepted = accepted, envelope = envelope, envelopeTime = envelopeTime, messageId = messageId, messageSize = messageSize, messageTime = messageTime, rejected = rejected, response = response)
    if (rejectedErrors != null) __obj.updateDynamic("rejectedErrors")(rejectedErrors)
    __obj.asInstanceOf[SentMessageInfo]
  }
}

