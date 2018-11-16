package typings
package nodemailerLib.libSesDashTransportMod.SESTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SentMessageInfo extends js.Object {
  /** an envelope object {from:‘address’, to:[‘address’]} */
  var envelope: nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Envelope
  /** the Message-ID header value. This value is derived from the response of SES API, so it differs from the Message-ID values used in logging. */
  var messageId: java.lang.String
  var response: java.lang.String
}

