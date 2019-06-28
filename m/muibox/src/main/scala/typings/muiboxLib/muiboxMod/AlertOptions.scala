package typings
package muiboxLib.muiboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertOptions extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var ok: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(message: java.lang.String = null, ok: java.lang.String = null, title: java.lang.String = null): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (ok != null) __obj.updateDynamic("ok")(ok)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AlertOptions]
  }
}

