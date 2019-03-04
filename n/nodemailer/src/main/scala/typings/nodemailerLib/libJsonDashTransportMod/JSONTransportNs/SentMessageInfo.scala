package typings
package nodemailerLib.libJsonDashTransportMod.JSONTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo extends js.Object {
  /** an envelope object {from:‘address’, to:[‘address’]} */
  var envelope: nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Envelope
  /** JSON string */
  var message: java.lang.String
  /** the Message-ID header value */
  var messageId: java.lang.String
}

object SentMessageInfo {
  @scala.inline
  def apply(
    envelope: nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Envelope,
    message: java.lang.String,
    messageId: java.lang.String
  ): SentMessageInfo = {
    val __obj = js.Dynamic.literal(envelope = envelope, message = message, messageId = messageId)
  
    __obj.asInstanceOf[SentMessageInfo]
  }
}

