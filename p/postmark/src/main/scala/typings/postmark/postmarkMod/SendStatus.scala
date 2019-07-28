package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendStatus extends js.Object {
  var ErrorCode: Double
  var Message: String
  var MessageID: String
  var SubmittedAt: String
  var To: String
}

object SendStatus {
  @scala.inline
  def apply(ErrorCode: Double, Message: String, MessageID: String, SubmittedAt: String, To: String): SendStatus = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode, Message = Message, MessageID = MessageID, SubmittedAt = SubmittedAt, To = To)
  
    __obj.asInstanceOf[SendStatus]
  }
}

