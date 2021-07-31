package typings.nodemailer.smtpConnectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentMessageInfo extends StObject {
  
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
    response: String
  ): SentMessageInfo = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], envelopeTime = envelopeTime.asInstanceOf[js.Any], messageSize = messageSize.asInstanceOf[js.Any], messageTime = messageTime.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentMessageInfo]
  }
  
  @scala.inline
  implicit class SentMessageInfoMutableBuilder[Self <: SentMessageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepted(value: js.Array[String]): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptedVarargs(value: String*): Self = StObject.set(x, "accepted", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeTime(value: Double): Self = StObject.set(x, "envelopeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageSize(value: Double): Self = StObject.set(x, "messageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTime(value: Double): Self = StObject.set(x, "messageTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejected(value: js.Array[String]): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedErrors(value: js.Array[SMTPError]): Self = StObject.set(x, "rejectedErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedErrorsUndefined: Self = StObject.set(x, "rejectedErrors", js.undefined)
    
    @scala.inline
    def setRejectedErrorsVarargs(value: SMTPError*): Self = StObject.set(x, "rejectedErrors", js.Array(value :_*))
    
    @scala.inline
    def setRejectedVarargs(value: String*): Self = StObject.set(x, "rejected", js.Array(value :_*))
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
