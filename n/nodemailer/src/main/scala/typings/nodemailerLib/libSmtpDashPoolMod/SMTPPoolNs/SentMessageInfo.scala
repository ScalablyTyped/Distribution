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

