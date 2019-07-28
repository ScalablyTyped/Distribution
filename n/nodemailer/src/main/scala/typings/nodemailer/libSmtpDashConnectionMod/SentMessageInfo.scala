package typings.nodemailer.libSmtpDashConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo extends js.Object {
  /** an array of accepted recipient addresses. Normally this array should contain at least one address except when in LMTP mode. In this case the message itself might have succeeded but all recipients were rejected after sending the message. */
  var accepted: js.Array[String]
  /** how long was envelope prepared */
  var envelopeTime: Double
  /** how many bytes were streamed */
  var messageSize: Double
  /** how long was send stream prepared */
  var messageTime: Double
  /** an array of rejected recipient addresses. This array includes both the addresses that were rejected before sending the message and addresses rejected after sending it if using LMTP */
  var rejected: js.Array[String]
  /** if some recipients were rejected then this property holds an array of error objects for the rejected recipients */
  var rejectedErrors: js.UndefOr[js.Array[SMTPError]] = js.undefined
  /** the last response received from the server */
  var response: String
}

object SentMessageInfo {
  @scala.inline
  def apply(
    accepted: js.Array[String],
    envelopeTime: Double,
    messageSize: Double,
    messageTime: Double,
    rejected: js.Array[String],
    response: String,
    rejectedErrors: js.Array[SMTPError] = null
  ): SentMessageInfo = {
    val __obj = js.Dynamic.literal(accepted = accepted, envelopeTime = envelopeTime, messageSize = messageSize, messageTime = messageTime, rejected = rejected, response = response)
    if (rejectedErrors != null) __obj.updateDynamic("rejectedErrors")(rejectedErrors)
    __obj.asInstanceOf[SentMessageInfo]
  }
}

