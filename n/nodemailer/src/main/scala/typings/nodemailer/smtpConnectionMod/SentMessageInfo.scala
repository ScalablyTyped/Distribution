package typings.nodemailer.smtpConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SentMessageInfo extends js.Object {
  
  /** an array of accepted recipient addresses. Normally this array should contain at least one address except when in LMTP mode. In this case the message itself might have succeeded but all recipients were rejected after sending the message. */
  var accepted: js.Array[String] = js.native
  
  /** how long was envelope prepared */
  var envelopeTime: Double = js.native
  
  /** how many bytes were streamed */
  var messageSize: Double = js.native
  
  /** how long was send stream prepared */
  var messageTime: Double = js.native
  
  /** an array of rejected recipient addresses. This array includes both the addresses that were rejected before sending the message and addresses rejected after sending it if using LMTP */
  var rejected: js.Array[String] = js.native
  
  /** if some recipients were rejected then this property holds an array of error objects for the rejected recipients */
  var rejectedErrors: js.UndefOr[js.Array[SMTPError]] = js.native
  
  /** the last response received from the server */
  var response: String = js.native
}
object SentMessageInfo {
  
  @scala.inline
  def apply(
    accepted: js.Array[String],
    envelopeTime: Double,
    messageSize: Double,
    messageTime: Double,
    rejected: js.Array[String],
    response: String
  ): SentMessageInfo = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], envelopeTime = envelopeTime.asInstanceOf[js.Any], messageSize = messageSize.asInstanceOf[js.Any], messageTime = messageTime.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentMessageInfo]
  }
  
  @scala.inline
  implicit class SentMessageInfoOps[Self <: SentMessageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptedVarargs(value: String*): Self = this.set("accepted", js.Array(value :_*))
    
    @scala.inline
    def setAccepted(value: js.Array[String]): Self = this.set("accepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeTime(value: Double): Self = this.set("envelopeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageSize(value: Double): Self = this.set("messageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTime(value: Double): Self = this.set("messageTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedVarargs(value: String*): Self = this.set("rejected", js.Array(value :_*))
    
    @scala.inline
    def setRejected(value: js.Array[String]): Self = this.set("rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedErrorsVarargs(value: SMTPError*): Self = this.set("rejectedErrors", js.Array(value :_*))
    
    @scala.inline
    def setRejectedErrors(value: js.Array[SMTPError]): Self = this.set("rejectedErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectedErrors: Self = this.set("rejectedErrors", js.undefined)
  }
}
