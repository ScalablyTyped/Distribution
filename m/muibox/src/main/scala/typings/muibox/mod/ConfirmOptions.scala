package typings.muibox.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmOptions extends AlertOptions {
  var cancel: js.UndefOr[DialogButtonOptions] = js.undefined
}

object ConfirmOptions {
  @scala.inline
  def apply(
    cancel: DialogButtonOptions = null,
    message: String | ReactNode = null,
    ok: DialogButtonOptions = null,
    title: String = null
  ): ConfirmOptions = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmOptions]
  }
}

