package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/notification-response/
trait NotificationResponse extends js.Object {
  val actionIdx: Double | Null
  val identifier: String
  val textInputValue: js.UndefOr[String] = js.undefined
}

object NotificationResponse {
  @scala.inline
  def apply(identifier: String, actionIdx: Double = null.asInstanceOf[Double], textInputValue: String = null): NotificationResponse = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], actionIdx = actionIdx.asInstanceOf[js.Any])
    if (textInputValue != null) __obj.updateDynamic("textInputValue")(textInputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationResponse]
  }
}

