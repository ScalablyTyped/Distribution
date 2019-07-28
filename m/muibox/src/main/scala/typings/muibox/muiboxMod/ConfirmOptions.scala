package typings.muibox.muiboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmOptions extends AlertOptions {
  var cancel: js.UndefOr[String] = js.undefined
}

object ConfirmOptions {
  @scala.inline
  def apply(cancel: String = null, message: String = null, ok: String = null, title: String = null): ConfirmOptions = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (message != null) __obj.updateDynamic("message")(message)
    if (ok != null) __obj.updateDynamic("ok")(ok)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ConfirmOptions]
  }
}

