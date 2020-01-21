package typings.nodePushnotifications.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var error: js.UndefOr[Error | Null] = js.undefined
  var errorMsg: js.UndefOr[String] = js.undefined
  var messageId: js.UndefOr[String] = js.undefined
  var originalRegId: js.UndefOr[String] = js.undefined
  var regId: String
}

object Message {
  @scala.inline
  def apply(
    regId: String,
    error: Error = null,
    errorMsg: String = null,
    messageId: String = null,
    originalRegId: String = null
  ): Message = {
    val __obj = js.Dynamic.literal(regId = regId.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (errorMsg != null) __obj.updateDynamic("errorMsg")(errorMsg.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (originalRegId != null) __obj.updateDynamic("originalRegId")(originalRegId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

