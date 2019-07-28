package typings.nodemailer.libSesDashTransportMod

import typings.nodemailer.libMimeDashNodeMod.Envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo extends js.Object {
  /** an envelope object {from:‘address’, to:[‘address’]} */
  var envelope: Envelope
  /** the Message-ID header value. This value is derived from the response of SES API, so it differs from the Message-ID values used in logging. */
  var messageId: String
  var response: String
}

object SentMessageInfo {
  @scala.inline
  def apply(envelope: Envelope, messageId: String, response: String): SentMessageInfo = {
    val __obj = js.Dynamic.literal(envelope = envelope, messageId = messageId, response = response)
  
    __obj.asInstanceOf[SentMessageInfo]
  }
}

