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
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], SubmittedAt = SubmittedAt.asInstanceOf[js.Any])
    if (Bcc != null) __obj.updateDynamic("Bcc")(Bcc.asInstanceOf[js.Any])
    if (Cc != null) __obj.updateDynamic("Cc")(Cc.asInstanceOf[js.Any])
    if (To != null) __obj.updateDynamic("To")(To.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSendingResponse]
  }
}

