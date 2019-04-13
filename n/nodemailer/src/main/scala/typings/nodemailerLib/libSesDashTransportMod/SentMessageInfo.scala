package typings
package nodemailerLib.libSesDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo extends js.Object {
  /** an envelope object {from:‘address’, to:[‘address’]} */
  var envelope: nodemailerLib.libMimeDashNodeMod.Envelope
  /** the Message-ID header value. This value is derived from the response of SES API, so it differs from the Message-ID values used in logging. */
  var messageId: java.lang.String
  var response: java.lang.String
}

object SentMessageInfo {
  @scala.inline
  def apply(
    envelope: nodemailerLib.libMimeDashNodeMod.Envelope,
    messageId: java.lang.String,
    response: java.lang.String
  ): SentMessageInfo = {
    val __obj = js.Dynamic.literal(envelope = envelope, messageId = messageId, response = response)
  
    __obj.asInstanceOf[SentMessageInfo]
  }
}

