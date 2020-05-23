package typings.novaEditorNode

import typings.novaEditorNode.novaEditorNodeStrings.`secure-input`
import typings.novaEditorNode.novaEditorNodeStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/notification-request/
trait NotificationRequest extends js.Object {
  var actions: js.UndefOr[js.Array[String]] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  val identifier: String
  var textInputPlaceholder: js.UndefOr[String] = js.undefined
  var textInputValue: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[input | `secure-input`] = js.undefined
}

object NotificationRequest {
  @scala.inline
  def apply(
    identifier: String,
    actions: js.Array[String] = null,
    body: String = null,
    textInputPlaceholder: String = null,
    textInputValue: String = null,
    title: String = null,
    `type`: input | `secure-input` = null
  ): NotificationRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (textInputPlaceholder != null) __obj.updateDynamic("textInputPlaceholder")(textInputPlaceholder.asInstanceOf[js.Any])
    if (textInputValue != null) __obj.updateDynamic("textInputValue")(textInputValue.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationRequest]
  }
}

