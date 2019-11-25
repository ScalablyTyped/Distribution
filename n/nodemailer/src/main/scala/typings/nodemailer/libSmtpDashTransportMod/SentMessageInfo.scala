package typings.nodemailer.libSmtpDashTransportMod

import typings.nodemailer.libMimeDashNodeMod.Envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo extends js.Object {
  /** includes the envelope object for the message */
  var envelope: Envelope
  /** most transports should return the final Message-Id value used with this property */
  var messageId: String
}

object SentMessageInfo {
  @scala.inline
  def apply(envelope: Envelope, messageId: String): SentMessageInfo = {
    val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SentMessageInfo]
  }
}

