package typings.muibox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertOptions extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var ok: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(message: String = null, ok: String = null, title: String = null): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertOptions]
  }
}

