package typings
package nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo extends js.Object {
  /** includes the envelope object for the message */
  var envelope: nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Envelope
  /** most transports should return the final Message-Id value used with this property */
  var messageId: java.lang.String
}

object SentMessageInfo {
  @scala.inline
  def apply(envelope: nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Envelope, messageId: java.lang.String): SentMessageInfo = {
    val __obj = js.Dynamic.literal(envelope = envelope, messageId = messageId)
  
    __obj.asInstanceOf[SentMessageInfo]
  }
}

