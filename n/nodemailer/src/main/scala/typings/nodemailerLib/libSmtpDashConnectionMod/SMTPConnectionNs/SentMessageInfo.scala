package typings
package nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SentMessageInfo extends js.Object {
  /** an array of accepted recipient addresses. Normally this array should contain at least one address except when in LMTP mode. In this case the message itself might have succeeded but all recipients were rejected after sending the message. */
  var accepted: js.Array[java.lang.String]
  /** how long was envelope prepared */
  var envelopeTime: scala.Double
  /** how many bytes were streamed */
  var messageSize: scala.Double
  /** how long was send stream prepared */
  var messageTime: scala.Double
  /** an array of rejected recipient addresses. This array includes both the addresses that were rejected before sending the message and addresses rejected after sending it if using LMTP */
  var rejected: js.Array[java.lang.String]
  /** if some recipients were rejected then this property holds an array of error objects for the rejected recipients */
  var rejectedErrors: js.UndefOr[js.Array[SMTPError]] = js.undefined
  /** the last response received from the server */
  var response: java.lang.String
}

