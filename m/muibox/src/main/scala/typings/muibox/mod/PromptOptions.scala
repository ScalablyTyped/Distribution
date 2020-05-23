package typings.muibox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptOptions extends ConfirmOptions {
  var defaultValue: js.UndefOr[String | Double] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
}

object PromptOptions {
  @scala.inline
  def apply(
    cancel: String = null,
    defaultValue: String | Double = null,
    message: String = null,
    ok: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): PromptOptions = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
}

