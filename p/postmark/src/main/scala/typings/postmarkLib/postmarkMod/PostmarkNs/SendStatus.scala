package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendStatus extends js.Object {
  var ErrorCode: scala.Double
  var Message: java.lang.String
  var MessageID: java.lang.String
  var SubmittedAt: java.lang.String
  var To: java.lang.String
}

object SendStatus {
  @scala.inline
  def apply(
    ErrorCode: scala.Double,
    Message: java.lang.String,
    MessageID: java.lang.String,
    SubmittedAt: java.lang.String,
    To: java.lang.String
  ): SendStatus = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode, Message = Message, MessageID = MessageID, SubmittedAt = SubmittedAt, To = To)
  
    __obj.asInstanceOf[SendStatus]
  }
}

