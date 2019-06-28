package typings
package muiboxLib.muiboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmOptions extends AlertOptions {
  var cancel: js.UndefOr[java.lang.String] = js.undefined
}

object ConfirmOptions {
  @scala.inline
  def apply(
    cancel: java.lang.String = null,
    message: java.lang.String = null,
    ok: java.lang.String = null,
    title: java.lang.String = null
  ): ConfirmOptions = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (message != null) __obj.updateDynamic("message")(message)
    if (ok != null) __obj.updateDynamic("ok")(ok)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ConfirmOptions]
  }
}

