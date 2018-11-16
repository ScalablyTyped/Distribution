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

