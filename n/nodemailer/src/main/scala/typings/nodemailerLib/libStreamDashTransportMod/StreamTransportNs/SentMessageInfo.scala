package typings
package nodemailerLib.libStreamDashTransportMod.StreamTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo extends js.Object {
  /** an envelope object {from:‘address’, to:[‘address’]} */
  var envelope: nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Envelope
  /** either stream (default) of buffer depending on the options */
  var message: nodeLib.Buffer | nodeLib.streamMod.Readable
  /** the Message-ID header value */
  var messageId: java.lang.String
}

object SentMessageInfo {
  @scala.inline
  def apply(
    envelope: nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Envelope,
    message: nodeLib.Buffer | nodeLib.streamMod.Readable,
    messageId: java.lang.String
  ): SentMessageInfo = {
    val __obj = js.Dynamic.literal(envelope = envelope, message = message.asInstanceOf[js.Any], messageId = messageId)
  
    __obj.asInstanceOf[SentMessageInfo]
  }
}

