package typings.nodemailer.libSendmailDashTransportMod

import typings.nodemailer.libMimeDashNodeMod.Envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo extends js.Object {
  var envelope: Envelope
  var messageId: String
  var response: String
}

object SentMessageInfo {
  @scala.inline
  def apply(envelope: Envelope, messageId: String, response: String): SentMessageInfo = {
    val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SentMessageInfo]
  }
}

