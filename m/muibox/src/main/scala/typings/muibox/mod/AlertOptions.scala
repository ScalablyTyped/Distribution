package typings.muibox.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertOptions extends js.Object {
  var message: js.UndefOr[String | ReactNode] = js.undefined
  var ok: js.UndefOr[DialogButtonOptions] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(message: String | ReactNode = null, ok: DialogButtonOptions = null, title: String = null): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertOptions]
  }
}

