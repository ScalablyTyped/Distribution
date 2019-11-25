package typings.nodemailer.libJsonDashTransportMod

import typings.nodemailer.libMimeDashNodeMod.Envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo extends js.Object {
  /** an envelope object {from:‘address’, to:[‘address’]} */
  var envelope: Envelope
  /** JSON string */
  var message: String
  /** the Message-ID header value */
  var messageId: String
}

object SentMessageInfo {
  @scala.inline
  def apply(envelope: Envelope, message: String, messageId: String): SentMessageInfo = {
    val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SentMessageInfo]
  }
}

