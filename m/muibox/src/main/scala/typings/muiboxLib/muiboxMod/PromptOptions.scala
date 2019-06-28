package typings
package muiboxLib.muiboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptOptions extends ConfirmOptions {
  var defaultValue: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
}

object PromptOptions {
  @scala.inline
  def apply(
    cancel: java.lang.String = null,
    defaultValue: java.lang.String | scala.Double = null,
    message: java.lang.String = null,
    ok: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): PromptOptions = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (ok != null) __obj.updateDynamic("ok")(ok)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PromptOptions]
  }
}

