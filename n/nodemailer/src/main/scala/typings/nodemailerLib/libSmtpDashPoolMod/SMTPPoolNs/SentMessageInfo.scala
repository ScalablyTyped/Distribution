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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accepted")(accepted)
    __obj.updateDynamic("envelope")(envelope)
    __obj.updateDynamic("envelopeTime")(envelopeTime)
    __obj.updateDynamic("messageId")(messageId)
    __obj.updateDynamic("messageSize")(messageSize)
    __obj.updateDynamic("messageTime")(messageTime)
    __obj.updateDynamic("rejected")(rejected)
    __obj.updateDynamic("response")(response)
    if (rejectedErrors != null) __obj.updateDynamic("rejectedErrors")(rejectedErrors)
    __obj.asInstanceOf[SentMessageInfo]
  }
}

