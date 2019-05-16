package typings
package nodeDashPushnotificationsLib.nodeDashPushnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var error: js.UndefOr[stdLib.Error | scala.Null] = js.undefined
  var errorMsg: js.UndefOr[java.lang.String] = js.undefined
  var messageId: js.UndefOr[java.lang.String] = js.undefined
  var originalRegId: js.UndefOr[java.lang.String] = js.undefined
  var regId: java.lang.String
}

object Message {
  @scala.inline
  def apply(
    regId: java.lang.String,
    error: stdLib.Error = null,
    errorMsg: java.lang.String = null,
    messageId: java.lang.String = null,
    originalRegId: java.lang.String = null
  ): Message = {
    val __obj = js.Dynamic.literal(regId = regId)
    if (error != null) __obj.updateDynamic("error")(error)
    if (errorMsg != null) __obj.updateDynamic("errorMsg")(errorMsg)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (originalRegId != null) __obj.updateDynamic("originalRegId")(originalRegId)
    __obj.asInstanceOf[Message]
  }
}

