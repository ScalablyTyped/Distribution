package typings.postmark.distClientModelsMessageMessageMod

import typings.postmark.distClientModelsClientDefaultResponseMod.DefaultResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageSendingResponse extends DefaultResponse {
  var Bcc: js.UndefOr[String] = js.undefined
  var Cc: js.UndefOr[String] = js.undefined
  var MessageID: String
  var SubmittedAt: String
  var To: js.UndefOr[String] = js.undefined
}

object MessageSendingResponse {
  @scala.inline
  def apply(
    ErrorCode: Double,
    Message: String,
    MessageID: String,
    SubmittedAt: String,
    Bcc: String = null,
    Cc: String = null,
    To: String = null
  ): MessageSendingResponse = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode, Message = Message, MessageID = MessageID, SubmittedAt = SubmittedAt)
    if (Bcc != null) __obj.updateDynamic("Bcc")(Bcc)
    if (Cc != null) __obj.updateDynamic("Cc")(Cc)
    if (To != null) __obj.updateDynamic("To")(To)
    __obj.asInstanceOf[MessageSendingResponse]
  }
}

