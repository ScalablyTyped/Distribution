package typings
package nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo extends js.Object {
  var envelope: nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Envelope
  var messageId: java.lang.String
  var response: java.lang.String
}

object SentMessageInfo {
  @scala.inline
  def apply(
    envelope: nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Envelope,
    messageId: java.lang.String,
    response: java.lang.String
  ): SentMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("envelope")(envelope)
    __obj.updateDynamic("messageId")(messageId)
    __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[SentMessageInfo]
  }
}

